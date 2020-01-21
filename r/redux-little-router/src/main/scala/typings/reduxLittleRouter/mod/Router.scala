package typings.reduxLittleRouter.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.MiddlewareAPI
import typings.redux.mod.Reducer
import typings.redux.mod.StoreEnhancer
import typings.redux.mod.StoreEnhancerStoreCreator
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

