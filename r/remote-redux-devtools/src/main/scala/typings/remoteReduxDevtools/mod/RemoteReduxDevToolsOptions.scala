package typings.remoteReduxDevtools.mod

import typings.redux.mod.ActionCreator
import typings.redux.mod.ActionCreatorsMapObject
import typings.remoteReduxDevtools.remoteReduxDevtoolsNumbers.`0`
import typings.remoteReduxDevtools.remoteReduxDevtoolsNumbers.`1`
import typings.remoteReduxDevtools.remoteReduxDevtoolsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteReduxDevToolsOptions extends js.Object {
  /** Action creators functions to be available in the dispatcher. */
  var actionCreators: js.UndefOr[js.Array[ActionCreator[_]] | ActionCreatorsMapObject[_]] = js.native
  /**
    * Function which takes `action` object as argument, and should return
    * `action` object back.
    */
  var actionSanitizer: js.UndefOr[js.Function1[/* action */ js.Any, _]] = js.native
  /**
    * Actions types to be hidden in the monitors (while passed to the
    * reducers). If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
    */
  var actionsBlacklist: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Actions types to be shown in the monitors (while passed to the reducers).
    * If `actionsWhitelist` specified, `actionsBlacklist` is ignored.
    */
  var actionsWhitelist: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Used to specify host for `remotedev-server`. If `port` is specified,
    * default value is `localhost`.
    */
  var hostname: js.UndefOr[String] = js.native
  /**
    * Identifies the instance when sending the history triggered by `sendOn`.
    * You can use, for example, user id here, to know who sent the data.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Maximum allowed actions to be stored in the history tree. The oldest
    * actions are removed once `maxAge` is reached. It's critical for
    * performance.
    */
  var maxAge: js.UndefOr[Double] = js.native
  /** The instance name to be showed on the monitor page. */
  var name: js.UndefOr[String] = js.native
  /** Used to specify host's port for `remotedev-server`. */
  var port: js.UndefOr[Double] = js.native
  /**
    * Specifies whether to allow remote monitoring. By default is
    * `process.env.NODE_ENV === 'development'`.
    */
  var realtime: js.UndefOr[Boolean] = js.native
  /** Specifies whether to use `https` protocol for `remotedev-server`. */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * Action or list of actions which should trigger sending the history to
    * the monitor (without starting it).
    */
  var sendOn: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * `0` - disabled (default)
    * `1` - send all uncaught exception messages
    * `2` - send only reducers error messages.
    */
  var sendOnError: js.UndefOr[`0` | `1` | `2`] = js.native
  /**
    * URL of the monitor to send the history when sendOn is triggered. By
    * default is `${secure ? 'https' : 'http'}://${hostname}:${port}`.
    */
  var sendTo: js.UndefOr[String] = js.native
  /**
    * If specified as `true`, whenever there's an exception in reducers, the
    * monitors will show the error message, and next actions will not be
    * dispatched.
    */
  var shouldCatchErrors: js.UndefOr[Boolean] = js.native
  /**
    * If set to `false`, will not recompute the states on hot reloading (or on
    * replacing the reducers). Available only for Redux enhancer.
    */
  var shouldHotReload: js.UndefOr[Boolean] = js.native
  /**
    * If specified as `false`, it will not record the changes till clicking on
    * *Start recording* button. Available only for Redux enhancer, for others
    * use `autoPause`.
    */
  var shouldRecordChanges: js.UndefOr[Boolean] = js.native
  /**
    * If specified as `true`, it will not allow any non-monitor actions to be
    * dispatched till clicking on *Unlock changes* button. Available only for
    * Redux enhancer.
    */
  var shouldStartLocked: js.UndefOr[Boolean] = js.native
  /**
    * Action or list of actions which should start remote monitoring (when
    * `realtime` is `false`).
    */
  var startOn: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Function which takes `state` object as argument, and should return
    * `state` object back.
    */
  var stateSanitizer: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
  /** Action or list of actions which should stop remote monitoring. */
  var stopOn: js.UndefOr[String | js.Array[String]] = js.native
}

object RemoteReduxDevToolsOptions {
  @scala.inline
  def apply(): RemoteReduxDevToolsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteReduxDevToolsOptions]
  }
  @scala.inline
  implicit class RemoteReduxDevToolsOptionsOps[Self <: RemoteReduxDevToolsOptions] (val x: Self) extends AnyVal {
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
    def setActionCreators(value: js.Array[ActionCreator[_]] | ActionCreatorsMapObject[_]): Self = this.set("actionCreators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionCreators: Self = this.set("actionCreators", js.undefined)
    @scala.inline
    def setActionSanitizer(value: /* action */ js.Any => _): Self = this.set("actionSanitizer", js.Any.fromFunction1(value))
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
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setRealtime(value: Boolean): Self = this.set("realtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealtime: Self = this.set("realtime", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setSendOnVarargs(value: String*): Self = this.set("sendOn", js.Array(value :_*))
    @scala.inline
    def setSendOn(value: String | js.Array[String]): Self = this.set("sendOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendOn: Self = this.set("sendOn", js.undefined)
    @scala.inline
    def setSendOnError(value: `0` | `1` | `2`): Self = this.set("sendOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendOnError: Self = this.set("sendOnError", js.undefined)
    @scala.inline
    def setSendTo(value: String): Self = this.set("sendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendTo: Self = this.set("sendTo", js.undefined)
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
    def setStartOnVarargs(value: String*): Self = this.set("startOn", js.Array(value :_*))
    @scala.inline
    def setStartOn(value: String | js.Array[String]): Self = this.set("startOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartOn: Self = this.set("startOn", js.undefined)
    @scala.inline
    def setStateSanitizer(value: /* state */ js.Any => _): Self = this.set("stateSanitizer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStateSanitizer: Self = this.set("stateSanitizer", js.undefined)
    @scala.inline
    def setStopOnVarargs(value: String*): Self = this.set("stopOn", js.Array(value :_*))
    @scala.inline
    def setStopOn(value: String | js.Array[String]): Self = this.set("stopOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOn: Self = this.set("stopOn", js.undefined)
  }
  
}

