package typings
package stripeDashV3Lib.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDetails extends js.Object {
  var displayItems: js.UndefOr[js.Array[DisplayItem]] = js.undefined
  var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.undefined
  var status: stripeDashV3Lib.stripeDashV3LibStrings.success | stripeDashV3Lib.stripeDashV3LibStrings.fail | stripeDashV3Lib.stripeDashV3LibStrings.invalid_shipping_address
  var total: js.UndefOr[DisplayItem] = js.undefined
}

object UpdateDetails {
  @scala.inline
  def apply(
    status: stripeDashV3Lib.stripeDashV3LibStrings.success | stripeDashV3Lib.stripeDashV3LibStrings.fail | stripeDashV3Lib.stripeDashV3LibStrings.invalid_shipping_address,
    displayItems: js.Array[DisplayItem] = null,
    shippingOptions: js.Array[ShippingOption] = null,
    total: DisplayItem = null
  ): UpdateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems)
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions)
    if (total != null) __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[UpdateDetails]
  }
}

