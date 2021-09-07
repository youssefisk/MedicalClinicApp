// Generated by view binder compiler. Do not edit!
package com.example.b07project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.b07project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDoctorBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button2;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button6;

  @NonNull
  public final Button doctorSignOut;

  @NonNull
  public final TextView doctorWelcome;

  private ActivityDoctorBinding(@NonNull ConstraintLayout rootView, @NonNull Button button2,
      @NonNull Button button3, @NonNull Button button6, @NonNull Button doctorSignOut,
      @NonNull TextView doctorWelcome) {
    this.rootView = rootView;
    this.button2 = button2;
    this.button3 = button3;
    this.button6 = button6;
    this.doctorSignOut = doctorSignOut;
    this.doctorWelcome = doctorWelcome;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDoctorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDoctorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_doctor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDoctorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button6;
      Button button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.doctorSignOut;
      Button doctorSignOut = ViewBindings.findChildViewById(rootView, id);
      if (doctorSignOut == null) {
        break missingId;
      }

      id = R.id.doctor_welcome;
      TextView doctorWelcome = ViewBindings.findChildViewById(rootView, id);
      if (doctorWelcome == null) {
        break missingId;
      }

      return new ActivityDoctorBinding((ConstraintLayout) rootView, button2, button3, button6,
          doctorSignOut, doctorWelcome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
