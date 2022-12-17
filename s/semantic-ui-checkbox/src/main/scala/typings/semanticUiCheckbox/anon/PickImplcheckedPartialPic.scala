package typings.semanticUiCheckbox.anon

import typings.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, 'checked'> & std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl>> */
trait PickImplcheckedPartialPic
  extends StObject
     with Param {
  
  var checked: String
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var radio: js.UndefOr[String] = js.undefined
  
  var readOnly: js.UndefOr[String] = js.undefined
}
object PickImplcheckedPartialPic {
  
  inline def apply(checked: String): PickImplcheckedPartialPic = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcheckedPartialPic]
  }
  
  extension [Self <: PickImplcheckedPartialPic](x: Self) {
    
    inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setRadio(value: String): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
    
    inline def setReadOnly(value: String): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
