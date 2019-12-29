package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashRESET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationResetAction
  extends NavigationStackAction
     with NavigationResetActionPayload {
  var `type`: NavigationSlashRESET
}

object NavigationResetAction {
  @scala.inline
  def apply(
    actions: js.Array[NavigationNavigateAction],
    index: Double,
    `type`: NavigationSlashRESET,
    key: String = null
  ): NavigationResetAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationResetAction]
  }
}

