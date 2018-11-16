package typings
package shopifyDashPrimeLib.distModelsDiscountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Discount
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
       * When a discount applies to a product or collection resource, applies_once determines whether the discount should
       * be applied once per order, or to every applicable item in the cart.
       */
  var applies_once: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Determines whether the discount should be applied once, or any number of times per customer.
       */
  var applies_once_per_customer: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The id of a collection or product that this discount code is restricted to. Leave blank for a store-wide discount.
       * If applies_to_id is set, then the applies_to_resource property is also mandatory.
       */
  var applies_to_id: js.UndefOr[scala.Double] = js.undefined
  /**
       * The discount code can be set to apply to only a product, smart_collection, customersavedsearch or custom_collection.
       * If applies_to_resource is set, then applies_to_id should also be set.
       */
  var applies_to_resource: js.UndefOr[
    shopifyDashPrimeLib.shopifyDashPrimeLibStrings.applies_to_resource | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.custom_collection | java.lang.String
  ] = js.undefined
  /**
       * The case-insensitive discount code that customers use at checkout. Required when creating a discount.
       * Maximum length of 255 characters.
       */
  var code: java.lang.String
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
  var discount_type: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.fixed_amount | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.percentage | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.shipping | java.lang.String
  /**
       * The date when the discount code becomes disabled in ISO 8601 format.
       */
  var ends_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The minimum value an order must reach for the discount to be allowed during checkout.
       */
  var minimum_order_amount: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The date the discount becomes valid for use during checkout in ISO 8601 format.
       */
  var starts_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The status of the discount code. Valid values are enabled, disabled, or depleted.
       */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Returns a count of successful checkouts where the discount code has been used. Cannot exceed the usage_limit property.
       */
  var times_used: js.UndefOr[scala.Double] = js.undefined
  /**
       * The number of times this discount code can be redeemed. It can be redeemed by one or many customers; the usage_limit is a
       * store-wide absolute value. Leave blank for unlimited uses.
       */
  var usage_limit: js.UndefOr[scala.Double] = js.undefined
  /**
       * The value of the discount. Required when creating a percentage-based or fixed-amount discount. See the discount_type
       * property to learn more about how value is interpreted.
       */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

