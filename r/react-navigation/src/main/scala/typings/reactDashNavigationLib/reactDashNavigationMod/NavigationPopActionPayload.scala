package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPopActionPayload extends js.Object {
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
  // n: the number of routes to pop of the stack
  var n: js.UndefOr[scala.Double] = js.undefined
}

object NavigationPopActionPayload {
  @scala.inline
  def apply(immediate: js.UndefOr[scala.Boolean] = js.undefined, n: scala.Int | scala.Double = null): NavigationPopActionPayload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPopActionPayload]
  }
}

