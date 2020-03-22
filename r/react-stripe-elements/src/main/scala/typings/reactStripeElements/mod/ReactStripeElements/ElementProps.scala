package typings.reactStripeElements.mod.ReactStripeElements

import org.scalablytyped.runtime.StringDictionary
import typings.stripeV3.AnonBase
import typings.stripeV3.AnonComplete
import typings.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typings.stripeV3.stripeV3Strings.default
import typings.stripeV3.stripeV3Strings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementProps
  extends typings.stripeV3.stripe.elements.ElementsOptions {
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
    classes: AnonBase = null,
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
    style: AnonComplete = null,
    supportedCountries: js.Array[String] = null,
    value: String | StringDictionary[String] = null
  ): ElementProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementRef != null) __obj.updateDynamic("elementRef")(js.Any.fromFunction1(elementRef))
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePostalCode)) __obj.updateDynamic("hidePostalCode")(hidePostalCode.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (paymentRequest != null) __obj.updateDynamic("paymentRequest")(paymentRequest.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderCountry != null) __obj.updateDynamic("placeholderCountry")(placeholderCountry.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedCountries != null) __obj.updateDynamic("supportedCountries")(supportedCountries.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementProps]
  }
}

