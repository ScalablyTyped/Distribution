package typings.semanticUiForm.anon

import typings.semanticUiForm.SemanticUI.Form.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl, 'visible'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl>> */
trait PickImplvisiblePartialPic
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var visible: String & js.UndefOr[String]
}
object PickImplvisiblePartialPic {
  
  inline def apply(visible: String & js.UndefOr[String]): PickImplvisiblePartialPic = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvisiblePartialPic]
  }
  
  extension [Self <: PickImplvisiblePartialPic](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setVisible(value: String & js.UndefOr[String]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
