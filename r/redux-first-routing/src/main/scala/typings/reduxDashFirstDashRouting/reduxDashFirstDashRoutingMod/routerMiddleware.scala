package typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingMod

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "routerMiddleware")
@js.native
object routerMiddleware extends js.Object {
  def apply(history: History[LocationState]): Middleware[_, State, Dispatch[AnyAction]] = js.native
}

