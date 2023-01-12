package typings.reactNativeReanimated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var _value: Boolean
  
  var value: Boolean
}
object Value {
  
  inline def apply(_value: Boolean, value: Boolean): Value = {
    val __obj = js.Dynamic.literal(_value = _value.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_value(value: Boolean): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
  }
}
