package typings.stripeDashV2.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeBankTokenParams extends js.Object {
  var account_holder_name: String
  var account_holder_type: String
  var account_number: Double | String
  var country: String
  var currency: String
  var routing_number: js.UndefOr[Double | String] = js.undefined
}

object StripeBankTokenParams {
  @scala.inline
  def apply(
    account_holder_name: String,
    account_holder_type: String,
    account_number: Double | String,
    country: String,
    currency: String,
    routing_number: Double | String = null
  ): StripeBankTokenParams = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name, account_holder_type = account_holder_type, account_number = account_number.asInstanceOf[js.Any], country = country, currency = currency)
    if (routing_number != null) __obj.updateDynamic("routing_number")(routing_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeBankTokenParams]
  }
}

