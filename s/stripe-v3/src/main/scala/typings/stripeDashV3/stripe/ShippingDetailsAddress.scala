package typings.stripeDashV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingDetailsAddress extends js.Object {
  var city: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var line1: String
  var line2: js.UndefOr[String] = js.undefined
  var postal_code: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object ShippingDetailsAddress {
  @scala.inline
  def apply(
    line1: String,
    city: String = null,
    country: String = null,
    line2: String = null,
    postal_code: String = null,
    state: String = null
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

