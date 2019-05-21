package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-native-maps.react-native-maps.Region ]:? react-native-maps.react-native-maps.Region[P]} */ trait AnimatedRegionSpringConfig
  extends reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimationConfig {
  var bounciness: js.UndefOr[scala.Double] = js.undefined
  var damping: js.UndefOr[scala.Double] = js.undefined
  var friction: js.UndefOr[scala.Double] = js.undefined
  var mass: js.UndefOr[scala.Double] = js.undefined
  var overshootClamping: js.UndefOr[scala.Boolean] = js.undefined
  var restDisplacementThreshold: js.UndefOr[scala.Double] = js.undefined
  var restSpeedThreshold: js.UndefOr[scala.Double] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var stiffness: js.UndefOr[scala.Double] = js.undefined
  var tension: js.UndefOr[scala.Double] = js.undefined
  var velocity: js.UndefOr[scala.Double | Point] = js.undefined
}

object AnimatedRegionSpringConfig {
  @scala.inline
  def apply(
    bounciness: scala.Int | scala.Double = null,
    damping: scala.Int | scala.Double = null,
    friction: scala.Int | scala.Double = null,
    isInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    mass: scala.Int | scala.Double = null,
    overshootClamping: js.UndefOr[scala.Boolean] = js.undefined,
    restDisplacementThreshold: scala.Int | scala.Double = null,
    restSpeedThreshold: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    stiffness: scala.Int | scala.Double = null,
    tension: scala.Int | scala.Double = null,
    useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined,
    velocity: scala.Double | Point = null
  ): AnimatedRegionSpringConfig = {
    val __obj = js.Dynamic.literal()
    if (bounciness != null) __obj.updateDynamic("bounciness")(bounciness.asInstanceOf[js.Any])
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction)
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (!js.isUndefined(overshootClamping)) __obj.updateDynamic("overshootClamping")(overshootClamping)
    if (restDisplacementThreshold != null) __obj.updateDynamic("restDisplacementThreshold")(restDisplacementThreshold.asInstanceOf[js.Any])
    if (restSpeedThreshold != null) __obj.updateDynamic("restSpeedThreshold")(restSpeedThreshold.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (tension != null) __obj.updateDynamic("tension")(tension.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedRegionSpringConfig]
  }
}

