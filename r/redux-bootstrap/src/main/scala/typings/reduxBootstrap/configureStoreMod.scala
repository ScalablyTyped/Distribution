package typings.reduxBootstrap

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import typings.redux.mod.StoreEnhancer
import typings.reduxBootstrap.interfacesMod.interfaces.DevToolsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configureStoreMod {
  
  @JSImport("redux-bootstrap/dts/store/configure_store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    middlewares: js.Array[Middleware[js.Object, js.Any, Dispatch[AnyAction]]],
    enhancers: js.Array[StoreEnhancer[js.Any, js.Object]],
    rootReducer: Reducer[js.Any, AnyAction],
    initialState: js.Any,
    devToolsOptions: DevToolsOptions
  ): Store[js.Any, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(middlewares.asInstanceOf[js.Any], enhancers.asInstanceOf[js.Any], rootReducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], devToolsOptions.asInstanceOf[js.Any])).asInstanceOf[Store[js.Any, AnyAction]]
}
