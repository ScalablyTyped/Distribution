package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'checked'> */
trait PickImplchecked extends StObject {
  
  var checked: String
}
object PickImplchecked {
  
  inline def apply(checked: String): PickImplchecked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplchecked]
  }
  
  extension [Self <: PickImplchecked](x: Self) {
    
    inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
  }
}
