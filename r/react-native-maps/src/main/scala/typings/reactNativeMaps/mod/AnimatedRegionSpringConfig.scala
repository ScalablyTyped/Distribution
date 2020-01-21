package typings.reactNativeMaps.mod

import typings.reactNative.mod.Animated.AnimationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-native-maps.react-native-maps.Region ]:? react-native-maps.react-native-maps.Region[P]} */ trait AnimatedRegionSpringConfig extends AnimationConfig {
  var bounciness: js.UndefOr[Double] = js.undefined
  var damping: js.UndefOr[Double] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var mass: js.UndefOr[Double] = js.undefined
  var overshootClamping: js.UndefOr[Boolean] = js.undefined
  var restDisplacementThreshold: js.UndefOr[Double] = js.undefined
  var restSpeedThreshold: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
  var tension: js.UndefOr[Double] = js.undefined
  var velocity: js.UndefOr[Double | Point] = js.undefined
}

object AnimatedRegionSpringConfig {
  @scala.inline
  def apply(
    bounciness: Int | Double = null,
    damping: Int | Double = null,
    friction: Int | Double = null,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    mass: Int | Double = null,
    overshootClamping: js.UndefOr[Boolean] = js.undefined,
    restDisplacementThreshold: Int | Double = null,
    restSpeedThreshold: Int | Double = null,
    speed: Int | Double = null,
    stiffness: Int | Double = null,
    tension: Int | Double = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    velocity: Double | Point = null
  ): AnimatedRegionSpringConfig = {
    val __obj = js.Dynamic.literal()
    if (bounciness != null) __obj.updateDynamic("bounciness")(bounciness.asInstanceOf[js.Any])
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (!js.isUndefined(overshootClamping)) __obj.updateDynamic("overshootClamping")(overshootClamping.asInstanceOf[js.Any])
    if (restDisplacementThreshold != null) __obj.updateDynamic("restDisplacementThreshold")(restDisplacementThreshold.asInstanceOf[js.Any])
    if (restSpeedThreshold != null) __obj.updateDynamic("restSpeedThreshold")(restSpeedThreshold.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (tension != null) __obj.updateDynamic("tension")(tension.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedRegionSpringConfig]
  }
}

