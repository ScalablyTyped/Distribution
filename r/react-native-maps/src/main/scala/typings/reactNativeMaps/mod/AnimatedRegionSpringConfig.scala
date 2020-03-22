package typings.reactNativeMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-native.react-native.Animated.AnimationConfig */
/* Inlined parent std.Partial<react-native-maps.react-native-maps.Region> */
trait AnimatedRegionSpringConfig extends js.Object {
  var bounciness: js.UndefOr[Double] = js.undefined
  var damping: js.UndefOr[Double] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  var latitude: js.UndefOr[Double] = js.undefined
  var latitudeDelta: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var longitudeDelta: js.UndefOr[Double] = js.undefined
  var mass: js.UndefOr[Double] = js.undefined
  var overshootClamping: js.UndefOr[Boolean] = js.undefined
  var restDisplacementThreshold: js.UndefOr[Double] = js.undefined
  var restSpeedThreshold: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
  var tension: js.UndefOr[Double] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  var velocity: js.UndefOr[Double | Point] = js.undefined
}

object AnimatedRegionSpringConfig {
  @scala.inline
  def apply(
    bounciness: Int | Double = null,
    damping: Int | Double = null,
    friction: Int | Double = null,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    latitude: Int | Double = null,
    latitudeDelta: Int | Double = null,
    longitude: Int | Double = null,
    longitudeDelta: Int | Double = null,
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
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (latitudeDelta != null) __obj.updateDynamic("latitudeDelta")(latitudeDelta.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (longitudeDelta != null) __obj.updateDynamic("longitudeDelta")(longitudeDelta.asInstanceOf[js.Any])
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

