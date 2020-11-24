package typings.recurlyRecurlyJs.adyenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdyenOptions extends js.Object {
  
  /**
    * 2 Digit Country Code
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * Invoice Uuid from PendingPurchase
    */
  var invoiceUuid: String = js.native
  
  /**
    * Shopper locale for Payment Modal
    */
  var shopperLocale: js.UndefOr[String] = js.native
  
  /**
    * Skin code provided by Adyen
    */
  var skinCode: js.UndefOr[String] = js.native
}
object AdyenOptions {
  
  @scala.inline
  def apply(invoiceUuid: String): AdyenOptions = {
    val __obj = js.Dynamic.literal(invoiceUuid = invoiceUuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdyenOptions]
  }
  
  @scala.inline
  implicit class AdyenOptionsOps[Self <: AdyenOptions] (val x: Self) extends AnyVal {
    
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
    def setInvoiceUuid(value: String): Self = this.set("invoiceUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setShopperLocale(value: String): Self = this.set("shopperLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShopperLocale: Self = this.set("shopperLocale", js.undefined)
    
    @scala.inline
    def setSkinCode(value: String): Self = this.set("skinCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkinCode: Self = this.set("skinCode", js.undefined)
  }
}
