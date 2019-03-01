package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerAndroidOpenOptions extends js.Object {
  var date: js.UndefOr[stdLib.Date | scala.Double] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date | scala.Double] = js.undefined
  var minDate: js.UndefOr[stdLib.Date | scala.Double] = js.undefined
  var mode: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.calendar | reactDashNativeLib.reactDashNativeLibStrings.spinner | reactDashNativeLib.reactDashNativeLibStrings.default
  ] = js.undefined
}

object DatePickerAndroidOpenOptions {
  @scala.inline
  def apply(
    date: stdLib.Date | scala.Double = null,
    maxDate: stdLib.Date | scala.Double = null,
    minDate: stdLib.Date | scala.Double = null,
    mode: reactDashNativeLib.reactDashNativeLibStrings.calendar | reactDashNativeLib.reactDashNativeLibStrings.spinner | reactDashNativeLib.reactDashNativeLibStrings.default = null
  ): DatePickerAndroidOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerAndroidOpenOptions]
  }
}

