package typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements

import org.scalablytyped.runtime.StringDictionary
import typings.stripeDashV3.Anon_Base
import typings.stripeDashV3.Anon_BaseComplete
import typings.stripeDashV3.stripe.paymentRequest.StripePaymentRequest
import typings.stripeDashV3.stripeDashV3Strings.default
import typings.stripeDashV3.stripeDashV3Strings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementProps
  extends typings.stripeDashV3.stripe.elements.ElementsOptions {
  var className: js.UndefOr[String] = js.undefined
  var elementRef: js.UndefOr[js.Function1[/* ref */ js.Any, Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* el */ HTMLStripeElement, Unit]] = js.undefined
}

object ElementProps {
  @scala.inline
  def apply(
    className: String = null,
    classes: Anon_Base = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementRef: /* ref */ js.Any => Unit = null,
    hideIcon: js.UndefOr[Boolean] = js.undefined,
    hidePostalCode: js.UndefOr[Boolean] = js.undefined,
    iconStyle: solid | default = null,
    id: String = null,
    onBlur: /* event */ ElementChangeResponse => Unit = null,
    onChange: /* event */ ElementChangeResponse => Unit = null,
    onFocus: /* event */ ElementChangeResponse => Unit = null,
    onReady: /* el */ HTMLStripeElement => Unit = null,
    paymentRequest: StripePaymentRequest = null,
    placeholder: String = null,
    placeholderCountry: String = null,
    style: Anon_BaseComplete = null,
    supportedCountries: js.Array[String] = null,
    value: String | StringDictionary[String] = null
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

