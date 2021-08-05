package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.SelectorSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplDisabled extends StObject {
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var form: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplDisabled {
  
  inline def apply(): PartialPickImplkeyofImplDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplDisabled]
  }
  
  extension [Self <: PartialPickImplkeyofImplDisabled](x: Self) {
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
  }
}
