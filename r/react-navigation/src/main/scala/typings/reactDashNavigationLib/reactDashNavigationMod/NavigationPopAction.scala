package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPopAction
  extends NavigationStackAction
     with NavigationPopActionPayload {
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/POP`
}

object NavigationPopAction {
  @scala.inline
  def apply(
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/POP`,
    immediate: js.UndefOr[scala.Boolean] = js.undefined,
    n: scala.Int | scala.Double = null
  ): NavigationPopAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPopAction]
  }
}

