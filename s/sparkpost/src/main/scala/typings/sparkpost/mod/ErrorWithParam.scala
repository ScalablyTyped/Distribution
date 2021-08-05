package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorWithParam extends StObject {
  
  var message: String
  
  var param: String
  
  var value: String | Null
}
object ErrorWithParam {
  
  inline def apply(message: String, param: String): ErrorWithParam = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[ErrorWithParam]
  }
  
  extension [Self <: ErrorWithParam](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
