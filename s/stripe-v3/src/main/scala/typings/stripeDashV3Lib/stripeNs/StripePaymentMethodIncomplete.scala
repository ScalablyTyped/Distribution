package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentMethodIncomplete extends js.Object {
  var billing_details: js.UndefOr[OwnerInfo] = js.undefined
  var card: js.UndefOr[StripePaymentMethodCard] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[paymentMethodType] = js.undefined
}

object StripePaymentMethodIncomplete {
  @scala.inline
  def apply(
    billing_details: OwnerInfo = null,
    card: StripePaymentMethodCard = null,
    metadata: js.Any = null,
    `type`: paymentMethodType = null
  ): StripePaymentMethodIncomplete = {
    val __obj = js.Dynamic.literal()
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    if (card != null) __obj.updateDynamic("card")(card)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StripePaymentMethodIncomplete]
  }
}

