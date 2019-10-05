package typings.stripeDashV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnerInfo extends js.Object {
  var address: js.UndefOr[OwnerAddress] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
}

object OwnerInfo {
  @scala.inline
  def apply(address: OwnerAddress = null, email: String = null, name: String = null, phone: String = null): OwnerInfo = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    __obj.asInstanceOf[OwnerInfo]
  }
}

