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

