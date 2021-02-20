package typings.remoteReduxDevtools

import typings.redux.mod.ActionCreator
import typings.redux.mod.ActionCreatorsMapObject
import typings.redux.mod.StoreEnhancer
import typings.remoteReduxDevtools.remoteReduxDevtoolsNumbers.`0`
import typings.remoteReduxDevtools.remoteReduxDevtoolsNumbers.`1`
import typings.remoteReduxDevtools.remoteReduxDevtoolsNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remote-redux-devtools", JSImport.Default)
  @js.native
  def default(): StoreEnhancer[js.Object, js.Object] = js.native
  @JSImport("remote-redux-devtools", JSImport.Default)
  @js.native
  def default(options: RemoteReduxDevToolsOptions): StoreEnhancer[js.Object, js.Object] = js.native
  
  @JSImport("remote-redux-devtools", "composeWithDevTools")
  @js.native
  def composeWithDevTools(): js.Function1[
    /* repeated */ StoreEnhancer[js.Object, js.Object], 
    StoreEnhancer[js.Object, js.Object]
  ] = js.native
  @JSImport("remote-redux-devtools", "composeWithDevTools")
  @js.native
  def composeWithDevTools(funcs: (StoreEnhancer[js.Object, js.Object])*): StoreEnhancer[js.Object, js.Object] = js.native
  @JSImport("remote-redux-devtools", "composeWithDevTools")
  @js.native
  def composeWithDevTools(options: RemoteReduxDevToolsOptions): js.Function1[
    /* repeated */ StoreEnhancer[js.Object, js.Object], 
    StoreEnhancer[js.Object, js.Object]
  ] = js.native
  
  @js.native
  trait RemoteReduxDevToolsOptions extends StObject {
    
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
    implicit class RemoteReduxDevToolsOptionsMutableBuilder[Self <: RemoteReduxDevToolsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionCreators(value: js.Array[ActionCreator[_]] | ActionCreatorsMapObject[_]): Self = StObject.set(x, "actionCreators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionCreatorsUndefined: Self = StObject.set(x, "actionCreators", js.undefined)
      
      @scala.inline
      def setActionCreatorsVarargs(value: ActionCreator[js.Any]*): Self = StObject.set(x, "actionCreators", js.Array(value :_*))
      
      @scala.inline
      def setActionSanitizer(value: /* action */ js.Any => _): Self = StObject.set(x, "actionSanitizer", js.Any.fromFunction1(value))
      
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
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRealtime(value: Boolean): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealtimeUndefined: Self = StObject.set(x, "realtime", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSendOn(value: String | js.Array[String]): Self = StObject.set(x, "sendOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendOnError(value: `0` | `1` | `2`): Self = StObject.set(x, "sendOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendOnErrorUndefined: Self = StObject.set(x, "sendOnError", js.undefined)
      
      @scala.inline
      def setSendOnUndefined: Self = StObject.set(x, "sendOn", js.undefined)
      
      @scala.inline
      def setSendOnVarargs(value: String*): Self = StObject.set(x, "sendOn", js.Array(value :_*))
      
      @scala.inline
      def setSendTo(value: String): Self = StObject.set(x, "sendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendToUndefined: Self = StObject.set(x, "sendTo", js.undefined)
      
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
      def setStartOn(value: String | js.Array[String]): Self = StObject.set(x, "startOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartOnUndefined: Self = StObject.set(x, "startOn", js.undefined)
      
      @scala.inline
      def setStartOnVarargs(value: String*): Self = StObject.set(x, "startOn", js.Array(value :_*))
      
      @scala.inline
      def setStateSanitizer(value: /* state */ js.Any => _): Self = StObject.set(x, "stateSanitizer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStateSanitizerUndefined: Self = StObject.set(x, "stateSanitizer", js.undefined)
      
      @scala.inline
      def setStopOn(value: String | js.Array[String]): Self = StObject.set(x, "stopOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOnUndefined: Self = StObject.set(x, "stopOn", js.undefined)
      
      @scala.inline
      def setStopOnVarargs(value: String*): Self = StObject.set(x, "stopOn", js.Array(value :_*))
    }
  }
}
