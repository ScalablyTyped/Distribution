package typings.stripeDashV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeTokenResponse extends js.Object {
  var client_ip: String
  var created: Double
  var error: js.UndefOr[StripeError] = js.undefined
  var id: String
  var livemode: Boolean
  var `object`: String
  var `type`: String
  var used: Boolean
}

object StripeTokenResponse {
  @scala.inline
  def apply(
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: String,
    `type`: String,
    used: Boolean,
    error: StripeError = null
  ): StripeTokenResponse = {
    val __obj = js.Dynamic.literal(client_ip = client_ip, created = created, id = id, livemode = livemode, used = used)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[StripeTokenResponse]
  }
}

