package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shop extends js.Object {
  var description: String = js.native
  var moneyFormat: String = js.native
  var name: String = js.native
  /**
    * TODO Add types for the Shop properties below
    * PaymentSettings, ShopPolicy etc
    */
  var paymentSettings: js.Any = js.native
  var primaryDomain: js.Any = js.native
  var privacyPolicy: js.Any = js.native
  var refundPolicy: js.Any = js.native
  var termsOfService: js.Any = js.native
}

object Shop {
  @scala.inline
  def apply(
    description: String,
    moneyFormat: String,
    name: String,
    paymentSettings: js.Any,
    primaryDomain: js.Any,
    privacyPolicy: js.Any,
    refundPolicy: js.Any,
    termsOfService: js.Any
  ): Shop = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], moneyFormat = moneyFormat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paymentSettings = paymentSettings.asInstanceOf[js.Any], primaryDomain = primaryDomain.asInstanceOf[js.Any], privacyPolicy = privacyPolicy.asInstanceOf[js.Any], refundPolicy = refundPolicy.asInstanceOf[js.Any], termsOfService = termsOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shop]
  }
  @scala.inline
  implicit class ShopOps[Self <: Shop] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoneyFormat(value: String): Self = this.set("moneyFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentSettings(value: js.Any): Self = this.set("paymentSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryDomain(value: js.Any): Self = this.set("primaryDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivacyPolicy(value: js.Any): Self = this.set("privacyPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefundPolicy(value: js.Any): Self = this.set("refundPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setTermsOfService(value: js.Any): Self = this.set("termsOfService", value.asInstanceOf[js.Any])
  }
  
}

