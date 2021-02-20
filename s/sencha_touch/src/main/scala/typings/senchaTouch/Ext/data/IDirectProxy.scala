package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.data.proxy.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDirectProxy extends IServer {
  
  /** [Method] Generates a url based on a given Ext data Request object
    * @returns String The url
    */
  @JSName("buildUrl")
  var buildUrl_IDirectProxy: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (Function/String) */
  var directFn: js.UndefOr[js.Any] = js.native
  
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
    * @param operation Object
    * @param callback Object
    * @param scope Object
    */
  @JSName("doRequest")
  var doRequest_IDirectProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Returns the value of directFn
    * @returns Function/String
    */
  var getDirectFn: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of paramOrder
    * @returns String/String[]
    */
  var getParamOrder: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of paramsAsHash
    * @returns Boolean
    */
  var getParamsAsHash: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets the value of directFn
    * @param directFn Function/String The new value.
    */
  var setDirectFn: js.UndefOr[js.Function1[/* directFn */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of paramOrder
    * @param paramOrder String/String[] The new value.
    */
  var setParamOrder: js.UndefOr[js.Function1[/* paramOrder */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of paramsAsHash
    * @param paramsAsHash Boolean The new value.
    */
  var setParamsAsHash: js.UndefOr[js.Function1[/* paramsAsHash */ js.UndefOr[Boolean], Unit]] = js.native
}
object IDirectProxy {
  
  @scala.inline
  def apply(): IDirectProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectProxy]
  }
  
  @scala.inline
  implicit class IDirectProxyMutableBuilder[Self <: IDirectProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildUrl(value: () => String): Self = StObject.set(x, "buildUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
    
    @scala.inline
    def setDirectFn(value: js.Any): Self = StObject.set(x, "directFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectFnUndefined: Self = StObject.set(x, "directFn", js.undefined)
    
    @scala.inline
    def setDoRequest(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
    
    @scala.inline
    def setGetDirectFn(value: () => _): Self = StObject.set(x, "getDirectFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDirectFnUndefined: Self = StObject.set(x, "getDirectFn", js.undefined)
    
    @scala.inline
    def setGetParamOrder(value: () => _): Self = StObject.set(x, "getParamOrder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParamOrderUndefined: Self = StObject.set(x, "getParamOrder", js.undefined)
    
    @scala.inline
    def setGetParamsAsHash(value: () => Boolean): Self = StObject.set(x, "getParamsAsHash", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParamsAsHashUndefined: Self = StObject.set(x, "getParamsAsHash", js.undefined)
    
    @scala.inline
    def setParamOrder(value: js.Any): Self = StObject.set(x, "paramOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamOrderUndefined: Self = StObject.set(x, "paramOrder", js.undefined)
    
    @scala.inline
    def setParamsAsHash(value: Boolean): Self = StObject.set(x, "paramsAsHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsAsHashUndefined: Self = StObject.set(x, "paramsAsHash", js.undefined)
    
    @scala.inline
    def setSetDirectFn(value: /* directFn */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDirectFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDirectFnUndefined: Self = StObject.set(x, "setDirectFn", js.undefined)
    
    @scala.inline
    def setSetParamOrder(value: /* paramOrder */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setParamOrder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetParamOrderUndefined: Self = StObject.set(x, "setParamOrder", js.undefined)
    
    @scala.inline
    def setSetParamsAsHash(value: /* paramsAsHash */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setParamsAsHash", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetParamsAsHashUndefined: Self = StObject.set(x, "setParamsAsHash", js.undefined)
  }
}
