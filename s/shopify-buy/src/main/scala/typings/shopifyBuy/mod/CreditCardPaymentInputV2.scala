package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreditCardPaymentInputV2 extends StObject {
  
  var billingAddress: MailingAddressInput
  
  var idempotencyKey: String
  
  var paymentAmount: MoneyInput
  
  var test: js.UndefOr[Boolean] = js.undefined
  
  var vaultId: String
}
object CreditCardPaymentInputV2 {
  
  inline def apply(
    billingAddress: MailingAddressInput,
    idempotencyKey: String,
    paymentAmount: MoneyInput,
    vaultId: String
  ): CreditCardPaymentInputV2 = {
    val __obj = js.Dynamic.literal(billingAddress = billingAddress.asInstanceOf[js.Any], idempotencyKey = idempotencyKey.asInstanceOf[js.Any], paymentAmount = paymentAmount.asInstanceOf[js.Any], vaultId = vaultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditCardPaymentInputV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreditCardPaymentInputV2] (val x: Self) extends AnyVal {
    
    inline def setBillingAddress(value: MailingAddressInput): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyKey(value: String): Self = StObject.set(x, "idempotencyKey", value.asInstanceOf[js.Any])
    
    inline def setPaymentAmount(value: MoneyInput): Self = StObject.set(x, "paymentAmount", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setVaultId(value: String): Self = StObject.set(x, "vaultId", value.asInstanceOf[js.Any])
  }
}
