package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'creditCard'> */
@js.native
trait PickImplcreditCard extends StObject {
  
  var creditCard: String = js.native
}
object PickImplcreditCard {
  
  @scala.inline
  def apply(creditCard: String): PickImplcreditCard = {
    val __obj = js.Dynamic.literal(creditCard = creditCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcreditCard]
  }
  
  @scala.inline
  implicit class PickImplcreditCardMutableBuilder[Self <: PickImplcreditCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreditCard(value: String): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
  }
}
