package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.timeSetAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerAndroidTimeSetAction extends TimePickerAndroidOpenReturn {
  var action: timeSetAction
  var hour: Double
  var minute: Double
}

object TimePickerAndroidTimeSetAction {
  @scala.inline
  def apply(action: timeSetAction, hour: Double, minute: Double): TimePickerAndroidTimeSetAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimePickerAndroidTimeSetAction]
  }
}

