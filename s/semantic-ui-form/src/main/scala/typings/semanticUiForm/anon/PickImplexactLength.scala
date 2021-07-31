package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'exactLength'> */
trait PickImplexactLength extends StObject {
  
  var exactLength: String
}
object PickImplexactLength {
  
  @scala.inline
  def apply(exactLength: String): PickImplexactLength = {
    val __obj = js.Dynamic.literal(exactLength = exactLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexactLength]
  }
  
  @scala.inline
  implicit class PickImplexactLengthMutableBuilder[Self <: PickImplexactLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExactLength(value: String): Self = StObject.set(x, "exactLength", value.asInstanceOf[js.Any])
  }
}
