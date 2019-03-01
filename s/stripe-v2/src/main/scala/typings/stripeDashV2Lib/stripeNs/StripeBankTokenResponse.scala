package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeBankTokenResponse extends StripeTokenResponse {
  var bank_account: stripeDashV2Lib.Anon_Bankname
}

object StripeBankTokenResponse {
  @scala.inline
  def apply(
    bank_account: stripeDashV2Lib.Anon_Bankname,
    client_ip: java.lang.String,
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: java.lang.String,
    `type`: java.lang.String,
    used: scala.Boolean,
    error: StripeError = null
  ): StripeBankTokenResponse = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`)
    __obj.updateDynamic("bank_account")(bank_account)
    __obj.updateDynamic("client_ip")(client_ip)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("livemode")(livemode)
    __obj.updateDynamic("used")(used)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[StripeBankTokenResponse]
  }
}

