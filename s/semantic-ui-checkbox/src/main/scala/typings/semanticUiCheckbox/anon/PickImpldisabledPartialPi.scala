package typings.semanticUiCheckbox.anon

import typings.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, 'disabled'> & std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl>> */
trait PickImpldisabledPartialPi
  extends StObject
     with Param {
  
  var checked: js.UndefOr[String] = js.undefined
  
  var disabled: String
  
  var radio: js.UndefOr[String] = js.undefined
  
  var readOnly: js.UndefOr[String] = js.undefined
}
object PickImpldisabledPartialPi {
  
  inline def apply(disabled: String): PickImpldisabledPartialPi = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldisabledPartialPi]
  }
  
  extension [Self <: PickImpldisabledPartialPi](x: Self) {
    
    inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setRadio(value: String): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
    
    inline def setReadOnly(value: String): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
