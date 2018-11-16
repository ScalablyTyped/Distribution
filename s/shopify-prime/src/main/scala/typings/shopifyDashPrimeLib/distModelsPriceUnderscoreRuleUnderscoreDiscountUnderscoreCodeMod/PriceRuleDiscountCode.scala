package typings
package shopifyDashPrimeLib.distModelsPriceUnderscoreRuleUnderscoreDiscountUnderscoreCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PriceRuleDiscountCode
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
       * The case-insensitive discount code that customers use at checkout. Required
       * when creating a discount. Maximum length of 255 characters.
       */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
       * By default, this auto-generated property is the date and time when the price rule was
       * created in Shopify, in ISO 8601 format.
       */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The unique identifier for the price rule associated to the discount code.
       */
  var price_rule_id: js.UndefOr[scala.Double] = js.undefined
  /**
       * The date and time the discount code was updated.
       */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The discount code usage count. Note that the usage limit is set on the price rule.
       */
  var usage_count: js.UndefOr[scala.Double] = js.undefined
}

