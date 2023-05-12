package typings.recurlyRecurlyJs.libApplePayNativeMod

import typings.recurlyRecurlyJs.anon.PaymentMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePayPayment extends StObject {
  
  /**
    * The billing contact selected by the user for this transaction.
    */
  var billingContact: ApplePayPaymentContact
  
  /**
    * The shipping contact selected by the user for this transaction.
    */
  var shippingContact: ApplePayPaymentContact
  
  var token: PaymentMethod
}
object ApplePayPayment {
  
  inline def apply(
    billingContact: ApplePayPaymentContact,
    shippingContact: ApplePayPaymentContact,
    token: PaymentMethod
  ): ApplePayPayment = {
    val __obj = js.Dynamic.literal(billingContact = billingContact.asInstanceOf[js.Any], shippingContact = shippingContact.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPayment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayPayment] (val x: Self) extends AnyVal {
    
    inline def setBillingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "billingContact", value.asInstanceOf[js.Any])
    
    inline def setShippingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
    
    inline def setToken(value: PaymentMethod): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
