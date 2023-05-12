package typings.recurlyRecurlyJs.libApplePayNativeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePayRecurringPaymentRequest extends StObject {
  
  /**
    * A localized billing agreement that the payment sheet displays to the user before the user authorizes the payment.
    */
  var billingAgreement: js.UndefOr[String] = js.undefined
  
  /**
    * A URL to a web page where the user can update or delete the payment method for the recurring payment.
    * Defaults to the managment URL set in the Recurly Apple Pay configuration.
    */
  var managementURL: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the recurring payment that Apple Pay displays to the user in the payment sheet.
    */
  var paymentDescription: String
  
  /**
    * The regular billing cycle for the recurring payment, including start and end dates, an interval, and an interval count.
    */
  var regularBilling: ApplePayLineItem
  
  /**
    * The trial billing cycle for the recurring payment.
    */
  var trialBilling: js.UndefOr[ApplePayLineItem] = js.undefined
}
object ApplePayRecurringPaymentRequest {
  
  inline def apply(paymentDescription: String, regularBilling: ApplePayLineItem): ApplePayRecurringPaymentRequest = {
    val __obj = js.Dynamic.literal(paymentDescription = paymentDescription.asInstanceOf[js.Any], regularBilling = regularBilling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayRecurringPaymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayRecurringPaymentRequest] (val x: Self) extends AnyVal {
    
    inline def setBillingAgreement(value: String): Self = StObject.set(x, "billingAgreement", value.asInstanceOf[js.Any])
    
    inline def setBillingAgreementUndefined: Self = StObject.set(x, "billingAgreement", js.undefined)
    
    inline def setManagementURL(value: String): Self = StObject.set(x, "managementURL", value.asInstanceOf[js.Any])
    
    inline def setManagementURLUndefined: Self = StObject.set(x, "managementURL", js.undefined)
    
    inline def setPaymentDescription(value: String): Self = StObject.set(x, "paymentDescription", value.asInstanceOf[js.Any])
    
    inline def setRegularBilling(value: ApplePayLineItem): Self = StObject.set(x, "regularBilling", value.asInstanceOf[js.Any])
    
    inline def setTrialBilling(value: ApplePayLineItem): Self = StObject.set(x, "trialBilling", value.asInstanceOf[js.Any])
    
    inline def setTrialBillingUndefined: Self = StObject.set(x, "trialBilling", js.undefined)
  }
}
