package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, 'value'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl>> */
trait PickImplvaluePartialPickIDefaultText
  extends StObject
     with Param {
  
  var defaultText: js.UndefOr[String] = js.undefined
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var placeholderText: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var value: String
}
object PickImplvaluePartialPickIDefaultText {
  
  inline def apply(value: String): PickImplvaluePartialPickIDefaultText = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvaluePartialPickIDefaultText]
  }
  
  extension [Self <: PickImplvaluePartialPickIDefaultText](x: Self) {
    
    inline def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
    
    inline def setDefaultTextUndefined: Self = StObject.set(x, "defaultText", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
