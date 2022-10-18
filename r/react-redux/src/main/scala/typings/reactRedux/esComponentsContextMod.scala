package typings.reactRedux

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactRedux.esUtilsSubscriptionMod.Subscription
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsContextMod extends Shortcut {
  
  @JSImport("react-redux/es/components/Context", JSImport.Default)
  @js.native
  val default: Context[ReactReduxContextValue[Any, AnyAction]] = js.native
  
  @JSImport("react-redux/es/components/Context", "ReactReduxContext")
  @js.native
  val ReactReduxContext: Context[ReactReduxContextValue[Any, AnyAction]] = js.native
  
  type ReactReduxContextInstance = Context[ReactReduxContextValue[Any, AnyAction]]
  
  trait ReactReduxContextValue[SS, A /* <: Action[Any] */] extends StObject {
    
    var getServerState: js.UndefOr[js.Function0[SS]] = js.undefined
    
    var store: Store[SS, A]
    
    var subscription: Subscription
  }
  object ReactReduxContextValue {
    
    inline def apply[SS, A /* <: Action[Any] */](store: Store[SS, A], subscription: Subscription): ReactReduxContextValue[SS, A] = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactReduxContextValue[SS, A]]
    }
    
    extension [Self <: ReactReduxContextValue[?, ?], SS, A /* <: Action[Any] */](x: Self & (ReactReduxContextValue[SS, A])) {
      
      inline def setGetServerState(value: () => SS): Self = StObject.set(x, "getServerState", js.Any.fromFunction0(value))
      
      inline def setGetServerStateUndefined: Self = StObject.set(x, "getServerState", js.undefined)
      
      inline def setStore(value: Store[SS, A]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[ReactReduxContextValue[Any, AnyAction]]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsContextMod.foo` */
  override def _to: Context[ReactReduxContextValue[Any, AnyAction]] = default
}
