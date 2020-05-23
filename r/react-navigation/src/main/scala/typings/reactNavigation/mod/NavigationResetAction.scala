package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashRESET
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
    key: js.UndefOr[Null | String] = js.undefined
  ): NavigationResetAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationResetAction]
  }
}

