package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerAndroidDateSetAction extends DatePickerAndroidOpenReturn {
  var action: reactDashNativeLib.reactDashNativeLibStrings.dateSetAction
  var day: scala.Double
  var month: scala.Double
  var year: scala.Double
}

object DatePickerAndroidDateSetAction {
  @scala.inline
  def apply(
    action: reactDashNativeLib.reactDashNativeLibStrings.dateSetAction,
    day: scala.Double,
    month: scala.Double,
    year: scala.Double
  ): DatePickerAndroidDateSetAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[DatePickerAndroidDateSetAction]
  }
}

