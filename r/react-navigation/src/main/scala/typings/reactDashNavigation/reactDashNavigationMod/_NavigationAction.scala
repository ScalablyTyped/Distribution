package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.CHILD_ACTION
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashBACK
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashCLOSE_DRAWER
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashCOMPLETE_TRANSITION
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashDRAWER_CLOSED
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashDRAWER_OPENED
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashINIT
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashNAVIGATE
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashOPEN_DRAWER
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashPOP
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashPOP_TO_TOP
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashPUSH
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashREPLACE
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashRESET
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashSET_PARAMS
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashTOGGLE_DRAWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _NavigationAction extends js.Object

object _NavigationAction {
  @scala.inline
  def NavigationCompleteTransitionAction(key: String, `type`: NavigationSlashCOMPLETE_TRANSITION): _NavigationAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationPopToTopAction(
    `type`: NavigationSlashPOP_TO_TOP,
    immediate: js.UndefOr[Boolean] = js.undefined,
    key: String = null
  ): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationDrawerOpenedAction(`type`: NavigationSlashDRAWER_OPENED, key: String = null): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationPushAction(
    routeName: String,
    `type`: NavigationSlashPUSH,
    action: NavigationNavigateAction = null,
    key: String = null,
    params: NavigationParams = null
  ): _NavigationAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationNavigateAction(
    routeName: String,
    `type`: NavigationSlashNAVIGATE,
    action: typings.reactDashNavigation.reactDashNavigationMod.NavigationNavigateAction = null,
    key: String = null,
    params: NavigationParams = null
  ): _NavigationAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationInitAction(`type`: NavigationSlashINIT, key: String = null, params: NavigationParams = null): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationToggleDrawerAction(`type`: NavigationSlashTOGGLE_DRAWER, key: String = null): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationDrawerClosedAction(`type`: NavigationSlashDRAWER_CLOSED, key: String = null): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationCloseDrawerAction(`type`: NavigationSlashCLOSE_DRAWER, key: String = null): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationSetParamsAction(key: String, `type`: NavigationSlashSET_PARAMS, params: NavigationParams = null): _NavigationAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationPopAction(
    `type`: NavigationSlashPOP,
    immediate: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    n: Int | Double = null
  ): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def Anon_CHILDACTION(`type`: CHILD_ACTION, key: String = null): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationResetAction(
    actions: js.Array[NavigationNavigateAction],
    index: Double,
    `type`: NavigationSlashRESET,
    key: String = null
  ): _NavigationAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationOpenDrawerAction(`type`: NavigationSlashOPEN_DRAWER, key: String = null): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationBackAction(`type`: NavigationSlashBACK, immediate: js.UndefOr[Boolean] = js.undefined, key: String = null): _NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
  @scala.inline
  def NavigationReplaceAction(
    key: String,
    routeName: String,
    `type`: NavigationSlashREPLACE,
    action: NavigationNavigateAction = null,
    params: NavigationParams = null
  ): _NavigationAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NavigationAction]
  }
}

