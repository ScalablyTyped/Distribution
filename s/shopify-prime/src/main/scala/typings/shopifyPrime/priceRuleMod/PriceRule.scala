package typings.shopifyPrime.priceRuleMod

import typings.shopifyPrime.anon.Greaterthanorequalto
import typings.shopifyPrime.anon.Lessthanorequalto
import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.shopifyPrimeStrings.across
import typings.shopifyPrime.shopifyPrimeStrings.all
import typings.shopifyPrime.shopifyPrimeStrings.each
import typings.shopifyPrime.shopifyPrimeStrings.entitled
import typings.shopifyPrime.shopifyPrimeStrings.fixed_amount
import typings.shopifyPrime.shopifyPrimeStrings.line_item
import typings.shopifyPrime.shopifyPrimeStrings.percentage
import typings.shopifyPrime.shopifyPrimeStrings.prerequisite
import typings.shopifyPrime.shopifyPrimeStrings.shipping_line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriceRule extends ShopifyObject {
  /**
    * The allocation method of the price rule.
    * With an allocation method of each, the discount will be applied to each of the entitled items. For example, for a price rule that take $15 off, each entitled line item in a checkout will be discounted by $15.
    * With an allocation method of across, the calculated discount amount will be applied across the entitled items.For example, for a price rule that takes $15 off, the discount will be applied across all the entitled items.
    * Currently, if target_type is shipping_line, then only each is accepted.
    */
  var allocation_method: across | each = js.native
  /**
    * By default, this auto- generated property is the date and time when the price rule was created in Shopify, in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The customer selection for the price rule.A customer selection of all means there are no restrictions
    * on who's eligible for the price rule.
    */
  var customer_selection: all | prerequisite = js.native
  /**
    * The date and time when the price rule ends.Must be after starts_at.
    */
  var ends_at: js.UndefOr[String] = js.native
  /**
    * A list of entitled collection ids. Cannot be used in combination with entitled_product_ids nor
    * entitled_variant_ids. entitled_collection_ids can only be used in conjunction with target_typeset to line_item and
    * target_selection set to entitled
    */
  var entitled_collection_ids: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A list of shipping country ids. entitled_country_ids can only be used in conjunction with target_type set to
    * shipping_line and target_selection set to entitled.
    */
  var entitled_country_ids: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A list of entitled product ids.Can be used in combination with entitled_variant_ids. entitled_product_ids can
    * only be used in conjunction with target_type set to line_itemif and target_selection set to entitled
    */
  var entitled_product_ids: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A list of entitled product variant ids. Can be used in combination with entitled_product_ids.
    * entitled_variant_ids can only be used in conjunction with target_type set to line_item if and target_selection set to
    * entitled
    */
  var entitled_variant_ids: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The price rule can only be used once per customer (tracked by customer id).
    */
  var once_per_customer: Boolean = js.native
  /**
    * A list of prerequisite customer saved search ids. For the price rule to be applicable,
    * the customer applying the price rule must be in the group of customers matching the customer saved searches.
    */
  var prerequisite_saved_search_ids: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Prerequisite shipping cost range.Can only be used when target_type is shipping_line.
    */
  var prerequisite_shipping_price_range: js.UndefOr[Lessthanorequalto] = js.native
  /**
    * Prerequisite cart subtotal range.
    */
  var prerequisite_subtotal_range: js.UndefOr[Greaterthanorequalto] = js.native
  /**
    * The date and time when the price rule starts.
    */
  var starts_at: String = js.native
  /**
    * The target selection method of the price rule. Use all to apply the discount to all line items
    * in the checkout and use entitled to apply to selected entitlements.
    */
  var target_selection: all | entitled = js.native
  /**
    * The target type the price rule applies to.
    */
  var target_type: line_item | shipping_line = js.native
  /**
    * The title of the price rule.
    */
  var title: String = js.native
  /**
    * The date and time when the price rule was last updated.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * The maximum number of times the price rule can be used, per discount code.
    */
  var usage_limit: js.UndefOr[Double] = js.native
  /**
    * The value of the price rule. If target_type is shipping_line, then only -100 is accepted.
    * It's important to note that when discounting a resource, the value must be a negative number.
    */
  var value: String = js.native
  /**
    * The value type of the price rule. If target_type is shipping_line then only percentage is accepted.
    */
  var value_type: fixed_amount | percentage = js.native
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
    value_type: fixed_amount | percentage
  ): PriceRule = {
    val __obj = js.Dynamic.literal(allocation_method = allocation_method.asInstanceOf[js.Any], customer_selection = customer_selection.asInstanceOf[js.Any], once_per_customer = once_per_customer.asInstanceOf[js.Any], starts_at = starts_at.asInstanceOf[js.Any], target_selection = target_selection.asInstanceOf[js.Any], target_type = target_type.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], value_type = value_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceRule]
  }
  @scala.inline
  implicit class PriceRuleOps[Self <: PriceRule] (val x: Self) extends AnyVal {
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
    def setAllocation_method(value: across | each): Self = this.set("allocation_method", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomer_selection(value: all | prerequisite): Self = this.set("customer_selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnce_per_customer(value: Boolean): Self = this.set("once_per_customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStarts_at(value: String): Self = this.set("starts_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget_selection(value: all | entitled): Self = this.set("target_selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget_type(value: line_item | shipping_line): Self = this.set("target_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue_type(value: fixed_amount | percentage): Self = this.set("value_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setEnds_at(value: String): Self = this.set("ends_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnds_at: Self = this.set("ends_at", js.undefined)
    @scala.inline
    def setEntitled_collection_idsVarargs(value: Double*): Self = this.set("entitled_collection_ids", js.Array(value :_*))
    @scala.inline
    def setEntitled_collection_ids(value: js.Array[Double]): Self = this.set("entitled_collection_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitled_collection_ids: Self = this.set("entitled_collection_ids", js.undefined)
    @scala.inline
    def setEntitled_country_idsVarargs(value: Double*): Self = this.set("entitled_country_ids", js.Array(value :_*))
    @scala.inline
    def setEntitled_country_ids(value: js.Array[Double]): Self = this.set("entitled_country_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitled_country_ids: Self = this.set("entitled_country_ids", js.undefined)
    @scala.inline
    def setEntitled_product_idsVarargs(value: Double*): Self = this.set("entitled_product_ids", js.Array(value :_*))
    @scala.inline
    def setEntitled_product_ids(value: js.Array[Double]): Self = this.set("entitled_product_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitled_product_ids: Self = this.set("entitled_product_ids", js.undefined)
    @scala.inline
    def setEntitled_variant_idsVarargs(value: Double*): Self = this.set("entitled_variant_ids", js.Array(value :_*))
    @scala.inline
    def setEntitled_variant_ids(value: js.Array[Double]): Self = this.set("entitled_variant_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitled_variant_ids: Self = this.set("entitled_variant_ids", js.undefined)
    @scala.inline
    def setPrerequisite_saved_search_idsVarargs(value: Double*): Self = this.set("prerequisite_saved_search_ids", js.Array(value :_*))
    @scala.inline
    def setPrerequisite_saved_search_ids(value: js.Array[Double]): Self = this.set("prerequisite_saved_search_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrerequisite_saved_search_ids: Self = this.set("prerequisite_saved_search_ids", js.undefined)
    @scala.inline
    def setPrerequisite_shipping_price_range(value: Lessthanorequalto): Self = this.set("prerequisite_shipping_price_range", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrerequisite_shipping_price_range: Self = this.set("prerequisite_shipping_price_range", js.undefined)
    @scala.inline
    def setPrerequisite_subtotal_range(value: Greaterthanorequalto): Self = this.set("prerequisite_subtotal_range", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrerequisite_subtotal_range: Self = this.set("prerequisite_subtotal_range", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    @scala.inline
    def setUsage_limit(value: Double): Self = this.set("usage_limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage_limit: Self = this.set("usage_limit", js.undefined)
  }
  
}

