package typings.reactNativePaypalLib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentConfirmation extends js.Object {
  
  var client: PayPalPayment = js.native
  
  var response: ProofOfPayment = js.native
  
  var response_type: String = js.native
}
object PaymentConfirmation {
  
  @scala.inline
  def apply(client: PayPalPayment, response: ProofOfPayment, response_type: String): PaymentConfirmation = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], response_type = response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentConfirmation]
  }
  
  @scala.inline
  implicit class PaymentConfirmationOps[Self <: PaymentConfirmation] (val x: Self) extends AnyVal {
    
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
    def setClient(value: PayPalPayment): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: ProofOfPayment): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_type(value: String): Self = this.set("response_type", value.asInstanceOf[js.Any])
  }
}
