package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router extends js.Object {
  var enhancer: StoreEnhancer[Location, js.Object]
  var middleware: Middleware[js.Object, _, Dispatch[AnyAction]]
  var reducer: Reducer[Location, AnyAction]
}

object Router {
  @scala.inline
  def apply(
    enhancer: StoreEnhancer[Location, js.Object],
    middleware: Middleware[js.Object, _, Dispatch[AnyAction]],
    reducer: Reducer[Location, AnyAction]
  ): Router = {
    val __obj = js.Dynamic.literal(enhancer = enhancer, middleware = middleware, reducer = reducer)
  
    __obj.asInstanceOf[Router]
  }
}

