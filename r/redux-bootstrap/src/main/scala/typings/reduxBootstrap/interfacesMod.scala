package typings.reduxBootstrap

import org.scalablytyped.runtime.StringDictionary
import typings.history.mod.History
import typings.history.mod.LocationState
import typings.react.mod.global.JSX.Element
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import typings.redux.mod.StoreEnhancer
import typings.reduxBootstrap.anon.Accept
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  object interfaces {
    
    trait BoostrapOptions extends StObject {
      
      var container: js.UndefOr[String] = js.undefined
      
      var createHistory: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.CreateHistory<History.HistoryOptions, History.History> */ js.Any
          ] = js.undefined
      
      var devToolsOptions: js.UndefOr[DevToolsOptions] = js.undefined
      
      var enhancers: js.UndefOr[js.Array[StoreEnhancer[js.Any, js.Object]]] = js.undefined
      
      var historyOptions: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.HistoryOptions */ js.Any
          ] = js.undefined
      
      var initialState: js.UndefOr[js.Any] = js.undefined
      
      var middlewares: js.UndefOr[js.Array[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]] = js.undefined
      
      var reducers: ReducersOption
      
      var render: js.UndefOr[js.Function] = js.undefined
      
      var routerProps: js.UndefOr[RouterProps] = js.undefined
      
      var routes: Element
    }
    object BoostrapOptions {
      
      @scala.inline
      def apply(reducers: ReducersOption, routes: Element): BoostrapOptions = {
        val __obj = js.Dynamic.literal(reducers = reducers.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
        __obj.asInstanceOf[BoostrapOptions]
      }
      
      @scala.inline
      implicit class BoostrapOptionsMutableBuilder[Self <: BoostrapOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
        
        @scala.inline
        def setCreateHistory(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.CreateHistory<History.HistoryOptions, History.History> */ js.Any
        ): Self = StObject.set(x, "createHistory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateHistoryUndefined: Self = StObject.set(x, "createHistory", js.undefined)
        
        @scala.inline
        def setDevToolsOptions(value: DevToolsOptions): Self = StObject.set(x, "devToolsOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDevToolsOptionsUndefined: Self = StObject.set(x, "devToolsOptions", js.undefined)
        
        @scala.inline
        def setEnhancers(value: js.Array[StoreEnhancer[js.Any, js.Object]]): Self = StObject.set(x, "enhancers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnhancersUndefined: Self = StObject.set(x, "enhancers", js.undefined)
        
        @scala.inline
        def setEnhancersVarargs(value: (StoreEnhancer[js.Any, js.Object])*): Self = StObject.set(x, "enhancers", js.Array(value :_*))
        
        @scala.inline
        def setHistoryOptions(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.HistoryOptions */ js.Any
        ): Self = StObject.set(x, "historyOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHistoryOptionsUndefined: Self = StObject.set(x, "historyOptions", js.undefined)
        
        @scala.inline
        def setInitialState(value: js.Any): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
        
        @scala.inline
        def setMiddlewares(value: js.Array[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMiddlewaresUndefined: Self = StObject.set(x, "middlewares", js.undefined)
        
        @scala.inline
        def setMiddlewaresVarargs(value: (Middleware[js.Object, js.Any, Dispatch[AnyAction]])*): Self = StObject.set(x, "middlewares", js.Array(value :_*))
        
        @scala.inline
        def setReducers(value: ReducersOption): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRender(value: js.Function): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
        
        @scala.inline
        def setRouterProps(value: RouterProps): Self = StObject.set(x, "routerProps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRouterPropsUndefined: Self = StObject.set(x, "routerProps", js.undefined)
        
        @scala.inline
        def setRoutes(value: Element): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      }
    }
    
    trait BootstrapResult extends StObject {
      
      var history: History[LocationState]
      
      var output: js.Any
      
      var root: Element
      
      var store: Store[js.Any, AnyAction]
    }
    object BootstrapResult {
      
      @scala.inline
      def apply(history: History[LocationState], output: js.Any, root: Element, store: Store[js.Any, AnyAction]): BootstrapResult = {
        val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
        __obj.asInstanceOf[BootstrapResult]
      }
      
      @scala.inline
      implicit class BootstrapResultMutableBuilder[Self <: BootstrapResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutput(value: js.Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoot(value: Element): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStore(value: Store[js.Any, AnyAction]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Compose
      extends js.Function {
      
      def apply[F /* <: js.Function */](f: F*): F = js.native
    }
    
    @js.native
    trait ConfigureStore
      extends js.Function {
      
      def apply(
        middlewares: js.Array[Middleware[js.Object, js.Any, Dispatch[AnyAction]]],
        rootReducer: js.Object,
        initialState: js.Any
      ): Store[js.Any, AnyAction] = js.native
    }
    
    @js.native
    trait DevTools
      extends js.Function {
      
      def apply(options: DevToolsOptions): Compose = js.native
    }
    
    trait DevToolsOptions extends StObject {
      
      var actionBlacklist: js.UndefOr[String | js.Array[String]] = js.undefined
      
      var actionCreators: js.UndefOr[js.Array[js.Any] | js.Object] = js.undefined
      
      var actionSanitizer: js.UndefOr[js.Function] = js.undefined
      
      var actionWhitelist: js.UndefOr[String | js.Array[String]] = js.undefined
      
      var autoPause: js.UndefOr[Boolean] = js.undefined
      
      var features: js.UndefOr[js.Object] = js.undefined
      
      var latency: js.UndefOr[Double] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var pauseActionType: js.UndefOr[String] = js.undefined
      
      var predicate: js.UndefOr[js.Function] = js.undefined
      
      var serialize: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var shouldHotReload: js.UndefOr[Boolean] = js.undefined
      
      var shouldRecordChanges: js.UndefOr[Boolean] = js.undefined
      
      var shouldStartLocked: js.UndefOr[Boolean] = js.undefined
      
      var stateSanitizer: js.UndefOr[js.Function] = js.undefined
    }
    object DevToolsOptions {
      
      @scala.inline
      def apply(): DevToolsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DevToolsOptions]
      }
      
      @scala.inline
      implicit class DevToolsOptionsMutableBuilder[Self <: DevToolsOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActionBlacklist(value: String | js.Array[String]): Self = StObject.set(x, "actionBlacklist", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionBlacklistUndefined: Self = StObject.set(x, "actionBlacklist", js.undefined)
        
        @scala.inline
        def setActionBlacklistVarargs(value: String*): Self = StObject.set(x, "actionBlacklist", js.Array(value :_*))
        
        @scala.inline
        def setActionCreators(value: js.Array[js.Any] | js.Object): Self = StObject.set(x, "actionCreators", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionCreatorsUndefined: Self = StObject.set(x, "actionCreators", js.undefined)
        
        @scala.inline
        def setActionCreatorsVarargs(value: js.Any*): Self = StObject.set(x, "actionCreators", js.Array(value :_*))
        
        @scala.inline
        def setActionSanitizer(value: js.Function): Self = StObject.set(x, "actionSanitizer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionSanitizerUndefined: Self = StObject.set(x, "actionSanitizer", js.undefined)
        
        @scala.inline
        def setActionWhitelist(value: String | js.Array[String]): Self = StObject.set(x, "actionWhitelist", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionWhitelistUndefined: Self = StObject.set(x, "actionWhitelist", js.undefined)
        
        @scala.inline
        def setActionWhitelistVarargs(value: String*): Self = StObject.set(x, "actionWhitelist", js.Array(value :_*))
        
        @scala.inline
        def setAutoPause(value: Boolean): Self = StObject.set(x, "autoPause", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoPauseUndefined: Self = StObject.set(x, "autoPause", js.undefined)
        
        @scala.inline
        def setFeatures(value: js.Object): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
        
        @scala.inline
        def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPauseActionType(value: String): Self = StObject.set(x, "pauseActionType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPauseActionTypeUndefined: Self = StObject.set(x, "pauseActionType", js.undefined)
        
        @scala.inline
        def setPredicate(value: js.Function): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
        
        @scala.inline
        def setSerialize(value: Boolean | js.Object): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
        
        @scala.inline
        def setShouldHotReload(value: Boolean): Self = StObject.set(x, "shouldHotReload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShouldHotReloadUndefined: Self = StObject.set(x, "shouldHotReload", js.undefined)
        
        @scala.inline
        def setShouldRecordChanges(value: Boolean): Self = StObject.set(x, "shouldRecordChanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShouldRecordChangesUndefined: Self = StObject.set(x, "shouldRecordChanges", js.undefined)
        
        @scala.inline
        def setShouldStartLocked(value: Boolean): Self = StObject.set(x, "shouldStartLocked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShouldStartLockedUndefined: Self = StObject.set(x, "shouldStartLocked", js.undefined)
        
        @scala.inline
        def setStateSanitizer(value: js.Function): Self = StObject.set(x, "stateSanitizer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateSanitizerUndefined: Self = StObject.set(x, "stateSanitizer", js.undefined)
      }
    }
    
    trait NodeModule extends StObject {
      
      var hot: Accept
    }
    object NodeModule {
      
      @scala.inline
      def apply(hot: Accept): NodeModule = {
        val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any])
        __obj.asInstanceOf[NodeModule]
      }
      
      @scala.inline
      implicit class NodeModuleMutableBuilder[Self <: NodeModule] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHot(value: Accept): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      }
    }
    
    type ReducersOption = StringDictionary[Reducer[js.Any, AnyAction]]
    
    trait RootComponentProps extends StObject {
      
      var history: History[LocationState]
      
      var routes: Element
      
      var store: Store[js.Any, AnyAction]
    }
    object RootComponentProps {
      
      @scala.inline
      def apply(history: History[LocationState], routes: Element, store: Store[js.Any, AnyAction]): RootComponentProps = {
        val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
        __obj.asInstanceOf[RootComponentProps]
      }
      
      @scala.inline
      implicit class RootComponentPropsMutableBuilder[Self <: RootComponentProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoutes(value: Element): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStore(value: Store[js.Any, AnyAction]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      }
    }
    
    trait RouterProps extends StObject {
      
      var onError: js.UndefOr[js.Function1[/* error */ js.Any, js.Any]] = js.undefined
      
      var onUpdate: js.UndefOr[js.Function0[js.Any]] = js.undefined
    }
    object RouterProps {
      
      @scala.inline
      def apply(): RouterProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RouterProps]
      }
      
      @scala.inline
      implicit class RouterPropsMutableBuilder[Self <: RouterProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnError(value: /* error */ js.Any => js.Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
        
        @scala.inline
        def setOnUpdate(value: () => js.Any): Self = StObject.set(x, "onUpdate", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      }
    }
  }
}
