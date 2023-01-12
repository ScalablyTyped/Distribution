package typings.reduxBootstrap

import org.scalablytyped.runtime.StringDictionary
import typings.history.mod.History
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

object dtsInterfacesInterfacesMod {
  
  object interfaces {
    
    trait BoostrapOptions extends StObject {
      
      var container: js.UndefOr[String] = js.undefined
      
      var createHistory: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.CreateHistory<History.HistoryOptions, History.History> */ Any
          ] = js.undefined
      
      var devToolsOptions: js.UndefOr[DevToolsOptions] = js.undefined
      
      var enhancers: js.UndefOr[js.Array[StoreEnhancer[Any, js.Object]]] = js.undefined
      
      var historyOptions: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.HistoryOptions */ Any
          ] = js.undefined
      
      var initialState: js.UndefOr[Any] = js.undefined
      
      var middlewares: js.UndefOr[js.Array[Middleware[js.Object, Any, Dispatch[AnyAction]]]] = js.undefined
      
      var reducers: ReducersOption
      
      var render: js.UndefOr[js.Function] = js.undefined
      
      var routerProps: js.UndefOr[RouterProps] = js.undefined
      
      var routes: Element
    }
    object BoostrapOptions {
      
      inline def apply(reducers: ReducersOption, routes: Element): BoostrapOptions = {
        val __obj = js.Dynamic.literal(reducers = reducers.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
        __obj.asInstanceOf[BoostrapOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BoostrapOptions] (val x: Self) extends AnyVal {
        
        inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
        
        inline def setCreateHistory(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.CreateHistory<History.HistoryOptions, History.History> */ Any
        ): Self = StObject.set(x, "createHistory", value.asInstanceOf[js.Any])
        
        inline def setCreateHistoryUndefined: Self = StObject.set(x, "createHistory", js.undefined)
        
        inline def setDevToolsOptions(value: DevToolsOptions): Self = StObject.set(x, "devToolsOptions", value.asInstanceOf[js.Any])
        
        inline def setDevToolsOptionsUndefined: Self = StObject.set(x, "devToolsOptions", js.undefined)
        
        inline def setEnhancers(value: js.Array[StoreEnhancer[Any, js.Object]]): Self = StObject.set(x, "enhancers", value.asInstanceOf[js.Any])
        
        inline def setEnhancersUndefined: Self = StObject.set(x, "enhancers", js.undefined)
        
        inline def setEnhancersVarargs(value: (StoreEnhancer[Any, js.Object])*): Self = StObject.set(x, "enhancers", js.Array(value*))
        
        inline def setHistoryOptions(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.HistoryOptions */ Any
        ): Self = StObject.set(x, "historyOptions", value.asInstanceOf[js.Any])
        
        inline def setHistoryOptionsUndefined: Self = StObject.set(x, "historyOptions", js.undefined)
        
        inline def setInitialState(value: Any): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
        
        inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
        
        inline def setMiddlewares(value: js.Array[Middleware[js.Object, Any, Dispatch[AnyAction]]]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
        
        inline def setMiddlewaresUndefined: Self = StObject.set(x, "middlewares", js.undefined)
        
        inline def setMiddlewaresVarargs(value: (Middleware[js.Object, Any, Dispatch[AnyAction]])*): Self = StObject.set(x, "middlewares", js.Array(value*))
        
        inline def setReducers(value: ReducersOption): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
        
        inline def setRender(value: js.Function): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
        
        inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
        
        inline def setRouterProps(value: RouterProps): Self = StObject.set(x, "routerProps", value.asInstanceOf[js.Any])
        
        inline def setRouterPropsUndefined: Self = StObject.set(x, "routerProps", js.undefined)
        
        inline def setRoutes(value: Element): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      }
    }
    
    trait BootstrapResult extends StObject {
      
      var history: History
      
      var output: Any
      
      var root: Element
      
      var store: Store[Any, AnyAction]
    }
    object BootstrapResult {
      
      inline def apply(history: History, output: Any, root: Element, store: Store[Any, AnyAction]): BootstrapResult = {
        val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
        __obj.asInstanceOf[BootstrapResult]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BootstrapResult] (val x: Self) extends AnyVal {
        
        inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
        
        inline def setOutput(value: Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        inline def setRoot(value: Element): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
        
        inline def setStore(value: Store[Any, AnyAction]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
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
        middlewares: js.Array[Middleware[js.Object, Any, Dispatch[AnyAction]]],
        rootReducer: js.Object,
        initialState: Any
      ): Store[Any, AnyAction] = js.native
    }
    
    @js.native
    trait DevTools
      extends js.Function {
      
      def apply(options: DevToolsOptions): Compose = js.native
    }
    
    trait DevToolsOptions extends StObject {
      
      var actionBlacklist: js.UndefOr[String | js.Array[String]] = js.undefined
      
      var actionCreators: js.UndefOr[js.Array[Any] | js.Object] = js.undefined
      
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
      
      inline def apply(): DevToolsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DevToolsOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DevToolsOptions] (val x: Self) extends AnyVal {
        
        inline def setActionBlacklist(value: String | js.Array[String]): Self = StObject.set(x, "actionBlacklist", value.asInstanceOf[js.Any])
        
        inline def setActionBlacklistUndefined: Self = StObject.set(x, "actionBlacklist", js.undefined)
        
        inline def setActionBlacklistVarargs(value: String*): Self = StObject.set(x, "actionBlacklist", js.Array(value*))
        
        inline def setActionCreators(value: js.Array[Any] | js.Object): Self = StObject.set(x, "actionCreators", value.asInstanceOf[js.Any])
        
        inline def setActionCreatorsUndefined: Self = StObject.set(x, "actionCreators", js.undefined)
        
        inline def setActionCreatorsVarargs(value: Any*): Self = StObject.set(x, "actionCreators", js.Array(value*))
        
        inline def setActionSanitizer(value: js.Function): Self = StObject.set(x, "actionSanitizer", value.asInstanceOf[js.Any])
        
        inline def setActionSanitizerUndefined: Self = StObject.set(x, "actionSanitizer", js.undefined)
        
        inline def setActionWhitelist(value: String | js.Array[String]): Self = StObject.set(x, "actionWhitelist", value.asInstanceOf[js.Any])
        
        inline def setActionWhitelistUndefined: Self = StObject.set(x, "actionWhitelist", js.undefined)
        
        inline def setActionWhitelistVarargs(value: String*): Self = StObject.set(x, "actionWhitelist", js.Array(value*))
        
        inline def setAutoPause(value: Boolean): Self = StObject.set(x, "autoPause", value.asInstanceOf[js.Any])
        
        inline def setAutoPauseUndefined: Self = StObject.set(x, "autoPause", js.undefined)
        
        inline def setFeatures(value: js.Object): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
        
        inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
        
        inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
        
        inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPauseActionType(value: String): Self = StObject.set(x, "pauseActionType", value.asInstanceOf[js.Any])
        
        inline def setPauseActionTypeUndefined: Self = StObject.set(x, "pauseActionType", js.undefined)
        
        inline def setPredicate(value: js.Function): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
        
        inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
        
        inline def setSerialize(value: Boolean | js.Object): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
        
        inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
        
        inline def setShouldHotReload(value: Boolean): Self = StObject.set(x, "shouldHotReload", value.asInstanceOf[js.Any])
        
        inline def setShouldHotReloadUndefined: Self = StObject.set(x, "shouldHotReload", js.undefined)
        
        inline def setShouldRecordChanges(value: Boolean): Self = StObject.set(x, "shouldRecordChanges", value.asInstanceOf[js.Any])
        
        inline def setShouldRecordChangesUndefined: Self = StObject.set(x, "shouldRecordChanges", js.undefined)
        
        inline def setShouldStartLocked(value: Boolean): Self = StObject.set(x, "shouldStartLocked", value.asInstanceOf[js.Any])
        
        inline def setShouldStartLockedUndefined: Self = StObject.set(x, "shouldStartLocked", js.undefined)
        
        inline def setStateSanitizer(value: js.Function): Self = StObject.set(x, "stateSanitizer", value.asInstanceOf[js.Any])
        
        inline def setStateSanitizerUndefined: Self = StObject.set(x, "stateSanitizer", js.undefined)
      }
    }
    
    trait NodeModule extends StObject {
      
      var hot: Accept
    }
    object NodeModule {
      
      inline def apply(hot: Accept): NodeModule = {
        val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any])
        __obj.asInstanceOf[NodeModule]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NodeModule] (val x: Self) extends AnyVal {
        
        inline def setHot(value: Accept): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      }
    }
    
    type ReducersOption = StringDictionary[Reducer[Any, AnyAction]]
    
    trait RootComponentProps extends StObject {
      
      var history: History
      
      var routes: Element
      
      var store: Store[Any, AnyAction]
    }
    object RootComponentProps {
      
      inline def apply(history: History, routes: Element, store: Store[Any, AnyAction]): RootComponentProps = {
        val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
        __obj.asInstanceOf[RootComponentProps]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RootComponentProps] (val x: Self) extends AnyVal {
        
        inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
        
        inline def setRoutes(value: Element): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
        
        inline def setStore(value: Store[Any, AnyAction]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      }
    }
    
    trait RouterProps extends StObject {
      
      var onError: js.UndefOr[js.Function1[/* error */ Any, Any]] = js.undefined
      
      var onUpdate: js.UndefOr[js.Function0[Any]] = js.undefined
    }
    object RouterProps {
      
      inline def apply(): RouterProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RouterProps]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RouterProps] (val x: Self) extends AnyVal {
        
        inline def setOnError(value: /* error */ Any => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
        
        inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
        
        inline def setOnUpdate(value: () => Any): Self = StObject.set(x, "onUpdate", js.Any.fromFunction0(value))
        
        inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      }
    }
  }
}
