package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.mixin.IObservable
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConnection extends IObservable {
  
  /** [Method] Aborts any outstanding request
    * @param request Object Defaults to the last request.
    */
  var abort: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Aborts all outstanding requests  */
  var abortAll: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Object) */
  var defaultHeaders: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var defaultXhrHeader: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var disableCachingParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of async
    * @returns Boolean
    */
  var getAsync: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of autoAbort
    * @returns Boolean
    */
  var getAutoAbort: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of defaultHeaders
    * @returns Object
    */
  var getDefaultHeaders: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of defaultPostHeader
    * @returns String
    */
  var getDefaultPostHeader: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of defaultXhrHeader
    * @returns String
    */
  var getDefaultXhrHeader: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of disableCaching
    * @returns Boolean
    */
  var getDisableCaching: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of disableCachingParam
    * @returns String
    */
  var getDisableCachingParam: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of extraParams
    * @returns Object
    */
  var getExtraParams: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of method
    * @returns String
    */
  var getMethod: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of password
    * @returns String
    */
  var getPassword: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of url
    * @returns String
    */
  var getUrl: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of useDefaultHeader
    * @returns Boolean
    */
  var getUseDefaultHeader: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of useDefaultXhrHeader
    * @returns Boolean
    */
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of username
    * @returns String
    */
  var getUsername: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Determines whether this object has a request outstanding
    * @param request Object The request to check.
    * @returns Boolean True if there is an outstanding request.
    */
  var isLoading: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.native
  
  /** [Method] Checks if the response status was successful
    * @param status Number The status code.
    * @param xhr XMLHttpRequest
    * @returns Object An object containing success/status state.
    */
  var parseStatus: js.UndefOr[
    js.Function2[/* status */ js.UndefOr[Double], /* xhr */ js.UndefOr[XMLHttpRequest], _]
  ] = js.native
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IConnection: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  
  /** [Method] Sends an HTTP request to a remote server
    * @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform post-processing in a callback because it is passed to callback functions.)
    * @returns Object/null The request object. This may be used to cancel the request.
    */
  var request: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Sets the value of async
    * @param async Boolean The new value.
    */
  var setAsync: js.UndefOr[js.Function1[/* async */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of autoAbort
    * @param autoAbort Boolean The new value.
    */
  var setAutoAbort: js.UndefOr[js.Function1[/* autoAbort */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of defaultHeaders
    * @param defaultHeaders Object The new value.
    */
  var setDefaultHeaders: js.UndefOr[js.Function1[/* defaultHeaders */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of defaultPostHeader
    * @param defaultPostHeader String The new value.
    */
  var setDefaultPostHeader: js.UndefOr[js.Function1[/* defaultPostHeader */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of defaultXhrHeader
    * @param defaultXhrHeader String The new value.
    */
  var setDefaultXhrHeader: js.UndefOr[js.Function1[/* defaultXhrHeader */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of disableCaching
    * @param disableCaching Boolean The new value.
    */
  var setDisableCaching: js.UndefOr[js.Function1[/* disableCaching */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of disableCachingParam
    * @param disableCachingParam String The new value.
    */
  var setDisableCachingParam: js.UndefOr[js.Function1[/* disableCachingParam */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of extraParams
    * @param extraParams Object The new value.
    */
  var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of method
    * @param method String The new value.
    */
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets various options such as the url params for the request
    * @param options Object The initial options.
    * @param scope Object The scope to execute in.
    * @returns Object The params for the request.
    */
  var setOptions: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]
  ] = js.native
  
  /** [Method] Sets the value of password
    * @param password String The new value.
    */
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of useDefaultHeader
    * @param useDefaultHeader Boolean The new value.
    */
  var setUseDefaultHeader: js.UndefOr[js.Function1[/* useDefaultHeader */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of useDefaultXhrHeader
    * @param useDefaultXhrHeader Boolean The new value.
    */
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of username
    * @param username String The new value.
    */
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  
  /** [Method] Uploads a form using a hidden iframe
    * @param form String/HTMLElement/Ext.Element The form to upload.
    * @param url String The url to post to.
    * @param params String Any extra parameters to pass.
    * @param options Object The initial options.
    */
  var upload: js.UndefOr[
    js.Function4[
      /* form */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[String], 
      /* params */ js.UndefOr[String], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var useDefaultXhrHeader: js.UndefOr[Boolean] = js.native
}
object IConnection {
  
  @scala.inline
  def apply(): IConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnection]
  }
  
  @scala.inline
  implicit class IConnectionOps[Self <: IConnection] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: /* request */ js.UndefOr[js.Any] => Unit): Self = this.set("abort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    
    @scala.inline
    def setAbortAll(value: () => Unit): Self = this.set("abortAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAbortAll: Self = this.set("abortAll", js.undefined)
    
    @scala.inline
    def setDefaultHeaders(value: js.Any): Self = this.set("defaultHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHeaders: Self = this.set("defaultHeaders", js.undefined)
    
    @scala.inline
    def setDefaultXhrHeader(value: String): Self = this.set("defaultXhrHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultXhrHeader: Self = this.set("defaultXhrHeader", js.undefined)
    
    @scala.inline
    def setDisableCaching(value: Boolean): Self = this.set("disableCaching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCaching: Self = this.set("disableCaching", js.undefined)
    
    @scala.inline
    def setDisableCachingParam(value: String): Self = this.set("disableCachingParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCachingParam: Self = this.set("disableCachingParam", js.undefined)
    
    @scala.inline
    def setExtraParams(value: js.Any): Self = this.set("extraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraParams: Self = this.set("extraParams", js.undefined)
    
    @scala.inline
    def setGetAsync(value: () => Boolean): Self = this.set("getAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAsync: Self = this.set("getAsync", js.undefined)
    
    @scala.inline
    def setGetAutoAbort(value: () => Boolean): Self = this.set("getAutoAbort", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoAbort: Self = this.set("getAutoAbort", js.undefined)
    
    @scala.inline
    def setGetDefaultHeaders(value: () => _): Self = this.set("getDefaultHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaultHeaders: Self = this.set("getDefaultHeaders", js.undefined)
    
    @scala.inline
    def setGetDefaultPostHeader(value: () => String): Self = this.set("getDefaultPostHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaultPostHeader: Self = this.set("getDefaultPostHeader", js.undefined)
    
    @scala.inline
    def setGetDefaultXhrHeader(value: () => String): Self = this.set("getDefaultXhrHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaultXhrHeader: Self = this.set("getDefaultXhrHeader", js.undefined)
    
    @scala.inline
    def setGetDisableCaching(value: () => Boolean): Self = this.set("getDisableCaching", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisableCaching: Self = this.set("getDisableCaching", js.undefined)
    
    @scala.inline
    def setGetDisableCachingParam(value: () => String): Self = this.set("getDisableCachingParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisableCachingParam: Self = this.set("getDisableCachingParam", js.undefined)
    
    @scala.inline
    def setGetExtraParams(value: () => _): Self = this.set("getExtraParams", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetExtraParams: Self = this.set("getExtraParams", js.undefined)
    
    @scala.inline
    def setGetMethod(value: () => String): Self = this.set("getMethod", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMethod: Self = this.set("getMethod", js.undefined)
    
    @scala.inline
    def setGetPassword(value: () => String): Self = this.set("getPassword", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPassword: Self = this.set("getPassword", js.undefined)
    
    @scala.inline
    def setGetTimeout(value: () => Double): Self = this.set("getTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTimeout: Self = this.set("getTimeout", js.undefined)
    
    @scala.inline
    def setGetUrl(value: () => String): Self = this.set("getUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUrl: Self = this.set("getUrl", js.undefined)
    
    @scala.inline
    def setGetUseDefaultHeader(value: () => Boolean): Self = this.set("getUseDefaultHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUseDefaultHeader: Self = this.set("getUseDefaultHeader", js.undefined)
    
    @scala.inline
    def setGetUseDefaultXhrHeader(value: () => Boolean): Self = this.set("getUseDefaultXhrHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUseDefaultXhrHeader: Self = this.set("getUseDefaultXhrHeader", js.undefined)
    
    @scala.inline
    def setGetUsername(value: () => String): Self = this.set("getUsername", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUsername: Self = this.set("getUsername", js.undefined)
    
    @scala.inline
    def setIsLoading(value: /* request */ js.UndefOr[js.Any] => Boolean): Self = this.set("isLoading", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsLoading: Self = this.set("isLoading", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setParseStatus(value: (/* status */ js.UndefOr[Double], /* xhr */ js.UndefOr[XMLHttpRequest]) => _): Self = this.set("parseStatus", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteParseStatus: Self = this.set("parseStatus", js.undefined)
    
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    
    @scala.inline
    def setRequest(value: /* options */ js.UndefOr[js.Any] => _): Self = this.set("request", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setSetAsync(value: /* async */ js.UndefOr[Boolean] => Unit): Self = this.set("setAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAsync: Self = this.set("setAsync", js.undefined)
    
    @scala.inline
    def setSetAutoAbort(value: /* autoAbort */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoAbort: Self = this.set("setAutoAbort", js.undefined)
    
    @scala.inline
    def setSetDefaultHeaders(value: /* defaultHeaders */ js.UndefOr[js.Any] => Unit): Self = this.set("setDefaultHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDefaultHeaders: Self = this.set("setDefaultHeaders", js.undefined)
    
    @scala.inline
    def setSetDefaultPostHeader(value: /* defaultPostHeader */ js.UndefOr[String] => Unit): Self = this.set("setDefaultPostHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDefaultPostHeader: Self = this.set("setDefaultPostHeader", js.undefined)
    
    @scala.inline
    def setSetDefaultXhrHeader(value: /* defaultXhrHeader */ js.UndefOr[String] => Unit): Self = this.set("setDefaultXhrHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDefaultXhrHeader: Self = this.set("setDefaultXhrHeader", js.undefined)
    
    @scala.inline
    def setSetDisableCaching(value: /* disableCaching */ js.UndefOr[Boolean] => Unit): Self = this.set("setDisableCaching", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisableCaching: Self = this.set("setDisableCaching", js.undefined)
    
    @scala.inline
    def setSetDisableCachingParam(value: /* disableCachingParam */ js.UndefOr[String] => Unit): Self = this.set("setDisableCachingParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisableCachingParam: Self = this.set("setDisableCachingParam", js.undefined)
    
    @scala.inline
    def setSetExtraParams(value: /* extraParams */ js.UndefOr[js.Any] => Unit): Self = this.set("setExtraParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetExtraParams: Self = this.set("setExtraParams", js.undefined)
    
    @scala.inline
    def setSetMethod(value: /* method */ js.UndefOr[String] => Unit): Self = this.set("setMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMethod: Self = this.set("setMethod", js.undefined)
    
    @scala.inline
    def setSetOptions(value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _): Self = this.set("setOptions", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetOptions: Self = this.set("setOptions", js.undefined)
    
    @scala.inline
    def setSetPassword(value: /* password */ js.UndefOr[String] => Unit): Self = this.set("setPassword", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPassword: Self = this.set("setPassword", js.undefined)
    
    @scala.inline
    def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = this.set("setTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTimeout: Self = this.set("setTimeout", js.undefined)
    
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = this.set("setUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUrl: Self = this.set("setUrl", js.undefined)
    
    @scala.inline
    def setSetUseDefaultHeader(value: /* useDefaultHeader */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseDefaultHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUseDefaultHeader: Self = this.set("setUseDefaultHeader", js.undefined)
    
    @scala.inline
    def setSetUseDefaultXhrHeader(value: /* useDefaultXhrHeader */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseDefaultXhrHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUseDefaultXhrHeader: Self = this.set("setUseDefaultXhrHeader", js.undefined)
    
    @scala.inline
    def setSetUsername(value: /* username */ js.UndefOr[String] => Unit): Self = this.set("setUsername", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUsername: Self = this.set("setUsername", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUpload(
      value: (/* form */ js.UndefOr[js.Any], /* url */ js.UndefOr[String], /* params */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("upload", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUseDefaultXhrHeader(value: Boolean): Self = this.set("useDefaultXhrHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDefaultXhrHeader: Self = this.set("useDefaultXhrHeader", js.undefined)
  }
}
