package typings.reduxFirstRouting.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "routerMiddleware")
@js.native
object routerMiddleware extends js.Object {
  def apply(history: History[LocationState]): Middleware[_, State, Dispatch[AnyAction]] = js.native
}

