package typings.stripeDashV2.stripe

import typings.stripeDashV2.Anon_Bankname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeBankTokenResponse extends StripeTokenResponse {
  var bank_account: Anon_Bankname
}

object StripeBankTokenResponse {
  @scala.inline
  def apply(
    bank_account: Anon_Bankname,
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: String,
    `type`: String,
    used: Boolean,
    error: StripeError = null
  ): StripeBankTokenResponse = {
    val __obj = js.Dynamic.literal(bank_account = bank_account, client_ip = client_ip, created = created, id = id, livemode = livemode, used = used)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[StripeBankTokenResponse]
  }
}

