package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'checked'> */
@js.native
trait PickImplchecked extends StObject {
  
  var checked: String = js.native
}
object PickImplchecked {
  
  @scala.inline
  def apply(checked: String): PickImplchecked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplchecked]
  }
  
  @scala.inline
  implicit class PickImplcheckedMutableBuilder[Self <: PickImplchecked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
  }
}
