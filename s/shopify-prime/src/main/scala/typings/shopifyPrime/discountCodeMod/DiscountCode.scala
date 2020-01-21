package typings.shopifyPrime.discountCodeMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.shopifyPrimeStrings.fixed_amount
import typings.shopifyPrime.shopifyPrimeStrings.percentage
import typings.shopifyPrime.shopifyPrimeStrings.shipping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscountCode extends ShopifyObject {
  /**
    *  The amount of the discount.
    */
  var amount: js.UndefOr[String] = js.undefined
  /**
    *  The discount code.
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    *  The type of discount. Known values are 'percentage', 'shipping', 'fixed_amount' and 'none'.
    */
  var `type`: js.UndefOr[percentage | shipping | fixed_amount | String] = js.undefined
}

object DiscountCode {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    amount: String = null,
    code: String = null,
    id: Int | Double = null,
    `type`: percentage | shipping | fixed_amount | String = null
  ): DiscountCode = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscountCode]
  }
}

