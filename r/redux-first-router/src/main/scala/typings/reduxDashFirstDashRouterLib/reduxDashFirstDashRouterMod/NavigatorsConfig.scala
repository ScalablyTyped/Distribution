package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

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
    store: reduxLib.reduxMod.Store[TState, reduxLib.reduxMod.AnyAction],
    routesMap: RoutesMap[TKeys, TState],
    action: js.Object
  ): reduxDashFirstDashRouterLib.Anon_Action
  def patchNavigators(navigators: Navigators[TState]): scala.Unit
}

object NavigatorsConfig {
  @scala.inline
  def apply[TKeys, TState](
    actionToNavigation: (Navigators[TState], js.Object, Nullable[NavigationAction], Nullable[Route[TKeys, TState]]) => js.Object,
    navigationToAction: (Navigators[TState], reduxLib.reduxMod.Store[TState, reduxLib.reduxMod.AnyAction], RoutesMap[TKeys, TState], js.Object) => reduxDashFirstDashRouterLib.Anon_Action,
    navigators: Navigators[TState],
    patchNavigators: Navigators[TState] => scala.Unit
  ): NavigatorsConfig[TKeys, TState] = {
    val __obj = js.Dynamic.literal(actionToNavigation = js.Any.fromFunction4(actionToNavigation), navigationToAction = js.Any.fromFunction4(navigationToAction), navigators = navigators, patchNavigators = js.Any.fromFunction1(patchNavigators))
  
    __obj.asInstanceOf[NavigatorsConfig[TKeys, TState]]
  }
}

