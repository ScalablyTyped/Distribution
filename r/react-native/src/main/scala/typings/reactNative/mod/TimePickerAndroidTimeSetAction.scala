package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.timeSetAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerAndroidTimeSetAction extends TimePickerAndroidOpenReturn {
  var action: timeSetAction = js.native
  var hour: Double = js.native
  var minute: Double = js.native
}

object TimePickerAndroidTimeSetAction {
  @scala.inline
  def apply(action: timeSetAction, hour: Double, minute: Double): TimePickerAndroidTimeSetAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerAndroidTimeSetAction]
  }
  @scala.inline
  implicit class TimePickerAndroidTimeSetActionOps[Self <: TimePickerAndroidTimeSetAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: timeSetAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
  }
  
}

