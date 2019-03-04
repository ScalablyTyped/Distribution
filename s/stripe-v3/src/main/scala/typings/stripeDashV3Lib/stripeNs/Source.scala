package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var card: js.UndefOr[Card] = js.undefined
  var client_secret: java.lang.String
  var created: scala.Double
  var currency: java.lang.String
  var id: java.lang.String
  var owner: stripeDashV3Lib.Anon_Address
  var redirect: js.UndefOr[stripeDashV3Lib.Anon_Status] = js.undefined
  var sepa_debit: js.UndefOr[stripeDashV3Lib.Anon_Bankcode] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var three_d_secure: js.UndefOr[stripeDashV3Lib.Anon_Authenticated] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    client_secret: java.lang.String,
    created: scala.Double,
    currency: java.lang.String,
    id: java.lang.String,
    owner: stripeDashV3Lib.Anon_Address,
    card: Card = null,
    redirect: stripeDashV3Lib.Anon_Status = null,
    sepa_debit: stripeDashV3Lib.Anon_Bankcode = null,
    status: java.lang.String = null,
    three_d_secure: stripeDashV3Lib.Anon_Authenticated = null
  ): Source = {
    val __obj = js.Dynamic.literal(client_secret = client_secret, created = created, currency = currency, id = id, owner = owner)
    if (card != null) __obj.updateDynamic("card")(card)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (sepa_debit != null) __obj.updateDynamic("sepa_debit")(sepa_debit)
    if (status != null) __obj.updateDynamic("status")(status)
    if (three_d_secure != null) __obj.updateDynamic("three_d_secure")(three_d_secure)
    __obj.asInstanceOf[Source]
  }
}

