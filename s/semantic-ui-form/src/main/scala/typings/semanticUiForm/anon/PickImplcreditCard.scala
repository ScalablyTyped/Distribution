package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'creditCard'> */
trait PickImplcreditCard extends StObject {
  
  var creditCard: String
}
object PickImplcreditCard {
  
  inline def apply(creditCard: String): PickImplcreditCard = {
    val __obj = js.Dynamic.literal(creditCard = creditCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcreditCard]
  }
  
  extension [Self <: PickImplcreditCard](x: Self) {
    
    inline def setCreditCard(value: String): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
  }
}
