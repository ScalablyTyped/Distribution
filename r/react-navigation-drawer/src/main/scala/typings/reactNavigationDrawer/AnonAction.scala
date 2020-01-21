package typings.reactNavigationDrawer

import typings.reactNavigation.mod.NavigationAction
import typings.reactNavigation.mod.NavigationBackAction
import typings.reactNavigation.mod.NavigationCloseDrawerAction
import typings.reactNavigation.mod.NavigationCompleteTransitionAction
import typings.reactNavigation.mod.NavigationComponent
import typings.reactNavigation.mod.NavigationDrawerClosedAction
import typings.reactNavigation.mod.NavigationDrawerOpenedAction
import typings.reactNavigation.mod.NavigationInitAction
import typings.reactNavigation.mod.NavigationJumpToAction
import typings.reactNavigation.mod.NavigationNavigateAction
import typings.reactNavigation.mod.NavigationOpenDrawerAction
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationPopAction
import typings.reactNavigation.mod.NavigationPopToTopAction
import typings.reactNavigation.mod.NavigationPushAction
import typings.reactNavigation.mod.NavigationReplaceAction
import typings.reactNavigation.mod.NavigationResetAction
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenOptionsGetter
import typings.reactNavigation.mod.NavigationScreenProp
import typings.reactNavigation.mod.NavigationSetParamsAction
import typings.reactNavigation.mod.NavigationToggleDrawerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAction extends js.Object {
  var getScreenOptions: NavigationScreenOptionsGetter[_] = js.native
  def getActionCreators(route: NavigationRoute[NavigationParams], navStateKey: String): AnonCloseDrawer = js.native
  def getActionForPathAndParams(path: String): NavigationInitAction | NavigationNavigateAction | NavigationBackAction | NavigationSetParamsAction | NavigationResetAction | NavigationReplaceAction | NavigationPopAction | NavigationPushAction | NavigationPopToTopAction | NavigationCompleteTransitionAction | NavigationDrawerOpenedAction | NavigationDrawerClosedAction | NavigationOpenDrawerAction | NavigationCloseDrawerAction | NavigationToggleDrawerAction | NavigationJumpToAction | AnonCHILDACTION | Null = js.native
  def getActionForPathAndParams(path: String, params: NavigationParams): NavigationInitAction | NavigationNavigateAction | NavigationBackAction | NavigationSetParamsAction | NavigationResetAction | NavigationReplaceAction | NavigationPopAction | NavigationPushAction | NavigationPopToTopAction | NavigationCompleteTransitionAction | NavigationDrawerOpenedAction | NavigationDrawerClosedAction | NavigationOpenDrawerAction | NavigationCloseDrawerAction | NavigationToggleDrawerAction | NavigationJumpToAction | AnonCHILDACTION | Null = js.native
  def getComponentForRouteName(routeName: String): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  def getComponentForState(state: js.Any): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  def getPathAndParamsForState(state: js.Any): AnonParams = js.native
  def getStateForAction(action: NavigationAction): js.Any = js.native
  def getStateForAction(action: NavigationAction, state: NavigationLeafRouteNavigationParamsNavigationState): js.Any = js.native
  def getStateForAction(action: NavigationAction, state: NavigationLeafRouteNavigationParamsisDrawerOpenany): js.Any = js.native
}

