package typings.recurlyRecurlyJs.libApplePayNativeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePayShippingContactSelectedEvent extends StObject {
  
  /**
    * The shipping address selected by the user.
    */
  var shippingContact: ApplePayPaymentContact
}
object ApplePayShippingContactSelectedEvent {
  
  inline def apply(shippingContact: ApplePayPaymentContact): ApplePayShippingContactSelectedEvent = {
    val __obj = js.Dynamic.literal(shippingContact = shippingContact.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayShippingContactSelectedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayShippingContactSelectedEvent] (val x: Self) extends AnyVal {
    
    inline def setShippingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
  }
}
