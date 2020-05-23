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
  var useNativeDriver: Boolean
}

object AnimatedRegionTimingConfig {
  @scala.inline
  def apply(
    useNativeDriver: Boolean,
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: /* value */ Double => Double = null,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    latitude: js.UndefOr[Double] = js.undefined,
    latitudeDelta: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    longitudeDelta: js.UndefOr[Double] = js.undefined
  ): AnimatedRegionTimingConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latitudeDelta)) __obj.updateDynamic("latitudeDelta")(latitudeDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitudeDelta)) __obj.updateDynamic("longitudeDelta")(longitudeDelta.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedRegionTimingConfig]
  }
}

