package typings.senchaUnderscoreTouch.ExtNs.dataNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IClass
import typings.senchaUnderscoreTouch.ExtNs.mixinNs.IObservable
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnection extends IObservable {
  /** [Method] Aborts any outstanding request
  		* @param request Object Defaults to the last request.
  		*/
  var abort: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Aborts all outstanding requests  */
  var abortAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Object) */
  var defaultHeaders: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var defaultXhrHeader: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var disableCachingParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of async
  		* @returns Boolean
  		*/
  var getAsync: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of autoAbort
  		* @returns Boolean
  		*/
  var getAutoAbort: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
  var getDisableCaching: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of useDefaultHeader
  		* @returns Boolean
  		*/
  var getUseDefaultHeader: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of useDefaultXhrHeader
  		* @returns Boolean
  		*/
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of username
  		* @returns String
  		*/
  var getUsername: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Determines whether this object has a request outstanding
  		* @param request Object The request to check.
  		* @returns Boolean True if there is an outstanding request.
  		*/
  var isLoading: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Config Option] (String) */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Checks if the response status was successful
  		* @param status Number The status code.
  		* @param xhr XMLHttpRequest
  		* @returns Object An object containing success/status state.
  		*/
  var parseStatus: js.UndefOr[
    js.Function2[/* status */ js.UndefOr[Double], /* xhr */ js.UndefOr[XMLHttpRequest], _]
  ] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IConnection: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.undefined
  /** [Method] Sends an HTTP request to a remote server
  		* @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform post-processing in a callback because it is passed to callback functions.)
  		* @returns Object/null The request object. This may be used to cancel the request.
  		*/
  var request: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of async
  		* @param async Boolean The new value.
  		*/
  var setAsync: js.UndefOr[js.Function1[/* async */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of autoAbort
  		* @param autoAbort Boolean The new value.
  		*/
  var setAutoAbort: js.UndefOr[js.Function1[/* autoAbort */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of defaultHeaders
  		* @param defaultHeaders Object The new value.
  		*/
  var setDefaultHeaders: js.UndefOr[js.Function1[/* defaultHeaders */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of defaultPostHeader
  		* @param defaultPostHeader String The new value.
  		*/
  var setDefaultPostHeader: js.UndefOr[js.Function1[/* defaultPostHeader */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of defaultXhrHeader
  		* @param defaultXhrHeader String The new value.
  		*/
  var setDefaultXhrHeader: js.UndefOr[js.Function1[/* defaultXhrHeader */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of disableCaching
  		* @param disableCaching Boolean The new value.
  		*/
  var setDisableCaching: js.UndefOr[js.Function1[/* disableCaching */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of disableCachingParam
  		* @param disableCachingParam String The new value.
  		*/
  var setDisableCachingParam: js.UndefOr[js.Function1[/* disableCachingParam */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of extraParams
  		* @param extraParams Object The new value.
  		*/
  var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of method
  		* @param method String The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[java.lang.String], Unit]] = js.undefined
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
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of useDefaultHeader
  		* @param useDefaultHeader Boolean The new value.
  		*/
  var setUseDefaultHeader: js.UndefOr[js.Function1[/* useDefaultHeader */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of useDefaultXhrHeader
  		* @param useDefaultXhrHeader Boolean The new value.
  		*/
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of username
  		* @param username String The new value.
  		*/
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
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
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var useDefaultXhrHeader: js.UndefOr[Boolean] = js.undefined
}

object IConnection {
  @scala.inline
  def apply(
    abort: /* request */ js.UndefOr[js.Any] => Unit = null,
    abortAll: () => Unit = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    defaultHeaders: js.Any = null,
    defaultXhrHeader: java.lang.String = null,
    destroy: () => Unit = null,
    disableCaching: js.UndefOr[Boolean] = js.undefined,
    disableCachingParam: java.lang.String = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    extraParams: js.Any = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    getAsync: () => Boolean = null,
    getAutoAbort: () => Boolean = null,
    getBubbleEvents: () => _ = null,
    getDefaultHeaders: () => _ = null,
    getDefaultPostHeader: () => java.lang.String = null,
    getDefaultXhrHeader: () => java.lang.String = null,
    getDisableCaching: () => Boolean = null,
    getDisableCachingParam: () => java.lang.String = null,
    getExtraParams: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getListeners: () => _ = null,
    getMethod: () => java.lang.String = null,
    getPassword: () => java.lang.String = null,
    getTimeout: () => Double = null,
    getUrl: () => java.lang.String = null,
    getUseDefaultHeader: () => Boolean = null,
    getUseDefaultXhrHeader: () => Boolean = null,
    getUsername: () => java.lang.String = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    isLoading: /* request */ js.UndefOr[js.Any] => Boolean = null,
    listeners: js.Any = null,
    method: java.lang.String = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    parseStatus: (/* status */ js.UndefOr[Double], /* xhr */ js.UndefOr[XMLHttpRequest]) => _ = null,
    platformConfig: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    request: /* options */ js.UndefOr[js.Any] => _ = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    setAsync: /* async */ js.UndefOr[Boolean] => Unit = null,
    setAutoAbort: /* autoAbort */ js.UndefOr[Boolean] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setDefaultHeaders: /* defaultHeaders */ js.UndefOr[js.Any] => Unit = null,
    setDefaultPostHeader: /* defaultPostHeader */ js.UndefOr[java.lang.String] => Unit = null,
    setDefaultXhrHeader: /* defaultXhrHeader */ js.UndefOr[java.lang.String] => Unit = null,
    setDisableCaching: /* disableCaching */ js.UndefOr[Boolean] => Unit = null,
    setDisableCachingParam: /* disableCachingParam */ js.UndefOr[java.lang.String] => Unit = null,
    setExtraParams: /* extraParams */ js.UndefOr[js.Any] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setMethod: /* method */ js.UndefOr[java.lang.String] => Unit = null,
    setOptions: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    setPassword: /* password */ js.UndefOr[java.lang.String] => Unit = null,
    setTimeout: /* timeout */ js.UndefOr[Double] => Unit = null,
    setUrl: /* url */ js.UndefOr[java.lang.String] => Unit = null,
    setUseDefaultHeader: /* useDefaultHeader */ js.UndefOr[Boolean] => Unit = null,
    setUseDefaultXhrHeader: /* useDefaultXhrHeader */ js.UndefOr[Boolean] => Unit = null,
    setUsername: /* username */ js.UndefOr[java.lang.String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: () => Unit = null,
    timeout: Int | Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    upload: (/* form */ js.UndefOr[js.Any], /* url */ js.UndefOr[java.lang.String], /* params */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[js.Any]) => Unit = null,
    url: java.lang.String = null,
    useDefaultXhrHeader: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null
  ): IConnection = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction1(abort))
    if (abortAll != null) __obj.updateDynamic("abortAll")(js.Any.fromFunction0(abortAll))
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (defaultHeaders != null) __obj.updateDynamic("defaultHeaders")(defaultHeaders)
    if (defaultXhrHeader != null) __obj.updateDynamic("defaultXhrHeader")(defaultXhrHeader)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(disableCaching)) __obj.updateDynamic("disableCaching")(disableCaching)
    if (disableCachingParam != null) __obj.updateDynamic("disableCachingParam")(disableCachingParam)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (extraParams != null) __obj.updateDynamic("extraParams")(extraParams)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getAsync != null) __obj.updateDynamic("getAsync")(js.Any.fromFunction0(getAsync))
    if (getAutoAbort != null) __obj.updateDynamic("getAutoAbort")(js.Any.fromFunction0(getAutoAbort))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getDefaultHeaders != null) __obj.updateDynamic("getDefaultHeaders")(js.Any.fromFunction0(getDefaultHeaders))
    if (getDefaultPostHeader != null) __obj.updateDynamic("getDefaultPostHeader")(js.Any.fromFunction0(getDefaultPostHeader))
    if (getDefaultXhrHeader != null) __obj.updateDynamic("getDefaultXhrHeader")(js.Any.fromFunction0(getDefaultXhrHeader))
    if (getDisableCaching != null) __obj.updateDynamic("getDisableCaching")(js.Any.fromFunction0(getDisableCaching))
    if (getDisableCachingParam != null) __obj.updateDynamic("getDisableCachingParam")(js.Any.fromFunction0(getDisableCachingParam))
    if (getExtraParams != null) __obj.updateDynamic("getExtraParams")(js.Any.fromFunction0(getExtraParams))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMethod != null) __obj.updateDynamic("getMethod")(js.Any.fromFunction0(getMethod))
    if (getPassword != null) __obj.updateDynamic("getPassword")(js.Any.fromFunction0(getPassword))
    if (getTimeout != null) __obj.updateDynamic("getTimeout")(js.Any.fromFunction0(getTimeout))
    if (getUrl != null) __obj.updateDynamic("getUrl")(js.Any.fromFunction0(getUrl))
    if (getUseDefaultHeader != null) __obj.updateDynamic("getUseDefaultHeader")(js.Any.fromFunction0(getUseDefaultHeader))
    if (getUseDefaultXhrHeader != null) __obj.updateDynamic("getUseDefaultXhrHeader")(js.Any.fromFunction0(getUseDefaultXhrHeader))
    if (getUsername != null) __obj.updateDynamic("getUsername")(js.Any.fromFunction0(getUsername))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isLoading != null) __obj.updateDynamic("isLoading")(js.Any.fromFunction1(isLoading))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (parseStatus != null) __obj.updateDynamic("parseStatus")(js.Any.fromFunction2(parseStatus))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction1(request))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAsync != null) __obj.updateDynamic("setAsync")(js.Any.fromFunction1(setAsync))
    if (setAutoAbort != null) __obj.updateDynamic("setAutoAbort")(js.Any.fromFunction1(setAutoAbort))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setDefaultHeaders != null) __obj.updateDynamic("setDefaultHeaders")(js.Any.fromFunction1(setDefaultHeaders))
    if (setDefaultPostHeader != null) __obj.updateDynamic("setDefaultPostHeader")(js.Any.fromFunction1(setDefaultPostHeader))
    if (setDefaultXhrHeader != null) __obj.updateDynamic("setDefaultXhrHeader")(js.Any.fromFunction1(setDefaultXhrHeader))
    if (setDisableCaching != null) __obj.updateDynamic("setDisableCaching")(js.Any.fromFunction1(setDisableCaching))
    if (setDisableCachingParam != null) __obj.updateDynamic("setDisableCachingParam")(js.Any.fromFunction1(setDisableCachingParam))
    if (setExtraParams != null) __obj.updateDynamic("setExtraParams")(js.Any.fromFunction1(setExtraParams))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMethod != null) __obj.updateDynamic("setMethod")(js.Any.fromFunction1(setMethod))
    if (setOptions != null) __obj.updateDynamic("setOptions")(js.Any.fromFunction2(setOptions))
    if (setPassword != null) __obj.updateDynamic("setPassword")(js.Any.fromFunction1(setPassword))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1(setTimeout))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1(setUrl))
    if (setUseDefaultHeader != null) __obj.updateDynamic("setUseDefaultHeader")(js.Any.fromFunction1(setUseDefaultHeader))
    if (setUseDefaultXhrHeader != null) __obj.updateDynamic("setUseDefaultXhrHeader")(js.Any.fromFunction1(setUseDefaultXhrHeader))
    if (setUsername != null) __obj.updateDynamic("setUsername")(js.Any.fromFunction1(setUsername))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (upload != null) __obj.updateDynamic("upload")(js.Any.fromFunction4(upload))
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(useDefaultXhrHeader)) __obj.updateDynamic("useDefaultXhrHeader")(useDefaultXhrHeader)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IConnection]
  }
}

