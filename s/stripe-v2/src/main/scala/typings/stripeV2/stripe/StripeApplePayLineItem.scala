package typings.stripeV2.stripe

import typings.stripeV2.stripeV2Strings.`final`
import typings.stripeV2.stripeV2Strings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/reference/applepayjs/1916082-applepay_js_data_types
trait StripeApplePayLineItem extends StObject {
  
  var amount: Double
  
  var label: String
  
  var `type`: pending | `final`
}
object StripeApplePayLineItem {
  
  inline def apply(amount: Double, label: String, `type`: pending | `final`): StripeApplePayLineItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePayLineItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StripeApplePayLineItem] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: pending | `final`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
