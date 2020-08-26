package typings.stripeCheckout

import typings.stripeCheckout.stripeCheckoutStrings.auto
import typings.stripeV3.stripe.Source
import typings.stripeV3.stripe.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeCheckoutOptions extends js.Object {
  var alipay: js.UndefOr[Boolean | auto] = js.native
  var alipayReusable: js.UndefOr[Boolean] = js.native
  var allowRememberMe: js.UndefOr[Boolean] = js.native
  var amount: js.UndefOr[Double] = js.native
  var billingAddress: js.UndefOr[Boolean] = js.native
  var bitcoin: js.UndefOr[Boolean] = js.native
  var closed: js.UndefOr[js.Function0[Unit]] = js.native
  var currency: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var image: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var opened: js.UndefOr[js.Function0[Unit]] = js.native
  var panelLabel: js.UndefOr[String] = js.native
  var shippingAddress: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[js.Function1[/* source */ Source, Unit]] = js.native
  var token: js.UndefOr[js.Function1[/* token */ Token, Unit]] = js.native
  var zipCode: js.UndefOr[Boolean] = js.native
}

object StripeCheckoutOptions {
  @scala.inline
  def apply(): StripeCheckoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripeCheckoutOptions]
  }
  @scala.inline
  implicit class StripeCheckoutOptionsOps[Self <: StripeCheckoutOptions] (val x: Self) extends AnyVal {
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
    def setAlipay(value: Boolean | auto): Self = this.set("alipay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlipay: Self = this.set("alipay", js.undefined)
    @scala.inline
    def setAlipayReusable(value: Boolean): Self = this.set("alipayReusable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlipayReusable: Self = this.set("alipayReusable", js.undefined)
    @scala.inline
    def setAllowRememberMe(value: Boolean): Self = this.set("allowRememberMe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRememberMe: Self = this.set("allowRememberMe", js.undefined)
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setBillingAddress(value: Boolean): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingAddress: Self = this.set("billingAddress", js.undefined)
    @scala.inline
    def setBitcoin(value: Boolean): Self = this.set("bitcoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitcoin: Self = this.set("bitcoin", js.undefined)
    @scala.inline
    def setClosed(value: () => Unit): Self = this.set("closed", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpened(value: () => Unit): Self = this.set("opened", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOpened: Self = this.set("opened", js.undefined)
    @scala.inline
    def setPanelLabel(value: String): Self = this.set("panelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanelLabel: Self = this.set("panelLabel", js.undefined)
    @scala.inline
    def setShippingAddress(value: Boolean): Self = this.set("shippingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingAddress: Self = this.set("shippingAddress", js.undefined)
    @scala.inline
    def setSource(value: /* source */ Source => Unit): Self = this.set("source", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setToken(value: /* token */ Token => Unit): Self = this.set("token", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setZipCode(value: Boolean): Self = this.set("zipCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZipCode: Self = this.set("zipCode", js.undefined)
  }
  
}

