package typings.shopifyPrime.discountMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.shopifyPrimeStrings.applies_to_resource
import typings.shopifyPrime.shopifyPrimeStrings.custom_collection
import typings.shopifyPrime.shopifyPrimeStrings.fixed_amount
import typings.shopifyPrime.shopifyPrimeStrings.percentage
import typings.shopifyPrime.shopifyPrimeStrings.shipping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Discount extends ShopifyObject {
  /**
    * When a discount applies to a product or collection resource, applies_once determines whether the discount should
    * be applied once per order, or to every applicable item in the cart.
    */
  var applies_once: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether the discount should be applied once, or any number of times per customer.
    */
  var applies_once_per_customer: js.UndefOr[Boolean] = js.native
  /**
    * The id of a collection or product that this discount code is restricted to. Leave blank for a store-wide discount.
    * If applies_to_id is set, then the applies_to_resource property is also mandatory.
    */
  var applies_to_id: js.UndefOr[Double] = js.native
  /**
    * The discount code can be set to apply to only a product, smart_collection, customersavedsearch or custom_collection.
    * If applies_to_resource is set, then applies_to_id should also be set.
    */
  var applies_to_resource: js.UndefOr[
    typings.shopifyPrime.shopifyPrimeStrings.applies_to_resource | custom_collection | String
  ] = js.native
  /**
    * The case-insensitive discount code that customers use at checkout. Required when creating a discount.
    * Maximum length of 255 characters.
    */
  var code: String = js.native
  /**
    * Specify how the discount's value will be applied to the order. Valid values are:
    *
    * fixed_amount: The value as a unit of the store's currency will be discounted. E.g. If value is 30 and store's
    * currency is USD, then $30 is deducted.
    *
    * percentage: The percent amount to discount the order, e.g. 15% off.
    *
    * shipping: Applies a free shipping discount on orders that have a shipping rate less than or equal to the amount
    * specified in the value property. For example, free shipping for any shipping rate that is less than or equal to $70.
    */
  var discount_type: fixed_amount | percentage | shipping | String = js.native
  /**
    * The date when the discount code becomes disabled in ISO 8601 format.
    */
  var ends_at: js.UndefOr[String] = js.native
  /**
    * The minimum value an order must reach for the discount to be allowed during checkout.
    */
  var minimum_order_amount: js.UndefOr[String] = js.native
  /**
    * The date the discount becomes valid for use during checkout in ISO 8601 format.
    */
  var starts_at: js.UndefOr[String] = js.native
  /**
    * The status of the discount code. Valid values are enabled, disabled, or depleted.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Returns a count of successful checkouts where the discount code has been used. Cannot exceed the usage_limit property.
    */
  var times_used: js.UndefOr[Double] = js.native
  /**
    * The number of times this discount code can be redeemed. It can be redeemed by one or many customers; the usage_limit is a
    * store-wide absolute value. Leave blank for unlimited uses.
    */
  var usage_limit: js.UndefOr[Double] = js.native
  /**
    * The value of the discount. Required when creating a percentage-based or fixed-amount discount. See the discount_type
    * property to learn more about how value is interpreted.
    */
  var value: js.UndefOr[String] = js.native
}

object Discount {
  @scala.inline
  def apply(code: String, discount_type: fixed_amount | percentage | shipping | String): Discount = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], discount_type = discount_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discount]
  }
  @scala.inline
  implicit class DiscountOps[Self <: Discount] (val x: Self) extends AnyVal {
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
    def setDiscount_type(value: fixed_amount | percentage | shipping | String): Self = this.set("discount_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplies_once(value: Boolean): Self = this.set("applies_once", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplies_once: Self = this.set("applies_once", js.undefined)
    @scala.inline
    def setApplies_once_per_customer(value: Boolean): Self = this.set("applies_once_per_customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplies_once_per_customer: Self = this.set("applies_once_per_customer", js.undefined)
    @scala.inline
    def setApplies_to_id(value: Double): Self = this.set("applies_to_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplies_to_id: Self = this.set("applies_to_id", js.undefined)
    @scala.inline
    def setApplies_to_resource(value: applies_to_resource | custom_collection | String): Self = this.set("applies_to_resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplies_to_resource: Self = this.set("applies_to_resource", js.undefined)
    @scala.inline
    def setEnds_at(value: String): Self = this.set("ends_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnds_at: Self = this.set("ends_at", js.undefined)
    @scala.inline
    def setMinimum_order_amount(value: String): Self = this.set("minimum_order_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum_order_amount: Self = this.set("minimum_order_amount", js.undefined)
    @scala.inline
    def setStarts_at(value: String): Self = this.set("starts_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarts_at: Self = this.set("starts_at", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTimes_used(value: Double): Self = this.set("times_used", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimes_used: Self = this.set("times_used", js.undefined)
    @scala.inline
    def setUsage_limit(value: Double): Self = this.set("usage_limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage_limit: Self = this.set("usage_limit", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

