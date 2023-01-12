package typings.semanticUiForm.anon

import typings.semanticUiForm.SemanticUI.Form.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl, 'disabled'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl>> */
trait PickImpldisabledPartialPi
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var disabled: String
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[String] = js.undefined
}
object PickImpldisabledPartialPi {
  
  inline def apply(disabled: String): PickImpldisabledPartialPi = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldisabledPartialPi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImpldisabledPartialPi] (val x: Self) extends AnyVal {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
