package typings.recurlyRecurlyJs.bankAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingInfo extends js.Object {
  var account_number: String
  var account_number_confirmation: String
  var account_type: String
  var address1: js.UndefOr[String] = js.undefined
  var address2: js.UndefOr[String] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var iban: js.UndefOr[String] = js.undefined
  var name_on_account: String
  var postal_code: js.UndefOr[String] = js.undefined
  var routing_number: String
  var state: js.UndefOr[String] = js.undefined
  var vat_number: js.UndefOr[String] = js.undefined
}

object BillingInfo {
  @scala.inline
  def apply(
    account_number: String,
    account_number_confirmation: String,
    account_type: String,
    name_on_account: String,
    routing_number: String,
    address1: String = null,
    address2: String = null,
    city: String = null,
    country: String = null,
    iban: String = null,
    postal_code: String = null,
    state: String = null,
    vat_number: String = null
  ): BillingInfo = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], account_type = account_type.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any])
    if (address1 != null) __obj.updateDynamic("address1")(address1.asInstanceOf[js.Any])
    if (address2 != null) __obj.updateDynamic("address2")(address2.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (iban != null) __obj.updateDynamic("iban")(iban.asInstanceOf[js.Any])
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (vat_number != null) __obj.updateDynamic("vat_number")(vat_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingInfo]
  }
}

