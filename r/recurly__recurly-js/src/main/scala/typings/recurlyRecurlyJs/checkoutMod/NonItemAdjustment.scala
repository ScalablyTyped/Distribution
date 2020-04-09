package typings.recurlyRecurlyJs.checkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonItemAdjustment extends Adjustment {
  var amount: Double
  var currency: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var quantity: Double
  var taxCode: String
  var taxExempt: Boolean
}

object NonItemAdjustment {
  @scala.inline
  def apply(
    amount: Double,
    quantity: Double,
    taxCode: String,
    taxExempt: Boolean,
    currency: String = null,
    id: String = null
  ): NonItemAdjustment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], taxCode = taxCode.asInstanceOf[js.Any], taxExempt = taxExempt.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonItemAdjustment]
  }
}

