package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var bank_account: js.UndefOr[BankAccount] = js.undefined
  var card: js.UndefOr[Card] = js.undefined
  var client_ip: java.lang.String
  var created: scala.Double
  var id: java.lang.String
  var livemode: scala.Boolean
  var `object`: java.lang.String
  var `type`: java.lang.String
  var used: scala.Boolean
}

object Token {
  @scala.inline
  def apply(
    client_ip: java.lang.String,
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: java.lang.String,
    `type`: java.lang.String,
    used: scala.Boolean,
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

