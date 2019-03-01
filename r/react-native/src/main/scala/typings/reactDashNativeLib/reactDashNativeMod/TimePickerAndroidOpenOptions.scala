package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerAndroidOpenOptions extends js.Object {
  var hour: js.UndefOr[scala.Double] = js.undefined
  var is24Hour: js.UndefOr[scala.Boolean] = js.undefined
  var minute: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.clock | reactDashNativeLib.reactDashNativeLibStrings.spinner | reactDashNativeLib.reactDashNativeLibStrings.default
  ] = js.undefined
}

object TimePickerAndroidOpenOptions {
  @scala.inline
  def apply(
    hour: scala.Int | scala.Double = null,
    is24Hour: js.UndefOr[scala.Boolean] = js.undefined,
    minute: scala.Int | scala.Double = null,
    mode: reactDashNativeLib.reactDashNativeLibStrings.clock | reactDashNativeLib.reactDashNativeLibStrings.spinner | reactDashNativeLib.reactDashNativeLibStrings.default = null
  ): TimePickerAndroidOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (!js.isUndefined(is24Hour)) __obj.updateDynamic("is24Hour")(is24Hour)
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerAndroidOpenOptions]
  }
}

