package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavigationTransitionSpec extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  // An easing function from `Easing`.
  var easing: js.UndefOr[js.Function1[/* t */ scala.Double, scala.Double]] = js.undefined
  // A timing function such as `Animated.timing`.
  var timing: js.UndefOr[js.Function2[/* value */ AnimatedValue, /* config */ js.Any, _]] = js.undefined
}

