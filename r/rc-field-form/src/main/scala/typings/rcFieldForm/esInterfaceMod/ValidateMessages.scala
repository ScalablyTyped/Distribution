package typings.rcFieldForm.esInterfaceMod

import typings.rcFieldForm.anon.Array
import typings.rcFieldForm.anon.Format
import typings.rcFieldForm.anon.Len
import typings.rcFieldForm.anon.Mismatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateMessages extends StObject {
  
  var default: js.UndefOr[ValidateMessage] = js.undefined
  
  var array: js.UndefOr[Len] = js.undefined
  
  var date: js.UndefOr[Format] = js.undefined
  
  var `enum`: js.UndefOr[ValidateMessage] = js.undefined
  
  var number: js.UndefOr[Len] = js.undefined
  
  var pattern: js.UndefOr[Mismatch] = js.undefined
  
  var required: js.UndefOr[ValidateMessage] = js.undefined
  
  var string: js.UndefOr[Len] = js.undefined
  
  var types: js.UndefOr[Array] = js.undefined
  
  var whitespace: js.UndefOr[ValidateMessage] = js.undefined
}
object ValidateMessages {
  
  inline def apply(): ValidateMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateMessages] (val x: Self) extends AnyVal {
    
    inline def setArray(value: Len): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setDate(value: Format): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDefault(value: ValidateMessage): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultFunction0(value: () => String): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setEnum(value: ValidateMessage): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumFunction0(value: () => String): Self = StObject.set(x, "enum", js.Any.fromFunction0(value))
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setNumber(value: Len): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPattern(value: Mismatch): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setRequired(value: ValidateMessage): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredFunction0(value: () => String): Self = StObject.set(x, "required", js.Any.fromFunction0(value))
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setString(value: Len): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setTypes(value: Array): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setWhitespace(value: ValidateMessage): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    
    inline def setWhitespaceFunction0(value: () => String): Self = StObject.set(x, "whitespace", js.Any.fromFunction0(value))
    
    inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
  }
}
