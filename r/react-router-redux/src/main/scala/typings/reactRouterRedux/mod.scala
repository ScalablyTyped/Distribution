package typings.reactRouterRedux

import typings.history.mod.History
import typings.history.mod.Location
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactRouterRedux.anon.Locationpropsmatchpathstr
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
  open class ConnectedRouter[State] protected ()
    extends Component[ConnectedRouterProps[State], js.Object, Any] {
    def this(props: ConnectedRouterProps[State]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ConnectedRouterProps[State], context: Any) = this()
  }
  
  @JSImport("react-router-redux", "LOCATION_CHANGE")
  @js.native
  val LOCATION_CHANGE: /* "@@router/LOCATION_CHANGE" */ String = js.native
  
  inline def createMatchSelector(path: String): js.Function1[
    /* state */ Router, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify match */ Any) | Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMatchSelector")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* state */ Router, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify match */ Any) | Null
  ]]
  
  inline def go(n: Double): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(n.asInstanceOf[js.Any]).asInstanceOf[RouterAction]
  
  inline def goBack(): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[RouterAction]
  
  inline def goForward(): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")().asInstanceOf[RouterAction]
  
  inline def push(
    location: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any
  ): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(location.asInstanceOf[js.Any]).asInstanceOf[RouterAction]
  inline def push(
    location: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any,
    state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationState */ Any
  ): RouterAction = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(location.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RouterAction]
  
  inline def replace(
    location: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any
  ): RouterAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(location.asInstanceOf[js.Any]).asInstanceOf[RouterAction]
  inline def replace(
    location: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any,
    state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationState */ Any
  ): RouterAction = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(location.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RouterAction]
  
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
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ /* location */ Any, 
        /* state */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationState */ Any
        ], 
        RouterAction
      ] = js.native
    inline def push_=(
      x: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ /* location */ Any, 
          /* state */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationState */ Any
          ], 
          RouterAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("push")(x.asInstanceOf[js.Any])
    
    @JSImport("react-router-redux", "routerActions.replace")
    @js.native
    def replace: js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ /* location */ Any, 
        /* state */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationState */ Any
        ], 
        RouterAction
      ] = js.native
    inline def replace_=(
      x: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ /* location */ Any, 
          /* state */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationState */ Any
          ], 
          RouterAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replace")(x.asInstanceOf[js.Any])
  }
  
  inline def routerMiddleware(history: History): Middleware[js.Object, Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("routerMiddleware")(history.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  
  @JSImport("react-router-redux", "routerReducer")
  @js.native
  val routerReducer: Reducer[RouterState, AnyAction] = js.native
  
  trait ConnectedRouterProps[State] extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var history: History
    
    var store: js.UndefOr[Store[State, AnyAction]] = js.undefined
  }
  object ConnectedRouterProps {
    
    inline def apply[State](history: History): ConnectedRouterProps[State] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectedRouterProps[State]]
    }
    
    extension [Self <: ConnectedRouterProps[?], State](x: Self & ConnectedRouterProps[State]) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setStore(value: Store[State, AnyAction]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  trait LocationActionPayload extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var method: String
  }
  object LocationActionPayload {
    
    inline def apply(method: String): LocationActionPayload = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationActionPayload]
    }
    
    extension [Self <: LocationActionPayload](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocationChangeAction extends StObject {
    
    var payload: Locationpropsmatchpathstr
    
    var `type`: /* "@@router/LOCATION_CHANGE" */ String
  }
  object LocationChangeAction {
    
    inline def apply(payload: Locationpropsmatchpathstr, `type`: /* "@@router/LOCATION_CHANGE" */ String): LocationChangeAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationChangeAction]
    }
    
    extension [Self <: LocationChangeAction](x: Self) {
      
      inline def setPayload(value: Locationpropsmatchpathstr): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
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
    
    var location: Location | Null
  }
  object RouterState {
    
    inline def apply(): RouterState = {
      val __obj = js.Dynamic.literal(location = null)
      __obj.asInstanceOf[RouterState]
    }
    
    extension [Self <: RouterState](x: Self) {
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
    }
  }
}
