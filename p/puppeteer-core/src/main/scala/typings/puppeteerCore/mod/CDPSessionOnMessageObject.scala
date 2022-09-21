package typings.puppeteerCore.mod

import typings.puppeteerCore.anon.Code
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CDPSessionOnMessageObject extends StObject {
  
  var error: Code
  
  var id: js.UndefOr[Double] = js.undefined
  
  var method: String
  
  var params: Record[String, Any]
  
  var result: js.UndefOr[Any] = js.undefined
}
object CDPSessionOnMessageObject {
  
  inline def apply(error: Code, method: String, params: Record[String, Any]): CDPSessionOnMessageObject = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[CDPSessionOnMessageObject]
  }
  
  extension [Self <: CDPSessionOnMessageObject](x: Self) {
    
    inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
