package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingDetails extends js.Object {
  var address: js.UndefOr[BillingDetailsAddress | scala.Null] = js.undefined
  var email: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var phone: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object BillingDetails {
  @scala.inline
  def apply(
    address: BillingDetailsAddress = null,
    email: java.lang.String = null,
    name: java.lang.String = null,
    phone: java.lang.String = null
  ): BillingDetails = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    __obj.asInstanceOf[BillingDetails]
  }
}

