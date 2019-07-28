package typings.shopifyDashPrime.distModelsAppliedUnderscoreDiscountMod

import typings.shopifyDashPrime.shopifyDashPrimeStrings.fixed_amount
import typings.shopifyDashPrime.shopifyDashPrimeStrings.percentage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppliedDiscount extends js.Object {
  /**
    * The applied amount of the discount, based on the setting of value_type.
    * When ValueType is set to fixed_amount discount amount = quantity * value
    * When ValueType is set to percentage discount amount = floor(price * quantity * value) / 100
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * Reason for the discount.
    */
  var description: String
  /**
    * Title of the discount.
    */
  var title: String
  /**
    * he value of the discount. If the type of the discount is fixed_amount, then this is a fixed dollar amount. If the type is percentage, then this is the percentage.
    */
  var value: String
  /**
    * The type of discount. Known values are "percentage" and "fixed_amount".
    */
  var value_type: percentage | fixed_amount
}

object AppliedDiscount {
  @scala.inline
  def apply(
    description: String,
    title: String,
    value: String,
    value_type: percentage | fixed_amount,
    amount: Int | Double = null
  ): AppliedDiscount = {
    val __obj = js.Dynamic.literal(description = description, title = title, value = value, value_type = value_type.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppliedDiscount]
  }
}

