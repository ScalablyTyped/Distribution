package typings.reactDashNavigationDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Damping extends js.Object {
  var damping: Double
  var duration: js.UndefOr[scala.Nothing] = js.undefined
  var easing: js.UndefOr[scala.Nothing] = js.undefined
  var mass: Double
  var overshootClamping: Boolean
  var restDisplacementThreshold: Double
  var restSpeedThreshold: Double
  var stiffness: Double
  var timing: Fn_Config
}

object Anon_Damping {
  @scala.inline
  def apply(
    damping: Double,
    mass: Double,
    overshootClamping: Boolean,
    restDisplacementThreshold: Double,
    restSpeedThreshold: Double,
    stiffness: Double,
    timing: Fn_Config,
    duration: js.UndefOr[scala.Nothing] = js.undefined,
    easing: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_Damping = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], mass = mass.asInstanceOf[js.Any], overshootClamping = overshootClamping.asInstanceOf[js.Any], restDisplacementThreshold = restDisplacementThreshold.asInstanceOf[js.Any], restSpeedThreshold = restSpeedThreshold.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(easing)) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Damping]
  }
}

