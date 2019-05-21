package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router extends js.Object {
  var enhancer: reduxLib.reduxMod.StoreEnhancer[Location, js.Object]
  var middleware: reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]]
  var reducer: reduxLib.reduxMod.Reducer[Location, reduxLib.reduxMod.AnyAction]
}

object Router {
  @scala.inline
  def apply(
    enhancer: reduxLib.reduxMod.StoreEnhancer[Location, js.Object],
    middleware: reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]],
    reducer: reduxLib.reduxMod.Reducer[Location, reduxLib.reduxMod.AnyAction]
  ): Router = {
    val __obj = js.Dynamic.literal(enhancer = enhancer, middleware = middleware, reducer = reducer)
  
    __obj.asInstanceOf[Router]
  }
}

