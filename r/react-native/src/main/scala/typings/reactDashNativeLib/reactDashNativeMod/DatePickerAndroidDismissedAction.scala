package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerAndroidDismissedAction extends DatePickerAndroidOpenReturn {
  var action: reactDashNativeLib.reactDashNativeLibStrings.dismissedAction
}

object DatePickerAndroidDismissedAction {
  @scala.inline
  def apply(action: reactDashNativeLib.reactDashNativeLibStrings.dismissedAction): DatePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.asInstanceOf[DatePickerAndroidDismissedAction]
  }
}

