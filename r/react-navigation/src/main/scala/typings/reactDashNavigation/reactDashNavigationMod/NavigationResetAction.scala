package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/RESET`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationResetAction
  extends NavigationStackAction
     with NavigationResetActionPayload {
  var `type`: `Navigation/RESET`
}

object NavigationResetAction {
  @scala.inline
  def apply(
    actions: js.Array[NavigationNavigateAction],
    index: Double,
    `type`: `Navigation/RESET`,
    key: String = null
  ): NavigationResetAction = {
    val __obj = js.Dynamic.literal(actions = actions, index = index)
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationResetAction]
  }
}

