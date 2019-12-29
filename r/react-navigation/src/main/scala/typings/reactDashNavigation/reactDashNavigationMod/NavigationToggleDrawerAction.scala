package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashTOGGLE_DRAWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationToggleDrawerAction extends NavigationDrawerAction {
  var key: js.UndefOr[String] = js.undefined
  var `type`: NavigationSlashTOGGLE_DRAWER
}

object NavigationToggleDrawerAction {
  @scala.inline
  def apply(`type`: NavigationSlashTOGGLE_DRAWER, key: String = null): NavigationToggleDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationToggleDrawerAction]
  }
}

