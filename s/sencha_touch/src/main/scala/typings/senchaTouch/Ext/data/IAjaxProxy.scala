package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.data.proxy.IServer
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
  implicit class IAjaxProxyOps[Self <: IAjaxProxy] (val x: Self) extends AnyVal {
    
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
    def setActionMethods(value: js.Any): Self = this.set("actionMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionMethods: Self = this.set("actionMethods", js.undefined)
    
    @scala.inline
    def setDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _
    ): Self = this.set("doRequest", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDoRequest: Self = this.set("doRequest", js.undefined)
    
    @scala.inline
    def setGetHeaders(value: () => _): Self = this.set("getHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHeaders: Self = this.set("getHeaders", js.undefined)
    
    @scala.inline
    def setGetMethod(value: /* request */ js.UndefOr[IRequest] => String): Self = this.set("getMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetMethod: Self = this.set("getMethod", js.undefined)
    
    @scala.inline
    def setGetPassword(value: () => String): Self = this.set("getPassword", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPassword: Self = this.set("getPassword", js.undefined)
    
    @scala.inline
    def setGetUseDefaultXhrHeader(value: () => Boolean): Self = this.set("getUseDefaultXhrHeader", js.Any.fromFunction0(value))
    
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
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setSetHeaders(value: /* headers */ js.UndefOr[js.Any] => Unit): Self = this.set("setHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHeaders: Self = this.set("setHeaders", js.undefined)
    
    @scala.inline
    def setSetPassword(value: /* password */ js.UndefOr[String] => Unit): Self = this.set("setPassword", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPassword: Self = this.set("setPassword", js.undefined)
    
    @scala.inline
    def setSetUseDefaultXhrHeader(value: /* useDefaultXhrHeader */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseDefaultXhrHeader", js.Any.fromFunction1(value))
    
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
    def setUseDefaultXhrHeader(value: Boolean): Self = this.set("useDefaultXhrHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDefaultXhrHeader: Self = this.set("useDefaultXhrHeader", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
