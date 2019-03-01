package typings
package shopifyDashPrimeLib.distModelsDiscountUnderscoreCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscountCode
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    *  The amount of the discount.
    */
  var amount: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  The discount code.
    */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  The type of discount. Known values are 'percentage', 'shipping', 'fixed_amount' and 'none'.
    */
  var `type`: js.UndefOr[
    shopifyDashPrimeLib.shopifyDashPrimeLibStrings.percentage | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.shipping | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.fixed_amount | java.lang.String
  ] = js.undefined
}

object DiscountCode {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    amount: java.lang.String = null,
    code: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    `type`: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.percentage | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.shipping | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.fixed_amount | java.lang.String = null
  ): DiscountCode = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (code != null) __obj.updateDynamic("code")(code)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscountCode]
  }
}

