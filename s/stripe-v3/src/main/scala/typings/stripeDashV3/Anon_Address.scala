package typings.stripeDashV3

import typings.stripeDashV3.stripeNs.OwnerAddress
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
    if (address != null) __obj.updateDynamic("address")(address)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (verified_address != null) __obj.updateDynamic("verified_address")(verified_address)
    if (verified_email != null) __obj.updateDynamic("verified_email")(verified_email)
    if (verified_name != null) __obj.updateDynamic("verified_name")(verified_name)
    if (verified_phone != null) __obj.updateDynamic("verified_phone")(verified_phone)
    __obj.asInstanceOf[Anon_Address]
  }
}

