package typings.shopifyDashPrime.distModelsDiscountMod

import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import typings.shopifyDashPrime.shopifyDashPrimeStrings.applies_to_resource
import typings.shopifyDashPrime.shopifyDashPrimeStrings.custom_collection
import typings.shopifyDashPrime.shopifyDashPrimeStrings.fixed_amount
import typings.shopifyDashPrime.shopifyDashPrimeStrings.percentage
import typings.shopifyDashPrime.shopifyDashPrimeStrings.shipping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Discount extends ShopifyObject {
  /**
    * When a discount applies to a product or collection resource, applies_once determines whether the discount should
    * be applied once per order, or to every applicable item in the cart.
    */
  var applies_once: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether the discount should be applied once, or any number of times per customer.
    */
  var applies_once_per_customer: js.UndefOr[Boolean] = js.undefined
  /**
    * The id of a collection or product that this discount code is restricted to. Leave blank for a store-wide discount.
    * If applies_to_id is set, then the applies_to_resource property is also mandatory.
    */
  var applies_to_id: js.UndefOr[Double] = js.undefined
  /**
    * The discount code can be set to apply to only a product, smart_collection, customersavedsearch or custom_collection.
    * If applies_to_resource is set, then applies_to_id should also be set.
    */
  var applies_to_resource: js.UndefOr[
    typings.shopifyDashPrime.shopifyDashPrimeStrings.applies_to_resource | custom_collection | String
  ] = js.undefined
  /**
    * The case-insensitive discount code that customers use at checkout. Required when creating a discount.
    * Maximum length of 255 characters.
    */
  var code: String
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
  var discount_type: fixed_amount | percentage | shipping | String
  /**
    * The date when the discount code becomes disabled in ISO 8601 format.
    */
  var ends_at: js.UndefOr[String] = js.undefined
  /**
    * The minimum value an order must reach for the discount to be allowed during checkout.
    */
  var minimum_order_amount: js.UndefOr[String] = js.undefined
  /**
    * The date the discount becomes valid for use during checkout in ISO 8601 format.
    */
  var starts_at: js.UndefOr[String] = js.undefined
  /**
    * The status of the discount code. Valid values are enabled, disabled, or depleted.
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * Returns a count of successful checkouts where the discount code has been used. Cannot exceed the usage_limit property.
    */
  var times_used: js.UndefOr[Double] = js.undefined
  /**
    * The number of times this discount code can be redeemed. It can be redeemed by one or many customers; the usage_limit is a
    * store-wide absolute value. Leave blank for unlimited uses.
    */
  var usage_limit: js.UndefOr[Double] = js.undefined
  /**
    * The value of the discount. Required when creating a percentage-based or fixed-amount discount. See the discount_type
    * property to learn more about how value is interpreted.
    */
  var value: js.UndefOr[String] = js.undefined
}

object Discount {
  @scala.inline
  def apply(
    code: String,
    discount_type: fixed_amount | percentage | shipping | String,
    admin_graphql_api_id: String = null,
    applies_once: js.UndefOr[Boolean] = js.undefined,
    applies_once_per_customer: js.UndefOr[Boolean] = js.undefined,
    applies_to_id: Int | Double = null,
    applies_to_resource: applies_to_resource | custom_collection | String = null,
    ends_at: String = null,
    id: Int | Double = null,
    minimum_order_amount: String = null,
    starts_at: String = null,
    status: String = null,
    times_used: Int | Double = null,
    usage_limit: Int | Double = null,
    value: String = null
  ): Discount = {
    val __obj = js.Dynamic.literal(code = code, discount_type = discount_type.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (!js.isUndefined(applies_once)) __obj.updateDynamic("applies_once")(applies_once)
    if (!js.isUndefined(applies_once_per_customer)) __obj.updateDynamic("applies_once_per_customer")(applies_once_per_customer)
    if (applies_to_id != null) __obj.updateDynamic("applies_to_id")(applies_to_id.asInstanceOf[js.Any])
    if (applies_to_resource != null) __obj.updateDynamic("applies_to_resource")(applies_to_resource.asInstanceOf[js.Any])
    if (ends_at != null) __obj.updateDynamic("ends_at")(ends_at)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (minimum_order_amount != null) __obj.updateDynamic("minimum_order_amount")(minimum_order_amount)
    if (starts_at != null) __obj.updateDynamic("starts_at")(starts_at)
    if (status != null) __obj.updateDynamic("status")(status)
    if (times_used != null) __obj.updateDynamic("times_used")(times_used.asInstanceOf[js.Any])
    if (usage_limit != null) __obj.updateDynamic("usage_limit")(usage_limit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Discount]
  }
}

