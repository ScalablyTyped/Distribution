package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, 'placeholderText'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl>> */
trait PickImplplaceholderTextPa
  extends StObject
     with Param {
  
  var defaultText: js.UndefOr[String] = js.undefined
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var placeholderText: String
  
  var text: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object PickImplplaceholderTextPa {
  
  inline def apply(placeholderText: String): PickImplplaceholderTextPa = {
    val __obj = js.Dynamic.literal(placeholderText = placeholderText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplplaceholderTextPa]
  }
  
  extension [Self <: PickImplplaceholderTextPa](x: Self) {
    
    inline def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
    
    inline def setDefaultTextUndefined: Self = StObject.set(x, "defaultText", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
