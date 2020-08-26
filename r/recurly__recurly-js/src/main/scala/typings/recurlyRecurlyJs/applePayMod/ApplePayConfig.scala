package typings.recurlyRecurlyJs.applePayMod

import typings.recurlyRecurlyJs.checkoutMod.CheckoutPricingInstance
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplePayConfig extends js.Object {
  var country: String = js.native
  var currency: String = js.native
  var form: js.UndefOr[HTMLFormElement] = js.native
  var label: String = js.native
  var pricing: js.UndefOr[CheckoutPricingInstance] = js.native
  var total: String = js.native
}

object ApplePayConfig {
  @scala.inline
  def apply(country: String, currency: String, label: String, total: String): ApplePayConfig = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: String): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setForm(value: HTMLFormElement): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setPricing(value: CheckoutPricingInstance): Self = this.set("pricing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricing: Self = this.set("pricing", js.undefined)
  }
  
}

