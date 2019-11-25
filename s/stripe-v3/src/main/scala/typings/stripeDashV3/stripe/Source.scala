package typings.stripeDashV3.stripe

import typings.stripeDashV3.Anon_Address
import typings.stripeDashV3.Anon_Authenticated
import typings.stripeDashV3.Anon_Bankcode
import typings.stripeDashV3.Anon_Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var card: js.UndefOr[Card] = js.undefined
  var client_secret: String
  var created: Double
  var currency: String
  var id: String
  var owner: Anon_Address
  var redirect: js.UndefOr[Anon_Status] = js.undefined
  var sepa_debit: js.UndefOr[Anon_Bankcode] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var three_d_secure: js.UndefOr[Anon_Authenticated] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    client_secret: String,
    created: Double,
    currency: String,
    id: String,
    owner: Anon_Address,
    card: Card = null,
    redirect: Anon_Status = null,
    sepa_debit: Anon_Bankcode = null,
    status: String = null,
    three_d_secure: Anon_Authenticated = null
  ): Source = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (sepa_debit != null) __obj.updateDynamic("sepa_debit")(sepa_debit.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (three_d_secure != null) __obj.updateDynamic("three_d_secure")(three_d_secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

