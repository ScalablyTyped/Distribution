package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseComplete extends js.Object {
  var base: js.UndefOr[stripeDashV3Lib.stripeNs.elementsNs.Style] = js.undefined
  var complete: js.UndefOr[stripeDashV3Lib.stripeNs.elementsNs.Style] = js.undefined
  var empty: js.UndefOr[stripeDashV3Lib.stripeNs.elementsNs.Style] = js.undefined
  var invalid: js.UndefOr[stripeDashV3Lib.stripeNs.elementsNs.Style] = js.undefined
  var paymentRequestButton: js.UndefOr[stripeDashV3Lib.stripeNs.elementsNs.PaymentRequestButtonStyleOptions] = js.undefined
}

object Anon_BaseComplete {
  @scala.inline
  def apply(
    base: stripeDashV3Lib.stripeNs.elementsNs.Style = null,
    complete: stripeDashV3Lib.stripeNs.elementsNs.Style = null,
    empty: stripeDashV3Lib.stripeNs.elementsNs.Style = null,
    invalid: stripeDashV3Lib.stripeNs.elementsNs.Style = null,
    paymentRequestButton: stripeDashV3Lib.stripeNs.elementsNs.PaymentRequestButtonStyleOptions = null
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

