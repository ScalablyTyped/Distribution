package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.CHILD_ACTION
import typings.reactNavigation.reactNavigationStrings.NavigationSlashBACK
import typings.reactNavigation.reactNavigationStrings.NavigationSlashCLOSE_DRAWER
import typings.reactNavigation.reactNavigationStrings.NavigationSlashCOMPLETE_TRANSITION
import typings.reactNavigation.reactNavigationStrings.NavigationSlashDRAWER_CLOSED
import typings.reactNavigation.reactNavigationStrings.NavigationSlashDRAWER_OPENED
import typings.reactNavigation.reactNavigationStrings.NavigationSlashINIT
import typings.reactNavigation.reactNavigationStrings.NavigationSlashNAVIGATE
import typings.reactNavigation.reactNavigationStrings.NavigationSlashOPEN_DRAWER
import typings.reactNavigation.reactNavigationStrings.NavigationSlashPOP
import typings.reactNavigation.reactNavigationStrings.NavigationSlashPOP_TO_TOP
import typings.reactNavigation.reactNavigationStrings.NavigationSlashPUSH
import typings.reactNavigation.reactNavigationStrings.NavigationSlashREPLACE
import typings.reactNavigation.reactNavigationStrings.NavigationSlashRESET
import typings.reactNavigation.reactNavigationStrings.NavigationSlashSET_PARAMS
import typings.reactNavigation.reactNavigationStrings.NavigationSlashTOGGLE_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _NavigationAction extends StObject
object _NavigationAction {
  
  @scala.inline
  def NavigationBackAction(`type`: NavigationSlashBACK): typings.reactNavigation.mod.NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationBackAction]
  }
  
  @scala.inline
  def NavigationCloseDrawerAction(`type`: NavigationSlashCLOSE_DRAWER): typings.reactNavigation.mod.NavigationCloseDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationCloseDrawerAction]
  }
  
  @scala.inline
  def NavigationCompleteTransitionAction(key: String, `type`: NavigationSlashCOMPLETE_TRANSITION): typings.reactNavigation.mod.NavigationCompleteTransitionAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationCompleteTransitionAction]
  }
  
  @scala.inline
  def NavigationDrawerClosedAction(`type`: NavigationSlashDRAWER_CLOSED): typings.reactNavigation.mod.NavigationDrawerClosedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationDrawerClosedAction]
  }
  
  @scala.inline
  def NavigationDrawerOpenedAction(`type`: NavigationSlashDRAWER_OPENED): typings.reactNavigation.mod.NavigationDrawerOpenedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationDrawerOpenedAction]
  }
  
  @scala.inline
  def NavigationInitAction(`type`: NavigationSlashINIT): typings.reactNavigation.mod.NavigationInitAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationInitAction]
  }
  
  @scala.inline
  def NavigationNavigateAction(routeName: String, `type`: NavigationSlashNAVIGATE): typings.reactNavigation.mod.NavigationNavigateAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationNavigateAction]
  }
  
  @scala.inline
  def NavigationOpenDrawerAction(`type`: NavigationSlashOPEN_DRAWER): typings.reactNavigation.mod.NavigationOpenDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationOpenDrawerAction]
  }
  
  @scala.inline
  def NavigationPopAction(`type`: NavigationSlashPOP): typings.reactNavigation.mod.NavigationPopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationPopAction]
  }
  
  @scala.inline
  def NavigationPopToTopAction(`type`: NavigationSlashPOP_TO_TOP): typings.reactNavigation.mod.NavigationPopToTopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationPopToTopAction]
  }
  
  @scala.inline
  def NavigationPushAction(routeName: String, `type`: NavigationSlashPUSH): typings.reactNavigation.mod.NavigationPushAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationPushAction]
  }
  
  @scala.inline
  def NavigationReplaceAction(key: String, routeName: String, `type`: NavigationSlashREPLACE): typings.reactNavigation.mod.NavigationReplaceAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationReplaceAction]
  }
  
  @scala.inline
  def NavigationResetAction(actions: js.Array[NavigationNavigateAction], index: Double, `type`: NavigationSlashRESET): typings.reactNavigation.mod.NavigationResetAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationResetAction]
  }
  
  @scala.inline
  def NavigationSetParamsAction(key: String, params: NavigationParams, `type`: NavigationSlashSET_PARAMS): typings.reactNavigation.mod.NavigationSetParamsAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationSetParamsAction]
  }
  
  @scala.inline
  def NavigationToggleDrawerAction(`type`: NavigationSlashTOGGLE_DRAWER): typings.reactNavigation.mod.NavigationToggleDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationToggleDrawerAction]
  }
  
  @scala.inline
  def Type(`type`: CHILD_ACTION): typings.reactNavigation.anon.Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigation.anon.Type]
  }
}
