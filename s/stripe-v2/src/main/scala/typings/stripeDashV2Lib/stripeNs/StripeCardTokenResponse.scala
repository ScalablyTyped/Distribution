package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeCardTokenResponse extends StripeTokenResponse {
  var card: StripeCard
}

object StripeCardTokenResponse {
  @scala.inline
  def apply(
    card: StripeCard,
    client_ip: java.lang.String,
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: java.lang.String,
    `type`: java.lang.String,
    used: scala.Boolean,
    error: StripeError = null
  ): StripeCardTokenResponse = {
    val __obj = js.Dynamic.literal(card = card, client_ip = client_ip, created = created, id = id, livemode = livemode, used = used)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[StripeCardTokenResponse]
  }
}

