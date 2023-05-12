package typings.recurlyRecurlyJs.libApplePayNativeMod

import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.credit
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.debit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePayPaymentMethod extends StObject {
  
  /**
    * The billing contact associated with the card.
    */
  var billingContact: js.UndefOr[ApplePayPaymentContact] = js.undefined
  
  /**
    * A string, suitable for display, that describes the card.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * A string, suitable for display, that is the name of the payment network backing the card.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * A string value representing the card's type of payment.
    */
  var `type`: js.UndefOr[credit | debit] = js.undefined
}
object ApplePayPaymentMethod {
  
  inline def apply(): ApplePayPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePayPaymentMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayPaymentMethod] (val x: Self) extends AnyVal {
    
    inline def setBillingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "billingContact", value.asInstanceOf[js.Any])
    
    inline def setBillingContactUndefined: Self = StObject.set(x, "billingContact", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setType(value: credit | debit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
