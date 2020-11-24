package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IBase
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
  implicit class IRequestOps[Self <: IRequest] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setCallbackKey(value: String): Self = this.set("callbackKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackKey: Self = this.set("callbackKey", js.undefined)
    
    @scala.inline
    def setDisableCaching(value: Boolean): Self = this.set("disableCaching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCaching: Self = this.set("disableCaching", js.undefined)
    
    @scala.inline
    def setGetAction(value: () => String): Self = this.set("getAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAction: Self = this.set("getAction", js.undefined)
    
    @scala.inline
    def setGetArgs(value: () => _): Self = this.set("getArgs", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetArgs: Self = this.set("getArgs", js.undefined)
    
    @scala.inline
    def setGetCallback(value: () => _): Self = this.set("getCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCallback: Self = this.set("getCallback", js.undefined)
    
    @scala.inline
    def setGetCallbackKey(value: () => String): Self = this.set("getCallbackKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCallbackKey: Self = this.set("getCallbackKey", js.undefined)
    
    @scala.inline
    def setGetDirectFn(value: () => _): Self = this.set("getDirectFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDirectFn: Self = this.set("getDirectFn", js.undefined)
    
    @scala.inline
    def setGetDisableCaching(value: () => Boolean): Self = this.set("getDisableCaching", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisableCaching: Self = this.set("getDisableCaching", js.undefined)
    
    @scala.inline
    def setGetHeaders(value: () => _): Self = this.set("getHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHeaders: Self = this.set("getHeaders", js.undefined)
    
    @scala.inline
    def setGetJsonData(value: () => _): Self = this.set("getJsonData", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetJsonData: Self = this.set("getJsonData", js.undefined)
    
    @scala.inline
    def setGetMethod(value: () => String): Self = this.set("getMethod", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMethod: Self = this.set("getMethod", js.undefined)
    
    @scala.inline
    def setGetOperation(value: () => IOperation): Self = this.set("getOperation", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOperation: Self = this.set("getOperation", js.undefined)
    
    @scala.inline
    def setGetParams(value: () => _): Self = this.set("getParams", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetParams: Self = this.set("getParams", js.undefined)
    
    @scala.inline
    def setGetPassword(value: () => String): Self = this.set("getPassword", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPassword: Self = this.set("getPassword", js.undefined)
    
    @scala.inline
    def setGetProxy(value: () => typings.senchaTouch.Ext.data.proxy.IProxy): Self = this.set("getProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetProxy: Self = this.set("getProxy", js.undefined)
    
    @scala.inline
    def setGetRecords(value: () => _): Self = this.set("getRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRecords: Self = this.set("getRecords", js.undefined)
    
    @scala.inline
    def setGetScope(value: () => _): Self = this.set("getScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScope: Self = this.set("getScope", js.undefined)
    
    @scala.inline
    def setGetTimeout(value: () => Double): Self = this.set("getTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTimeout: Self = this.set("getTimeout", js.undefined)
    
    @scala.inline
    def setGetUrl(value: () => String): Self = this.set("getUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUrl: Self = this.set("getUrl", js.undefined)
    
    @scala.inline
    def setGetUseDefaultXhrHeader(value: () => _): Self = this.set("getUseDefaultXhrHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUseDefaultXhrHeader: Self = this.set("getUseDefaultXhrHeader", js.undefined)
    
    @scala.inline
    def setGetUsername(value: () => String): Self = this.set("getUsername", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUsername: Self = this.set("getUsername", js.undefined)
    
    @scala.inline
    def setGetWithCredentials(value: () => Boolean): Self = this.set("getWithCredentials", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetWithCredentials: Self = this.set("getWithCredentials", js.undefined)
    
    @scala.inline
    def setGetXmlData(value: () => _): Self = this.set("getXmlData", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetXmlData: Self = this.set("getXmlData", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setJsonData(value: js.Any): Self = this.set("jsonData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonData: Self = this.set("jsonData", js.undefined)
    
    @scala.inline
    def setJsonp(value: IJsonP): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOperation(value: IOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setProxy(value: typings.senchaTouch.Ext.data.proxy.IProxy): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setSetAction(value: /* action */ js.UndefOr[String] => Unit): Self = this.set("setAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAction: Self = this.set("setAction", js.undefined)
    
    @scala.inline
    def setSetArgs(value: /* args */ js.UndefOr[js.Any] => Unit): Self = this.set("setArgs", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetArgs: Self = this.set("setArgs", js.undefined)
    
    @scala.inline
    def setSetCallback(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = this.set("setCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCallback: Self = this.set("setCallback", js.undefined)
    
    @scala.inline
    def setSetCallbackKey(value: /* callbackKey */ js.UndefOr[String] => Unit): Self = this.set("setCallbackKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCallbackKey: Self = this.set("setCallbackKey", js.undefined)
    
    @scala.inline
    def setSetDirectFn(value: /* directFn */ js.UndefOr[js.Any] => Unit): Self = this.set("setDirectFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDirectFn: Self = this.set("setDirectFn", js.undefined)
    
    @scala.inline
    def setSetDisableCaching(value: /* disableCaching */ js.UndefOr[Boolean] => Unit): Self = this.set("setDisableCaching", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisableCaching: Self = this.set("setDisableCaching", js.undefined)
    
    @scala.inline
    def setSetHeaders(value: /* headers */ js.UndefOr[js.Any] => Unit): Self = this.set("setHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHeaders: Self = this.set("setHeaders", js.undefined)
    
    @scala.inline
    def setSetJsonData(value: /* jsonData */ js.UndefOr[js.Any] => Unit): Self = this.set("setJsonData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetJsonData: Self = this.set("setJsonData", js.undefined)
    
    @scala.inline
    def setSetMethod(value: /* method */ js.UndefOr[String] => Unit): Self = this.set("setMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMethod: Self = this.set("setMethod", js.undefined)
    
    @scala.inline
    def setSetOperation(value: /* operation */ js.UndefOr[IOperation] => Unit): Self = this.set("setOperation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOperation: Self = this.set("setOperation", js.undefined)
    
    @scala.inline
    def setSetParams(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("setParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetParams: Self = this.set("setParams", js.undefined)
    
    @scala.inline
    def setSetPassword(value: /* password */ js.UndefOr[String] => Unit): Self = this.set("setPassword", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPassword: Self = this.set("setPassword", js.undefined)
    
    @scala.inline
    def setSetProxy(value: /* proxy */ js.UndefOr[typings.senchaTouch.Ext.data.proxy.IProxy] => Unit): Self = this.set("setProxy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetProxy: Self = this.set("setProxy", js.undefined)
    
    @scala.inline
    def setSetRecords(value: /* records */ js.UndefOr[js.Any] => Unit): Self = this.set("setRecords", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRecords: Self = this.set("setRecords", js.undefined)
    
    @scala.inline
    def setSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = this.set("setScope", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetScope: Self = this.set("setScope", js.undefined)
    
    @scala.inline
    def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = this.set("setTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTimeout: Self = this.set("setTimeout", js.undefined)
    
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = this.set("setUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUrl: Self = this.set("setUrl", js.undefined)
    
    @scala.inline
    def setSetUseDefaultXhrHeader(value: /* useDefaultXhrHeader */ js.UndefOr[js.Any] => Unit): Self = this.set("setUseDefaultXhrHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUseDefaultXhrHeader: Self = this.set("setUseDefaultXhrHeader", js.undefined)
    
    @scala.inline
    def setSetUsername(value: /* username */ js.UndefOr[String] => Unit): Self = this.set("setUsername", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUsername: Self = this.set("setUsername", js.undefined)
    
    @scala.inline
    def setSetWithCredentials(value: /* withCredentials */ js.UndefOr[Boolean] => Unit): Self = this.set("setWithCredentials", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetWithCredentials: Self = this.set("setWithCredentials", js.undefined)
    
    @scala.inline
    def setSetXmlData(value: /* xmlData */ js.UndefOr[js.Any] => Unit): Self = this.set("setXmlData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetXmlData: Self = this.set("setXmlData", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
    
    @scala.inline
    def setXmlData(value: js.Any): Self = this.set("xmlData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlData: Self = this.set("xmlData", js.undefined)
  }
}
