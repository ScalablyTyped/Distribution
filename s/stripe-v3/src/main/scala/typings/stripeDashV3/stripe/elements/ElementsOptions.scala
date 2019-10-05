package typings.stripeDashV3.stripe.elements

import org.scalablytyped.runtime.StringDictionary
import typings.stripeDashV3.Anon_Base
import typings.stripeDashV3.Anon_BaseComplete
import typings.stripeDashV3.stripe.paymentRequest.StripePaymentRequest
import typings.stripeDashV3.stripeDashV3Strings.default
import typings.stripeDashV3.stripeDashV3Strings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementsOptions extends js.Object {
  var classes: js.UndefOr[Anon_Base] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var hideIcon: js.UndefOr[Boolean] = js.undefined
  var hidePostalCode: js.UndefOr[Boolean] = js.undefined
  var iconStyle: js.UndefOr[solid | default] = js.undefined
  var paymentRequest: js.UndefOr[StripePaymentRequest] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var placeholderCountry: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[Anon_BaseComplete] = js.undefined
  var supportedCountries: js.UndefOr[js.Array[String]] = js.undefined
  var value: js.UndefOr[String | StringDictionary[String]] = js.undefined
}

object ElementsOptions {
  @scala.inline
  def apply(
    classes: Anon_Base = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hideIcon: js.UndefOr[Boolean] = js.undefined,
    hidePostalCode: js.UndefOr[Boolean] = js.undefined,
    iconStyle: solid | default = null,
    paymentRequest: StripePaymentRequest = null,
    placeholder: String = null,
    placeholderCountry: String = null,
    style: Anon_BaseComplete = null,
    supportedCountries: js.Array[String] = null,
    value: String | StringDictionary[String] = null
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

