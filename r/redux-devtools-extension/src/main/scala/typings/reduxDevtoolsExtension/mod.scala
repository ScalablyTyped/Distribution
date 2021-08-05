package typings.reduxDevtoolsExtension

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.Action
import typings.redux.mod.ActionCreator
import typings.redux.mod.StoreEnhancer
import typings.reduxDevtoolsExtension.anon.Date
import typings.reduxDevtoolsExtension.anon.Dispatch
import typings.reduxDevtoolsExtension.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-devtools-extension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeWithDevTools(options: EnhancerOptions): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("composeWithDevTools")(options.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  inline def composeWithDevTools[StoreExt, StateExt](funcs: (StoreEnhancer[StoreExt, js.Object])*): StoreEnhancer[StoreExt, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeWithDevTools")(funcs.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[StoreExt, js.Object]]
  
  inline def devToolsEnhancer(options: EnhancerOptions): StoreEnhancer[js.Any, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("devToolsEnhancer")(options.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[js.Any, js.Object]]
  
  trait EnhancerOptions extends StObject {
    
    /**
      * action creators functions to be available in the Dispatcher.
      */
    var actionCreators: js.UndefOr[js.Array[ActionCreator[js.Any]] | StringDictionary[ActionCreator[js.Any]]] = js.undefined
    
    /**
      * function which takes `action` object and id number as arguments, and should return `action` object back.
      */
    var actionSanitizer: js.UndefOr[js.Function2[/* action */ Action[js.Any], /* id */ Double, Action[js.Any]]] = js.undefined
    
    /**
      * *string or array of strings as regex* - actions types to be hidden / shown in the monitors (while passed to the reducers).
      * If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
      */
    var actionsBlacklist: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * *string or array of strings as regex* - actions types to be hidden / shown in the monitors (while passed to the reducers).
      * If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
      */
    var actionsWhitelist: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * auto pauses when the extension’s window is not opened, and so has zero impact on your app when not in use.
      * Not available for Redux enhancer (as it already does it but storing the data to be sent).
      *
      * @default false
      */
    var autoPause: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you want to restrict the extension, specify the features you allow.
      * If not specified, all of the features are enabled. When set as an object, only those included as `true` will be allowed.
      * Note that except `true`/`false`, `import` and `export` can be set as `custom` (which is by default for Redux enhancer), meaning that the importing/exporting occurs on the client side.
      * Otherwise, you'll get/set the data right from the monitor part.
      */
    var features: js.UndefOr[Dispatch] = js.undefined
    
    /**
      * if more than one action is dispatched in the indicated interval, all new actions will be collected and sent at once.
      * It is the joint between performance and speed. When set to `0`, all actions will be sent instantly.
      * Set it to a higher value when experiencing perf issues (also `maxAge` to a lower value).
      *
      * @default 500 ms.
      */
    var latency: js.UndefOr[Double] = js.undefined
    
    /**
      * (> 1) - maximum allowed actions to be stored in the history tree. The oldest actions are removed once maxAge is reached. It's critical for performance.
      *
      * @default 50
      */
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * the instance name to be showed on the monitor page. Default value is `document.title`.
      * If not specified and there's no document title, it will consist of `tabId` and `instanceId`.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * if specified, whenever clicking on `Pause recording` button and there are actions in the history log, will add this action type.
      * If not specified, will commit when paused. Available only for Redux enhancer.
      *
      * @default "@@PAUSED""
      */
    var pauseActionType: js.UndefOr[String] = js.undefined
    
    /**
      * called for every action before sending, takes `state` and `action` object, and returns `true` in case it allows sending the current data to the monitor.
      * Use it as a more advanced version of `actionsBlacklist`/`actionsWhitelist` parameters.
      */
    var predicate: js.UndefOr[js.Function2[/* state */ js.Any, /* action */ Action[js.Any], Boolean]] = js.undefined
    
    /**
      * - `undefined` - will use regular `JSON.stringify` to send data (it's the fast mode).
      * - `false` - will handle also circular references.
      * - `true` - will handle also date, regex, undefined, error objects, symbols, maps, sets and functions.
      * - object, which contains `date`, `regex`, `undefined`, `error`, `symbol`, `map`, `set` and `function` keys.
      *   For each of them you can indicate if to include (by setting as `true`).
      *   For `function` key you can also specify a custom function which handles serialization.
      *   See [`jsan`](https://github.com/kolodny/jsan) for more details.
      */
    var serialize: js.UndefOr[Boolean | Date] = js.undefined
    
    /**
      * if specified as `true`, whenever there's an exception in reducers, the monitors will show the error message, and next actions will not be dispatched.
      *
      * @default false
      */
    var shouldCatchErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if set to `false`, will not recompute the states on hot reloading (or on replacing the reducers). Available only for Redux enhancer.
      *
      * @default true
      */
    var shouldHotReload: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if specified as `false`, it will not record the changes till clicking on `Start recording` button.
      * Available only for Redux enhancer, for others use `autoPause`.
      *
      * @default true
      */
    var shouldRecordChanges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if specified as `true`, it will not allow any non-monitor actions to be dispatched till clicking on `Unlock changes` button.
      * Available only for Redux enhancer.
      *
      * @default false
      */
    var shouldStartLocked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * function which takes `state` object and index as arguments, and should return `state` object back.
      */
    var stateSanitizer: js.UndefOr[js.Function2[/* state */ js.Any, /* index */ Double, js.Any]] = js.undefined
    
    /**
      * Set to true or a stacktrace-returning function to record call stack traces for dispatched actions.
      * Defaults to false.
      */
    var trace: js.UndefOr[Boolean | (js.Function1[/* action */ Action[js.Any], String])] = js.undefined
    
    /**
      * The maximum number of stack trace entries to record per action. Defaults to 10.
      */
    var traceLimit: js.UndefOr[Double] = js.undefined
  }
  object EnhancerOptions {
    
    inline def apply(): EnhancerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnhancerOptions]
    }
    
    extension [Self <: EnhancerOptions](x: Self) {
      
      inline def setActionCreators(value: js.Array[ActionCreator[js.Any]] | StringDictionary[ActionCreator[js.Any]]): Self = StObject.set(x, "actionCreators", value.asInstanceOf[js.Any])
      
      inline def setActionCreatorsUndefined: Self = StObject.set(x, "actionCreators", js.undefined)
      
      inline def setActionCreatorsVarargs(value: ActionCreator[js.Any]*): Self = StObject.set(x, "actionCreators", js.Array(value :_*))
      
      inline def setActionSanitizer(value: (/* action */ Action[js.Any], /* id */ Double) => Action[js.Any]): Self = StObject.set(x, "actionSanitizer", js.Any.fromFunction2(value))
      
      inline def setActionSanitizerUndefined: Self = StObject.set(x, "actionSanitizer", js.undefined)
      
      inline def setActionsBlacklist(value: String | js.Array[String]): Self = StObject.set(x, "actionsBlacklist", value.asInstanceOf[js.Any])
      
      inline def setActionsBlacklistUndefined: Self = StObject.set(x, "actionsBlacklist", js.undefined)
      
      inline def setActionsBlacklistVarargs(value: String*): Self = StObject.set(x, "actionsBlacklist", js.Array(value :_*))
      
      inline def setActionsWhitelist(value: String | js.Array[String]): Self = StObject.set(x, "actionsWhitelist", value.asInstanceOf[js.Any])
      
      inline def setActionsWhitelistUndefined: Self = StObject.set(x, "actionsWhitelist", js.undefined)
      
      inline def setActionsWhitelistVarargs(value: String*): Self = StObject.set(x, "actionsWhitelist", js.Array(value :_*))
      
      inline def setAutoPause(value: Boolean): Self = StObject.set(x, "autoPause", value.asInstanceOf[js.Any])
      
      inline def setAutoPauseUndefined: Self = StObject.set(x, "autoPause", js.undefined)
      
      inline def setFeatures(value: Dispatch): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPauseActionType(value: String): Self = StObject.set(x, "pauseActionType", value.asInstanceOf[js.Any])
      
      inline def setPauseActionTypeUndefined: Self = StObject.set(x, "pauseActionType", js.undefined)
      
      inline def setPredicate(value: (/* state */ js.Any, /* action */ Action[js.Any]) => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction2(value))
      
      inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      inline def setSerialize(value: Boolean | Date): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setShouldCatchErrors(value: Boolean): Self = StObject.set(x, "shouldCatchErrors", value.asInstanceOf[js.Any])
      
      inline def setShouldCatchErrorsUndefined: Self = StObject.set(x, "shouldCatchErrors", js.undefined)
      
      inline def setShouldHotReload(value: Boolean): Self = StObject.set(x, "shouldHotReload", value.asInstanceOf[js.Any])
      
      inline def setShouldHotReloadUndefined: Self = StObject.set(x, "shouldHotReload", js.undefined)
      
      inline def setShouldRecordChanges(value: Boolean): Self = StObject.set(x, "shouldRecordChanges", value.asInstanceOf[js.Any])
      
      inline def setShouldRecordChangesUndefined: Self = StObject.set(x, "shouldRecordChanges", js.undefined)
      
      inline def setShouldStartLocked(value: Boolean): Self = StObject.set(x, "shouldStartLocked", value.asInstanceOf[js.Any])
      
      inline def setShouldStartLockedUndefined: Self = StObject.set(x, "shouldStartLocked", js.undefined)
      
      inline def setStateSanitizer(value: (/* state */ js.Any, /* index */ Double) => js.Any): Self = StObject.set(x, "stateSanitizer", js.Any.fromFunction2(value))
      
      inline def setStateSanitizerUndefined: Self = StObject.set(x, "stateSanitizer", js.undefined)
      
      inline def setTrace(value: Boolean | (js.Function1[/* action */ Action[js.Any], String])): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceFunction1(value: /* action */ Action[js.Any] => String): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      inline def setTraceLimit(value: Double): Self = StObject.set(x, "traceLimit", value.asInstanceOf[js.Any])
      
      inline def setTraceLimitUndefined: Self = StObject.set(x, "traceLimit", js.undefined)
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
}
