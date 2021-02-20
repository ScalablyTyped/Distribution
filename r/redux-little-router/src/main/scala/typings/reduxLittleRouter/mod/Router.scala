package typings.reduxLittleRouter.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.MiddlewareAPI
import typings.redux.mod.Reducer
import typings.redux.mod.StoreEnhancer
import typings.redux.mod.StoreEnhancerStoreCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router extends StObject {
  
  var enhancer: StoreEnhancer[Location, js.Object] = js.native
  
  var middleware: Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  
  var reducer: Reducer[Location, AnyAction] = js.native
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
  
  @scala.inline
  implicit class RouterMutableBuilder[Self <: Router] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnhancer(
      value: /* next */ StoreEnhancerStoreCreator[js.Object, js.Object] => StoreEnhancerStoreCreator[Location, js.Object]
    ): Self = StObject.set(x, "enhancer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMiddleware(
      value: /* api */ MiddlewareAPI[Dispatch[AnyAction], _] => js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ js.Any, js.Any]]
    ): Self = StObject.set(x, "middleware", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReducer(value: (/* state */ js.UndefOr[Location], AnyAction) => Location): Self = StObject.set(x, "reducer", js.Any.fromFunction2(value))
  }
}
