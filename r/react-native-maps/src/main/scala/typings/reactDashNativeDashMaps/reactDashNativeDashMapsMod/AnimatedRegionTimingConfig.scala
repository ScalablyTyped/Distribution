package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import typings.reactDashNative.reactDashNativeMod.Animated.AnimationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// =======================================================================
//  AnimatedRegion
// =======================================================================
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-native-maps.react-native-maps.Region ]:? react-native-maps.react-native-maps.Region[P]} */ trait AnimatedRegionTimingConfig extends AnimationConfig {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
}

object AnimatedRegionTimingConfig {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    duration: Int | Double = null,
    easing: /* value */ Double => Double = null,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): AnimatedRegionTimingConfig = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction)
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    __obj.asInstanceOf[AnimatedRegionTimingConfig]
  }
}

