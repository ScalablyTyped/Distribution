package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashCLOSE_DRAWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationCloseDrawerAction extends NavigationDrawerAction {
  var key: js.UndefOr[String] = js.undefined
  var `type`: NavigationSlashCLOSE_DRAWER
}

object NavigationCloseDrawerAction {
  @scala.inline
  def apply(`type`: NavigationSlashCLOSE_DRAWER, key: String = null): NavigationCloseDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationCloseDrawerAction]
  }
}

