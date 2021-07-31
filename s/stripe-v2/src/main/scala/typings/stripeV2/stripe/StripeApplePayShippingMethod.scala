package typings.stripeV2.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeApplePayShippingMethod extends StObject {
  
  var amount: Double
  
  var detail: String
  
  var identifier: String
  
  var label: String
}
object StripeApplePayShippingMethod {
  
  @scala.inline
  def apply(amount: Double, detail: String, identifier: String, label: String): StripeApplePayShippingMethod = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePayShippingMethod]
  }
  
  @scala.inline
  implicit class StripeApplePayShippingMethodMutableBuilder[Self <: StripeApplePayShippingMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
