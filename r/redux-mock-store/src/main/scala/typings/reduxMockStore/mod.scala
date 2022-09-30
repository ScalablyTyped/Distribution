package typings.reduxMockStore

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-mock-store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create Mock Store returns a function that will create a mock store from a state
    * with the same set of set of middleware applied.
    *
    * @param middlewares The list of middleware to be applied.
    * @template S The type of state to be held by the store.
    * @template DispatchExts The additional Dispatch signatures for the middlewares applied.
    */
  inline def default[S, DispatchExts](): MockStoreCreator[S, DispatchExts] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[MockStoreCreator[S, DispatchExts]]
  inline def default[S, DispatchExts](middlewares: js.Array[Middleware[js.Object, Any, Dispatch[AnyAction]]]): MockStoreCreator[S, DispatchExts] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(middlewares.asInstanceOf[js.Any]).asInstanceOf[MockStoreCreator[S, DispatchExts]]
  
  type MockGetState[S] = js.Function1[/* actions */ js.Array[AnyAction], S]
  
  @js.native
  trait MockStore[S, A /* <: Action[Any] */]
    extends StObject
       with Store[S, A] {
    
    def clearActions(): Unit = js.native
    
    def getActions(): js.Array[Any] = js.native
  }
  
  type MockStoreCreator[S, DispatchExts] = js.Function1[/* state */ js.UndefOr[S | MockGetState[S]], MockStoreEnhanced[S, DispatchExts]]
  
  @js.native
  trait MockStoreEnhanced[S, DispatchExts]
    extends StObject
       with MockStore[S, AnyAction] {
    
    var dispatch: DispatchExts = js.native
  }
}
