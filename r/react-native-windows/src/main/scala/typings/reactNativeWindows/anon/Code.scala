package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: Double
  
  var details: Any
  
  var message: String
}
object Code {
  
  inline def apply(code: Double, details: Any, message: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
