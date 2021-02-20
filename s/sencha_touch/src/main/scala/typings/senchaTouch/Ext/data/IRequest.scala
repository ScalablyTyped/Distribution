package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRequest extends IBase {
  
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var callbackKey: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the value of action
    * @returns String
    */
  var getAction: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of args
    * @returns Object
    */
  var getArgs: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of callback
    * @returns Object
    */
  var getCallback: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of callbackKey
    * @returns String
    */
  var getCallbackKey: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of directFn
    * @returns Object
    */
  var getDirectFn: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of disableCaching
    * @returns Boolean
    */
  var getDisableCaching: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of headers
    * @returns Object
    */
  var getHeaders: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of jsonData
    * @returns Object
    */
  var getJsonData: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of method
    * @returns String
    */
  var getMethod: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of operation
    * @returns Ext.data.Operation
    */
  var getOperation: js.UndefOr[js.Function0[IOperation]] = js.native
  
  /** [Method] Returns the value of params
    * @returns Object
    */
  var getParams: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of password
    * @returns String
    */
  var getPassword: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of proxy
    * @returns Ext.data.proxy.Proxy
    */
  var getProxy: js.UndefOr[js.Function0[typings.senchaTouch.Ext.data.proxy.IProxy]] = js.native
  
  /** [Method] Returns the value of records
    * @returns Object
    */
  var getRecords: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of url
    * @returns String
    */
  var getUrl: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of useDefaultXhrHeader
    * @returns Object
    */
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of username
    * @returns String
    */
  var getUsername: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of withCredentials
    * @returns Boolean
    */
  var getWithCredentials: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of xmlData
    * @returns Object
    */
  var getXmlData: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Object) */
  var headers: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var jsonData: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Ext.data.JsonP) */
  var jsonp: js.UndefOr[IJsonP] = js.native
  
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.data.Operation) */
  var operation: js.UndefOr[IOperation] = js.native
  
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var password: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.data.proxy.Proxy) */
  var proxy: js.UndefOr[typings.senchaTouch.Ext.data.proxy.IProxy] = js.native
  
  /** [Method] Sets the value of action
    * @param action String The new value.
    */
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of args
    * @param args Object The new value.
    */
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of callback
    * @param callback Object The new value.
    */
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of callbackKey
    * @param callbackKey String The new value.
    */
  var setCallbackKey: js.UndefOr[js.Function1[/* callbackKey */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of directFn
    * @param directFn Object The new value.
    */
  var setDirectFn: js.UndefOr[js.Function1[/* directFn */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of disableCaching
    * @param disableCaching Boolean The new value.
    */
  var setDisableCaching: js.UndefOr[js.Function1[/* disableCaching */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of headers
    * @param headers Object The new value.
    */
  var setHeaders: js.UndefOr[js.Function1[/* headers */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of jsonData
    * @param jsonData Object The new value.
    */
  var setJsonData: js.UndefOr[js.Function1[/* jsonData */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of method
    * @param method String The new value.
    */
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of operation
    * @param operation Ext.data.Operation The new value.
    */
  var setOperation: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], Unit]] = js.native
  
  /** [Method] Sets the value of params
    * @param params Object The new value.
    */
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of password
    * @param password String The new value.
    */
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of proxy
    * @param proxy Ext.data.proxy.Proxy The new value.
    */
  var setProxy: js.UndefOr[
    js.Function1[/* proxy */ js.UndefOr[typings.senchaTouch.Ext.data.proxy.IProxy], Unit]
  ] = js.native
  
  /** [Method] Sets the value of records
    * @param records Object The new value.
    */
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of useDefaultXhrHeader
    * @param useDefaultXhrHeader Object The new value.
    */
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of username
    * @param username String The new value.
    */
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of withCredentials
    * @param withCredentials Boolean The new value.
    */
  var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of xmlData
    * @param xmlData Object The new value.
    */
  var setXmlData: js.UndefOr[js.Function1[/* xmlData */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var username: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var xmlData: js.UndefOr[js.Any] = js.native
}
object IRequest {
  
  @scala.inline
  def apply(): IRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequest]
  }
  
  @scala.inline
  implicit class IRequestMutableBuilder[Self <: IRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setCallbackKey(value: String): Self = StObject.set(x, "callbackKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackKeyUndefined: Self = StObject.set(x, "callbackKey", js.undefined)
    
    @scala.inline
    def setDisableCaching(value: Boolean): Self = StObject.set(x, "disableCaching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCachingUndefined: Self = StObject.set(x, "disableCaching", js.undefined)
    
    @scala.inline
    def setGetAction(value: () => String): Self = StObject.set(x, "getAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActionUndefined: Self = StObject.set(x, "getAction", js.undefined)
    
    @scala.inline
    def setGetArgs(value: () => _): Self = StObject.set(x, "getArgs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetArgsUndefined: Self = StObject.set(x, "getArgs", js.undefined)
    
    @scala.inline
    def setGetCallback(value: () => _): Self = StObject.set(x, "getCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCallbackKey(value: () => String): Self = StObject.set(x, "getCallbackKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCallbackKeyUndefined: Self = StObject.set(x, "getCallbackKey", js.undefined)
    
    @scala.inline
    def setGetCallbackUndefined: Self = StObject.set(x, "getCallback", js.undefined)
    
    @scala.inline
    def setGetDirectFn(value: () => _): Self = StObject.set(x, "getDirectFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDirectFnUndefined: Self = StObject.set(x, "getDirectFn", js.undefined)
    
    @scala.inline
    def setGetDisableCaching(value: () => Boolean): Self = StObject.set(x, "getDisableCaching", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisableCachingUndefined: Self = StObject.set(x, "getDisableCaching", js.undefined)
    
    @scala.inline
    def setGetHeaders(value: () => _): Self = StObject.set(x, "getHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeadersUndefined: Self = StObject.set(x, "getHeaders", js.undefined)
    
    @scala.inline
    def setGetJsonData(value: () => _): Self = StObject.set(x, "getJsonData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetJsonDataUndefined: Self = StObject.set(x, "getJsonData", js.undefined)
    
    @scala.inline
    def setGetMethod(value: () => String): Self = StObject.set(x, "getMethod", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMethodUndefined: Self = StObject.set(x, "getMethod", js.undefined)
    
    @scala.inline
    def setGetOperation(value: () => IOperation): Self = StObject.set(x, "getOperation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOperationUndefined: Self = StObject.set(x, "getOperation", js.undefined)
    
    @scala.inline
    def setGetParams(value: () => _): Self = StObject.set(x, "getParams", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParamsUndefined: Self = StObject.set(x, "getParams", js.undefined)
    
    @scala.inline
    def setGetPassword(value: () => String): Self = StObject.set(x, "getPassword", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPasswordUndefined: Self = StObject.set(x, "getPassword", js.undefined)
    
    @scala.inline
    def setGetProxy(value: () => typings.senchaTouch.Ext.data.proxy.IProxy): Self = StObject.set(x, "getProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    @scala.inline
    def setGetRecords(value: () => _): Self = StObject.set(x, "getRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecordsUndefined: Self = StObject.set(x, "getRecords", js.undefined)
    
    @scala.inline
    def setGetScope(value: () => _): Self = StObject.set(x, "getScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScopeUndefined: Self = StObject.set(x, "getScope", js.undefined)
    
    @scala.inline
    def setGetTimeout(value: () => Double): Self = StObject.set(x, "getTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeoutUndefined: Self = StObject.set(x, "getTimeout", js.undefined)
    
    @scala.inline
    def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
    
    @scala.inline
    def setGetUseDefaultXhrHeader(value: () => _): Self = StObject.set(x, "getUseDefaultXhrHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "getUseDefaultXhrHeader", js.undefined)
    
    @scala.inline
    def setGetUsername(value: () => String): Self = StObject.set(x, "getUsername", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUsernameUndefined: Self = StObject.set(x, "getUsername", js.undefined)
    
    @scala.inline
    def setGetWithCredentials(value: () => Boolean): Self = StObject.set(x, "getWithCredentials", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWithCredentialsUndefined: Self = StObject.set(x, "getWithCredentials", js.undefined)
    
    @scala.inline
    def setGetXmlData(value: () => _): Self = StObject.set(x, "getXmlData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetXmlDataUndefined: Self = StObject.set(x, "getXmlData", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setJsonData(value: js.Any): Self = StObject.set(x, "jsonData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonDataUndefined: Self = StObject.set(x, "jsonData", js.undefined)
    
    @scala.inline
    def setJsonp(value: IJsonP): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOperation(value: IOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setProxy(value: typings.senchaTouch.Ext.data.proxy.IProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setSetAction(value: /* action */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActionUndefined: Self = StObject.set(x, "setAction", js.undefined)
    
    @scala.inline
    def setSetArgs(value: /* args */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setArgs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetArgsUndefined: Self = StObject.set(x, "setArgs", js.undefined)
    
    @scala.inline
    def setSetCallback(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCallbackKey(value: /* callbackKey */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCallbackKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCallbackKeyUndefined: Self = StObject.set(x, "setCallbackKey", js.undefined)
    
    @scala.inline
    def setSetCallbackUndefined: Self = StObject.set(x, "setCallback", js.undefined)
    
    @scala.inline
    def setSetDirectFn(value: /* directFn */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDirectFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDirectFnUndefined: Self = StObject.set(x, "setDirectFn", js.undefined)
    
    @scala.inline
    def setSetDisableCaching(value: /* disableCaching */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisableCaching", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDisableCachingUndefined: Self = StObject.set(x, "setDisableCaching", js.undefined)
    
    @scala.inline
    def setSetHeaders(value: /* headers */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
    
    @scala.inline
    def setSetJsonData(value: /* jsonData */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setJsonData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetJsonDataUndefined: Self = StObject.set(x, "setJsonData", js.undefined)
    
    @scala.inline
    def setSetMethod(value: /* method */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMethodUndefined: Self = StObject.set(x, "setMethod", js.undefined)
    
    @scala.inline
    def setSetOperation(value: /* operation */ js.UndefOr[IOperation] => Unit): Self = StObject.set(x, "setOperation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOperationUndefined: Self = StObject.set(x, "setOperation", js.undefined)
    
    @scala.inline
    def setSetParams(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetParamsUndefined: Self = StObject.set(x, "setParams", js.undefined)
    
    @scala.inline
    def setSetPassword(value: /* password */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPassword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPasswordUndefined: Self = StObject.set(x, "setPassword", js.undefined)
    
    @scala.inline
    def setSetProxy(value: /* proxy */ js.UndefOr[typings.senchaTouch.Ext.data.proxy.IProxy] => Unit): Self = StObject.set(x, "setProxy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProxyUndefined: Self = StObject.set(x, "setProxy", js.undefined)
    
    @scala.inline
    def setSetRecords(value: /* records */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setRecords", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRecordsUndefined: Self = StObject.set(x, "setRecords", js.undefined)
    
    @scala.inline
    def setSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setScope", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScopeUndefined: Self = StObject.set(x, "setScope", js.undefined)
    
    @scala.inline
    def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
    
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
    
    @scala.inline
    def setSetUseDefaultXhrHeader(value: /* useDefaultXhrHeader */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setUseDefaultXhrHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "setUseDefaultXhrHeader", js.undefined)
    
    @scala.inline
    def setSetUsername(value: /* username */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setUsername", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUsernameUndefined: Self = StObject.set(x, "setUsername", js.undefined)
    
    @scala.inline
    def setSetWithCredentials(value: /* withCredentials */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setWithCredentials", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWithCredentialsUndefined: Self = StObject.set(x, "setWithCredentials", js.undefined)
    
    @scala.inline
    def setSetXmlData(value: /* xmlData */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setXmlData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXmlDataUndefined: Self = StObject.set(x, "setXmlData", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    
    @scala.inline
    def setXmlData(value: js.Any): Self = StObject.set(x, "xmlData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlDataUndefined: Self = StObject.set(x, "xmlData", js.undefined)
  }
}
