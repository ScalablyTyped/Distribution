package typings.shopifyDashBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shop extends js.Object {
  var description: String
  var moneyFormat: String
  var name: String
  /**
    * TODO Add types for the Shop properties below
    * PaymentSettings, ShopPolicy etc
    */
  var paymentSettings: js.Any
  var primaryDomain: js.Any
  var privacyPolicy: js.Any
  var refundPolicy: js.Any
  var termsOfService: js.Any
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
    val __obj = js.Dynamic.literal(description = description, moneyFormat = moneyFormat, name = name, paymentSettings = paymentSettings, primaryDomain = primaryDomain, privacyPolicy = privacyPolicy, refundPolicy = refundPolicy, termsOfService = termsOfService)
  
    __obj.asInstanceOf[Shop]
  }
}

