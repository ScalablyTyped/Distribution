package typings.remoteReduxDevtools.mod

import typings.redux.mod.ActionCreator
import typings.redux.mod.ActionCreatorsMapObject
import typings.remoteReduxDevtools.remoteReduxDevtoolsNumbers.`0`
import typings.remoteReduxDevtools.remoteReduxDevtoolsNumbers.`1`
import typings.remoteReduxDevtools.remoteReduxDevtoolsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteReduxDevToolsOptions extends js.Object {
  /** Action creators functions to be available in the dispatcher. */
  var actionCreators: js.UndefOr[js.Array[ActionCreator[_]] | ActionCreatorsMapObject[_]] = js.undefined
  /**
    * Function which takes `action` object as argument, and should return
    * `action` object back.
    */
  var actionSanitizer: js.UndefOr[js.Function1[/* action */ js.Any, _]] = js.undefined
  /**
    * Actions types to be hidden in the monitors (while passed to the
    * reducers). If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
    */
  var actionsBlacklist: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Actions types to be shown in the monitors (while passed to the reducers).
    * If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
    */
  var actionsWhitelist: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Used to specify host for `remotedev-server`. If `port` is specified,
    * default value is `localhost`.
    */
  var hostname: js.UndefOr[String] = js.undefined
  /**
    * Identifies the instance when sending the history triggered by `sendOn`.
    * You can use, for example, user id here, to know who sent the data.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Maximum allowed actions to be stored in the history tree. The oldest
    * actions are removed once `maxAge` is reached. It's critical for
    * performance.
    */
  var maxAge: js.UndefOr[Double] = js.undefined
  /** The instance name to be showed on the monitor page. */
  var name: js.UndefOr[String] = js.undefined
  /** Used to specify host's port for `remotedev-server`. */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * Specifies whether to allow remote monitoring. By default is
    * `process.env.NODE_ENV === 'development'`.
    */
  var realtime: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to use `https` protocol for `remotedev-server`. */
  var secure: js.UndefOr[Boolean] = js.undefined
  /**
    * Action or list of actions which should trigger sending the history to
    * the monitor (without starting it).
    */
  var sendOn: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * `0` - disabled (default)
    * `1` - send all uncaught exception messages
    * `2` - send only reducers error messages.
    */
  var sendOnError: js.UndefOr[`0` | `1` | `2`] = js.undefined
  /**
    * URL of the monitor to send the history when sendOn is triggered. By
    * default is `${secure ? 'https' : 'http'}://${hostname}:${port}`.
    */
  var sendTo: js.UndefOr[String] = js.undefined
  /**
    * If specified as `true`, whenever there's an exception in reducers, the
    * monitors will show the error message, and next actions will not be
    * dispatched.
    */
  var shouldCatchErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to `false`, will not recompute the states on hot reloading (or on
    * replacing the reducers). Available only for Redux enhancer.
    */
  var shouldHotReload: js.UndefOr[Boolean] = js.undefined
  /**
    * If specified as `false`, it will not record the changes till clicking on
    * *Start recording* button. Available only for Redux enhancer, for others
    * use `autoPause`.
    */
  var shouldRecordChanges: js.UndefOr[Boolean] = js.undefined
  /**
    * If specified as `true`, it will not allow any non-monitor actions to be
    * dispatched till clicking on *Unlock changes* button. Available only for
    * Redux enhancer.
    */
  var shouldStartLocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Action or list of actions which should start remote monitoring (when
    * `realtime` is `false`).
    */
  var startOn: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Function which takes `state` object as argument, and should return
    * `state` object back.
    */
  var stateSanitizer: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  /** Action or list of actions which should stop remote monitoring. */
  var stopOn: js.UndefOr[String | js.Array[String]] = js.undefined
}

object RemoteReduxDevToolsOptions {
  @scala.inline
  def apply(
    actionCreators: js.Array[ActionCreator[_]] | ActionCreatorsMapObject[_] = null,
    actionSanitizer: /* action */ js.Any => _ = null,
    actionsBlacklist: String | js.Array[String] = null,
    actionsWhitelist: String | js.Array[String] = null,
    hostname: String = null,
    id: String = null,
    maxAge: js.UndefOr[Double] = js.undefined,
    name: String = null,
    port: js.UndefOr[Double] = js.undefined,
    realtime: js.UndefOr[Boolean] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined,
    sendOn: String | js.Array[String] = null,
    sendOnError: `0` | `1` | `2` = null,
    sendTo: String = null,
    shouldCatchErrors: js.UndefOr[Boolean] = js.undefined,
    shouldHotReload: js.UndefOr[Boolean] = js.undefined,
    shouldRecordChanges: js.UndefOr[Boolean] = js.undefined,
    shouldStartLocked: js.UndefOr[Boolean] = js.undefined,
    startOn: String | js.Array[String] = null,
    stateSanitizer: /* state */ js.Any => _ = null,
    stopOn: String | js.Array[String] = null
  ): RemoteReduxDevToolsOptions = {
    val __obj = js.Dynamic.literal()
    if (actionCreators != null) __obj.updateDynamic("actionCreators")(actionCreators.asInstanceOf[js.Any])
    if (actionSanitizer != null) __obj.updateDynamic("actionSanitizer")(js.Any.fromFunction1(actionSanitizer))
    if (actionsBlacklist != null) __obj.updateDynamic("actionsBlacklist")(actionsBlacklist.asInstanceOf[js.Any])
    if (actionsWhitelist != null) __obj.updateDynamic("actionsWhitelist")(actionsWhitelist.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (sendOn != null) __obj.updateDynamic("sendOn")(sendOn.asInstanceOf[js.Any])
    if (sendOnError != null) __obj.updateDynamic("sendOnError")(sendOnError.asInstanceOf[js.Any])
    if (sendTo != null) __obj.updateDynamic("sendTo")(sendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCatchErrors)) __obj.updateDynamic("shouldCatchErrors")(shouldCatchErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldHotReload)) __obj.updateDynamic("shouldHotReload")(shouldHotReload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRecordChanges)) __obj.updateDynamic("shouldRecordChanges")(shouldRecordChanges.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldStartLocked)) __obj.updateDynamic("shouldStartLocked")(shouldStartLocked.get.asInstanceOf[js.Any])
    if (startOn != null) __obj.updateDynamic("startOn")(startOn.asInstanceOf[js.Any])
    if (stateSanitizer != null) __obj.updateDynamic("stateSanitizer")(js.Any.fromFunction1(stateSanitizer))
    if (stopOn != null) __obj.updateDynamic("stopOn")(stopOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteReduxDevToolsOptions]
  }
}

