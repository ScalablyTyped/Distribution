package typings.shopifyPrime.priceRuleDiscountCodeMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriceRuleDiscountCode extends ShopifyObject {
  /**
    * The case-insensitive discount code that customers use at checkout. Required
    * when creating a discount. Maximum length of 255 characters.
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * By default, this auto-generated property is the date and time when the price rule was
    * created in Shopify, in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * The unique identifier for the price rule associated to the discount code.
    */
  var price_rule_id: js.UndefOr[Double] = js.undefined
  /**
    * The date and time the discount code was updated.
    */
  var updated_at: js.UndefOr[String] = js.undefined
  /**
    * The discount code usage count. Note that the usage limit is set on the price rule.
    */
  var usage_count: js.UndefOr[Double] = js.undefined
}

object PriceRuleDiscountCode {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    code: String = null,
    created_at: String = null,
    id: js.UndefOr[Double] = js.undefined,
    price_rule_id: js.UndefOr[Double] = js.undefined,
    updated_at: String = null,
    usage_count: js.UndefOr[Double] = js.undefined
  ): PriceRuleDiscountCode = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(price_rule_id)) __obj.updateDynamic("price_rule_id")(price_rule_id.get.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (!js.isUndefined(usage_count)) __obj.updateDynamic("usage_count")(usage_count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceRuleDiscountCode]
  }
}

