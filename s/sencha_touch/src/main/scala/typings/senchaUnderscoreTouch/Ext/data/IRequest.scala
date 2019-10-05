package typings.senchaUnderscoreTouch.Ext.data

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequest extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var callbackKey: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of action
  		* @returns String
  		*/
  var getAction: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of args
  		* @returns Object
  		*/
  var getArgs: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of callback
  		* @returns Object
  		*/
  var getCallback: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of callbackKey
  		* @returns String
  		*/
  var getCallbackKey: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of directFn
  		* @returns Object
  		*/
  var getDirectFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of disableCaching
  		* @returns Boolean
  		*/
  var getDisableCaching: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of headers
  		* @returns Object
  		*/
  var getHeaders: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of jsonData
  		* @returns Object
  		*/
  var getJsonData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of method
  		* @returns String
  		*/
  var getMethod: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of operation
  		* @returns Ext.data.Operation
  		*/
  var getOperation: js.UndefOr[js.Function0[IOperation]] = js.undefined
  /** [Method] Returns the value of params
  		* @returns Object
  		*/
  var getParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of password
  		* @returns String
  		*/
  var getPassword: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of proxy
  		* @returns Ext.data.proxy.Proxy
  		*/
  var getProxy: js.UndefOr[js.Function0[typings.senchaUnderscoreTouch.Ext.data.proxy.IProxy]] = js.undefined
  /** [Method] Returns the value of records
  		* @returns Object
  		*/
  var getRecords: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of useDefaultXhrHeader
  		* @returns Object
  		*/
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of username
  		* @returns String
  		*/
  var getUsername: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of withCredentials
  		* @returns Boolean
  		*/
  var getWithCredentials: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of xmlData
  		* @returns Object
  		*/
  var getXmlData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Object) */
  var headers: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var jsonData: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.data.JsonP) */
  var jsonp: js.UndefOr[IJsonP] = js.undefined
  /** [Config Option] (String) */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.data.Operation) */
  var operation: js.UndefOr[IOperation] = js.undefined
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.data.proxy.Proxy) */
  var proxy: js.UndefOr[typings.senchaUnderscoreTouch.Ext.data.proxy.IProxy] = js.undefined
  /** [Method] Sets the value of action
  		* @param action String The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of args
  		* @param args Object The new value.
  		*/
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of callback
  		* @param callback Object The new value.
  		*/
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of callbackKey
  		* @param callbackKey String The new value.
  		*/
  var setCallbackKey: js.UndefOr[js.Function1[/* callbackKey */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of directFn
  		* @param directFn Object The new value.
  		*/
  var setDirectFn: js.UndefOr[js.Function1[/* directFn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of disableCaching
  		* @param disableCaching Boolean The new value.
  		*/
  var setDisableCaching: js.UndefOr[js.Function1[/* disableCaching */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of headers
  		* @param headers Object The new value.
  		*/
  var setHeaders: js.UndefOr[js.Function1[/* headers */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of jsonData
  		* @param jsonData Object The new value.
  		*/
  var setJsonData: js.UndefOr[js.Function1[/* jsonData */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of method
  		* @param method String The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of operation
  		* @param operation Ext.data.Operation The new value.
  		*/
  var setOperation: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], Unit]] = js.undefined
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of password
  		* @param password String The new value.
  		*/
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of proxy
  		* @param proxy Ext.data.proxy.Proxy The new value.
  		*/
  var setProxy: js.UndefOr[
    js.Function1[/* proxy */ js.UndefOr[typings.senchaUnderscoreTouch.Ext.data.proxy.IProxy], Unit]
  ] = js.undefined
  /** [Method] Sets the value of records
  		* @param records Object The new value.
  		*/
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of useDefaultXhrHeader
  		* @param useDefaultXhrHeader Object The new value.
  		*/
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of username
  		* @param username String The new value.
  		*/
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of withCredentials
  		* @param withCredentials Boolean The new value.
  		*/
  var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of xmlData
  		* @param xmlData Object The new value.
  		*/
  var setXmlData: js.UndefOr[js.Function1[/* xmlData */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var username: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var xmlData: js.UndefOr[js.Any] = js.undefined
}

object IRequest {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    callbackKey: java.lang.String = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    disableCaching: js.UndefOr[Boolean] = js.undefined,
    extend: java.lang.String = null,
    getAction: () => java.lang.String = null,
    getArgs: () => _ = null,
    getCallback: () => _ = null,
    getCallbackKey: () => java.lang.String = null,
    getDirectFn: () => _ = null,
    getDisableCaching: () => Boolean = null,
    getHeaders: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getJsonData: () => _ = null,
    getMethod: () => java.lang.String = null,
    getOperation: () => IOperation = null,
    getParams: () => _ = null,
    getPassword: () => java.lang.String = null,
    getProxy: () => typings.senchaUnderscoreTouch.Ext.data.proxy.IProxy = null,
    getRecords: () => _ = null,
    getScope: () => _ = null,
    getTimeout: () => Double = null,
    getUrl: () => java.lang.String = null,
    getUseDefaultXhrHeader: () => _ = null,
    getUsername: () => java.lang.String = null,
    getWithCredentials: () => Boolean = null,
    getXmlData: () => _ = null,
    headers: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    jsonData: js.Any = null,
    jsonp: IJsonP = null,
    method: java.lang.String = null,
    mixins: js.Any = null,
    operation: IOperation = null,
    params: js.Any = null,
    password: java.lang.String = null,
    platformConfig: js.Any = null,
    proxy: typings.senchaUnderscoreTouch.Ext.data.proxy.IProxy = null,
    self: IClass = null,
    setAction: /* action */ js.UndefOr[java.lang.String] => Unit = null,
    setArgs: /* args */ js.UndefOr[js.Any] => Unit = null,
    setCallback: /* callback */ js.UndefOr[js.Any] => Unit = null,
    setCallbackKey: /* callbackKey */ js.UndefOr[java.lang.String] => Unit = null,
    setDirectFn: /* directFn */ js.UndefOr[js.Any] => Unit = null,
    setDisableCaching: /* disableCaching */ js.UndefOr[Boolean] => Unit = null,
    setHeaders: /* headers */ js.UndefOr[js.Any] => Unit = null,
    setJsonData: /* jsonData */ js.UndefOr[js.Any] => Unit = null,
    setMethod: /* method */ js.UndefOr[java.lang.String] => Unit = null,
    setOperation: /* operation */ js.UndefOr[IOperation] => Unit = null,
    setParams: /* params */ js.UndefOr[js.Any] => Unit = null,
    setPassword: /* password */ js.UndefOr[java.lang.String] => Unit = null,
    setProxy: /* proxy */ js.UndefOr[typings.senchaUnderscoreTouch.Ext.data.proxy.IProxy] => Unit = null,
    setRecords: /* records */ js.UndefOr[js.Any] => Unit = null,
    setScope: /* scope */ js.UndefOr[js.Any] => Unit = null,
    setTimeout: /* timeout */ js.UndefOr[Double] => Unit = null,
    setUrl: /* url */ js.UndefOr[java.lang.String] => Unit = null,
    setUseDefaultXhrHeader: /* useDefaultXhrHeader */ js.UndefOr[js.Any] => Unit = null,
    setUsername: /* username */ js.UndefOr[java.lang.String] => Unit = null,
    setWithCredentials: /* withCredentials */ js.UndefOr[Boolean] => Unit = null,
    setXmlData: /* xmlData */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    url: java.lang.String = null,
    username: java.lang.String = null,
    uses: Array = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xmlData: js.Any = null
  ): IRequest = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (callbackKey != null) __obj.updateDynamic("callbackKey")(callbackKey)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(disableCaching)) __obj.updateDynamic("disableCaching")(disableCaching)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAction != null) __obj.updateDynamic("getAction")(js.Any.fromFunction0(getAction))
    if (getArgs != null) __obj.updateDynamic("getArgs")(js.Any.fromFunction0(getArgs))
    if (getCallback != null) __obj.updateDynamic("getCallback")(js.Any.fromFunction0(getCallback))
    if (getCallbackKey != null) __obj.updateDynamic("getCallbackKey")(js.Any.fromFunction0(getCallbackKey))
    if (getDirectFn != null) __obj.updateDynamic("getDirectFn")(js.Any.fromFunction0(getDirectFn))
    if (getDisableCaching != null) __obj.updateDynamic("getDisableCaching")(js.Any.fromFunction0(getDisableCaching))
    if (getHeaders != null) __obj.updateDynamic("getHeaders")(js.Any.fromFunction0(getHeaders))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getJsonData != null) __obj.updateDynamic("getJsonData")(js.Any.fromFunction0(getJsonData))
    if (getMethod != null) __obj.updateDynamic("getMethod")(js.Any.fromFunction0(getMethod))
    if (getOperation != null) __obj.updateDynamic("getOperation")(js.Any.fromFunction0(getOperation))
    if (getParams != null) __obj.updateDynamic("getParams")(js.Any.fromFunction0(getParams))
    if (getPassword != null) __obj.updateDynamic("getPassword")(js.Any.fromFunction0(getPassword))
    if (getProxy != null) __obj.updateDynamic("getProxy")(js.Any.fromFunction0(getProxy))
    if (getRecords != null) __obj.updateDynamic("getRecords")(js.Any.fromFunction0(getRecords))
    if (getScope != null) __obj.updateDynamic("getScope")(js.Any.fromFunction0(getScope))
    if (getTimeout != null) __obj.updateDynamic("getTimeout")(js.Any.fromFunction0(getTimeout))
    if (getUrl != null) __obj.updateDynamic("getUrl")(js.Any.fromFunction0(getUrl))
    if (getUseDefaultXhrHeader != null) __obj.updateDynamic("getUseDefaultXhrHeader")(js.Any.fromFunction0(getUseDefaultXhrHeader))
    if (getUsername != null) __obj.updateDynamic("getUsername")(js.Any.fromFunction0(getUsername))
    if (getWithCredentials != null) __obj.updateDynamic("getWithCredentials")(js.Any.fromFunction0(getWithCredentials))
    if (getXmlData != null) __obj.updateDynamic("getXmlData")(js.Any.fromFunction0(getXmlData))
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (jsonData != null) __obj.updateDynamic("jsonData")(jsonData)
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (params != null) __obj.updateDynamic("params")(params)
    if (password != null) __obj.updateDynamic("password")(password)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAction != null) __obj.updateDynamic("setAction")(js.Any.fromFunction1(setAction))
    if (setArgs != null) __obj.updateDynamic("setArgs")(js.Any.fromFunction1(setArgs))
    if (setCallback != null) __obj.updateDynamic("setCallback")(js.Any.fromFunction1(setCallback))
    if (setCallbackKey != null) __obj.updateDynamic("setCallbackKey")(js.Any.fromFunction1(setCallbackKey))
    if (setDirectFn != null) __obj.updateDynamic("setDirectFn")(js.Any.fromFunction1(setDirectFn))
    if (setDisableCaching != null) __obj.updateDynamic("setDisableCaching")(js.Any.fromFunction1(setDisableCaching))
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(js.Any.fromFunction1(setHeaders))
    if (setJsonData != null) __obj.updateDynamic("setJsonData")(js.Any.fromFunction1(setJsonData))
    if (setMethod != null) __obj.updateDynamic("setMethod")(js.Any.fromFunction1(setMethod))
    if (setOperation != null) __obj.updateDynamic("setOperation")(js.Any.fromFunction1(setOperation))
    if (setParams != null) __obj.updateDynamic("setParams")(js.Any.fromFunction1(setParams))
    if (setPassword != null) __obj.updateDynamic("setPassword")(js.Any.fromFunction1(setPassword))
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1(setProxy))
    if (setRecords != null) __obj.updateDynamic("setRecords")(js.Any.fromFunction1(setRecords))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1(setScope))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1(setTimeout))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1(setUrl))
    if (setUseDefaultXhrHeader != null) __obj.updateDynamic("setUseDefaultXhrHeader")(js.Any.fromFunction1(setUseDefaultXhrHeader))
    if (setUsername != null) __obj.updateDynamic("setUsername")(js.Any.fromFunction1(setUsername))
    if (setWithCredentials != null) __obj.updateDynamic("setWithCredentials")(js.Any.fromFunction1(setWithCredentials))
    if (setXmlData != null) __obj.updateDynamic("setXmlData")(js.Any.fromFunction1(setXmlData))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    if (xmlData != null) __obj.updateDynamic("xmlData")(xmlData)
    __obj.asInstanceOf[IRequest]
  }
}

