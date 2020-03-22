package typings.reactNativeMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// =======================================================================
//  AnimatedRegion
// =======================================================================
/* Inlined parent react-native.react-native.Animated.AnimationConfig */
/* Inlined parent std.Partial<react-native-maps.react-native-maps.Region> */
trait AnimatedRegionTimingConfig extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  var latitude: js.UndefOr[Double] = js.undefined
  var latitudeDelta: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var longitudeDelta: js.UndefOr[Double] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}

object AnimatedRegionTimingConfig {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    duration: Int | Double = null,
    easing: /* value */ Double => Double = null,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    latitude: Int | Double = null,
    latitudeDelta: Int | Double = null,
    longitude: Int | Double = null,
    longitudeDelta: Int | Double = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): AnimatedRegionTimingConfig = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (latitudeDelta != null) __obj.updateDynamic("latitudeDelta")(latitudeDelta.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (longitudeDelta != null) __obj.updateDynamic("longitudeDelta")(longitudeDelta.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedRegionTimingConfig]
  }
}

