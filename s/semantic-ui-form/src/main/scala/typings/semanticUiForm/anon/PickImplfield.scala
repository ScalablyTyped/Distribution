package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, 'field'> */
@js.native
trait PickImplfield extends StObject {
  
  var field: String = js.native
}
object PickImplfield {
  
  @scala.inline
  def apply(field: String): PickImplfield = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfield]
  }
  
  @scala.inline
  implicit class PickImplfieldMutableBuilder[Self <: PickImplfield] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
