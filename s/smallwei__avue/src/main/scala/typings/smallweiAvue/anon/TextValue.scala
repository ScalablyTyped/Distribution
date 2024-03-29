package typings.smallweiAvue.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextValue extends StObject {
  
  var text: String
  
  var value: String
}
object TextValue {
  
  inline def apply(text: String, value: String): TextValue = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextValue] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
