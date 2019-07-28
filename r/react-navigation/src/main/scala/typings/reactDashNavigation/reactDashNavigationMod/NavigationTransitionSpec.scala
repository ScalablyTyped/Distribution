package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationTransitionSpec extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  // An easing function from `Easing`.
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var tension: js.UndefOr[Double] = js.undefined
  // A timing function such as `Animated.timing`.
  var timing: js.UndefOr[js.Function2[/* value */ AnimatedValue, /* config */ js.Any, _]] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}

object NavigationTransitionSpec {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    easing: /* t */ Double => Double = null,
    friction: Int | Double = null,
    tension: Int | Double = null,
    timing: (/* value */ AnimatedValue, /* config */ js.Any) => _ = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): NavigationTransitionSpec = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (tension != null) __obj.updateDynamic("tension")(tension.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(js.Any.fromFunction2(timing))
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    __obj.asInstanceOf[NavigationTransitionSpec]
  }
}

