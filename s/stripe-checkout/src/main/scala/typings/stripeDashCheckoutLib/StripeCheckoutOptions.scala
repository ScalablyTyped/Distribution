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

