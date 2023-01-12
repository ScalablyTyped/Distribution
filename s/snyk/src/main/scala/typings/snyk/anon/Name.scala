package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var message: String
  
  var name: String
  
  var `type`: String
  
  def validate(input: String): String | Boolean
  @JSName("validate")
  var validate_Original: js.Function1[/* input */ String, String | Boolean]
}
object Name {
  
  inline def apply(message: String, name: String, `type`: String, validate: /* input */ String => String | Boolean): Name = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: /* input */ String => String | Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
