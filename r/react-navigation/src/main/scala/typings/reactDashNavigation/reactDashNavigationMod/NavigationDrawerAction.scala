package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashCLOSE_DRAWER
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashDRAWER_CLOSED
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashDRAWER_OPENED
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashOPEN_DRAWER
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashTOGGLE_DRAWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationDrawerOpenedAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationDrawerClosedAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationOpenDrawerAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationCloseDrawerAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationToggleDrawerAction
*/
trait NavigationDrawerAction extends _NavigationAction

object NavigationDrawerAction {
  @scala.inline
  def NavigationDrawerOpenedAction(`type`: NavigationSlashDRAWER_OPENED, key: String = null): NavigationDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerAction]
  }
  @scala.inline
  def NavigationToggleDrawerAction(`type`: NavigationSlashTOGGLE_DRAWER, key: String = null): NavigationDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerAction]
  }
  @scala.inline
  def NavigationDrawerClosedAction(`type`: NavigationSlashDRAWER_CLOSED, key: String = null): NavigationDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerAction]
  }
  @scala.inline
  def NavigationCloseDrawerAction(`type`: NavigationSlashCLOSE_DRAWER, key: String = null): NavigationDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerAction]
  }
  @scala.inline
  def NavigationOpenDrawerAction(`type`: NavigationSlashOPEN_DRAWER, key: String = null): NavigationDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerAction]
  }
}

