package typings.reactNativeCalendarPicker.mod

import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in '0' | '1' | '2' | '3' | '4' | '5' | '6' ]:? react-native.react-native.TextStyle} */
trait DayOfWeekStyle extends js.Object {
  var `0`: js.UndefOr[TextStyle] = js.undefined
  var `1`: js.UndefOr[TextStyle] = js.undefined
  var `2`: js.UndefOr[TextStyle] = js.undefined
  var `3`: js.UndefOr[TextStyle] = js.undefined
  var `4`: js.UndefOr[TextStyle] = js.undefined
  var `5`: js.UndefOr[TextStyle] = js.undefined
  var `6`: js.UndefOr[TextStyle] = js.undefined
}

object DayOfWeekStyle {
  @scala.inline
  def apply(
    `0`: TextStyle = null,
    `1`: TextStyle = null,
    `2`: TextStyle = null,
    `3`: TextStyle = null,
    `4`: TextStyle = null,
    `5`: TextStyle = null,
    `6`: TextStyle = null
  ): DayOfWeekStyle = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    if (`2` != null) __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    if (`3` != null) __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    if (`4` != null) __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    if (`5` != null) __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    if (`6` != null) __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayOfWeekStyle]
  }
}

