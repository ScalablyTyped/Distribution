package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWaitForConfig extends StObject {
  
  var callback: js.Function
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var method: js.Function
  
  var scope: js.UndefOr[Any] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object IWaitForConfig {
  
  inline def apply(callback: js.Function, method: js.Function): IWaitForConfig = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWaitForConfig]
  }
  
  extension [Self <: IWaitForConfig](x: Self) {
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setMethod(value: js.Function): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
