package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// =======================================================================
//  AnimatedRegion
// =======================================================================
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-native-maps.react-native-maps.Region ]:? react-native-maps.react-native-maps.Region[P]} */ trait AnimatedRegionTimingConfig
  extends reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimationConfig {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Double]] = js.undefined
}

object AnimatedRegionTimingConfig {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    easing: /* value */ scala.Double => scala.Double = null,
    isInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
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

