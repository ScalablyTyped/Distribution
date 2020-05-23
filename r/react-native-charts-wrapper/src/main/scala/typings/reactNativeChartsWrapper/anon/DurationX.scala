package typings.reactNativeChartsWrapper.anon

import typings.reactNativeChartsWrapper.mod.EasingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationX extends js.Object {
  var durationX: js.UndefOr[Double] = js.undefined
  var durationY: js.UndefOr[Double] = js.undefined
  var easingX: js.UndefOr[EasingType] = js.undefined
  var easingY: js.UndefOr[EasingType] = js.undefined
}

object DurationX {
  @scala.inline
  def apply(
    durationX: js.UndefOr[Double] = js.undefined,
    durationY: js.UndefOr[Double] = js.undefined,
    easingX: EasingType = null,
    easingY: EasingType = null
  ): DurationX = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(durationX)) __obj.updateDynamic("durationX")(durationX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(durationY)) __obj.updateDynamic("durationY")(durationY.get.asInstanceOf[js.Any])
    if (easingX != null) __obj.updateDynamic("easingX")(easingX.asInstanceOf[js.Any])
    if (easingY != null) __obj.updateDynamic("easingY")(easingY.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationX]
  }
}

