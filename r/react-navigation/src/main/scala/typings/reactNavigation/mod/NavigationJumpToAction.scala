package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashJUMP_TO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationJumpToAction extends js.Object {
  var key: String
  var preserveFocus: js.UndefOr[Boolean] = js.undefined
  var routeName: String
  var `type`: NavigationSlashJUMP_TO
}

object NavigationJumpToAction {
  @scala.inline
  def apply(
    key: String,
    routeName: String,
    `type`: NavigationSlashJUMP_TO,
    preserveFocus: js.UndefOr[Boolean] = js.undefined
  ): NavigationJumpToAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFocus)) __obj.updateDynamic("preserveFocus")(preserveFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationJumpToAction]
  }
}

