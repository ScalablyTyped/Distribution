package typings.shopifyPrime.discountCodeMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.shopifyPrimeStrings.fixed_amount
import typings.shopifyPrime.shopifyPrimeStrings.percentage
import typings.shopifyPrime.shopifyPrimeStrings.shipping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscountCode extends ShopifyObject {
  /**
    *  The amount of the discount.
    */
  var amount: js.UndefOr[String] = js.native
  /**
    *  The discount code.
    */
  var code: js.UndefOr[String] = js.native
  /**
    *  The type of discount. Known values are 'percentage', 'shipping', 'fixed_amount' and 'none'.
    */
  var `type`: js.UndefOr[percentage | shipping | fixed_amount | String] = js.native
}

object DiscountCode {
  @scala.inline
  def apply(): DiscountCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscountCode]
  }
  @scala.inline
  implicit class DiscountCodeOps[Self <: DiscountCode] (val x: Self) extends AnyVal {
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setType(value: percentage | shipping | fixed_amount | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

