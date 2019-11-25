package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentDetailsBase extends js.Object {
  var displayItems: js.UndefOr[js.Array[PaymentItem]] = js.undefined
  var modifiers: js.UndefOr[js.Array[PaymentDetailsModifier]] = js.undefined
  var shippingOptions: js.UndefOr[js.Array[PaymentShippingOption]] = js.undefined
}

object PaymentDetailsBase {
  @scala.inline
  def apply(
    displayItems: js.Array[PaymentItem] = null,
    modifiers: js.Array[PaymentDetailsModifier] = null,
    shippingOptions: js.Array[PaymentShippingOption] = null
  ): PaymentDetailsBase = {
    val __obj = js.Dynamic.literal()
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsBase]
  }
}

