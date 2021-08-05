package typings.reactRouterRedux

import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.Component
import typings.reactRouter.mod.`match`
import typings.reactRouterRedux.anon.LocationLocationStateprop
import typings.reactRouterRedux.anon.Router
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-redux", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-router-redux", "CALL_HISTORY_METHOD")
  @js.native
  val CALL_HISTORY_METHOD: /* "@@router/CALL_HISTORY_METHOD" */ String = js.native
  
  @JSImport("react-router-redux", "ConnectedRouter")
  @js.native
  class ConnectedRouter[State] protected ()
    extends Component[ConnectedRouterProps[State], js.Object, js.Any] {
    def this(props: ConnectedRouterProps[State]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ConnectedRouterProps[State], context: js.Any) = this()
  }
  
  @JSImport("react-router-redux", "LOCATION_CHANGE")
  @js.native
  val LOCATION_CHANGE: /* "@@router/LOCATION_CHANGE" */ String = js.native
  
  inline def createMatchSelector(path: String): js.Function1[/* state */ Router, `match`[js.Object] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMatchSelector")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* state */ Router, `match`[js.Object] | Null]]
  
  inline def go(n: Double): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(n.asInstanceOf[js.Any]).asInstanceOf[RouterAction]
  
  inline def goBack(): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[RouterAction]
  
  inline def goForward(): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")().asInstanceOf[RouterAction]
  
  inline def push(location: LocationDescriptor[LocationState]): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(location.asInstanceOf[js.Any]).asInstanceOf[RouterAction]
  inline def push(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(location.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RouterAction]
  
  inline def replace(location: LocationDescriptor[LocationState]): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(location.asInstanceOf[js.Any]).asInstanceOf[RouterAction]
  inline def replace(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(location.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RouterAction]
  
  object routerActions {
    
    @JSImport("react-router-redux", "routerActions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-router-redux", "routerActions.go")
    @js.native
    def go: js.Function1[/* n */ Double, RouterAction] = js.native
    
    @JSImport("react-router-redux", "routerActions.goBack")
    @js.native
    def goBack: js.Function0[RouterAction] = js.native
    inline def goBack_=(x: js.Function0[RouterAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goBack")(x.asInstanceOf[js.Any])
    
    @JSImport("react-router-redux", "routerActions.goForward")
    @js.native
    def goForward: js.Function0[RouterAction] = js.native
    inline def goForward_=(x: js.Function0[RouterAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goForward")(x.asInstanceOf[js.Any])
    
    inline def go_=(x: js.Function1[/* n */ Double, RouterAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("go")(x.asInstanceOf[js.Any])
    
    @JSImport("react-router-redux", "routerActions.push")
    @js.native
    def push: js.Function2[
        /* location */ LocationDescriptor[LocationState], 
        /* state */ js.UndefOr[LocationState], 
        RouterAction
      ] = js.native
    inline def push_=(
      x: js.Function2[
          /* location */ LocationDescriptor[LocationState], 
          /* state */ js.UndefOr[LocationState], 
          RouterAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("push")(x.asInstanceOf[js.Any])
    
    @JSImport("react-router-redux", "routerActions.replace")
    @js.native
    def replace: js.Function2[
        /* location */ LocationDescriptor[LocationState], 
        /* state */ js.UndefOr[LocationState], 
        RouterAction
      ] = js.native
    inline def replace_=(
      x: js.Function2[
          /* location */ LocationDescriptor[LocationState], 
          /* state */ js.UndefOr[LocationState], 
          RouterAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replace")(x.asInstanceOf[js.Any])
  }
  
  inline def routerMiddleware(history: History[LocationState]): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("routerMiddleware")(history.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  
  @JSImport("react-router-redux", "routerReducer")
  @js.native
  val routerReducer: Reducer[RouterState, AnyAction] = js.native
  
  trait ConnectedRouterProps[State] extends StObject {
    
    var history: History[LocationState]
    
    var store: js.UndefOr[Store[State, AnyAction]] = js.undefined
  }
  object ConnectedRouterProps {
    
    inline def apply[State](history: History[LocationState]): ConnectedRouterProps[State] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectedRouterProps[State]]
    }
    
    extension [Self <: ConnectedRouterProps[?], State](x: Self & ConnectedRouterProps[State]) {
      
      inline def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setStore(value: Store[State, AnyAction]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  trait LocationActionPayload extends StObject {
    
    var args: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var method: String
  }
  object LocationActionPayload {
    
    inline def apply(method: String): LocationActionPayload = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationActionPayload]
    }
    
    extension [Self <: LocationActionPayload](x: Self) {
      
      inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocationChangeAction extends StObject {
    
    var payload: LocationLocationStateprop
    
    var `type`: /* "@@router/LOCATION_CHANGE" */ String
  }
  object LocationChangeAction {
    
    inline def apply(payload: LocationLocationStateprop, `type`: /* "@@router/LOCATION_CHANGE" */ String): LocationChangeAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationChangeAction]
    }
    
    extension [Self <: LocationChangeAction](x: Self) {
      
      inline def setPayload(value: LocationLocationStateprop): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "@@router/LOCATION_CHANGE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouterAction extends StObject {
    
    var payload: LocationActionPayload
    
    var `type`: /* "@@router/CALL_HISTORY_METHOD" */ String
  }
  object RouterAction {
    
    inline def apply(payload: LocationActionPayload, `type`: /* "@@router/CALL_HISTORY_METHOD" */ String): RouterAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterAction]
    }
    
    extension [Self <: RouterAction](x: Self) {
      
      inline def setPayload(value: LocationActionPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "@@router/CALL_HISTORY_METHOD" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouterState extends StObject {
    
    var location: Location[LocationState] | Null
  }
  object RouterState {
    
    inline def apply(): RouterState = {
      val __obj = js.Dynamic.literal(location = null)
      __obj.asInstanceOf[RouterState]
    }
    
    extension [Self <: RouterState](x: Self) {
      
      inline def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
    }
  }
}
