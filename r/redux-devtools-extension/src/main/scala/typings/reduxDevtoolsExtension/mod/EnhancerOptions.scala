package typings.reduxDevtoolsExtension.mod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.Action
import typings.redux.mod.ActionCreator
import typings.reduxDevtoolsExtension.anon.Date
import typings.reduxDevtoolsExtension.anon.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnhancerOptions extends js.Object {
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
  implicit class EnhancerOptionsOps[Self <: EnhancerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionCreatorsVarargs(value: ActionCreator[js.Any]*): Self = this.set("actionCreators", js.Array(value :_*))
    @scala.inline
    def setActionCreators(value: js.Array[ActionCreator[_]] | StringDictionary[ActionCreator[_]]): Self = this.set("actionCreators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionCreators: Self = this.set("actionCreators", js.undefined)
    @scala.inline
    def setActionSanitizer(value: (/* action */ Action[_], /* id */ Double) => Action[_]): Self = this.set("actionSanitizer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteActionSanitizer: Self = this.set("actionSanitizer", js.undefined)
    @scala.inline
    def setActionsBlacklistVarargs(value: String*): Self = this.set("actionsBlacklist", js.Array(value :_*))
    @scala.inline
    def setActionsBlacklist(value: String | js.Array[String]): Self = this.set("actionsBlacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionsBlacklist: Self = this.set("actionsBlacklist", js.undefined)
    @scala.inline
    def setActionsWhitelistVarargs(value: String*): Self = this.set("actionsWhitelist", js.Array(value :_*))
    @scala.inline
    def setActionsWhitelist(value: String | js.Array[String]): Self = this.set("actionsWhitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionsWhitelist: Self = this.set("actionsWhitelist", js.undefined)
    @scala.inline
    def setAutoPause(value: Boolean): Self = this.set("autoPause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPause: Self = this.set("autoPause", js.undefined)
    @scala.inline
    def setFeatures(value: Dispatch): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setLatency(value: Double): Self = this.set("latency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPauseActionType(value: String): Self = this.set("pauseActionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseActionType: Self = this.set("pauseActionType", js.undefined)
    @scala.inline
    def setPredicate(value: (/* state */ js.Any, /* action */ Action[_]) => Boolean): Self = this.set("predicate", js.Any.fromFunction2(value))
    @scala.inline
    def deletePredicate: Self = this.set("predicate", js.undefined)
    @scala.inline
    def setSerialize(value: Boolean | Date): Self = this.set("serialize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    @scala.inline
    def setShouldCatchErrors(value: Boolean): Self = this.set("shouldCatchErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldCatchErrors: Self = this.set("shouldCatchErrors", js.undefined)
    @scala.inline
    def setShouldHotReload(value: Boolean): Self = this.set("shouldHotReload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldHotReload: Self = this.set("shouldHotReload", js.undefined)
    @scala.inline
    def setShouldRecordChanges(value: Boolean): Self = this.set("shouldRecordChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldRecordChanges: Self = this.set("shouldRecordChanges", js.undefined)
    @scala.inline
    def setShouldStartLocked(value: Boolean): Self = this.set("shouldStartLocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldStartLocked: Self = this.set("shouldStartLocked", js.undefined)
    @scala.inline
    def setStateSanitizer(value: (/* state */ js.Any, /* index */ Double) => _): Self = this.set("stateSanitizer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStateSanitizer: Self = this.set("stateSanitizer", js.undefined)
    @scala.inline
    def setTraceFunction1(value: /* action */ Action[_] => String): Self = this.set("trace", js.Any.fromFunction1(value))
    @scala.inline
    def setTrace(value: Boolean | (js.Function1[/* action */ Action[_], String])): Self = this.set("trace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
    @scala.inline
    def setTraceLimit(value: Double): Self = this.set("traceLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceLimit: Self = this.set("traceLimit", js.undefined)
  }
  
}

