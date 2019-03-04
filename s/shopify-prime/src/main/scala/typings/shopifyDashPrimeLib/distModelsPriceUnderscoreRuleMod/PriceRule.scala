package typings
package shopifyDashPrimeLib.distModelsPriceUnderscoreRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriceRule
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The allocation method of the price rule.
    * With an allocation method of each, the discount will be applied to each of the entitled items. For example, for a price rule that take $15 off, each entitled line item in a checkout will be discounted by $15.
    * With an allocation method of across, the calculated discount amount will be applied across the entitled items.For example, for a price rule that takes $15 off, the discount will be applied across all the entitled items.
    * Currently, if target_type is shipping_line, then only each is accepted.
    */
  var allocation_method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.across | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.each
  /**
    * By default, this auto- generated property is the date and time when the price rule was created in Shopify, in ISO 8601 format.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The customer selection for the price rule.A customer selection of all means there are no restrictions
    * on who's eligible for the price rule.
    */
  var customer_selection: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.all | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.prerequisite
  /**
    * The date and time when the price rule ends.Must be after starts_at.
    */
  var ends_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of entitled collection ids. Cannot be used in combination with entitled_product_ids nor
    * entitled_variant_ids. entitled_collection_ids can only be used in conjunction with target_typeset to line_item and
    * target_selection set to entitled
    */
  var entitled_collection_ids: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * A list of shipping country ids. entitled_country_ids can only be used in conjunction with target_type set to
    * shipping_line and target_selection set to entitled.
    */
  var entitled_country_ids: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * A list of entitled product ids.Can be used in combination with entitled_variant_ids. entitled_product_ids can
    * only be used in conjunction with target_type set to line_itemif and target_selection set to entitled
    */
  var entitled_product_ids: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * A list of entitled product variant ids. Can be used in combination with entitled_product_ids.
    * entitled_variant_ids can only be used in conjunction with target_type set to line_item if and target_selection set to
    * entitled
    */
  var entitled_variant_ids: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The price rule can only be used once per customer (tracked by customer id).
    */
  var once_per_customer: scala.Boolean
  /**
    * A list of prerequisite customer saved search ids. For the price rule to be applicable,
    * the customer applying the price rule must be in the group of customers matching the customer saved searches.
    */
  var prerequisite_saved_search_ids: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Prerequisite shipping cost range.Can only be used when target_type is shipping_line.
    */
  var prerequisite_shipping_price_range: js.UndefOr[shopifyDashPrimeLib.Anon_Lessthanorequalto] = js.undefined
  /**
    * Prerequisite cart subtotal range.
    */
  var prerequisite_subtotal_range: js.UndefOr[shopifyDashPrimeLib.Anon_Greaterthanorequalto] = js.undefined
  /**
    * The date and time when the price rule starts.
    */
  var starts_at: java.lang.String
  /**
    * The target selection method of the price rule. Use all to apply the discount to all line items
    * in the checkout and use entitled to apply to selected entitlements.
    */
  var target_selection: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.all | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.entitled
  /**
    * The target type the price rule applies to.
    */
  var target_type: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.line_item | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.shipping_line
  /**
    * The title of the price rule.
    */
  var title: java.lang.String
  /**
    * The date and time when the price rule was last updated.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of times the price rule can be used, per discount code.
    */
  var usage_limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The value of the price rule. If target_type is shipping_line, then only -100 is accepted.
    * It's important to note that when discounting a resource, the value must be a negative number.
    */
  var value: java.lang.String
  /**
    * The value type of the price rule. If target_type is shipping_line then only percentage is accepted.
    */
  var value_type: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.fixed_amount | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.percentage
}

object PriceRule {
  @scala.inline
  def apply(
    allocation_method: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.across | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.each,
    customer_selection: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.all | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.prerequisite,
    once_per_customer: scala.Boolean,
    starts_at: java.lang.String,
    target_selection: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.all | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.entitled,
    target_type: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.line_item | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.shipping_line,
    title: java.lang.String,
    value: java.lang.String,
    value_type: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.fixed_amount | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.percentage,
    admin_graphql_api_id: java.lang.String = null,
    created_at: java.lang.String = null,
    ends_at: java.lang.String = null,
    entitled_collection_ids: js.Array[scala.Double] = null,
    entitled_country_ids: js.Array[scala.Double] = null,
    entitled_product_ids: js.Array[scala.Double] = null,
    entitled_variant_ids: js.Array[scala.Double] = null,
    id: scala.Int | scala.Double = null,
    prerequisite_saved_search_ids: js.Array[scala.Double] = null,
    prerequisite_shipping_price_range: shopifyDashPrimeLib.Anon_Lessthanorequalto = null,
    prerequisite_subtotal_range: shopifyDashPrimeLib.Anon_Greaterthanorequalto = null,
    updated_at: java.lang.String = null,
    usage_limit: scala.Int | scala.Double = null
  ): PriceRule = {
    val __obj = js.Dynamic.literal(allocation_method = allocation_method.asInstanceOf[js.Any], customer_selection = customer_selection.asInstanceOf[js.Any], once_per_customer = once_per_customer, starts_at = starts_at, target_selection = target_selection.asInstanceOf[js.Any], target_type = target_type.asInstanceOf[js.Any], title = title, value = value, value_type = value_type.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (ends_at != null) __obj.updateDynamic("ends_at")(ends_at)
    if (entitled_collection_ids != null) __obj.updateDynamic("entitled_collection_ids")(entitled_collection_ids)
    if (entitled_country_ids != null) __obj.updateDynamic("entitled_country_ids")(entitled_country_ids)
    if (entitled_product_ids != null) __obj.updateDynamic("entitled_product_ids")(entitled_product_ids)
    if (entitled_variant_ids != null) __obj.updateDynamic("entitled_variant_ids")(entitled_variant_ids)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (prerequisite_saved_search_ids != null) __obj.updateDynamic("prerequisite_saved_search_ids")(prerequisite_saved_search_ids)
    if (prerequisite_shipping_price_range != null) __obj.updateDynamic("prerequisite_shipping_price_range")(prerequisite_shipping_price_range)
    if (prerequisite_subtotal_range != null) __obj.updateDynamic("prerequisite_subtotal_range")(prerequisite_subtotal_range)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    if (usage_limit != null) __obj.updateDynamic("usage_limit")(usage_limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceRule]
  }
}

