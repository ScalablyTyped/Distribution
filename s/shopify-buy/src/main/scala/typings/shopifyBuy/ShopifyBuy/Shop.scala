package typings.shopifyBuy.ShopifyBuy

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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], moneyFormat = moneyFormat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paymentSettings = paymentSettings.asInstanceOf[js.Any], primaryDomain = primaryDomain.asInstanceOf[js.Any], privacyPolicy = privacyPolicy.asInstanceOf[js.Any], refundPolicy = refundPolicy.asInstanceOf[js.Any], termsOfService = termsOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shop]
  }
}

