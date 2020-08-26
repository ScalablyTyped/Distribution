package typings.shopifyPrime.appliedDiscountMod

import typings.shopifyPrime.shopifyPrimeStrings.fixed_amount
import typings.shopifyPrime.shopifyPrimeStrings.percentage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppliedDiscount extends js.Object {
  /**
    * The applied amount of the discount, based on the setting of value_type.
    * When ValueType is set to fixed_amount discount amount = quantity * value
    * When ValueType is set to percentage discount amount = floor(price * quantity * value) / 100
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * Reason for the discount.
    */
  var description: String = js.native
  /**
    * Title of the discount.
    */
  var title: String = js.native
  /**
    * he value of the discount. If the type of the discount is fixed_amount, then this is a fixed dollar amount. If the type is percentage, then this is the percentage.
    */
  var value: String = js.native
  /**
    * The type of discount. Known values are "percentage" and "fixed_amount".
    */
  var value_type: percentage | fixed_amount = js.native
}

object AppliedDiscount {
  @scala.inline
  def apply(description: String, title: String, value: String, value_type: percentage | fixed_amount): AppliedDiscount = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], value_type = value_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppliedDiscount]
  }
  @scala.inline
  implicit class AppliedDiscountOps[Self <: AppliedDiscount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue_type(value: percentage | fixed_amount): Self = this.set("value_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
  }
  
}

