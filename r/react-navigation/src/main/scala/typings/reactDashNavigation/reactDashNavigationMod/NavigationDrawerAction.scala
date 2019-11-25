package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/CLOSE_DRAWER`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/DRAWER_CLOSED`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/DRAWER_OPENED`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/OPEN_DRAWER`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/TOGGLE_DRAWER`
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
  def NavigationOpenDrawerAction(`type`: `Navigation/OPEN_DRAWER`, key: String = null): NavigationDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerAction]
  }
  @scala.inline
  def NavigationDrawerOpenedAction(`type`: `Navigation/DRAWER_OPENED`, key: String = null): NavigationDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerAction]
  }
  @scala.inline
  def NavigationDrawerClosedAction(`type`: `Navigation/DRAWER_CLOSED`, key: String = null): NavigationDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerAction]
  }
  @scala.inline
  def NavigationCloseDrawerAction(`type`: `Navigation/CLOSE_DRAWER`, key: String = null): NavigationDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerAction]
  }
  @scala.inline
  def NavigationToggleDrawerAction(`type`: `Navigation/TOGGLE_DRAWER`, key: String = null): NavigationDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerAction]
  }
}

