package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.data.proxy.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAjaxProxy
  extends StObject
     with IServer {
  
  /** [Property] (Object) */
  var actionMethods: js.UndefOr[Any] = js.undefined
  
  /** [Method] Performs Ajax request
    * @param operation Ext.data.Operation
    * @param callback Function
    * @param scope Object
    * @returns Object
    */
  @JSName("doRequest")
  var doRequest_IAjaxProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Any
    ]
  ] = js.undefined
  
  /** [Method] Returns the value of headers
    * @returns Object
    */
  var getHeaders: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the HTTP method name for a given request
    * @param request Ext.data.Request The request object.
    * @returns String The HTTP method to use (should be one of 'GET', 'POST', 'PUT' or 'DELETE').
    */
  var getMethod: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.undefined
  
  /** [Method] Returns the value of password
    * @returns String
    */
  var getPassword: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of useDefaultXhrHeader
    * @returns Boolean
    */
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of username
    * @returns String
    */
  var getUsername: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of withCredentials
    * @returns Boolean
    */
  var getWithCredentials: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Object) */
  var headers: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var password: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of headers
    * @param headers Object The new value.
    */
  var setHeaders: js.UndefOr[js.Function1[/* headers */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of password
    * @param password String The new value.
    */
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of useDefaultXhrHeader
    * @param useDefaultXhrHeader Boolean The new value.
    */
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of username
    * @param username String The new value.
    */
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of withCredentials
    * @param withCredentials Boolean The new value.
    */
  var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useDefaultXhrHeader: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var username: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object IAjaxProxy {
  
  inline def apply(): IAjaxProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAjaxProxy]
  }
  
  extension [Self <: IAjaxProxy](x: Self) {
    
    inline def setActionMethods(value: Any): Self = StObject.set(x, "actionMethods", value.asInstanceOf[js.Any])
    
    inline def setActionMethodsUndefined: Self = StObject.set(x, "actionMethods", js.undefined)
    
    inline def setDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Any
    ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
    
    inline def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
    
    inline def setGetHeaders(value: () => Any): Self = StObject.set(x, "getHeaders", js.Any.fromFunction0(value))
    
    inline def setGetHeadersUndefined: Self = StObject.set(x, "getHeaders", js.undefined)
    
    inline def setGetMethod(value: /* request */ js.UndefOr[IRequest] => String): Self = StObject.set(x, "getMethod", js.Any.fromFunction1(value))
    
    inline def setGetMethodUndefined: Self = StObject.set(x, "getMethod", js.undefined)
    
    inline def setGetPassword(value: () => String): Self = StObject.set(x, "getPassword", js.Any.fromFunction0(value))
    
    inline def setGetPasswordUndefined: Self = StObject.set(x, "getPassword", js.undefined)
    
    inline def setGetUseDefaultXhrHeader(value: () => Boolean): Self = StObject.set(x, "getUseDefaultXhrHeader", js.Any.fromFunction0(value))
    
    inline def setGetUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "getUseDefaultXhrHeader", js.undefined)
    
    inline def setGetUsername(value: () => String): Self = StObject.set(x, "getUsername", js.Any.fromFunction0(value))
    
    inline def setGetUsernameUndefined: Self = StObject.set(x, "getUsername", js.undefined)
    
    inline def setGetWithCredentials(value: () => Boolean): Self = StObject.set(x, "getWithCredentials", js.Any.fromFunction0(value))
    
    inline def setGetWithCredentialsUndefined: Self = StObject.set(x, "getWithCredentials", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setSetHeaders(value: /* headers */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1(value))
    
    inline def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
    
    inline def setSetPassword(value: /* password */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPassword", js.Any.fromFunction1(value))
    
    inline def setSetPasswordUndefined: Self = StObject.set(x, "setPassword", js.undefined)
    
    inline def setSetUseDefaultXhrHeader(value: /* useDefaultXhrHeader */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseDefaultXhrHeader", js.Any.fromFunction1(value))
    
    inline def setSetUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "setUseDefaultXhrHeader", js.undefined)
    
    inline def setSetUsername(value: /* username */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setUsername", js.Any.fromFunction1(value))
    
    inline def setSetUsernameUndefined: Self = StObject.set(x, "setUsername", js.undefined)
    
    inline def setSetWithCredentials(value: /* withCredentials */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setWithCredentials", js.Any.fromFunction1(value))
    
    inline def setSetWithCredentialsUndefined: Self = StObject.set(x, "setWithCredentials", js.undefined)
    
    inline def setUseDefaultXhrHeader(value: Boolean): Self = StObject.set(x, "useDefaultXhrHeader", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "useDefaultXhrHeader", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
