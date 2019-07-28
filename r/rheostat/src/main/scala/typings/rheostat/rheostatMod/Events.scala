package typings.rheostat.rheostatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  var getNextHandlePosition: js.UndefOr[js.Function2[/* handleIdx */ Double, /* percentPosition */ Double, Double]] = js.undefined
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
    getNextHandlePosition: (/* handleIdx */ Double, /* percentPosition */ Double) => Double = null,
    onChange: /* publicState */ PublicState => _ = null,
    onClick: () => _ = null,
    onKeyPress: () => _ = null,
    onSliderDragEnd: () => _ = null,
    onSliderDragMove: () => _ = null,
    onSliderDragStart: () => _ = null,
    onValuesUpdated: /* publicState */ PublicState => _ = null
  ): Events = {
    val __obj = js.Dynamic.literal()
    if (getNextHandlePosition != null) __obj.updateDynamic("getNextHandlePosition")(js.Any.fromFunction2(getNextHandlePosition))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction0(onKeyPress))
    if (onSliderDragEnd != null) __obj.updateDynamic("onSliderDragEnd")(js.Any.fromFunction0(onSliderDragEnd))
    if (onSliderDragMove != null) __obj.updateDynamic("onSliderDragMove")(js.Any.fromFunction0(onSliderDragMove))
    if (onSliderDragStart != null) __obj.updateDynamic("onSliderDragStart")(js.Any.fromFunction0(onSliderDragStart))
    if (onValuesUpdated != null) __obj.updateDynamic("onValuesUpdated")(js.Any.fromFunction1(onValuesUpdated))
    __obj.asInstanceOf[Events]
  }
}

