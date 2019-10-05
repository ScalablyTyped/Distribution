package typings.stripeDashV3

import typings.stripeDashV3.stripe.elements.PaymentRequestButtonStyleOptions
import typings.stripeDashV3.stripe.elements.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseComplete extends js.Object {
  var base: js.UndefOr[Style] = js.undefined
  var complete: js.UndefOr[Style] = js.undefined
  var empty: js.UndefOr[Style] = js.undefined
  var invalid: js.UndefOr[Style] = js.undefined
  var paymentRequestButton: js.UndefOr[PaymentRequestButtonStyleOptions] = js.undefined
}

object Anon_BaseComplete {
  @scala.inline
  def apply(
    base: Style = null,
    complete: Style = null,
    empty: Style = null,
    invalid: Style = null,
    paymentRequestButton: PaymentRequestButtonStyleOptions = null
  ): Anon_BaseComplete = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (invalid != null) __obj.updateDynamic("invalid")(invalid)
    if (paymentRequestButton != null) __obj.updateDynamic("paymentRequestButton")(paymentRequestButton)
    __obj.asInstanceOf[Anon_BaseComplete]
  }
}

