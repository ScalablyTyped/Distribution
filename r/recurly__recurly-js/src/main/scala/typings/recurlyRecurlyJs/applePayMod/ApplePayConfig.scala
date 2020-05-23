package typings.recurlyRecurlyJs.applePayMod

import typings.recurlyRecurlyJs.checkoutMod.CheckoutPricingInstance
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplePayConfig extends js.Object {
  var country: String
  var currency: String
  var form: js.UndefOr[HTMLFormElement] = js.undefined
  var label: String
  var pricing: js.UndefOr[CheckoutPricingInstance] = js.undefined
  var total: String
}

object ApplePayConfig {
  @scala.inline
  def apply(
    country: String,
    currency: String,
    label: String,
    total: String,
    form: HTMLFormElement = null,
    pricing: CheckoutPricingInstance = null
  ): ApplePayConfig = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (pricing != null) __obj.updateDynamic("pricing")(pricing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayConfig]
  }
}

