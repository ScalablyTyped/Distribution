package typings.recurlyRecurlyJs.checkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.recurlyRecurlyJs.checkoutMod.ItemAdjustment
  - typings.recurlyRecurlyJs.checkoutMod.NonItemAdjustment
*/
trait Adjustment extends js.Object

object Adjustment {
  @scala.inline
  def ItemAdjustment(itemCode: String, quantity: Double, currency: String = null, id: String = null): Adjustment = {
    val __obj = js.Dynamic.literal(itemCode = itemCode.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adjustment]
  }
  @scala.inline
  def NonItemAdjustment(
    amount: Double,
    quantity: Double,
    taxCode: String,
    taxExempt: Boolean,
    currency: String = null,
    id: String = null
  ): Adjustment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], taxCode = taxCode.asInstanceOf[js.Any], taxExempt = taxExempt.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adjustment]
  }
}

