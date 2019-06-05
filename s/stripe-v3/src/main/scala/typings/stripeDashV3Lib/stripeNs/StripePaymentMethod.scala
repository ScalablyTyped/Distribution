package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentMethod extends StripePaymentMethodIncomplete {
  var id: java.lang.String
  @JSName("type")
  var type_StripePaymentMethod: paymentMethodType
}

object StripePaymentMethod {
  @scala.inline
  def apply(
    id: java.lang.String,
    `type`: paymentMethodType,
    billing_details: OwnerInfo = null,
    card: StripePaymentMethodCard = null,
    metadata: js.Any = null
  ): StripePaymentMethod = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    if (card != null) __obj.updateDynamic("card")(card)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[StripePaymentMethod]
  }
}

