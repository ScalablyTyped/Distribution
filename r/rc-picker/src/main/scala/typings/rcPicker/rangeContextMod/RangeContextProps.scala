package typings.rcPicker.rangeContextMod

import typings.rcPicker.interfaceMod.NullableDateType
import typings.rcPicker.interfaceMod.RangeValue
import typings.rcPicker.rcPickerBooleans.`false`
import typings.rcPicker.rcPickerStrings.left
import typings.rcPicker.rcPickerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeContextProps extends js.Object {
  var hoverRangedValue: js.UndefOr[RangeValue[_]] = js.undefined
  var inRange: js.UndefOr[Boolean] = js.undefined
  var panelPosition: js.UndefOr[left | right | `false`] = js.undefined
  /**
    * Set displayed range value style.
    * Panel only has one value, this is only style effect.
    */
  var rangedValue: js.UndefOr[(js.Tuple2[NullableDateType[_], NullableDateType[_]]) | Null] = js.undefined
}

object RangeContextProps {
  @scala.inline
  def apply(
    hoverRangedValue: RangeValue[_] = null,
    inRange: js.UndefOr[Boolean] = js.undefined,
    panelPosition: left | right | `false` = null,
    rangedValue: js.Tuple2[NullableDateType[_], NullableDateType[_]] = null
  ): RangeContextProps = {
    val __obj = js.Dynamic.literal()
    if (hoverRangedValue != null) __obj.updateDynamic("hoverRangedValue")(hoverRangedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(inRange)) __obj.updateDynamic("inRange")(inRange.asInstanceOf[js.Any])
    if (panelPosition != null) __obj.updateDynamic("panelPosition")(panelPosition.asInstanceOf[js.Any])
    if (rangedValue != null) __obj.updateDynamic("rangedValue")(rangedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeContextProps]
  }
}

