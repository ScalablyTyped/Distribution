package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.dismissedAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerAndroidDismissedAction extends DatePickerAndroidOpenReturn {
  var action: dismissedAction
}

object DatePickerAndroidDismissedAction {
  @scala.inline
  def apply(action: dismissedAction): DatePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatePickerAndroidDismissedAction]
  }
}

