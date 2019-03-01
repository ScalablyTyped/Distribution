package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: java.lang.String | scala.Null
  var email: java.lang.String | scala.Null
  var name: java.lang.String | scala.Null
  var phone: java.lang.String | scala.Null
  var verified_address: java.lang.String | scala.Null
  var verified_email: java.lang.String | scala.Null
  var verified_name: java.lang.String | scala.Null
  var verified_phone: java.lang.String | scala.Null
}

object Anon_Address {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    email: java.lang.String = null,
    name: java.lang.String = null,
    phone: java.lang.String = null,
    verified_address: java.lang.String = null,
    verified_email: java.lang.String = null,
    verified_name: java.lang.String = null,
    verified_phone: java.lang.String = null
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

