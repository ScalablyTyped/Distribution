package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentDetailsUpdate extends PaymentDetailsBase {
  var error: js.UndefOr[java.lang.String] = js.undefined
  var total: js.UndefOr[PaymentItem] = js.undefined
}

object PaymentDetailsUpdate {
  @scala.inline
  def apply(
    displayItems: js.Array[PaymentItem] = null,
    error: java.lang.String = null,
    modifiers: js.Array[PaymentDetailsModifier] = null,
    shippingOptions: js.Array[PaymentShippingOption] = null,
    total: PaymentItem = null
  ): PaymentDetailsUpdate = {
    val __obj = js.Dynamic.literal()
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsUpdate]
  }
}

