package typings.shopifyDashPrime.distModelsPriceUnderscoreRuleMod

import typings.shopifyDashPrime.Anon_Greaterthanorequalto
import typings.shopifyDashPrime.Anon_Lessthanorequalto
import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import typings.shopifyDashPrime.shopifyDashPrimeStrings.across
import typings.shopifyDashPrime.shopifyDashPrimeStrings.all
import typings.shopifyDashPrime.shopifyDashPrimeStrings.each
import typings.shopifyDashPrime.shopifyDashPrimeStrings.entitled
import typings.shopifyDashPrime.shopifyDashPrimeStrings.fixed_amount
import typings.shopifyDashPrime.shopifyDashPrimeStrings.line_item
import typings.shopifyDashPrime.shopifyDashPrimeStrings.percentage
import typings.shopifyDashPrime.shopifyDashPrimeStrings.prerequisite
import typings.shopifyDashPrime.shopifyDashPrimeStrings.shipping_line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriceRule extends ShopifyObject {
  /**
    * The allocation method of the price rule.
    * With an allocation method of each, the discount will be applied to each of the entitled items. For example, for a price rule that take $15 off, each entitled line item in a checkout will be discounted by $15.
    * With an allocation method of across, the calculated discount amount will be applied across the entitled items.For example, for a price rule that takes $15 off, the discount will be applied across all the entitled items.
    * Currently, if target_type is shipping_line, then only each is accepted.
    */
  var allocation_method: across | each
  /**
    * By default, this auto- generated property is the date and time when the price rule was created in Shopify, in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * The customer selection for the price rule.A customer selection of all means there are no restrictions
    * on who's eligible for the price rule.
    */
  var customer_selection: all | prerequisite
  /**
    * The date and time when the price rule ends.Must be after starts_at.
    */
  var ends_at: js.UndefOr[String] = js.undefined
  /**
    * A list of entitled collection ids. Cannot be used in combination with entitled_product_ids nor
    * entitled_variant_ids. entitled_collection_ids can only be used in conjunction with target_typeset to line_item and
    * target_selection set to entitled
    */
  var entitled_collection_ids: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * A list of shipping country ids. entitled_country_ids can only be used in conjunction with target_type set to
    * shipping_line and target_selection set to entitled.
    */
  var entitled_country_ids: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * A list of entitled product ids.Can be used in combination with entitled_variant_ids. entitled_product_ids can
    * only be used in conjunction with target_type set to line_itemif and target_selection set to entitled
    */
  var entitled_product_ids: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * A list of entitled product variant ids. Can be used in combination with entitled_product_ids.
    * entitled_variant_ids can only be used in conjunction with target_type set to line_item if and target_selection set to
    * entitled
    */
  var entitled_variant_ids: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The price rule can only be used once per customer (tracked by customer id).
    */
  var once_per_customer: Boolean
  /**
    * A list of prerequisite customer saved search ids. For the price rule to be applicable,
    * the customer applying the price rule must be in the group of customers matching the customer saved searches.
    */
  var prerequisite_saved_search_ids: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Prerequisite shipping cost range.Can only be used when target_type is shipping_line.
    */
  var prerequisite_shipping_price_range: js.UndefOr[Anon_Lessthanorequalto] = js.undefined
  /**
    * Prerequisite cart subtotal range.
    */
  var prerequisite_subtotal_range: js.UndefOr[Anon_Greaterthanorequalto] = js.undefined
  /**
    * The date and time when the price rule starts.
    */
  var starts_at: String
  /**
    * The target selection method of the price rule. Use all to apply the discount to all line items
    * in the checkout and use entitled to apply to selected entitlements.
    */
  var target_selection: all | entitled
  /**
    * The target type the price rule applies to.
    */
  var target_type: line_item | shipping_line
  /**
    * The title of the price rule.
    */
  var title: String
  /**
    * The date and time when the price rule was last updated.
    */
  var updated_at: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of times the price rule can be used, per discount code.
    */
  var usage_limit: js.UndefOr[Double] = js.undefined
  /**
    * The value of the price rule. If target_type is shipping_line, then only -100 is accepted.
    * It's important to note that when discounting a resource, the value must be a negative number.
    */
  var value: String
  /**
    * The value type of the price rule. If target_type is shipping_line then only percentage is accepted.
    */
  var value_type: fixed_amount | percentage
}

object PriceRule {
  @scala.inline
  def apply(
    allocation_method: across | each,
    customer_selection: all | prerequisite,
    once_per_customer: Boolean,
    starts_at: String,
    target_selection: all | entitled,
    target_type: line_item | shipping_line,
    title: String,
    value: String,
    value_type: fixed_amount | percentage,
    admin_graphql_api_id: String = null,
    created_at: String = null,
    ends_at: String = null,
    entitled_collection_ids: js.Array[Double] = null,
    entitled_country_ids: js.Array[Double] = null,
    entitled_product_ids: js.Array[Double] = null,
    entitled_variant_ids: js.Array[Double] = null,
    id: Int | Double = null,
    prerequisite_saved_search_ids: js.Array[Double] = null,
    prerequisite_shipping_price_range: Anon_Lessthanorequalto = null,
    prerequisite_subtotal_range: Anon_Greaterthanorequalto = null,
    updated_at: String = null,
    usage_limit: Int | Double = null
  ): PriceRule = {
    val __obj = js.Dynamic.literal(allocation_method = allocation_method.asInstanceOf[js.Any], customer_selection = customer_selection.asInstanceOf[js.Any], once_per_customer = once_per_customer.asInstanceOf[js.Any], starts_at = starts_at.asInstanceOf[js.Any], target_selection = target_selection.asInstanceOf[js.Any], target_type = target_type.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], value_type = value_type.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (ends_at != null) __obj.updateDynamic("ends_at")(ends_at.asInstanceOf[js.Any])
    if (entitled_collection_ids != null) __obj.updateDynamic("entitled_collection_ids")(entitled_collection_ids.asInstanceOf[js.Any])
    if (entitled_country_ids != null) __obj.updateDynamic("entitled_country_ids")(entitled_country_ids.asInstanceOf[js.Any])
    if (entitled_product_ids != null) __obj.updateDynamic("entitled_product_ids")(entitled_product_ids.asInstanceOf[js.Any])
    if (entitled_variant_ids != null) __obj.updateDynamic("entitled_variant_ids")(entitled_variant_ids.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (prerequisite_saved_search_ids != null) __obj.updateDynamic("prerequisite_saved_search_ids")(prerequisite_saved_search_ids.asInstanceOf[js.Any])
    if (prerequisite_shipping_price_range != null) __obj.updateDynamic("prerequisite_shipping_price_range")(prerequisite_shipping_price_range.asInstanceOf[js.Any])
    if (prerequisite_subtotal_range != null) __obj.updateDynamic("prerequisite_subtotal_range")(prerequisite_subtotal_range.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (usage_limit != null) __obj.updateDynamic("usage_limit")(usage_limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceRule]
  }
}

