package typings.smooch

import typings.smooch.smoochStrings.email
import typings.smooch.smoochStrings.select
import typings.smooch.smoochStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrechatCaptureField extends StObject {
  
  var label: String
  
  var name: String
  
  var options: js.UndefOr[js.Array[PrechatCaptureFieldOptions]] = js.undefined
  
  var placeholder: String
  
  var `type`: text | select | email
}
object PrechatCaptureField {
  
  inline def apply(label: String, name: String, placeholder: String, `type`: text | select | email): PrechatCaptureField = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrechatCaptureField]
  }
  
  extension [Self <: PrechatCaptureField](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[PrechatCaptureFieldOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: PrechatCaptureFieldOptions*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setType(value: text | select | email): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
