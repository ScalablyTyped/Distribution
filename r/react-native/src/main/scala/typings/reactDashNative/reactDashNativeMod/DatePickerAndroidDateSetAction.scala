package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.dateSetAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerAndroidDateSetAction extends DatePickerAndroidOpenReturn {
  var action: dateSetAction
  var day: Double
  var month: Double
  var year: Double
}

object DatePickerAndroidDateSetAction {
  @scala.inline
  def apply(action: dateSetAction, day: Double, month: Double, year: Double): DatePickerAndroidDateSetAction = {
    val __obj = js.Dynamic.literal(action = action, day = day, month = month, year = year)
  
    __obj.asInstanceOf[DatePickerAndroidDateSetAction]
  }
}

