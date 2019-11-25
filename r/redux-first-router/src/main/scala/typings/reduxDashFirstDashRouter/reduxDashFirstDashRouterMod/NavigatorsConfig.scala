package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import typings.reduxDashFirstDashRouter.Anon_Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorsConfig[TKeys, TState] extends js.Object {
  var navigators: Navigators[TState]
  def actionToNavigation(
    navigators: Navigators[TState],
     // TODO check this
  action: js.Object,
    navigationAction: Nullable[NavigationAction],
    route: Nullable[Route[TKeys, TState]]
  ): js.Object
  def navigationToAction(
    navigators: Navigators[TState],
    store: Store[TState, AnyAction],
    routesMap: RoutesMap[TKeys, TState],
    action: js.Object
  ): Anon_Action
  def patchNavigators(navigators: Navigators[TState]): Unit
}

object NavigatorsConfig {
  @scala.inline
  def apply[TKeys, TState](
    actionToNavigation: (Navigators[TState], js.Object, Nullable[NavigationAction], Nullable[Route[TKeys, TState]]) => js.Object,
    navigationToAction: (Navigators[TState], Store[TState, AnyAction], RoutesMap[TKeys, TState], js.Object) => Anon_Action,
    navigators: Navigators[TState],
    patchNavigators: Navigators[TState] => Unit
  ): NavigatorsConfig[TKeys, TState] = {
    val __obj = js.Dynamic.literal(actionToNavigation = js.Any.fromFunction4(actionToNavigation), navigationToAction = js.Any.fromFunction4(navigationToAction), navigators = navigators.asInstanceOf[js.Any], patchNavigators = js.Any.fromFunction1(patchNavigators))
  
    __obj.asInstanceOf[NavigatorsConfig[TKeys, TState]]
  }
}

