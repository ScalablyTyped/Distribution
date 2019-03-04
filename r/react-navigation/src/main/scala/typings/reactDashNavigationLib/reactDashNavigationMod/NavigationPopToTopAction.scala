package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPopToTopAction
  extends NavigationStackAction
     with NavigationPopToTopActionPayload {
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/POP_TO_TOP`
}

object NavigationPopToTopAction {
  @scala.inline
  def apply(
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/POP_TO_TOP`,
    immediate: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null
  ): NavigationPopToTopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationPopToTopAction]
  }
}

