package typings
package stripeDashCheckoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeCheckoutOptions extends js.Object {
  var alipay: js.UndefOr[scala.Boolean | stripeDashCheckoutLib.stripeDashCheckoutLibStrings.auto] = js.undefined
  var alipayReusable: js.UndefOr[scala.Boolean] = js.undefined
  var allowRememberMe: js.UndefOr[scala.Boolean] = js.undefined
  var amount: js.UndefOr[scala.Double] = js.undefined
  var billingAddress: js.UndefOr[scala.Boolean] = js.undefined
  var bitcoin: js.UndefOr[scala.Boolean] = js.undefined
  var closed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var opened: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var panelLabel: js.UndefOr[java.lang.String] = js.undefined
  var shippingAddress: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[js.Function1[/* source */ stripeDashV3Lib.stripeNs.Source, scala.Unit]] = js.undefined
  var token: js.UndefOr[js.Function1[/* token */ stripeDashV3Lib.stripeNs.Token, scala.Unit]] = js.undefined
  var zipCode: js.UndefOr[scala.Boolean] = js.undefined
}

object StripeCheckoutOptions {
  @scala.inline
  def apply(
    alipay: scala.Boolean | stripeDashCheckoutLib.stripeDashCheckoutLibStrings.auto = null,
    alipayReusable: js.UndefOr[scala.Boolean] = js.undefined,
    allowRememberMe: js.UndefOr[scala.Boolean] = js.undefined,
    amount: scala.Int | scala.Double = null,
    billingAddress: js.UndefOr[scala.Boolean] = js.undefined,
    bitcoin: js.UndefOr[scala.Boolean] = js.undefined,
    closed: js.Function0[scala.Unit] = null,
    currency: java.lang.String = null,
    description: java.lang.String = null,
    email: java.lang.String = null,
    image: java.lang.String = null,
    key: java.lang.String = null,
    label: java.lang.String = null,
    locale: java.lang.String = null,
    name: java.lang.String = null,
    opened: js.Function0[scala.Unit] = null,
    panelLabel: java.lang.String = null,
    shippingAddress: js.UndefOr[scala.Boolean] = js.undefined,
    source: js.Function1[/* source */ stripeDashV3Lib.stripeNs.Source, scala.Unit] = null,
    token: js.Function1[/* token */ stripeDashV3Lib.stripeNs.Token, scala.Unit] = null,
    zipCode: js.UndefOr[scala.Boolean] = js.undefined
  ): StripeCheckoutOptions = {
    val __obj = js.Dynamic.literal()
    if (alipay != null) __obj.updateDynamic("alipay")(alipay.asInstanceOf[js.Any])
    if (!js.isUndefined(alipayReusable)) __obj.updateDynamic("alipayReusable")(alipayReusable)
    if (!js.isUndefined(allowRememberMe)) __obj.updateDynamic("allowRememberMe")(allowRememberMe)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (!js.isUndefined(billingAddress)) __obj.updateDynamic("billingAddress")(billingAddress)
    if (!js.isUndefined(bitcoin)) __obj.updateDynamic("bitcoin")(bitcoin)
    if (closed != null) __obj.updateDynamic("closed")(closed)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (description != null) __obj.updateDynamic("description")(description)
    if (email != null) __obj.updateDynamic("email")(email)
    if (image != null) __obj.updateDynamic("image")(image)
    if (key != null) __obj.updateDynamic("key")(key)
    if (label != null) __obj.updateDynamic("label")(label)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (name != null) __obj.updateDynamic("name")(name)
    if (opened != null) __obj.updateDynamic("opened")(opened)
    if (panelLabel != null) __obj.updateDynamic("panelLabel")(panelLabel)
    if (!js.isUndefined(shippingAddress)) __obj.updateDynamic("shippingAddress")(shippingAddress)
    if (source != null) __obj.updateDynamic("source")(source)
    if (token != null) __obj.updateDynamic("token")(token)
    if (!js.isUndefined(zipCode)) __obj.updateDynamic("zipCode")(zipCode)
    __obj.asInstanceOf[StripeCheckoutOptions]
  }
}

