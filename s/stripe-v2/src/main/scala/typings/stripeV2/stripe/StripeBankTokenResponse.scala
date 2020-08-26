package typings.stripeV2.stripe

import typings.stripeV2.anon.Bankname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeBankTokenResponse extends StripeTokenResponse {
  var bank_account: Bankname = js.native
}

object StripeBankTokenResponse {
  @scala.inline
  def apply(
    bank_account: Bankname,
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: String,
    `type`: String,
    used: Boolean
  ): StripeBankTokenResponse = {
    val __obj = js.Dynamic.literal(bank_account = bank_account.asInstanceOf[js.Any], client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeBankTokenResponse]
  }
  @scala.inline
  implicit class StripeBankTokenResponseOps[Self <: StripeBankTokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBank_account(value: Bankname): Self = this.set("bank_account", value.asInstanceOf[js.Any])
  }
  
}

