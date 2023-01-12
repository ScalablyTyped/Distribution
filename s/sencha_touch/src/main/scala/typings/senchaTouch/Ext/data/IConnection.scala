package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.mixin.IObservable
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConnection
  extends StObject
     with IObservable {
  
  /** [Method] Aborts any outstanding request
    * @param request Object Defaults to the last request.
    */
  var abort: js.UndefOr[js.Function1[/* request */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Aborts all outstanding requests  */
  var abortAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var defaultHeaders: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var defaultXhrHeader: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var disableCachingParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[Any] = js.undefined
  
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
  var getDefaultHeaders: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of defaultPostHeader
    * @returns String
    */
  var getDefaultPostHeader: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of defaultXhrHeader
    * @returns String
    */
  var getDefaultXhrHeader: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of disableCaching
    * @returns Boolean
    */
  var getDisableCaching: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of disableCachingParam
    * @returns String
    */
  var getDisableCachingParam: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of extraParams
    * @returns Object
    */
  var getExtraParams: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of method
    * @returns String
    */
  var getMethod: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of password
    * @returns String
    */
  var getPassword: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of url
    * @returns String
    */
  var getUrl: js.UndefOr[js.Function0[String]] = js.undefined
  
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
  var getUsername: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Determines whether this object has a request outstanding
    * @param request Object The request to check.
    * @returns Boolean True if there is an outstanding request.
    */
  var isLoading: js.UndefOr[js.Function1[/* request */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.undefined
  
  /** [Method] Checks if the response status was successful
    * @param status Number The status code.
    * @param xhr XMLHttpRequest
    * @returns Object An object containing success/status state.
    */
  var parseStatus: js.UndefOr[
    js.Function2[/* status */ js.UndefOr[Double], /* xhr */ js.UndefOr[XMLHttpRequest], Any]
  ] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IConnection: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
  ] = js.undefined
  
  /** [Method] Sends an HTTP request to a remote server
    * @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform post-processing in a callback because it is passed to callback functions.)
    * @returns Object/null The request object. This may be used to cancel the request.
    */
  var request: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Any]] = js.undefined
  
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
  var setDefaultHeaders: js.UndefOr[js.Function1[/* defaultHeaders */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaultPostHeader
    * @param defaultPostHeader String The new value.
    */
  var setDefaultPostHeader: js.UndefOr[js.Function1[/* defaultPostHeader */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaultXhrHeader
    * @param defaultXhrHeader String The new value.
    */
  var setDefaultXhrHeader: js.UndefOr[js.Function1[/* defaultXhrHeader */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of disableCaching
    * @param disableCaching Boolean The new value.
    */
  var setDisableCaching: js.UndefOr[js.Function1[/* disableCaching */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of disableCachingParam
    * @param disableCachingParam String The new value.
    */
  var setDisableCachingParam: js.UndefOr[js.Function1[/* disableCachingParam */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of extraParams
    * @param extraParams Object The new value.
    */
  var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of method
    * @param method String The new value.
    */
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets various options such as the url params for the request
    * @param options Object The initial options.
    * @param scope Object The scope to execute in.
    * @returns Object The params for the request.
    */
  var setOptions: js.UndefOr[js.Function2[/* options */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Sets the value of password
    * @param password String The new value.
    */
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.undefined
  
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
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[String], Unit]] = js.undefined
  
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
      /* form */ js.UndefOr[Any], 
      /* url */ js.UndefOr[String], 
      /* params */ js.UndefOr[String], 
      /* options */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useDefaultXhrHeader: js.UndefOr[Boolean] = js.undefined
}
object IConnection {
  
  inline def apply(): IConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IConnection] (val x: Self) extends AnyVal {
    
    inline def setAbort(value: /* request */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction1(value))
    
    inline def setAbortAll(value: () => Unit): Self = StObject.set(x, "abortAll", js.Any.fromFunction0(value))
    
    inline def setAbortAllUndefined: Self = StObject.set(x, "abortAll", js.undefined)
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setDefaultHeaders(value: Any): Self = StObject.set(x, "defaultHeaders", value.asInstanceOf[js.Any])
    
    inline def setDefaultHeadersUndefined: Self = StObject.set(x, "defaultHeaders", js.undefined)
    
    inline def setDefaultXhrHeader(value: String): Self = StObject.set(x, "defaultXhrHeader", value.asInstanceOf[js.Any])
    
    inline def setDefaultXhrHeaderUndefined: Self = StObject.set(x, "defaultXhrHeader", js.undefined)
    
    inline def setDisableCaching(value: Boolean): Self = StObject.set(x, "disableCaching", value.asInstanceOf[js.Any])
    
    inline def setDisableCachingParam(value: String): Self = StObject.set(x, "disableCachingParam", value.asInstanceOf[js.Any])
    
    inline def setDisableCachingParamUndefined: Self = StObject.set(x, "disableCachingParam", js.undefined)
    
    inline def setDisableCachingUndefined: Self = StObject.set(x, "disableCaching", js.undefined)
    
    inline def setExtraParams(value: Any): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
    
    inline def setExtraParamsUndefined: Self = StObject.set(x, "extraParams", js.undefined)
    
    inline def setGetAsync(value: () => Boolean): Self = StObject.set(x, "getAsync", js.Any.fromFunction0(value))
    
    inline def setGetAsyncUndefined: Self = StObject.set(x, "getAsync", js.undefined)
    
    inline def setGetAutoAbort(value: () => Boolean): Self = StObject.set(x, "getAutoAbort", js.Any.fromFunction0(value))
    
    inline def setGetAutoAbortUndefined: Self = StObject.set(x, "getAutoAbort", js.undefined)
    
    inline def setGetDefaultHeaders(value: () => Any): Self = StObject.set(x, "getDefaultHeaders", js.Any.fromFunction0(value))
    
    inline def setGetDefaultHeadersUndefined: Self = StObject.set(x, "getDefaultHeaders", js.undefined)
    
    inline def setGetDefaultPostHeader(value: () => String): Self = StObject.set(x, "getDefaultPostHeader", js.Any.fromFunction0(value))
    
    inline def setGetDefaultPostHeaderUndefined: Self = StObject.set(x, "getDefaultPostHeader", js.undefined)
    
    inline def setGetDefaultXhrHeader(value: () => String): Self = StObject.set(x, "getDefaultXhrHeader", js.Any.fromFunction0(value))
    
    inline def setGetDefaultXhrHeaderUndefined: Self = StObject.set(x, "getDefaultXhrHeader", js.undefined)
    
    inline def setGetDisableCaching(value: () => Boolean): Self = StObject.set(x, "getDisableCaching", js.Any.fromFunction0(value))
    
    inline def setGetDisableCachingParam(value: () => String): Self = StObject.set(x, "getDisableCachingParam", js.Any.fromFunction0(value))
    
    inline def setGetDisableCachingParamUndefined: Self = StObject.set(x, "getDisableCachingParam", js.undefined)
    
    inline def setGetDisableCachingUndefined: Self = StObject.set(x, "getDisableCaching", js.undefined)
    
    inline def setGetExtraParams(value: () => Any): Self = StObject.set(x, "getExtraParams", js.Any.fromFunction0(value))
    
    inline def setGetExtraParamsUndefined: Self = StObject.set(x, "getExtraParams", js.undefined)
    
    inline def setGetMethod(value: () => String): Self = StObject.set(x, "getMethod", js.Any.fromFunction0(value))
    
    inline def setGetMethodUndefined: Self = StObject.set(x, "getMethod", js.undefined)
    
    inline def setGetPassword(value: () => String): Self = StObject.set(x, "getPassword", js.Any.fromFunction0(value))
    
    inline def setGetPasswordUndefined: Self = StObject.set(x, "getPassword", js.undefined)
    
    inline def setGetTimeout(value: () => Double): Self = StObject.set(x, "getTimeout", js.Any.fromFunction0(value))
    
    inline def setGetTimeoutUndefined: Self = StObject.set(x, "getTimeout", js.undefined)
    
    inline def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    inline def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
    
    inline def setGetUseDefaultHeader(value: () => Boolean): Self = StObject.set(x, "getUseDefaultHeader", js.Any.fromFunction0(value))
    
    inline def setGetUseDefaultHeaderUndefined: Self = StObject.set(x, "getUseDefaultHeader", js.undefined)
    
    inline def setGetUseDefaultXhrHeader(value: () => Boolean): Self = StObject.set(x, "getUseDefaultXhrHeader", js.Any.fromFunction0(value))
    
    inline def setGetUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "getUseDefaultXhrHeader", js.undefined)
    
    inline def setGetUsername(value: () => String): Self = StObject.set(x, "getUsername", js.Any.fromFunction0(value))
    
    inline def setGetUsernameUndefined: Self = StObject.set(x, "getUsername", js.undefined)
    
    inline def setIsLoading(value: /* request */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "isLoading", js.Any.fromFunction1(value))
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setParseStatus(value: (/* status */ js.UndefOr[Double], /* xhr */ js.UndefOr[XMLHttpRequest]) => Any): Self = StObject.set(x, "parseStatus", js.Any.fromFunction2(value))
    
    inline def setParseStatusUndefined: Self = StObject.set(x, "parseStatus", js.undefined)
    
    inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setRequest(value: /* options */ js.UndefOr[Any] => Any): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setSetAsync(value: /* async */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAsync", js.Any.fromFunction1(value))
    
    inline def setSetAsyncUndefined: Self = StObject.set(x, "setAsync", js.undefined)
    
    inline def setSetAutoAbort(value: /* autoAbort */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoAbort", js.Any.fromFunction1(value))
    
    inline def setSetAutoAbortUndefined: Self = StObject.set(x, "setAutoAbort", js.undefined)
    
    inline def setSetDefaultHeaders(value: /* defaultHeaders */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setDefaultHeaders", js.Any.fromFunction1(value))
    
    inline def setSetDefaultHeadersUndefined: Self = StObject.set(x, "setDefaultHeaders", js.undefined)
    
    inline def setSetDefaultPostHeader(value: /* defaultPostHeader */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDefaultPostHeader", js.Any.fromFunction1(value))
    
    inline def setSetDefaultPostHeaderUndefined: Self = StObject.set(x, "setDefaultPostHeader", js.undefined)
    
    inline def setSetDefaultXhrHeader(value: /* defaultXhrHeader */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDefaultXhrHeader", js.Any.fromFunction1(value))
    
    inline def setSetDefaultXhrHeaderUndefined: Self = StObject.set(x, "setDefaultXhrHeader", js.undefined)
    
    inline def setSetDisableCaching(value: /* disableCaching */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisableCaching", js.Any.fromFunction1(value))
    
    inline def setSetDisableCachingParam(value: /* disableCachingParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDisableCachingParam", js.Any.fromFunction1(value))
    
    inline def setSetDisableCachingParamUndefined: Self = StObject.set(x, "setDisableCachingParam", js.undefined)
    
    inline def setSetDisableCachingUndefined: Self = StObject.set(x, "setDisableCaching", js.undefined)
    
    inline def setSetExtraParams(value: /* extraParams */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setExtraParams", js.Any.fromFunction1(value))
    
    inline def setSetExtraParamsUndefined: Self = StObject.set(x, "setExtraParams", js.undefined)
    
    inline def setSetMethod(value: /* method */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setMethod", js.Any.fromFunction1(value))
    
    inline def setSetMethodUndefined: Self = StObject.set(x, "setMethod", js.undefined)
    
    inline def setSetOptions(value: (/* options */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "setOptions", js.Any.fromFunction2(value))
    
    inline def setSetOptionsUndefined: Self = StObject.set(x, "setOptions", js.undefined)
    
    inline def setSetPassword(value: /* password */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPassword", js.Any.fromFunction1(value))
    
    inline def setSetPasswordUndefined: Self = StObject.set(x, "setPassword", js.undefined)
    
    inline def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
    
    inline def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
    
    inline def setSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
    
    inline def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
    
    inline def setSetUseDefaultHeader(value: /* useDefaultHeader */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseDefaultHeader", js.Any.fromFunction1(value))
    
    inline def setSetUseDefaultHeaderUndefined: Self = StObject.set(x, "setUseDefaultHeader", js.undefined)
    
    inline def setSetUseDefaultXhrHeader(value: /* useDefaultXhrHeader */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseDefaultXhrHeader", js.Any.fromFunction1(value))
    
    inline def setSetUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "setUseDefaultXhrHeader", js.undefined)
    
    inline def setSetUsername(value: /* username */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setUsername", js.Any.fromFunction1(value))
    
    inline def setSetUsernameUndefined: Self = StObject.set(x, "setUsername", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUpload(
      value: (/* form */ js.UndefOr[Any], /* url */ js.UndefOr[String], /* params */ js.UndefOr[String], /* options */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "upload", js.Any.fromFunction4(value))
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseDefaultXhrHeader(value: Boolean): Self = StObject.set(x, "useDefaultXhrHeader", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "useDefaultXhrHeader", js.undefined)
  }
}
