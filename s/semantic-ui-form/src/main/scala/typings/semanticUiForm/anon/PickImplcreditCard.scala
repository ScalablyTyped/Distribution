package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'creditCard'> */
@js.native
trait PickImplcreditCard extends js.Object {
  
  var creditCard: String = js.native
}
object PickImplcreditCard {
  
  @scala.inline
  def apply(creditCard: String): PickImplcreditCard = {
    val __obj = js.Dynamic.literal(creditCard = creditCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcreditCard]
  }
  
  @scala.inline
  implicit class PickImplcreditCardOps[Self <: PickImplcreditCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreditCard(value: String): Self = this.set("creditCard", value.asInstanceOf[js.Any])
  }
}
