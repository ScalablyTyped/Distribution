package typings.reduxInjectableStore

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import typings.redux.mod.StoreEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-injectable-store", "createInjectableStore")
  @js.native
  val createInjectableStore: InjectableStoreCreator = js.native
  
  @js.native
  trait InjectableStore[S] extends Store[S, AnyAction] {
    
    def clearReducers(): Unit = js.native
    
    def inject(namespace: String, reducer: Reducer[_, AnyAction]): Unit = js.native
    
    def injectAll(reducers: StringDictionary[Reducer[_, AnyAction]]): Unit = js.native
  }
  
  @js.native
  trait InjectableStoreCreator extends StObject {
    
    def apply[S](): InjectableStore[S] = js.native
    def apply[S](enhancer: js.UndefOr[scala.Nothing], wrapReducer: WrapReducer[S]): InjectableStore[S] = js.native
    def apply[S](enhancer: StoreEnhancer[S, js.Object]): InjectableStore[S] = js.native
    def apply[S](enhancer: StoreEnhancer[S, js.Object], wrapReducer: WrapReducer[S]): InjectableStore[S] = js.native
    def apply[S](preloadedState: S): InjectableStore[S] = js.native
    def apply[S](preloadedState: S, enhancer: js.UndefOr[scala.Nothing], wrapReducer: WrapReducer[S]): InjectableStore[S] = js.native
    def apply[S](preloadedState: S, enhancer: StoreEnhancer[S, js.Object]): InjectableStore[S] = js.native
    def apply[S](preloadedState: S, enhancer: StoreEnhancer[S, js.Object], wrapReducer: WrapReducer[S]): InjectableStore[S] = js.native
  }
  
  type WrapReducer[S] = js.Function1[/* reducer */ Reducer[S, AnyAction], Reducer[S, AnyAction]]
}
