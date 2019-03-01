package typings
package stripeDashV3Lib.stripeNs.elementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementsOptions extends js.Object {
  var classes: js.UndefOr[stripeDashV3Lib.Anon_Base] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var hideIcon: js.UndefOr[scala.Boolean] = js.undefined
  var hidePostalCode: js.UndefOr[scala.Boolean] = js.undefined
  var iconStyle: js.UndefOr[
    stripeDashV3Lib.stripeDashV3LibStrings.solid | stripeDashV3Lib.stripeDashV3LibStrings.default
  ] = js.undefined
  var paymentRequest: js.UndefOr[stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequest] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var placeholderCountry: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[stripeDashV3Lib.Anon_BaseComplete] = js.undefined
  var supportedCountries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var value: js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object ElementsOptions {
  @scala.inline
  def apply(
    classes: stripeDashV3Lib.Anon_Base = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hideIcon: js.UndefOr[scala.Boolean] = js.undefined,
    hidePostalCode: js.UndefOr[scala.Boolean] = js.undefined,
    iconStyle: stripeDashV3Lib.stripeDashV3LibStrings.solid | stripeDashV3Lib.stripeDashV3LibStrings.default = null,
    paymentRequest: stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequest = null,
    placeholder: java.lang.String = null,
    placeholderCountry: java.lang.String = null,
    style: stripeDashV3Lib.Anon_BaseComplete = null,
    supportedCountries: js.Array[java.lang.String] = null,
    value: java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): ElementsOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon)
    if (!js.isUndefined(hidePostalCode)) __obj.updateDynamic("hidePostalCode")(hidePostalCode)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (paymentRequest != null) __obj.updateDynamic("paymentRequest")(paymentRequest)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (placeholderCountry != null) __obj.updateDynamic("placeholderCountry")(placeholderCountry)
    if (style != null) __obj.updateDynamic("style")(style)
    if (supportedCountries != null) __obj.updateDynamic("supportedCountries")(supportedCountries)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementsOptions]
  }
}

