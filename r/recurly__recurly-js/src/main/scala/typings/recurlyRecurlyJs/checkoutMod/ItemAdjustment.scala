package typings.recurlyRecurlyJs.checkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemAdjustment extends Adjustment {
  var currency: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemCode: String
  var quantity: Double
}

object ItemAdjustment {
  @scala.inline
  def apply(itemCode: String, quantity: Double, currency: String = null, id: String = null): ItemAdjustment = {
    val __obj = js.Dynamic.literal(itemCode = itemCode.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAdjustment]
  }
}

