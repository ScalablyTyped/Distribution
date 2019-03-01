package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeBankTokenParams extends js.Object {
  var account_holder_name: java.lang.String
  var account_holder_type: java.lang.String
  var account_number: scala.Double | java.lang.String
  var country: java.lang.String
  var currency: java.lang.String
  var routing_number: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object StripeBankTokenParams {
  @scala.inline
  def apply(
    account_holder_name: java.lang.String,
    account_holder_type: java.lang.String,
    account_number: scala.Double | java.lang.String,
    country: java.lang.String,
    currency: java.lang.String,
    routing_number: scala.Double | java.lang.String = null
  ): StripeBankTokenParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("account_holder_name")(account_holder_name)
    __obj.updateDynamic("account_holder_type")(account_holder_type)
    __obj.updateDynamic("account_number")(account_number.asInstanceOf[js.Any])
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("currency")(currency)
    if (routing_number != null) __obj.updateDynamic("routing_number")(routing_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeBankTokenParams]
  }
}

