package typings
package remoteDashReduxDashDevtoolsLib.remoteDashReduxDashDevtoolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RemoteReduxDevToolsOptions extends js.Object {
  /** Action creators functions to be available in the dispatcher. */
  var actionCreators: js.UndefOr[
    js.Array[reduxLib.reduxMod.ActionCreator[_]] | reduxLib.reduxMod.ActionCreatorsMapObject[_]
  ] = js.undefined
  /**
     * Function which takes `action` object as argument, and should return
     * `action` object back.
     */
  var actionSanitizer: js.UndefOr[js.Function1[/* action */ js.Any, _]] = js.undefined
  /**
     * Actions types to be hidden in the monitors (while passed to the
     * reducers). If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
     */
  var actionsBlacklist: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
     * Actions types to be shown in the monitors (while passed to the reducers).
     * If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
     */
  var actionsWhitelist: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
     * Used to specify host for `remotedev-server`. If `port` is specified,
     * default value is `localhost`.
     */
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Identifies the instance when sending the history triggered by `sendOn`.
     * You can use, for example, user id here, to know who sent the data.
     */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Maximum allowed actions to be stored in the history tree. The oldest
     * actions are removed once `maxAge` is reached. It's critical for
     * performance.
     */
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  /** The instance name to be showed on the monitor page. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Used to specify host's port for `remotedev-server`. */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
     * Specifies whether to allow remote monitoring. By default is
     * `process.env.NODE_ENV === 'development'`.
     */
  var realtime: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to use `https` protocol for `remotedev-server`. */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Action or list of actions which should trigger sending the history to
     * the monitor (without starting it).
     */
  var sendOn: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
     * `0` - disabled (default)
     * `1` - send all uncaught exception messages
     * `2` - send only reducers error messages.
     */
  var sendOnError: js.UndefOr[
    remoteDashReduxDashDevtoolsLib.remoteDashReduxDashDevtoolsLibNumbers.`0` | remoteDashReduxDashDevtoolsLib.remoteDashReduxDashDevtoolsLibNumbers.`1` | remoteDashReduxDashDevtoolsLib.remoteDashReduxDashDevtoolsLibNumbers.`2`
  ] = js.undefined
  /**
     * URL of the monitor to send the history when sendOn is triggered. By
     * default is `${secure ? 'https' : 'http'}://${hostname}:${port}`.
     */
  var sendTo: js.UndefOr[java.lang.String] = js.undefined
  /**
     * If specified as `true`, whenever there's an exception in reducers, the
     * monitors will show the error message, and next actions will not be
     * dispatched.
     */
  var shouldCatchErrors: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If set to `false`, will not recompute the states on hot reloading (or on
     * replacing the reducers). Available only for Redux enhancer.
     */
  var shouldHotReload: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If specified as `false`, it will not record the changes till clicking on
     * *Start recording* button. Available only for Redux enhancer, for others
     * use `autoPause`.
     */
  var shouldRecordChanges: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If specified as `true`, it will not allow any non-monitor actions to be
     * dispatched till clicking on *Unlock changes* button. Available only for
     * Redux enhancer.
     */
  var shouldStartLocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Action or list of actions which should start remote monitoring (when
     * `realtime` is `false`).
     */
  var startOn: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
     * Function which takes `state` object as argument, and should return
     * `state` object back.
     */
  var stateSanitizer: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  /** Action or list of actions which should stop remote monitoring. */
  var stopOn: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

