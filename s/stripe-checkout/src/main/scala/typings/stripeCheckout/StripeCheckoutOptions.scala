package typings.stripeCheckout

import typings.stripeCheckout.stripeCheckoutStrings.auto
import typings.stripeV3.stripe.Source
import typings.stripeV3.stripe.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeCheckoutOptions extends js.Object {
  var alipay: js.UndefOr[Boolean | auto] = js.undefined
  var alipayReusable: js.UndefOr[Boolean] = js.undefined
  var allowRememberMe: js.UndefOr[Boolean] = js.undefined
  var amount: js.UndefOr[Double] = js.undefined
  var billingAddress: js.UndefOr[Boolean] = js.undefined
  var bitcoin: js.UndefOr[Boolean] = js.undefined
  var closed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opened: js.UndefOr[js.Function0[Unit]] = js.undefined
  var panelLabel: js.UndefOr[String] = js.undefined
  var shippingAddress: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[js.Function1[/* source */ Source, Unit]] = js.undefined
  var token: js.UndefOr[js.Function1[/* token */ Token, Unit]] = js.undefined
  var zipCode: js.UndefOr[Boolean] = js.undefined
}

object StripeCheckoutOptions {
  @scala.inline
  def apply(
    alipay: Boolean | auto = null,
    alipayReusable: js.UndefOr[Boolean] = js.undefined,
    allowRememberMe: js.UndefOr[Boolean] = js.undefined,
    amount: Int | Double = null,
    billingAddress: js.UndefOr[Boolean] = js.undefined,
    bitcoin: js.UndefOr[Boolean] = js.undefined,
    closed: () => Unit = null,
    currency: String = null,
    description: String = null,
    email: String = null,
    image: String = null,
    key: String = null,
    label: String = null,
    locale: String = null,
    name: String = null,
    opened: () => Unit = null,
    panelLabel: String = null,
    shippingAddress: js.UndefOr[Boolean] = js.undefined,
    source: /* source */ Source => Unit = null,
    token: /* token */ Token => Unit = null,
    zipCode: js.UndefOr[Boolean] = js.undefined
  ): StripeCheckoutOptions = {
    val __obj = js.Dynamic.literal()
    if (alipay != null) __obj.updateDynamic("alipay")(alipay.asInstanceOf[js.Any])
    if (!js.isUndefined(alipayReusable)) __obj.updateDynamic("alipayReusable")(alipayReusable.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRememberMe)) __obj.updateDynamic("allowRememberMe")(allowRememberMe.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (!js.isUndefined(billingAddress)) __obj.updateDynamic("billingAddress")(billingAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(bitcoin)) __obj.updateDynamic("bitcoin")(bitcoin.asInstanceOf[js.Any])
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction0(closed))
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opened != null) __obj.updateDynamic("opened")(js.Any.fromFunction0(opened))
    if (panelLabel != null) __obj.updateDynamic("panelLabel")(panelLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(shippingAddress)) __obj.updateDynamic("shippingAddress")(shippingAddress.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(js.Any.fromFunction1(source))
    if (token != null) __obj.updateDynamic("token")(js.Any.fromFunction1(token))
    if (!js.isUndefined(zipCode)) __obj.updateDynamic("zipCode")(zipCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeCheckoutOptions]
  }
}

