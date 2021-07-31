package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigation.mod.NavigationDrawerOpenedAction
  - typings.reactNavigation.mod.NavigationDrawerClosedAction
  - typings.reactNavigation.mod.NavigationOpenDrawerAction
  - typings.reactNavigation.mod.NavigationCloseDrawerAction
  - typings.reactNavigation.mod.NavigationToggleDrawerAction
*/
trait NavigationDrawerAction
  extends StObject
     with _NavigationAction
object NavigationDrawerAction {
  
  @scala.inline
  def NavigationCloseDrawerAction(): typings.reactNavigation.mod.NavigationCloseDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/CLOSE_DRAWER")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationCloseDrawerAction]
  }
  
  @scala.inline
  def NavigationDrawerClosedAction(): typings.reactNavigation.mod.NavigationDrawerClosedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/DRAWER_CLOSED")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationDrawerClosedAction]
  }
  
  @scala.inline
  def NavigationDrawerOpenedAction(): typings.reactNavigation.mod.NavigationDrawerOpenedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/DRAWER_OPENED")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationDrawerOpenedAction]
  }
  
  @scala.inline
  def NavigationOpenDrawerAction(): typings.reactNavigation.mod.NavigationOpenDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/OPEN_DRAWER")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationOpenDrawerAction]
  }
  
  @scala.inline
  def NavigationToggleDrawerAction(): typings.reactNavigation.mod.NavigationToggleDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/TOGGLE_DRAWER")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationToggleDrawerAction]
  }
}
