package typings.reactNativeSquareInAppPayments.mod.SQIPGooglePay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the Google Pay configuration. */
@js.native
trait GooglePayConfig extends js.Object {
  
  /** ISO currency code of the payment amount. */
  var currencyCode: String = js.native
  
  /** The payment authorization amount as a string. */
  var price: String = js.native
  
  /** The status of the total price used */
  var priceStatus: GooglePayPriceStatus = js.native
}
object GooglePayConfig {
  
  @scala.inline
  def apply(currencyCode: String, price: String, priceStatus: GooglePayPriceStatus): GooglePayConfig = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], priceStatus = priceStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePayConfig]
  }
  
  @scala.inline
  implicit class GooglePayConfigOps[Self <: GooglePayConfig] (val x: Self) extends AnyVal {
    
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
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceStatus(value: GooglePayPriceStatus): Self = this.set("priceStatus", value.asInstanceOf[js.Any])
  }
}
