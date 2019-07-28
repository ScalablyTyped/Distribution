package typings.stripeDashV3.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var bank_account: js.UndefOr[BankAccount] = js.undefined
  var card: js.UndefOr[Card] = js.undefined
  var client_ip: String
  var created: Double
  var id: String
  var livemode: Boolean
  var `object`: String
  var `type`: String
  var used: Boolean
}

object Token {
  @scala.inline
  def apply(
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: String,
    `type`: String,
    used: Boolean,
    bank_account: BankAccount = null,
    card: Card = null
  ): Token = {
    val __obj = js.Dynamic.literal(client_ip = client_ip, created = created, id = id, livemode = livemode, used = used)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (bank_account != null) __obj.updateDynamic("bank_account")(bank_account)
    if (card != null) __obj.updateDynamic("card")(card)
    __obj.asInstanceOf[Token]
  }
}

