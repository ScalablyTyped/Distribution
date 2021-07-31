package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _NavigationAction extends StObject
object _NavigationAction {
  
  @scala.inline
  def Key(): typings.reactNavigation.anon.Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CHILD_ACTION")
    __obj.asInstanceOf[typings.reactNavigation.anon.Key]
  }
  
  @scala.inline
  def NavigationBackAction(): typings.reactNavigation.mod.NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/BACK")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationBackAction]
  }
  
  @scala.inline
  def NavigationCloseDrawerAction(): typings.reactNavigation.mod.NavigationCloseDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/CLOSE_DRAWER")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationCloseDrawerAction]
  }
  
  @scala.inline
  def NavigationCompleteTransitionAction(key: String): typings.reactNavigation.mod.NavigationCompleteTransitionAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/COMPLETE_TRANSITION")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationCompleteTransitionAction]
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
  def NavigationInitAction(): typings.reactNavigation.mod.NavigationInitAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/INIT")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationInitAction]
  }
  
  @scala.inline
  def NavigationNavigateAction(routeName: String): typings.reactNavigation.mod.NavigationNavigateAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/NAVIGATE")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationNavigateAction]
  }
  
  @scala.inline
  def NavigationOpenDrawerAction(): typings.reactNavigation.mod.NavigationOpenDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/OPEN_DRAWER")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationOpenDrawerAction]
  }
  
  @scala.inline
  def NavigationPopAction(): typings.reactNavigation.mod.NavigationPopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/POP")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationPopAction]
  }
  
  @scala.inline
  def NavigationPopToTopAction(): typings.reactNavigation.mod.NavigationPopToTopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/POP_TO_TOP")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationPopToTopAction]
  }
  
  @scala.inline
  def NavigationPushAction(routeName: String): typings.reactNavigation.mod.NavigationPushAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/PUSH")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationPushAction]
  }
  
  @scala.inline
  def NavigationReplaceAction(key: String, routeName: String): typings.reactNavigation.mod.NavigationReplaceAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/REPLACE")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationReplaceAction]
  }
  
  @scala.inline
  def NavigationResetAction(actions: js.Array[NavigationNavigateAction], index: Double): typings.reactNavigation.mod.NavigationResetAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/RESET")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationResetAction]
  }
  
  @scala.inline
  def NavigationSetParamsAction(key: String, params: NavigationParams): typings.reactNavigation.mod.NavigationSetParamsAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/SET_PARAMS")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationSetParamsAction]
  }
  
  @scala.inline
  def NavigationToggleDrawerAction(): typings.reactNavigation.mod.NavigationToggleDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/TOGGLE_DRAWER")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationToggleDrawerAction]
  }
}
