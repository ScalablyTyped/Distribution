package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlProps[T] extends StObject {
  
  var argType: js.UndefOr[ArgType] = js.undefined
  
  var defaultValue: js.UndefOr[T] = js.undefined
  
  var name: String
  
  var onBlur: js.UndefOr[js.Function1[/* evt */ Any, Unit]] = js.undefined
  
  def onChange(value: T): T | Unit
  
  var onFocus: js.UndefOr[js.Function1[/* evt */ Any, Unit]] = js.undefined
  
  var value: js.UndefOr[T] = js.undefined
}
object ControlProps {
  
  inline def apply[T](name: String, onChange: T => T | Unit): ControlProps[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[ControlProps[T]]
  }
  
  extension [Self <: ControlProps[?], T](x: Self & ControlProps[T]) {
    
    inline def setArgType(value: ArgType): Self = StObject.set(x, "argType", value.asInstanceOf[js.Any])
    
    inline def setArgTypeUndefined: Self = StObject.set(x, "argType", js.undefined)
    
    inline def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: /* evt */ Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: T => T | Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnFocus(value: /* evt */ Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
