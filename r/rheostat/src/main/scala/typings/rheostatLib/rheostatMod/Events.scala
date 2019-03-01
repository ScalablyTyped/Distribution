package typings
package rheostatLib.rheostatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  var getNextHandlePosition: js.UndefOr[
    js.Function2[/* handleIdx */ scala.Double, /* percentPosition */ scala.Double, scala.Double]
  ] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* publicState */ PublicState, _]] = js.undefined
  var onClick: js.UndefOr[js.Function0[_]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function0[_]] = js.undefined
  var onSliderDragEnd: js.UndefOr[js.Function0[_]] = js.undefined
  var onSliderDragMove: js.UndefOr[js.Function0[_]] = js.undefined
  var onSliderDragStart: js.UndefOr[js.Function0[_]] = js.undefined
  var onValuesUpdated: js.UndefOr[js.Function1[/* publicState */ PublicState, _]] = js.undefined
}

object Events {
  @scala.inline
  def apply(
    getNextHandlePosition: js.Function2[/* handleIdx */ scala.Double, /* percentPosition */ scala.Double, scala.Double] = null,
    onChange: js.Function1[/* publicState */ PublicState, _] = null,
    onClick: js.Function0[_] = null,
    onKeyPress: js.Function0[_] = null,
    onSliderDragEnd: js.Function0[_] = null,
    onSliderDragMove: js.Function0[_] = null,
    onSliderDragStart: js.Function0[_] = null,
    onValuesUpdated: js.Function1[/* publicState */ PublicState, _] = null
  ): Events = {
    val __obj = js.Dynamic.literal()
    if (getNextHandlePosition != null) __obj.updateDynamic("getNextHandlePosition")(getNextHandlePosition)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onSliderDragEnd != null) __obj.updateDynamic("onSliderDragEnd")(onSliderDragEnd)
    if (onSliderDragMove != null) __obj.updateDynamic("onSliderDragMove")(onSliderDragMove)
    if (onSliderDragStart != null) __obj.updateDynamic("onSliderDragStart")(onSliderDragStart)
    if (onValuesUpdated != null) __obj.updateDynamic("onValuesUpdated")(onValuesUpdated)
    __obj.asInstanceOf[Events]
  }
}

