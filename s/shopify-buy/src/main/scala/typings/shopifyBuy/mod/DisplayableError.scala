package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayableError extends StObject {
  
  var field: js.Array[String]
  
  var message: String
}
object DisplayableError {
  
  inline def apply(field: js.Array[String], message: String): DisplayableError = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayableError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayableError] (val x: Self) extends AnyVal {
    
    inline def setField(value: js.Array[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldVarargs(value: String*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
