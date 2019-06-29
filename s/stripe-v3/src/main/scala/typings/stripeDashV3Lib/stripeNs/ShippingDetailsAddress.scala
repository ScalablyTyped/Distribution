package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingDetailsAddress extends js.Object {
  var city: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var line1: java.lang.String
  var line2: js.UndefOr[java.lang.String] = js.undefined
  var postal_code: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object ShippingDetailsAddress {
  @scala.inline
  def apply(
    line1: java.lang.String,
    city: java.lang.String = null,
    country: java.lang.String = null,
    line2: java.lang.String = null,
    postal_code: java.lang.String = null,
    state: java.lang.String = null
  ): ShippingDetailsAddress = {
    val __obj = js.Dynamic.literal(line1 = line1)
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (line2 != null) __obj.updateDynamic("line2")(line2)
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ShippingDetailsAddress]
  }
}

