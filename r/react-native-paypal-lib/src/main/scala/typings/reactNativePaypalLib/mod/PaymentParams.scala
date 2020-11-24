package typings.reactNativePaypalLib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentParams extends js.Object {
  
  var acceptCreditCards: Boolean = js.native
  
  var clientId: String = js.native
  
  var currency: CURRENCIES = js.native
  
  var description: String = js.native
  
  var environment: ENVIRONMENT = js.native
  
  var intent: INTENT = js.native
  
  var price: Double = js.native
}
object PaymentParams {
  
  @scala.inline
  def apply(
    acceptCreditCards: Boolean,
    clientId: String,
    currency: CURRENCIES,
    description: String,
    environment: ENVIRONMENT,
    intent: INTENT,
    price: Double
  ): PaymentParams = {
    val __obj = js.Dynamic.literal(acceptCreditCards = acceptCreditCards.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentParams]
  }
  
  @scala.inline
  implicit class PaymentParamsOps[Self <: PaymentParams] (val x: Self) extends AnyVal {
    
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
    def setAcceptCreditCards(value: Boolean): Self = this.set("acceptCreditCards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: CURRENCIES): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: ENVIRONMENT): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntent(value: INTENT): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
  }
}
