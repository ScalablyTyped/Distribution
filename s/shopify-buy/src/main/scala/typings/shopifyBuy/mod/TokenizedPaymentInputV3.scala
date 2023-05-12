package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenizedPaymentInputV3 extends StObject {
  
  var billingAddress: MailingAddressInput
  
  var idempotencyKey: String
  
  var identifier: js.UndefOr[String] = js.undefined
  
  var paymentAmount: MoneyInput
  
  var paymentData: String
  
  var test: js.UndefOr[Boolean] = js.undefined
  
  var `type`: PaymentTokenType
}
object TokenizedPaymentInputV3 {
  
  inline def apply(
    billingAddress: MailingAddressInput,
    idempotencyKey: String,
    paymentAmount: MoneyInput,
    paymentData: String,
    `type`: PaymentTokenType
  ): TokenizedPaymentInputV3 = {
    val __obj = js.Dynamic.literal(billingAddress = billingAddress.asInstanceOf[js.Any], idempotencyKey = idempotencyKey.asInstanceOf[js.Any], paymentAmount = paymentAmount.asInstanceOf[js.Any], paymentData = paymentData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenizedPaymentInputV3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenizedPaymentInputV3] (val x: Self) extends AnyVal {
    
    inline def setBillingAddress(value: MailingAddressInput): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyKey(value: String): Self = StObject.set(x, "idempotencyKey", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPaymentAmount(value: MoneyInput): Self = StObject.set(x, "paymentAmount", value.asInstanceOf[js.Any])
    
    inline def setPaymentData(value: String): Self = StObject.set(x, "paymentData", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setType(value: PaymentTokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
