package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'minLength'> */
trait PickImplminLength extends StObject {
  
  var minLength: String
}
object PickImplminLength {
  
  @scala.inline
  def apply(minLength: String): PickImplminLength = {
    val __obj = js.Dynamic.literal(minLength = minLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplminLength]
  }
  
  @scala.inline
  implicit class PickImplminLengthMutableBuilder[Self <: PickImplminLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinLength(value: String): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
  }
}
