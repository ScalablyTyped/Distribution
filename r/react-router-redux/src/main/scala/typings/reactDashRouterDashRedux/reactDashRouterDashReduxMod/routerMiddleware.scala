package typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-redux", "routerMiddleware")
@js.native
object routerMiddleware extends js.Object {
  def apply(history: History[LocationState]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

