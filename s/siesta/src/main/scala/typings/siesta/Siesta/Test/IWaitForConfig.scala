package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWaitForConfig extends StObject {
  
  var callback: js.Function = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var method: js.Function = js.native
  
  var scope: js.UndefOr[js.Any] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object IWaitForConfig {
  
  @scala.inline
  def apply(callback: js.Function, method: js.Function): IWaitForConfig = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWaitForConfig]
  }
  
  @scala.inline
  implicit class IWaitForConfigMutableBuilder[Self <: IWaitForConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setMethod(value: js.Function): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
