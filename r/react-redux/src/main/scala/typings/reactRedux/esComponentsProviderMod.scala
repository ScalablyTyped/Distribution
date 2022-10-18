package typings.reactRedux

import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactRedux.esComponentsContextMod.ReactReduxContextValue
import typings.redux.mod.Action
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsProviderMod {
  
  @JSImport("react-redux/es/components/Provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A /* <: Action[Any] */](hasStoreContextChildrenServerState: ProviderProps[A, Any]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStoreContextChildrenServerState.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ProviderProps[A /* <: Action[Any] */, S] extends StObject {
    
    var children: ReactNode
    
    /**
      * Optional context to be used internally in react-redux. Use React.createContext() to create a context to be used.
      * If this is used, you'll need to customize `connect` by supplying the same context provided to the Provider.
      * Initial value doesn't matter, as it is overwritten with the internal state of Provider.
      */
    var context: js.UndefOr[Context[ReactReduxContextValue[S, A]]] = js.undefined
    
    /**
      * An optional server state snapshot. Will be used during initial hydration render if available, to ensure that the UI output is consistent with the HTML generated on the server.
      */
    var serverState: js.UndefOr[S] = js.undefined
    
    /**
      * The single Redux store in your application.
      */
    var store: Store[S, A]
  }
  object ProviderProps {
    
    inline def apply[A /* <: Action[Any] */, S](store: Store[S, A]): ProviderProps[A, S] = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderProps[A, S]]
    }
    
    extension [Self <: ProviderProps[?, ?], A /* <: Action[Any] */, S](x: Self & (ProviderProps[A, S])) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContext(value: Context[ReactReduxContextValue[S, A]]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setServerState(value: S): Self = StObject.set(x, "serverState", value.asInstanceOf[js.Any])
      
      inline def setServerStateUndefined: Self = StObject.set(x, "serverState", js.undefined)
      
      inline def setStore(value: Store[S, A]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
