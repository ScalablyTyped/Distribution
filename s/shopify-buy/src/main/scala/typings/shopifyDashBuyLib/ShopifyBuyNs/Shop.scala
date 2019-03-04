package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shop extends js.Object {
  var description: java.lang.String
  var moneyFormat: java.lang.String
  var name: java.lang.String
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
    description: java.lang.String,
    moneyFormat: java.lang.String,
    name: java.lang.String,
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

