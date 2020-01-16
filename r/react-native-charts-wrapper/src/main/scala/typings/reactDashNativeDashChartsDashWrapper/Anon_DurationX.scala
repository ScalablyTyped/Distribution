package typings.reactDashNativeDashChartsDashWrapper

import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod.EasingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DurationX extends js.Object {
  var durationX: js.UndefOr[Double] = js.undefined
  var durationY: js.UndefOr[Double] = js.undefined
  var easingX: js.UndefOr[EasingType] = js.undefined
  var easingY: js.UndefOr[EasingType] = js.undefined
}

object Anon_DurationX {
  @scala.inline
  def apply(
    durationX: Int | Double = null,
    durationY: Int | Double = null,
    easingX: EasingType = null,
    easingY: EasingType = null
  ): Anon_DurationX = {
    val __obj = js.Dynamic.literal()
    if (durationX != null) __obj.updateDynamic("durationX")(durationX.asInstanceOf[js.Any])
    if (durationY != null) __obj.updateDynamic("durationY")(durationY.asInstanceOf[js.Any])
    if (easingX != null) __obj.updateDynamic("easingX")(easingX.asInstanceOf[js.Any])
    if (easingY != null) __obj.updateDynamic("easingY")(easingY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DurationX]
  }
}

