package typings.reduxDevtoolsExtension.mod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.Action
import typings.redux.mod.ActionCreator
import typings.reduxDevtoolsExtension.AnonCustom
import typings.reduxDevtoolsExtension.AnonDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhancerOptions extends js.Object {
  /**
    * action creators functions to be available in the Dispatcher.
    */
  var actionCreators: js.UndefOr[js.Array[ActionCreator[_]] | StringDictionary[ActionCreator[_]]] = js.undefined
  /**
    * function which takes `action` object and id number as arguments, and should return `action` object back.
    */
  var actionSanitizer: js.UndefOr[js.Function2[/* action */ Action[_], /* id */ Double, Action[_]]] = js.undefined
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
  var features: js.UndefOr[AnonCustom] = js.undefined
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
  var predicate: js.UndefOr[js.Function2[/* state */ js.Any, /* action */ Action[_], Boolean]] = js.undefined
  /**
    * - `undefined` - will use regular `JSON.stringify` to send data (it's the fast mode).
    * - `false` - will handle also circular references.
    * - `true` - will handle also date, regex, undefined, error objects, symbols, maps, sets and functions.
    * - object, which contains `date`, `regex`, `undefined`, `error`, `symbol`, `map`, `set` and `function` keys.
    *   For each of them you can indicate if to include (by setting as `true`).
    *   For `function` key you can also specify a custom function which handles serialization.
    *   See [`jsan`](https://github.com/kolodny/jsan) for more details.
    */
  var serialize: js.UndefOr[Boolean | AnonDate] = js.undefined
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
  var stateSanitizer: js.UndefOr[js.Function2[/* state */ js.Any, /* index */ Double, _]] = js.undefined
  /**
    * Set to true or a stacktrace-returning function to record call stack traces for dispatched actions.
    * Defaults to false.
    */
  var trace: js.UndefOr[Boolean | (js.Function1[/* action */ Action[_], String])] = js.undefined
  /**
    * The maximum number of stack trace entries to record per action. Defaults to 10.
    */
  var traceLimit: js.UndefOr[Double] = js.undefined
}

object EnhancerOptions {
  @scala.inline
  def apply(
    actionCreators: js.Array[ActionCreator[_]] | StringDictionary[ActionCreator[_]] = null,
    actionSanitizer: (/* action */ Action[_], /* id */ Double) => Action[_] = null,
    actionsBlacklist: String | js.Array[String] = null,
    actionsWhitelist: String | js.Array[String] = null,
    autoPause: js.UndefOr[Boolean] = js.undefined,
    features: AnonCustom = null,
    latency: Int | Double = null,
    maxAge: Int | Double = null,
    name: String = null,
    pauseActionType: String = null,
    predicate: (/* state */ js.Any, /* action */ Action[_]) => Boolean = null,
    serialize: Boolean | AnonDate = null,
    shouldCatchErrors: js.UndefOr[Boolean] = js.undefined,
    shouldHotReload: js.UndefOr[Boolean] = js.undefined,
    shouldRecordChanges: js.UndefOr[Boolean] = js.undefined,
    shouldStartLocked: js.UndefOr[Boolean] = js.undefined,
    stateSanitizer: (/* state */ js.Any, /* index */ Double) => _ = null,
    trace: Boolean | (js.Function1[/* action */ Action[_], String]) = null,
    traceLimit: Int | Double = null
  ): EnhancerOptions = {
    val __obj = js.Dynamic.literal()
    if (actionCreators != null) __obj.updateDynamic("actionCreators")(actionCreators.asInstanceOf[js.Any])
    if (actionSanitizer != null) __obj.updateDynamic("actionSanitizer")(js.Any.fromFunction2(actionSanitizer))
    if (actionsBlacklist != null) __obj.updateDynamic("actionsBlacklist")(actionsBlacklist.asInstanceOf[js.Any])
    if (actionsWhitelist != null) __obj.updateDynamic("actionsWhitelist")(actionsWhitelist.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPause)) __obj.updateDynamic("autoPause")(autoPause.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pauseActionType != null) __obj.updateDynamic("pauseActionType")(pauseActionType.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(js.Any.fromFunction2(predicate))
    if (serialize != null) __obj.updateDynamic("serialize")(serialize.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCatchErrors)) __obj.updateDynamic("shouldCatchErrors")(shouldCatchErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldHotReload)) __obj.updateDynamic("shouldHotReload")(shouldHotReload.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRecordChanges)) __obj.updateDynamic("shouldRecordChanges")(shouldRecordChanges.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldStartLocked)) __obj.updateDynamic("shouldStartLocked")(shouldStartLocked.asInstanceOf[js.Any])
    if (stateSanitizer != null) __obj.updateDynamic("stateSanitizer")(js.Any.fromFunction2(stateSanitizer))
    if (trace != null) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    if (traceLimit != null) __obj.updateDynamic("traceLimit")(traceLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancerOptions]
  }
}

