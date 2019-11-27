package typings.reactDashNavigationDashDrawer

import typings.reactDashNavigation.reactDashNavigationMod.NavigationAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationBackAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationCloseDrawerAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationCompleteTransitionAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationComponent
import typings.reactDashNavigation.reactDashNavigationMod.NavigationDrawerClosedAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationDrawerOpenedAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationInitAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationJumpToAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationNavigateAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationOpenDrawerAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationPopAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationPopToTopAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationPushAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationReplaceAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationResetAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenOptionsGetter
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typings.reactDashNavigation.reactDashNavigationMod.NavigationSetParamsAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationToggleDrawerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Action extends js.Object {
  var getScreenOptions: NavigationScreenOptionsGetter[_] = js.native
  def getActionCreators(route: NavigationRoute[NavigationParams], navStateKey: String): Anon_CloseDrawer = js.native
  def getActionForPathAndParams(path: String): NavigationInitAction | NavigationNavigateAction | NavigationBackAction | NavigationSetParamsAction | NavigationResetAction | NavigationReplaceAction | NavigationPopAction | NavigationPushAction | NavigationPopToTopAction | NavigationCompleteTransitionAction | NavigationDrawerOpenedAction | NavigationDrawerClosedAction | NavigationOpenDrawerAction | NavigationCloseDrawerAction | NavigationToggleDrawerAction | NavigationJumpToAction | Anon_CHILDACTION | Null = js.native
  def getActionForPathAndParams(path: String, params: NavigationParams): NavigationInitAction | NavigationNavigateAction | NavigationBackAction | NavigationSetParamsAction | NavigationResetAction | NavigationReplaceAction | NavigationPopAction | NavigationPushAction | NavigationPopToTopAction | NavigationCompleteTransitionAction | NavigationDrawerOpenedAction | NavigationDrawerClosedAction | NavigationOpenDrawerAction | NavigationCloseDrawerAction | NavigationToggleDrawerAction | NavigationJumpToAction | Anon_CHILDACTION | Null = js.native
  def getComponentForRouteName(routeName: String): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  def getComponentForState(state: js.Any): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  def getPathAndParamsForState(state: js.Any): Anon_Params = js.native
  def getStateForAction(action: NavigationAction): js.Any = js.native
  def getStateForAction(action: NavigationAction, state: NavigationLeafRouteNavigationParamsNavigationState): js.Any = js.native
  def getStateForAction(action: NavigationAction, state: NavigationLeafRouteNavigationParamsisDrawerOpenany): js.Any = js.native
}

