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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-devtools-extension", "composeWithDevTools")
  @js.native
  def composeWithDevTools(options: EnhancerOptions): FnCall = js.native
  @JSImport("redux-devtools-extension", "composeWithDevTools")
  @js.native
  def composeWithDevTools[StoreExt, StateExt](funcs: (StoreEnhancer[StoreExt, js.Object])*): StoreEnhancer[StoreExt, js.Object] = js.native
  
  @JSImport("redux-devtools-extension", "devToolsEnhancer")
  @js.native
  def devToolsEnhancer(options: EnhancerOptions): StoreEnhancer[_, js.Object] = js.native
  
  @js.native
  trait EnhancerOptions extends StObject {
    
    /**
      * action creators functions to be available in the Dispatcher.
      */
    var actionCreators: js.UndefOr[js.Array[ActionCreator[_]] | StringDictionary[ActionCreator[_]]] = js.native
    
    /**
      * function which takes `action` object and id number as arguments, and should return `action` object back.
      */
    var actionSanitizer: js.UndefOr[js.Function2[/* action */ Action[_], /* id */ Double, Action[_]]] = js.native
    
    /**
      * *string or array of strings as regex* - actions types to be hidden / shown in the monitors (while passed to the reducers).
      * If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
      */
    var actionsBlacklist: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * *string or array of strings as regex* - actions types to be hidden / shown in the monitors (while passed to the reducers).
      * If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
      */
    var actionsWhitelist: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * auto pauses when the extension’s window is not opened, and so has zero impact on your app when not in use.
      * Not available for Redux enhancer (as it already does it but storing the data to be sent).
      *
      * @default false
      */
    var autoPause: js.UndefOr[Boolean] = js.native
    
    /**
      * If you want to restrict the extension, specify the features you allow.
      * If not specified, all of the features are enabled. When set as an object, only those included as `true` will be allowed.
      * Note that except `true`/`false`, `import` and `export` can be set as `custom` (which is by default for Redux enhancer), meaning that the importing/exporting occurs on the client side.
      * Otherwise, you'll get/set the data right from the monitor part.
      */
    var features: js.UndefOr[Dispatch] = js.native
    
    /**
      * if more than one action is dispatched in the indicated interval, all new actions will be collected and sent at once.
      * It is the joint between performance and speed. When set to `0`, all actions will be sent instantly.
      * Set it to a higher value when experiencing perf issues (also `maxAge` to a lower value).
      *
      * @default 500 ms.
      */
    var latency: js.UndefOr[Double] = js.native
    
    /**
      * (> 1) - maximum allowed actions to be stored in the history tree. The oldest actions are removed once maxAge is reached. It's critical for performance.
      *
      * @default 50
      */
    var maxAge: js.UndefOr[Double] = js.native
    
    /**
      * the instance name to be showed on the monitor page. Default value is `document.title`.
      * If not specified and there's no document title, it will consist of `tabId` and `instanceId`.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * if specified, whenever clicking on `Pause recording` button and there are actions in the history log, will add this action type.
      * If not specified, will commit when paused. Available only for Redux enhancer.
      *
      * @default "@@PAUSED""
      */
    var pauseActionType: js.UndefOr[String] = js.native
    
    /**
      * called for every action before sending, takes `state` and `action` object, and returns `true` in case it allows sending the current data to the monitor.
      * Use it as a more advanced version of `actionsBlacklist`/`actionsWhitelist` parameters.
      */
    var predicate: js.UndefOr[js.Function2[/* state */ js.Any, /* action */ Action[_], Boolean]] = js.native
    
    /**
      * - `undefined` - will use regular `JSON.stringify` to send data (it's the fast mode).
      * - `false` - will handle also circular references.
      * - `true` - will handle also date, regex, undefined, error objects, symbols, maps, sets and functions.
      * - object, which contains `date`, `regex`, `undefined`, `error`, `symbol`, `map`, `set` and `function` keys.
      *   For each of them you can indicate if to include (by setting as `true`).
      *   For `function` key you can also specify a custom function which handles serialization.
      *   See [`jsan`](https://github.com/kolodny/jsan) for more details.
      */
    var serialize: js.UndefOr[Boolean | Date] = js.native
    
    /**
      * if specified as `true`, whenever there's an exception in reducers, the monitors will show the error message, and next actions will not be dispatched.
      *
      * @default false
      */
    var shouldCatchErrors: js.UndefOr[Boolean] = js.native
    
    /**
      * if set to `false`, will not recompute the states on hot reloading (or on replacing the reducers). Available only for Redux enhancer.
      *
      * @default true
      */
    var shouldHotReload: js.UndefOr[Boolean] = js.native
    
    /**
      * if specified as `false`, it will not record the changes till clicking on `Start recording` button.
      * Available only for Redux enhancer, for others use `autoPause`.
      *
      * @default true
      */
    var shouldRecordChanges: js.UndefOr[Boolean] = js.native
    
    /**
      * if specified as `true`, it will not allow any non-monitor actions to be dispatched till clicking on `Unlock changes` button.
      * Available only for Redux enhancer.
      *
      * @default false
      */
    var shouldStartLocked: js.UndefOr[Boolean] = js.native
    
    /**
      * function which takes `state` object and index as arguments, and should return `state` object back.
      */
    var stateSanitizer: js.UndefOr[js.Function2[/* state */ js.Any, /* index */ Double, _]] = js.native
    
    /**
      * Set to true or a stacktrace-returning function to record call stack traces for dispatched actions.
      * Defaults to false.
      */
    var trace: js.UndefOr[Boolean | (js.Function1[/* action */ Action[_], String])] = js.native
    
    /**
      * The maximum number of stack trace entries to record per action. Defaults to 10.
      */
    var traceLimit: js.UndefOr[Double] = js.native
  }
  object EnhancerOptions {
    
    @scala.inline
    def apply(): EnhancerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnhancerOptions]
    }
    
    @scala.inline
    implicit class EnhancerOptionsMutableBuilder[Self <: EnhancerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionCreators(value: js.Array[ActionCreator[_]] | StringDictionary[ActionCreator[_]]): Self = StObject.set(x, "actionCreators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionCreatorsUndefined: Self = StObject.set(x, "actionCreators", js.undefined)
      
      @scala.inline
      def setActionCreatorsVarargs(value: ActionCreator[js.Any]*): Self = StObject.set(x, "actionCreators", js.Array(value :_*))
      
      @scala.inline
      def setActionSanitizer(value: (/* action */ Action[_], /* id */ Double) => Action[_]): Self = StObject.set(x, "actionSanitizer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setActionSanitizerUndefined: Self = StObject.set(x, "actionSanitizer", js.undefined)
      
      @scala.inline
      def setActionsBlacklist(value: String | js.Array[String]): Self = StObject.set(x, "actionsBlacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsBlacklistUndefined: Self = StObject.set(x, "actionsBlacklist", js.undefined)
      
      @scala.inline
      def setActionsBlacklistVarargs(value: String*): Self = StObject.set(x, "actionsBlacklist", js.Array(value :_*))
      
      @scala.inline
      def setActionsWhitelist(value: String | js.Array[String]): Self = StObject.set(x, "actionsWhitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsWhitelistUndefined: Self = StObject.set(x, "actionsWhitelist", js.undefined)
      
      @scala.inline
      def setActionsWhitelistVarargs(value: String*): Self = StObject.set(x, "actionsWhitelist", js.Array(value :_*))
      
      @scala.inline
      def setAutoPause(value: Boolean): Self = StObject.set(x, "autoPause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPauseUndefined: Self = StObject.set(x, "autoPause", js.undefined)
      
      @scala.inline
      def setFeatures(value: Dispatch): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPauseActionType(value: String): Self = StObject.set(x, "pauseActionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseActionTypeUndefined: Self = StObject.set(x, "pauseActionType", js.undefined)
      
      @scala.inline
      def setPredicate(value: (/* state */ js.Any, /* action */ Action[_]) => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      @scala.inline
      def setSerialize(value: Boolean | Date): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      @scala.inline
      def setShouldCatchErrors(value: Boolean): Self = StObject.set(x, "shouldCatchErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldCatchErrorsUndefined: Self = StObject.set(x, "shouldCatchErrors", js.undefined)
      
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
      def setStateSanitizer(value: (/* state */ js.Any, /* index */ Double) => _): Self = StObject.set(x, "stateSanitizer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStateSanitizerUndefined: Self = StObject.set(x, "stateSanitizer", js.undefined)
      
      @scala.inline
      def setTrace(value: Boolean | (js.Function1[/* action */ Action[_], String])): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceFunction1(value: /* action */ Action[_] => String): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTraceLimit(value: Double): Self = StObject.set(x, "traceLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceLimitUndefined: Self = StObject.set(x, "traceLimit", js.undefined)
      
      @scala.inline
      def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
}
