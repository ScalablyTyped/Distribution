package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'decimal'> */
trait PickImpldecimal extends StObject {
  
  var decimal: String
}
object PickImpldecimal {
  
  @scala.inline
  def apply(decimal: String): PickImpldecimal = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldecimal]
  }
  
  @scala.inline
  implicit class PickImpldecimalMutableBuilder[Self <: PickImpldecimal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
  }
}
