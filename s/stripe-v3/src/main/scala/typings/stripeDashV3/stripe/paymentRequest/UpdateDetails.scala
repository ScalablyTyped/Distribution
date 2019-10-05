package typings.stripeDashV3.stripe.paymentRequest

import typings.stripeDashV3.stripeDashV3Strings.fail
import typings.stripeDashV3.stripeDashV3Strings.invalid_shipping_address
import typings.stripeDashV3.stripeDashV3Strings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDetails extends js.Object {
  var displayItems: js.UndefOr[js.Array[DisplayItem]] = js.undefined
  var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.undefined
  var status: success | fail | invalid_shipping_address
  var total: js.UndefOr[DisplayItem] = js.undefined
}

object UpdateDetails {
  @scala.inline
  def apply(
    status: success | fail | invalid_shipping_address,
    displayItems: js.Array[DisplayItem] = null,
    shippingOptions: js.Array[ShippingOption] = null,
    total: DisplayItem = null
  ): UpdateDetails = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems)
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions)
    if (total != null) __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[UpdateDetails]
  }
}

