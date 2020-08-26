package typings.shopifyPrime.priceRuleDiscountCodeMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriceRuleDiscountCode extends ShopifyObject {
  /**
    * The case-insensitive discount code that customers use at checkout. Required
    * when creating a discount. Maximum length of 255 characters.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * By default, this auto-generated property is the date and time when the price rule was
    * created in Shopify, in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the price rule associated to the discount code.
    */
  var price_rule_id: js.UndefOr[Double] = js.native
  /**
    * The date and time the discount code was updated.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * The discount code usage count. Note that the usage limit is set on the price rule.
    */
  var usage_count: js.UndefOr[Double] = js.native
}

object PriceRuleDiscountCode {
  @scala.inline
  def apply(): PriceRuleDiscountCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriceRuleDiscountCode]
  }
  @scala.inline
  implicit class PriceRuleDiscountCodeOps[Self <: PriceRuleDiscountCode] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setPrice_rule_id(value: Double): Self = this.set("price_rule_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice_rule_id: Self = this.set("price_rule_id", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    @scala.inline
    def setUsage_count(value: Double): Self = this.set("usage_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage_count: Self = this.set("usage_count", js.undefined)
  }
  
}

