package typings
package stripeDashV3Lib.stripeNs.paymentIntentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentIntent extends js.Object {
  var amount: scala.Double
  var canceled_at: scala.Double
  var client_secret: java.lang.String
  var created: scala.Double
  var currency: java.lang.String
  var description: java.lang.String
  var id: java.lang.String
  var livemode: scala.Boolean
  var next_action: NextAction
  var `object`: stripeDashV3Lib.stripeDashV3LibStrings.payment_intent
  var payment_method: java.lang.String
  var receipt_email: java.lang.String
  var shipping: ShippingInformation
  var status: paymentIntentStatus
}

object StripePaymentIntent {
  @scala.inline
  def apply(
    amount: scala.Double,
    canceled_at: scala.Double,
    client_secret: java.lang.String,
    created: scala.Double,
    currency: java.lang.String,
    description: java.lang.String,
    id: java.lang.String,
    livemode: scala.Boolean,
    next_action: NextAction,
    `object`: stripeDashV3Lib.stripeDashV3LibStrings.payment_intent,
    payment_method: java.lang.String,
    receipt_email: java.lang.String,
    shipping: ShippingInformation,
    status: paymentIntentStatus
  ): StripePaymentIntent = {
    val __obj = js.Dynamic.literal(amount = amount, canceled_at = canceled_at, client_secret = client_secret, created = created, currency = currency, description = description, id = id, livemode = livemode, next_action = next_action, payment_method = payment_method, receipt_email = receipt_email, shipping = shipping, status = status)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[StripePaymentIntent]
  }
}

