package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payment
  extends StObject
     with Node {
  
  var amount: MoneyV2
  
  var billingAddress: js.UndefOr[MailingAddress] = js.undefined
  
  var checkout: Checkout
  
  var creditCard: js.UndefOr[CreditCard] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var idempotencyKe: js.UndefOr[String] = js.undefined
  
  var nextActionUrl: js.UndefOr[URL] = js.undefined
  
  var ready: Boolean
  
  var test: Boolean
  
  var transaction: js.UndefOr[Transaction] = js.undefined
}
object Payment {
  
  inline def apply(amount: MoneyV2, checkout: Checkout, id: ID, ready: Boolean, test: Boolean): Payment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], checkout = checkout.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Payment] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: MoneyV2): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBillingAddress(value: MailingAddress): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    inline def setCheckout(value: Checkout): Self = StObject.set(x, "checkout", value.asInstanceOf[js.Any])
    
    inline def setCreditCard(value: CreditCard): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
    
    inline def setCreditCardUndefined: Self = StObject.set(x, "creditCard", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setIdempotencyKe(value: String): Self = StObject.set(x, "idempotencyKe", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyKeUndefined: Self = StObject.set(x, "idempotencyKe", js.undefined)
    
    inline def setNextActionUrl(value: URL): Self = StObject.set(x, "nextActionUrl", value.asInstanceOf[js.Any])
    
    inline def setNextActionUrlUndefined: Self = StObject.set(x, "nextActionUrl", js.undefined)
    
    inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
