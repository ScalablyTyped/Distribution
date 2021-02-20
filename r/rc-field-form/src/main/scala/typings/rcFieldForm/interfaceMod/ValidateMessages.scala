package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.anon.Array
import typings.rcFieldForm.anon.Format
import typings.rcFieldForm.anon.Len
import typings.rcFieldForm.anon.Mismatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateMessages extends StObject {
  
  var default: js.UndefOr[ValidateMessage] = js.native
  
  var array: js.UndefOr[Len] = js.native
  
  var date: js.UndefOr[Format] = js.native
  
  var enum: js.UndefOr[ValidateMessage] = js.native
  
  var number: js.UndefOr[Len] = js.native
  
  var pattern: js.UndefOr[Mismatch] = js.native
  
  var required: js.UndefOr[ValidateMessage] = js.native
  
  var string: js.UndefOr[Len] = js.native
  
  var types: js.UndefOr[Array] = js.native
  
  var whitespace: js.UndefOr[ValidateMessage] = js.native
}
object ValidateMessages {
  
  @scala.inline
  def apply(): ValidateMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateMessages]
  }
  
  @scala.inline
  implicit class ValidateMessagesMutableBuilder[Self <: ValidateMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: Len): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    @scala.inline
    def setDate(value: Format): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDefault(value: ValidateMessage): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFunction0(value: () => String): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setEnum(value: ValidateMessage): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumFunction0(value: () => String): Self = StObject.set(x, "enum", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    @scala.inline
    def setNumber(value: Len): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setPattern(value: Mismatch): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setRequired(value: ValidateMessage): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFunction0(value: () => String): Self = StObject.set(x, "required", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setString(value: Len): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    @scala.inline
    def setTypes(value: Array): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setWhitespace(value: ValidateMessage): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitespaceFunction0(value: () => String): Self = StObject.set(x, "whitespace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
  }
}
