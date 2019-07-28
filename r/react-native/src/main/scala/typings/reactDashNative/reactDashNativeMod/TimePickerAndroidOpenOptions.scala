package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.clock
import typings.reactDashNative.reactDashNativeStrings.default
import typings.reactDashNative.reactDashNativeStrings.spinner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerAndroidOpenOptions extends js.Object {
  var hour: js.UndefOr[Double] = js.undefined
  var is24Hour: js.UndefOr[Boolean] = js.undefined
  var minute: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[clock | spinner | default] = js.undefined
}

object TimePickerAndroidOpenOptions {
  @scala.inline
  def apply(
    hour: Int | Double = null,
    is24Hour: js.UndefOr[Boolean] = js.undefined,
    minute: Int | Double = null,
    mode: clock | spinner | default = null
  ): TimePickerAndroidOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (!js.isUndefined(is24Hour)) __obj.updateDynamic("is24Hour")(is24Hour)
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerAndroidOpenOptions]
  }
}

