package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.data.proxy.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAjaxProxy extends IServer {
  
  /** [Property] (Object) */
  var actionMethods: js.UndefOr[js.Any] = js.native
  
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
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  
  /** [Method] Returns the value of headers
    * @returns Object
    */
  var getHeaders: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the HTTP method name for a given request
    * @param request Ext.data.Request The request object.
    * @returns String The HTTP method to use (should be one of 'GET', 'POST', 'PUT' or 'DELETE').
    */
  var getMethod: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.native
  
  /** [Method] Returns the value of password
    * @returns String
    */
  var getPassword: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of useDefaultXhrHeader
    * @returns Boolean
    */
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of username
    * @returns String
    */
  var getUsername: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of withCredentials
    * @returns Boolean
    */
  var getWithCredentials: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (Object) */
  var headers: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var password: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of headers
    * @param headers Object The new value.
    */
  var setHeaders: js.UndefOr[js.Function1[/* headers */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of password
    * @param password String The new value.
    */
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of useDefaultXhrHeader
    * @param useDefaultXhrHeader Boolean The new value.
    */
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of username
    * @param username String The new value.
    */
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of withCredentials
    * @param withCredentials Boolean The new value.
    */
  var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var useDefaultXhrHeader: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var username: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object IAjaxProxy {
  
  @scala.inline
  def apply(): IAjaxProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAjaxProxy]
  }
  
  @scala.inline
  implicit class IAjaxProxyMutableBuilder[Self <: IAjaxProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionMethods(value: js.Any): Self = StObject.set(x, "actionMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionMethodsUndefined: Self = StObject.set(x, "actionMethods", js.undefined)
    
    @scala.inline
    def setDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _
    ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
    
    @scala.inline
    def setGetHeaders(value: () => _): Self = StObject.set(x, "getHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeadersUndefined: Self = StObject.set(x, "getHeaders", js.undefined)
    
    @scala.inline
    def setGetMethod(value: /* request */ js.UndefOr[IRequest] => String): Self = StObject.set(x, "getMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMethodUndefined: Self = StObject.set(x, "getMethod", js.undefined)
    
    @scala.inline
    def setGetPassword(value: () => String): Self = StObject.set(x, "getPassword", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPasswordUndefined: Self = StObject.set(x, "getPassword", js.undefined)
    
    @scala.inline
    def setGetUseDefaultXhrHeader(value: () => Boolean): Self = StObject.set(x, "getUseDefaultXhrHeader", js.Any.fromFunction0(value))
    
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
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setSetHeaders(value: /* headers */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
    
    @scala.inline
    def setSetPassword(value: /* password */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPassword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPasswordUndefined: Self = StObject.set(x, "setPassword", js.undefined)
    
    @scala.inline
    def setSetUseDefaultXhrHeader(value: /* useDefaultXhrHeader */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseDefaultXhrHeader", js.Any.fromFunction1(value))
    
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
    def setUseDefaultXhrHeader(value: Boolean): Self = StObject.set(x, "useDefaultXhrHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "useDefaultXhrHeader", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
