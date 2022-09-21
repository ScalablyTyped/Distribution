package typings.sendcloud.mod

import typings.sendcloud.sendcloudStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorResp extends StObject {
  
  var errors: js.Array[String]
  
  var message: error
}
object ErrorResp {
  
  inline def apply(errors: js.Array[String]): ErrorResp = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = "error")
    __obj.asInstanceOf[ErrorResp]
  }
  
  extension [Self <: ErrorResp](x: Self) {
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setMessage(value: error): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
