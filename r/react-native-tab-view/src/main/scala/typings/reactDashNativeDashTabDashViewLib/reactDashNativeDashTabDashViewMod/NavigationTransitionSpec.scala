package typings
package reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationTransitionSpec extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  // An easing function from `Easing`.
  var easing: js.UndefOr[reactDashNativeLib.reactDashNativeMod.EasingFunction] = js.undefined
  // A timing function such as `Animated.timing`.
  var timing: js.UndefOr[
    js.Function2[
      /* value */ reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value, 
      /* config */ js.Any, 
      _
    ]
  ] = js.undefined
}

object NavigationTransitionSpec {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    easing: reactDashNativeLib.reactDashNativeMod.EasingFunction = null,
    timing: js.Function2[
      /* value */ reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value, 
      /* config */ js.Any, 
      _
    ] = null
  ): NavigationTransitionSpec = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (timing != null) __obj.updateDynamic("timing")(timing)
    __obj.asInstanceOf[NavigationTransitionSpec]
  }
}

