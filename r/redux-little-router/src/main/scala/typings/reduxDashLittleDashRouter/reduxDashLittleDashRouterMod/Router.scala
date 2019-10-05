package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.MiddlewareAPI
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.StoreEnhancer
import typings.redux.reduxMod.StoreEnhancerStoreCreator
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
    enhancer: /* next */ StoreEnhancerStoreCreator[js.Object, js.Object] => StoreEnhancerStoreCreator[Location, js.Object],
    middleware: /* api */ MiddlewareAPI[Dispatch[AnyAction], _] => js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ js.Any, js.Any]],
    reducer: (/* state */ js.UndefOr[Location], AnyAction) => Location
  ): Router = {
    val __obj = js.Dynamic.literal(enhancer = js.Any.fromFunction1(enhancer), middleware = js.Any.fromFunction1(middleware), reducer = js.Any.fromFunction2(reducer))
  
    __obj.asInstanceOf[Router]
  }
}

