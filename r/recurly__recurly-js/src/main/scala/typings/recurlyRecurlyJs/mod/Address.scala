package typings.recurlyRecurlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address1: js.UndefOr[String] = js.undefined
  var address2: js.UndefOr[String] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var first_name: String
  var last_name: String
  var phone: js.UndefOr[String] = js.undefined
  var postal_code: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var vat_number: js.UndefOr[String] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    first_name: String,
    last_name: String,
    address1: String = null,
    address2: String = null,
    city: String = null,
    country: String = null,
    phone: String = null,
    postal_code: String = null,
    state: String = null,
    vat_number: String = null
  ): Address = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
    if (address1 != null) __obj.updateDynamic("address1")(address1.asInstanceOf[js.Any])
    if (address2 != null) __obj.updateDynamic("address2")(address2.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (vat_number != null) __obj.updateDynamic("vat_number")(vat_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

