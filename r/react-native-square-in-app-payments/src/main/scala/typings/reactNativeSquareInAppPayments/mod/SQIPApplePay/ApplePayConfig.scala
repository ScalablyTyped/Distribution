package typings.reactNativeSquareInAppPayments.mod.SQIPApplePay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the Apple Pay configuration. */
@js.native
trait ApplePayConfig extends js.Object {
  
  /** The Apple Pay country code. */
  var countryCode: String = js.native
  
  /** ISO currency code of the payment amount. */
  var currencyCode: String = js.native
  
  /** Type of the payment summary item, PaymentTypeFinal for default */
  var paymentType: js.UndefOr[ApplePayPaymentType] = js.native
  
  /** The payment authorization amount as a string. */
  var price: String = js.native
  
  /** A label that displays the checkout summary in the Apple Pay view. */
  var summaryLabel: String = js.native
}
object ApplePayConfig {
  
  @scala.inline
  def apply(countryCode: String, currencyCode: String, price: String, summaryLabel: String): ApplePayConfig = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], summaryLabel = summaryLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayConfig]
  }
  
  @scala.inline
  implicit class ApplePayConfigOps[Self <: ApplePayConfig] (val x: Self) extends AnyVal {
    
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
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryLabel(value: String): Self = this.set("summaryLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentType(value: ApplePayPaymentType): Self = this.set("paymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentType: Self = this.set("paymentType", js.undefined)
  }
}
