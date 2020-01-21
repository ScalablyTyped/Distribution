package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashREPLACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationReplaceAction extends NavigationStackAction {
  var action: js.UndefOr[NavigationNavigateAction] = js.undefined
  var key: String
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routeName: String
  var `type`: NavigationSlashREPLACE
}

object NavigationReplaceAction {
  @scala.inline
  def apply(
    key: String,
    routeName: String,
    `type`: NavigationSlashREPLACE,
    action: NavigationNavigateAction = null,
    params: NavigationParams = null
  ): NavigationReplaceAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationReplaceAction]
  }
}

