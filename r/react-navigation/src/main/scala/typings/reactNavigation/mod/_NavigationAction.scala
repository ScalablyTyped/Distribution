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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _NavigationAction extends js.Object

object _NavigationAction {
  @scala.inline
  def NavigationPushAction(routeName: String, `type`: NavigationSlashPUSH): _NavigationAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationCloseDrawerAction(`type`: NavigationSlashCLOSE_DRAWER): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationDrawerOpenedAction(`type`: NavigationSlashDRAWER_OPENED): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationOpenDrawerAction(`type`: NavigationSlashOPEN_DRAWER): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationNavigateAction(routeName: String, `type`: NavigationSlashNAVIGATE): _NavigationAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationDrawerClosedAction(`type`: NavigationSlashDRAWER_CLOSED): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationCompleteTransitionAction(key: String, `type`: NavigationSlashCOMPLETE_TRANSITION): _NavigationAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationBackAction(`type`: NavigationSlashBACK): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationSetParamsAction(key: String, params: NavigationParams, `type`: NavigationSlashSET_PARAMS): _NavigationAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def Type(`type`: CHILD_ACTION): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationPopAction(`type`: NavigationSlashPOP): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationToggleDrawerAction(`type`: NavigationSlashTOGGLE_DRAWER): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationInitAction(`type`: NavigationSlashINIT): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationPopToTopAction(`type`: NavigationSlashPOP_TO_TOP): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationResetAction(actions: js.Array[NavigationNavigateAction], index: Double, `type`: NavigationSlashRESET): _NavigationAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationReplaceAction(key: String, routeName: String, `type`: NavigationSlashREPLACE): _NavigationAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
}

