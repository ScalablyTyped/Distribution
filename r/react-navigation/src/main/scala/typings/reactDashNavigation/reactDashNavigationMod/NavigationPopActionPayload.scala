package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPopActionPayload extends js.Object {
  var immediate: js.UndefOr[Boolean] = js.undefined
  // n: the number of routes to pop of the stack
  var n: js.UndefOr[Double] = js.undefined
}

object NavigationPopActionPayload {
  @scala.inline
  def apply(immediate: js.UndefOr[Boolean] = js.undefined, n: Int | Double = null): NavigationPopActionPayload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPopActionPayload]
  }
}

