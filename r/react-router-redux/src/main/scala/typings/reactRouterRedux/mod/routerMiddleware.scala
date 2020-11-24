package typings.reactRouterRedux.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-router-redux", "routerMiddleware")
@js.native
object routerMiddleware extends js.Object {
  
  def apply(history: History[LocationState]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}
