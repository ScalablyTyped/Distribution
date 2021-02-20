package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'maxLength'> */
@js.native
trait PickImplmaxLength extends StObject {
  
  var maxLength: String = js.native
}
object PickImplmaxLength {
  
  @scala.inline
  def apply(maxLength: String): PickImplmaxLength = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxLength]
  }
  
  @scala.inline
  implicit class PickImplmaxLengthMutableBuilder[Self <: PickImplmaxLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxLength(value: String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
  }
}
