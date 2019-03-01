package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnection
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Method] Aborts any outstanding request
  		* @param request Object Defaults to the last request.
  		*/
  var abort: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Aborts all outstanding requests  */
  var abortAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var defaultHeaders: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var defaultXhrHeader: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var disableCachingParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of async
  		* @returns Boolean
  		*/
  var getAsync: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of autoAbort
  		* @returns Boolean
  		*/
  var getAutoAbort: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of defaultHeaders
  		* @returns Object
  		*/
  var getDefaultHeaders: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaultPostHeader
  		* @returns String
  		*/
  var getDefaultPostHeader: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of defaultXhrHeader
  		* @returns String
  		*/
  var getDefaultXhrHeader: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of disableCaching
  		* @returns Boolean
  		*/
  var getDisableCaching: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of disableCachingParam
  		* @returns String
  		*/
  var getDisableCachingParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of extraParams
  		* @returns Object
  		*/
  var getExtraParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of method
  		* @returns String
  		*/
  var getMethod: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of password
  		* @returns String
  		*/
  var getPassword: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of useDefaultHeader
  		* @returns Boolean
  		*/
  var getUseDefaultHeader: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of useDefaultXhrHeader
  		* @returns Boolean
  		*/
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of username
  		* @returns String
  		*/
  var getUsername: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Determines whether this object has a request outstanding
  		* @param request Object The request to check.
  		* @returns Boolean True if there is an outstanding request.
  		*/
  var isLoading: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Checks if the response status was successful
  		* @param status Number The status code.
  		* @param xhr XMLHttpRequest
  		* @returns Object An object containing success/status state.
  		*/
  var parseStatus: js.UndefOr[
    js.Function2[
      /* status */ js.UndefOr[scala.Double], 
      /* xhr */ js.UndefOr[stdLib.XMLHttpRequest], 
      _
    ]
  ] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IConnection: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Sends an HTTP request to a remote server
  		* @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform post-processing in a callback because it is passed to callback functions.)
  		* @returns Object/null The request object. This may be used to cancel the request.
  		*/
  var request: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of async
  		* @param async Boolean The new value.
  		*/
  var setAsync: js.UndefOr[js.Function1[/* async */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoAbort
  		* @param autoAbort Boolean The new value.
  		*/
  var setAutoAbort: js.UndefOr[js.Function1[/* autoAbort */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultHeaders
  		* @param defaultHeaders Object The new value.
  		*/
  var setDefaultHeaders: js.UndefOr[js.Function1[/* defaultHeaders */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultPostHeader
  		* @param defaultPostHeader String The new value.
  		*/
  var setDefaultPostHeader: js.UndefOr[js.Function1[/* defaultPostHeader */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultXhrHeader
  		* @param defaultXhrHeader String The new value.
  		*/
  var setDefaultXhrHeader: js.UndefOr[js.Function1[/* defaultXhrHeader */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of disableCaching
  		* @param disableCaching Boolean The new value.
  		*/
  var setDisableCaching: js.UndefOr[js.Function1[/* disableCaching */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of disableCachingParam
  		* @param disableCachingParam String The new value.
  		*/
  var setDisableCachingParam: js.UndefOr[js.Function1[/* disableCachingParam */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of extraParams
  		* @param extraParams Object The new value.
  		*/
  var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of method
  		* @param method String The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets various options such as the url params for the request
  		* @param options Object The initial options.
  		* @param scope Object The scope to execute in.
  		* @returns Object The params for the request.
  		*/
  var setOptions: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Sets the value of password
  		* @param password String The new value.
  		*/
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useDefaultHeader
  		* @param useDefaultHeader Boolean The new value.
  		*/
  var setUseDefaultHeader: js.UndefOr[js.Function1[/* useDefaultHeader */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useDefaultXhrHeader
  		* @param useDefaultXhrHeader Boolean The new value.
  		*/
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of username
  		* @param username String The new value.
  		*/
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Uploads a form using a hidden iframe
  		* @param form String/HTMLElement/Ext.Element The form to upload.
  		* @param url String The url to post to.
  		* @param params String Any extra parameters to pass.
  		* @param options Object The initial options.
  		*/
  var upload: js.UndefOr[
    js.Function4[
      /* form */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[java.lang.String], 
      /* params */ js.UndefOr[java.lang.String], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var useDefaultXhrHeader: js.UndefOr[scala.Boolean] = js.undefined
}

object IConnection {
  @scala.inline
  def apply(
    abort: js.Function1[/* request */ js.UndefOr[js.Any], scala.Unit] = null,
    abortAll: js.Function0[scala.Unit] = null,
    addAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    addManagedListener: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    defaultHeaders: js.Any = null,
    defaultXhrHeader: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    disableCaching: js.UndefOr[scala.Boolean] = js.undefined,
    disableCachingParam: java.lang.String = null,
    enableBubble: js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    extraParams: js.Any = null,
    fireAction: js.Function4[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    getAsync: js.Function0[scala.Boolean] = null,
    getAutoAbort: js.Function0[scala.Boolean] = null,
    getBubbleEvents: js.Function0[_] = null,
    getDefaultHeaders: js.Function0[_] = null,
    getDefaultPostHeader: js.Function0[java.lang.String] = null,
    getDefaultXhrHeader: js.Function0[java.lang.String] = null,
    getDisableCaching: js.Function0[scala.Boolean] = null,
    getDisableCachingParam: js.Function0[java.lang.String] = null,
    getExtraParams: js.Function0[_] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getListeners: js.Function0[_] = null,
    getMethod: js.Function0[java.lang.String] = null,
    getPassword: js.Function0[java.lang.String] = null,
    getTimeout: js.Function0[scala.Double] = null,
    getUrl: js.Function0[java.lang.String] = null,
    getUseDefaultHeader: js.Function0[scala.Boolean] = null,
    getUseDefaultXhrHeader: js.Function0[scala.Boolean] = null,
    getUsername: js.Function0[java.lang.String] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    isLoading: js.Function1[/* request */ js.UndefOr[js.Any], scala.Boolean] = null,
    listeners: js.Any = null,
    method: java.lang.String = null,
    mixins: js.Any = null,
    mon: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    mun: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    on: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    onAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    onBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    parseStatus: js.Function2[
      /* status */ js.UndefOr[scala.Double], 
      /* xhr */ js.UndefOr[stdLib.XMLHttpRequest], 
      _
    ] = null,
    platformConfig: js.Any = null,
    relayEvents: js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ] = null,
    removeAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    request: js.Function1[/* options */ js.UndefOr[js.Any], _] = null,
    resumeEvents: js.Function1[/* discardQueuedEvents */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAsync: js.Function1[/* async */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAutoAbort: js.Function1[/* autoAbort */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setDefaultHeaders: js.Function1[/* defaultHeaders */ js.UndefOr[js.Any], scala.Unit] = null,
    setDefaultPostHeader: js.Function1[/* defaultPostHeader */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDefaultXhrHeader: js.Function1[/* defaultXhrHeader */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDisableCaching: js.Function1[/* disableCaching */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDisableCachingParam: js.Function1[/* disableCachingParam */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setExtraParams: js.Function1[/* extraParams */ js.UndefOr[js.Any], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setMethod: js.Function1[/* method */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setOptions: js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _] = null,
    setPassword: js.Function1[/* password */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setTimeout: js.Function1[/* timeout */ js.UndefOr[scala.Double], scala.Unit] = null,
    setUrl: js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setUseDefaultHeader: js.Function1[/* useDefaultHeader */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setUseDefaultXhrHeader: js.Function1[/* useDefaultXhrHeader */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setUsername: js.Function1[/* username */ js.UndefOr[java.lang.String], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: js.Function0[scala.Unit] = null,
    timeout: scala.Int | scala.Double = null,
    un: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    unAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    upload: js.Function4[
      /* form */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[java.lang.String], 
      /* params */ js.UndefOr[java.lang.String], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    url: java.lang.String = null,
    useDefaultXhrHeader: js.UndefOr[scala.Boolean] = js.undefined,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IConnection = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(abort)
    if (abortAll != null) __obj.updateDynamic("abortAll")(abortAll)
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(addAfterListener)
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(addBeforeListener)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (defaultHeaders != null) __obj.updateDynamic("defaultHeaders")(defaultHeaders)
    if (defaultXhrHeader != null) __obj.updateDynamic("defaultXhrHeader")(defaultXhrHeader)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(disableCaching)) __obj.updateDynamic("disableCaching")(disableCaching)
    if (disableCachingParam != null) __obj.updateDynamic("disableCachingParam")(disableCachingParam)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (extraParams != null) __obj.updateDynamic("extraParams")(extraParams)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (getAsync != null) __obj.updateDynamic("getAsync")(getAsync)
    if (getAutoAbort != null) __obj.updateDynamic("getAutoAbort")(getAutoAbort)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getDefaultHeaders != null) __obj.updateDynamic("getDefaultHeaders")(getDefaultHeaders)
    if (getDefaultPostHeader != null) __obj.updateDynamic("getDefaultPostHeader")(getDefaultPostHeader)
    if (getDefaultXhrHeader != null) __obj.updateDynamic("getDefaultXhrHeader")(getDefaultXhrHeader)
    if (getDisableCaching != null) __obj.updateDynamic("getDisableCaching")(getDisableCaching)
    if (getDisableCachingParam != null) __obj.updateDynamic("getDisableCachingParam")(getDisableCachingParam)
    if (getExtraParams != null) __obj.updateDynamic("getExtraParams")(getExtraParams)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getMethod != null) __obj.updateDynamic("getMethod")(getMethod)
    if (getPassword != null) __obj.updateDynamic("getPassword")(getPassword)
    if (getTimeout != null) __obj.updateDynamic("getTimeout")(getTimeout)
    if (getUrl != null) __obj.updateDynamic("getUrl")(getUrl)
    if (getUseDefaultHeader != null) __obj.updateDynamic("getUseDefaultHeader")(getUseDefaultHeader)
    if (getUseDefaultXhrHeader != null) __obj.updateDynamic("getUseDefaultXhrHeader")(getUseDefaultXhrHeader)
    if (getUsername != null) __obj.updateDynamic("getUsername")(getUsername)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isLoading != null) __obj.updateDynamic("isLoading")(isLoading)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (parseStatus != null) __obj.updateDynamic("parseStatus")(parseStatus)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (request != null) __obj.updateDynamic("request")(request)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAsync != null) __obj.updateDynamic("setAsync")(setAsync)
    if (setAutoAbort != null) __obj.updateDynamic("setAutoAbort")(setAutoAbort)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setDefaultHeaders != null) __obj.updateDynamic("setDefaultHeaders")(setDefaultHeaders)
    if (setDefaultPostHeader != null) __obj.updateDynamic("setDefaultPostHeader")(setDefaultPostHeader)
    if (setDefaultXhrHeader != null) __obj.updateDynamic("setDefaultXhrHeader")(setDefaultXhrHeader)
    if (setDisableCaching != null) __obj.updateDynamic("setDisableCaching")(setDisableCaching)
    if (setDisableCachingParam != null) __obj.updateDynamic("setDisableCachingParam")(setDisableCachingParam)
    if (setExtraParams != null) __obj.updateDynamic("setExtraParams")(setExtraParams)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setMethod != null) __obj.updateDynamic("setMethod")(setMethod)
    if (setOptions != null) __obj.updateDynamic("setOptions")(setOptions)
    if (setPassword != null) __obj.updateDynamic("setPassword")(setPassword)
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(setTimeout)
    if (setUrl != null) __obj.updateDynamic("setUrl")(setUrl)
    if (setUseDefaultHeader != null) __obj.updateDynamic("setUseDefaultHeader")(setUseDefaultHeader)
    if (setUseDefaultXhrHeader != null) __obj.updateDynamic("setUseDefaultXhrHeader")(setUseDefaultXhrHeader)
    if (setUsername != null) __obj.updateDynamic("setUsername")(setUsername)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (upload != null) __obj.updateDynamic("upload")(upload)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(useDefaultXhrHeader)) __obj.updateDynamic("useDefaultXhrHeader")(useDefaultXhrHeader)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IConnection]
  }
}

