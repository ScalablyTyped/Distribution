package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeTokenResponse extends js.Object {
  var client_ip: java.lang.String
  var created: scala.Double
  var error: js.UndefOr[StripeError] = js.undefined
  var id: java.lang.String
  var livemode: scala.Boolean
  var `object`: java.lang.String
  var `type`: java.lang.String
  var used: scala.Boolean
}

object StripeTokenResponse {
  @scala.inline
  def apply(
    client_ip: java.lang.String,
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: java.lang.String,
    `type`: java.lang.String,
    used: scala.Boolean,
    error: StripeError = null
  ): StripeTokenResponse = {
    val __obj = js.Dynamic.literal(client_ip = client_ip, created = created, id = id, livemode = livemode, used = used)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[StripeTokenResponse]
  }
}

