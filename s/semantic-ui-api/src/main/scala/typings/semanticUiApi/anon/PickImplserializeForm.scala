package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'serializeForm'> */
@js.native
trait PickImplserializeForm extends StObject {
  
  var serializeForm: Boolean = js.native
}
object PickImplserializeForm {
  
  @scala.inline
  def apply(serializeForm: Boolean): PickImplserializeForm = {
    val __obj = js.Dynamic.literal(serializeForm = serializeForm.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplserializeForm]
  }
  
  @scala.inline
  implicit class PickImplserializeFormMutableBuilder[Self <: PickImplserializeForm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializeForm(value: Boolean): Self = StObject.set(x, "serializeForm", value.asInstanceOf[js.Any])
  }
}
