package typings.stripeDashV3

import typings.stripeDashV3.stripe.OwnerAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: OwnerAddress | Null
  var email: String | Null
  var name: String | Null
  var phone: String | Null
  var verified_address: String | Null
  var verified_email: String | Null
  var verified_name: String | Null
  var verified_phone: String | Null
}

object Anon_Address {
  @scala.inline
  def apply(
    address: OwnerAddress = null,
    email: String = null,
    name: String = null,
    phone: String = null,
    verified_address: String = null,
    verified_email: String = null,
    verified_name: String = null,
    verified_phone: String = null
  ): Anon_Address = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (verified_address != null) __obj.updateDynamic("verified_address")(verified_address.asInstanceOf[js.Any])
    if (verified_email != null) __obj.updateDynamic("verified_email")(verified_email.asInstanceOf[js.Any])
    if (verified_name != null) __obj.updateDynamic("verified_name")(verified_name.asInstanceOf[js.Any])
    if (verified_phone != null) __obj.updateDynamic("verified_phone")(verified_phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Address]
  }
}

