package typings.reflux

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reflux", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("reflux", "ActionMethods")
  @js.native
  val ActionMethods: js.Any = js.native
  
  @JSImport("reflux", "Component")
  @js.native
  class Component[TOfStore /* <: Instantiable0[Store] */, P, S] protected ()
    extends typings.react.mod.Component[P, S, js.Any] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: js.Any) = this()
    
    def mapStoreToState(storeType: TOfStore, mappingFunc: js.Function1[/* newState */ js.Any, js.Any]): Unit = js.native
    
    var store: TOfStore = js.native
    
    var storeKeys: js.Array[String] = js.native
    
    var stores: js.Array[TOfStore] = js.native
  }
  
  @scala.inline
  def ListenerMixin(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListenerMixin")().asInstanceOf[js.Any]
  
  @JSImport("reflux", "PureComponent")
  @js.native
  class PureComponent[TOfStore /* <: Instantiable0[Store] */, P, S, SS] protected ()
    extends typings.react.mod.PureComponent[P, S, SS] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: js.Any) = this()
    
    def mapStoreToState(storeType: TOfStore, mappingFunc: js.Function1[/* newState */ js.Any, js.Any]): Unit = js.native
    
    var store: TOfStore = js.native
    
    var storeKeys: js.Array[String] = js.native
    
    var stores: js.Array[TOfStore] = js.native
  }
  
  @JSImport("reflux", "Store")
  @js.native
  class Store () extends StObject {
    
    def fetchInitialState(listenable: Listenable, defaultCallback: js.Function): Unit = js.native
    
    def hasListener(listenable: Listenable): Boolean = js.native
    
    var id: String = js.native
    
    def listen(callback: js.Function, bindContext: js.Any): js.Function = js.native
    
    def listenTo(listenable: Listenable, callback: js.Function): Subscription = js.native
    def listenTo(listenable: Listenable, callback: js.Function, defaultCallback: js.Function): Subscription = js.native
    
    def listenToMany(listenables: js.Array[Listenable]): Unit = js.native
    
    var listenables: js.Any = js.native
    
    def setState(state: js.Object): Unit = js.native
    
    var state: js.Any = js.native
    
    def stopListeningTo(listenable: Listenable): Boolean = js.native
    
    def stopListeningToAll(): Unit = js.native
    
    def trigger(state: js.Any): Unit = js.native
    
    def validateListening(listenable: Listenable): String = js.native
  }
  
  @scala.inline
  def connect(store: Store): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def connect(store: Store, key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(store.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createAction(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")().asInstanceOf[js.Any]
  @scala.inline
  def createAction(definition: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(definition.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createAction(definition: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(definition.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createAction(definition: ActionDefinition): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(definition.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def createActions(definitions: js.Array[ActionDefinition | String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(definitions.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def createActions(definitions: ActionObjectDefinition): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(definitions.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def createStore(definition: StoreDefinition): Store = ^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(definition.asInstanceOf[js.Any]).asInstanceOf[Store]
  
  @scala.inline
  def initStore(typeOfStore: Instantiable0[Store]): Store = ^.asInstanceOf[js.Dynamic].applyDynamic("initStore")(typeOfStore.asInstanceOf[js.Any]).asInstanceOf[Store]
  
  @scala.inline
  def listenTo(store: Store, handler: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listenTo")(store.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setState(state: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setState")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ActionDefinition
    extends StObject
       with ActionParameters {
    
    var actionName: js.UndefOr[String] = js.undefined
  }
  object ActionDefinition {
    
    @scala.inline
    def apply(): ActionDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionDefinition]
    }
    
    @scala.inline
    implicit class ActionDefinitionMutableBuilder[Self <: ActionDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    }
  }
  
  type ActionObjectDefinition = StringDictionary[ActionParameters]
  
  trait ActionParameters extends StObject {
    
    var asyncResult: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[js.Array[String]] = js.undefined
    
    var preEmit: js.UndefOr[js.Function1[/* repeated */ js.Any, js.UndefOr[js.Array[js.Any]]]] = js.undefined
    
    var shouldEmit: js.UndefOr[js.Function1[/* repeated */ js.Any, Boolean]] = js.undefined
    
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object ActionParameters {
    
    @scala.inline
    def apply(): ActionParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionParameters]
    }
    
    @scala.inline
    implicit class ActionParametersMutableBuilder[Self <: ActionParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncResult(value: Boolean): Self = StObject.set(x, "asyncResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncResultUndefined: Self = StObject.set(x, "asyncResult", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setPreEmit(value: /* repeated */ js.Any => js.UndefOr[js.Array[js.Any]]): Self = StObject.set(x, "preEmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreEmitUndefined: Self = StObject.set(x, "preEmit", js.undefined)
      
      @scala.inline
      def setShouldEmit(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "shouldEmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldEmitUndefined: Self = StObject.set(x, "shouldEmit", js.undefined)
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  type Actions = StringDictionary[Listenable]
  
  @js.native
  trait ListenFn extends StObject {
    
    def apply(params: js.Any*): js.Any = js.native
    
    var completed: js.Function = js.native
    
    var failed: js.Function = js.native
  }
  
  trait Listenable extends StObject {
    
    var listen: ListenFn
  }
  object Listenable {
    
    @scala.inline
    def apply(listen: ListenFn): Listenable = {
      val __obj = js.Dynamic.literal(listen = listen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Listenable]
    }
    
    @scala.inline
    implicit class ListenableMutableBuilder[Self <: Listenable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListen(value: ListenFn): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoreDefinition
    extends StObject
       with /* propertyName */ StringDictionary[js.Any] {
    
    var getInitialState: js.UndefOr[js.Function] = js.undefined
    
    var init: js.UndefOr[js.Function] = js.undefined
    
    var listenables: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object StoreDefinition {
    
    @scala.inline
    def apply(): StoreDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoreDefinition]
    }
    
    @scala.inline
    implicit class StoreDefinitionMutableBuilder[Self <: StoreDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetInitialState(value: js.Function): Self = StObject.set(x, "getInitialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetInitialStateUndefined: Self = StObject.set(x, "getInitialState", js.undefined)
      
      @scala.inline
      def setInit(value: js.Function): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setListenables(value: js.Array[js.Any]): Self = StObject.set(x, "listenables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenablesUndefined: Self = StObject.set(x, "listenables", js.undefined)
      
      @scala.inline
      def setListenablesVarargs(value: js.Any*): Self = StObject.set(x, "listenables", js.Array(value :_*))
    }
  }
  
  trait Subscription extends StObject {
    
    var listenable: Listenable
    
    var stop: js.Function
  }
  object Subscription {
    
    @scala.inline
    def apply(listenable: Listenable, stop: js.Function): Subscription = {
      val __obj = js.Dynamic.literal(listenable = listenable.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListenable(value: Listenable): Self = StObject.set(x, "listenable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStop(value: js.Function): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    }
  }
}
