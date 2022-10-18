package typings.reactPlaidLink.distIndexDotumdDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaidLinkError extends StObject {
  
  var display_message: String
  
  var error_code: String
  
  var error_message: String
  
  var error_type: String
}
object PlaidLinkError {
  
  inline def apply(display_message: String, error_code: String, error_message: String, error_type: String): PlaidLinkError = {
    val __obj = js.Dynamic.literal(display_message = display_message.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaidLinkError]
  }
  
  extension [Self <: PlaidLinkError](x: Self) {
    
    inline def setDisplay_message(value: String): Self = StObject.set(x, "display_message", value.asInstanceOf[js.Any])
    
    inline def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
    
    inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    inline def setError_type(value: String): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
  }
}
