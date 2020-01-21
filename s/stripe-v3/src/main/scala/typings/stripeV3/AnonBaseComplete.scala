package typings.stripeV3

import typings.stripeV3.stripe.elements.PaymentRequestButtonStyleOptions
import typings.stripeV3.stripe.elements.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseComplete extends js.Object {
  var base: js.UndefOr[Style] = js.undefined
  var complete: js.UndefOr[Style] = js.undefined
  var empty: js.UndefOr[Style] = js.undefined
  var invalid: js.UndefOr[Style] = js.undefined
  var paymentRequestButton: js.UndefOr[PaymentRequestButtonStyleOptions] = js.undefined
}

object AnonBaseComplete {
  @scala.inline
  def apply(
    base: Style = null,
    complete: Style = null,
    empty: Style = null,
    invalid: Style = null,
    paymentRequestButton: PaymentRequestButtonStyleOptions = null
  ): AnonBaseComplete = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (paymentRequestButton != null) __obj.updateDynamic("paymentRequestButton")(paymentRequestButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseComplete]
  }
}

