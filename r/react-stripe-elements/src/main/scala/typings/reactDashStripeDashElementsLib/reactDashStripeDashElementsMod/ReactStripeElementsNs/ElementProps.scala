package typings
package reactDashStripeDashElementsLib.reactDashStripeDashElementsMod.ReactStripeElementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementProps
  extends stripeDashV3Lib.stripeNs.elementsNs.ElementsOptions {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var elementRef: js.UndefOr[js.Function1[/* ref */ js.Any, scala.Unit]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, scala.Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* el */ HTMLStripeElement, scala.Unit]] = js.undefined
}

object ElementProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stripeDashV3Lib.Anon_Base = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    elementRef: /* ref */ js.Any => scala.Unit = null,
    hideIcon: js.UndefOr[scala.Boolean] = js.undefined,
    hidePostalCode: js.UndefOr[scala.Boolean] = js.undefined,
    iconStyle: stripeDashV3Lib.stripeDashV3LibStrings.solid | stripeDashV3Lib.stripeDashV3LibStrings.default = null,
    id: java.lang.String = null,
    onBlur: /* event */ ElementChangeResponse => scala.Unit = null,
    onChange: /* event */ ElementChangeResponse => scala.Unit = null,
    onFocus: /* event */ ElementChangeResponse => scala.Unit = null,
    onReady: /* el */ HTMLStripeElement => scala.Unit = null,
    paymentRequest: stripeDashV3Lib.stripeNs.paymentRequestNs.StripePaymentRequest = null,
    placeholder: java.lang.String = null,
    placeholderCountry: java.lang.String = null,
    style: stripeDashV3Lib.Anon_BaseComplete = null,
    supportedCountries: js.Array[java.lang.String] = null,
    value: java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): ElementProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (elementRef != null) __obj.updateDynamic("elementRef")(js.Any.fromFunction1(elementRef))
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon)
    if (!js.isUndefined(hidePostalCode)) __obj.updateDynamic("hidePostalCode")(hidePostalCode)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (paymentRequest != null) __obj.updateDynamic("paymentRequest")(paymentRequest)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (placeholderCountry != null) __obj.updateDynamic("placeholderCountry")(placeholderCountry)
    if (style != null) __obj.updateDynamic("style")(style)
    if (supportedCountries != null) __obj.updateDynamic("supportedCountries")(supportedCountries)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementProps]
  }
}

