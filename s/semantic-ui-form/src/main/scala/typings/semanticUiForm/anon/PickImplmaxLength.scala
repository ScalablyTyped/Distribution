package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'maxLength'> */
trait PickImplmaxLength extends StObject {
  
  var maxLength: String
}
object PickImplmaxLength {
  
  inline def apply(maxLength: String): PickImplmaxLength = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxLength]
  }
  
  extension [Self <: PickImplmaxLength](x: Self) {
    
    inline def setMaxLength(value: String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
  }
}
