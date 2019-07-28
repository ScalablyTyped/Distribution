package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentDetailsInit extends PaymentDetailsBase {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var total: PaymentItem
}

object PaymentDetailsInit {
  @scala.inline
  def apply(
    total: PaymentItem,
    displayItems: js.Array[PaymentItem] = null,
    id: java.lang.String = null,
    modifiers: js.Array[PaymentDetailsModifier] = null,
    shippingOptions: js.Array[PaymentShippingOption] = null
  ): PaymentDetailsInit = {
    val __obj = js.Dynamic.literal(total = total)
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions)
    __obj.asInstanceOf[PaymentDetailsInit]
  }
}

