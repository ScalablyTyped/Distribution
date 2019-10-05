package typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod

import typings.reactDashNative.reactDashNativeMod.Animated.Value
import typings.reactDashNative.reactDashNativeMod.EasingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationTransitionSpec extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  // An easing function from `Easing`.
  var easing: js.UndefOr[EasingFunction] = js.undefined
  // A timing function such as `Animated.timing`.
  var timing: js.UndefOr[js.Function2[/* value */ Value, /* config */ js.Any, _]] = js.undefined
}

object NavigationTransitionSpec {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    easing: /* value */ Double => Double = null,
    timing: (/* value */ Value, /* config */ js.Any) => _ = null
  ): NavigationTransitionSpec = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (timing != null) __obj.updateDynamic("timing")(js.Any.fromFunction2(timing))
    __obj.asInstanceOf[NavigationTransitionSpec]
  }
}

