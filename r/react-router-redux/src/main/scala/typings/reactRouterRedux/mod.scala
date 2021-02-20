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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("react-router-redux", "createMatchSelector")
  @js.native
  def createMatchSelector(path: String): js.Function1[/* state */ Router, `match`[js.Object] | Null] = js.native
  
  @JSImport("react-router-redux", "go")
  @js.native
  def go(n: Double): RouterAction = js.native
  
  @JSImport("react-router-redux", "goBack")
  @js.native
  def goBack(): RouterAction = js.native
  
  @JSImport("react-router-redux", "goForward")
  @js.native
  def goForward(): RouterAction = js.native
  
  @JSImport("react-router-redux", "push")
  @js.native
  def push(location: LocationDescriptor[LocationState]): RouterAction = js.native
  @JSImport("react-router-redux", "push")
  @js.native
  def push(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
  
  @JSImport("react-router-redux", "replace")
  @js.native
  def replace(location: LocationDescriptor[LocationState]): RouterAction = js.native
  @JSImport("react-router-redux", "replace")
  @js.native
  def replace(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
  
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
    @scala.inline
    def goBack_=(x: js.Function0[RouterAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goBack")(x.asInstanceOf[js.Any])
    
    @JSImport("react-router-redux", "routerActions.goForward")
    @js.native
    def goForward: js.Function0[RouterAction] = js.native
    @scala.inline
    def goForward_=(x: js.Function0[RouterAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goForward")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def go_=(x: js.Function1[/* n */ Double, RouterAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("go")(x.asInstanceOf[js.Any])
    
    @JSImport("react-router-redux", "routerActions.push")
    @js.native
    def push: js.Function2[
        /* location */ LocationDescriptor[LocationState], 
        /* state */ js.UndefOr[LocationState], 
        RouterAction
      ] = js.native
    @scala.inline
    def push_=(
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
    @scala.inline
    def replace_=(
      x: js.Function2[
          /* location */ LocationDescriptor[LocationState], 
          /* state */ js.UndefOr[LocationState], 
          RouterAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replace")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-router-redux", "routerMiddleware")
  @js.native
  def routerMiddleware(history: History[LocationState]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  
  @JSImport("react-router-redux", "routerReducer")
  @js.native
  val routerReducer: Reducer[RouterState, AnyAction] = js.native
  
  @js.native
  trait ConnectedRouterProps[State] extends StObject {
    
    var history: History[LocationState] = js.native
    
    var store: js.UndefOr[Store[State, AnyAction]] = js.native
  }
  object ConnectedRouterProps {
    
    @scala.inline
    def apply[State](history: History[LocationState]): ConnectedRouterProps[State] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectedRouterProps[State]]
    }
    
    @scala.inline
    implicit class ConnectedRouterPropsMutableBuilder[Self <: ConnectedRouterProps[_], State] (val x: Self with ConnectedRouterProps[State]) extends AnyVal {
      
      @scala.inline
      def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStore(value: Store[State, AnyAction]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  @js.native
  trait LocationActionPayload extends StObject {
    
    var args: js.UndefOr[js.Array[_]] = js.native
    
    var method: String = js.native
  }
  object LocationActionPayload {
    
    @scala.inline
    def apply(method: String): LocationActionPayload = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationActionPayload]
    }
    
    @scala.inline
    implicit class LocationActionPayloadMutableBuilder[Self <: LocationActionPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocationChangeAction extends StObject {
    
    var payload: LocationLocationStateprop = js.native
    
    var `type`: /* "@@router/LOCATION_CHANGE" */ String = js.native
  }
  object LocationChangeAction {
    
    @scala.inline
    def apply(payload: LocationLocationStateprop, `type`: /* "@@router/LOCATION_CHANGE" */ String): LocationChangeAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationChangeAction]
    }
    
    @scala.inline
    implicit class LocationChangeActionMutableBuilder[Self <: LocationChangeAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: LocationLocationStateprop): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: /* "@@router/LOCATION_CHANGE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouterAction extends StObject {
    
    var payload: LocationActionPayload = js.native
    
    var `type`: /* "@@router/CALL_HISTORY_METHOD" */ String = js.native
  }
  object RouterAction {
    
    @scala.inline
    def apply(payload: LocationActionPayload, `type`: /* "@@router/CALL_HISTORY_METHOD" */ String): RouterAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterAction]
    }
    
    @scala.inline
    implicit class RouterActionMutableBuilder[Self <: RouterAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: LocationActionPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: /* "@@router/CALL_HISTORY_METHOD" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouterState extends StObject {
    
    var location: Location[LocationState] | Null = js.native
  }
  object RouterState {
    
    @scala.inline
    def apply(): RouterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterState]
    }
    
    @scala.inline
    implicit class RouterStateMutableBuilder[Self <: RouterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationNull: Self = StObject.set(x, "location", null)
    }
  }
}
