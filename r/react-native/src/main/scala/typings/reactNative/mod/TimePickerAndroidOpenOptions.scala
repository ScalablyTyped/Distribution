package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.clock
import typings.reactNative.reactNativeStrings.default
import typings.reactNative.reactNativeStrings.spinner
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
    hour: js.UndefOr[Double] = js.undefined,
    is24Hour: js.UndefOr[Boolean] = js.undefined,
    minute: js.UndefOr[Double] = js.undefined,
    mode: clock | spinner | default = null
  ): TimePickerAndroidOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is24Hour)) __obj.updateDynamic("is24Hour")(is24Hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minute)) __obj.updateDynamic("minute")(minute.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerAndroidOpenOptions]
  }
}

