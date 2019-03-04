package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationResetAction
  extends NavigationStackAction
     with NavigationResetActionPayload {
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/RESET`
}

object NavigationResetAction {
  @scala.inline
  def apply(
    actions: js.Array[NavigationNavigateAction],
    index: scala.Double,
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/RESET`,
    key: java.lang.String = null
  ): NavigationResetAction = {
    val __obj = js.Dynamic.literal(actions = actions, index = index)
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationResetAction]
  }
}

