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

