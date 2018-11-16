package typings
package shopifyDashPrimeLib.distServicesPriceUnderscoreRuleUnderscoreDiscountsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/price_rule_discounts", "PriceRuleDiscounts")
@js.native
class PriceRuleDiscounts protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * Creates a new discount code for a given price rule.
       * Note: Currently, you can only create a single discount code per price rule.
       */
  def create(
    priceRuleId: scala.Double,
    discount: shopifyDashPrimeLib.distModelsPriceUnderscoreRuleUnderscoreDiscountUnderscoreCodeMod.PriceRuleDiscountCode
  ): stdLib.Promise[
    shopifyDashPrimeLib.distModelsPriceUnderscoreRuleUnderscoreDiscountUnderscoreCodeMod.PriceRuleDiscountCode
  ] = js.native
  /**
       * Deletes an existing discount code object.
       */
  def delete(priceRuleId: scala.Double, id: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Returns details about a single discount code object.
       */
  def get(priceRuleId: scala.Double, id: scala.Double): stdLib.Promise[
    shopifyDashPrimeLib.distModelsPriceUnderscoreRuleUnderscoreDiscountUnderscoreCodeMod.PriceRuleDiscountCode
  ] = js.native
  /* private */ def getPath(priceRuleId: js.Any, path: js.Any): js.Any = js.native
  /**
       * Returns a list of discount codes belonging to a specified price rule.
       * @param options Options for filtering the results.
       */
  def list(priceRuleId: scala.Double): stdLib.Promise[
    js.Array[
      shopifyDashPrimeLib.distModelsPriceUnderscoreRuleUnderscoreDiscountUnderscoreCodeMod.PriceRuleDiscountCode
    ]
  ] = js.native
  /**
       * Returns a list of discount codes belonging to a specified price rule.
       * @param options Options for filtering the results.
       */
  def list(priceRuleId: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.ListOptions): stdLib.Promise[
    js.Array[
      shopifyDashPrimeLib.distModelsPriceUnderscoreRuleUnderscoreDiscountUnderscoreCodeMod.PriceRuleDiscountCode
    ]
  ] = js.native
  /**
       * Search by discount code.
       *
       * The lookup endpoint does not return the discount code object, rather it returns the location of the
       * discount code in the location header.
       *
       * // https://your-store-domain.myshopify.com/admin/discount_codes/lookup?code=discountCode
       */
  def lookup(priceRuleId: scala.Double, code: java.lang.String): stdLib.Promise[
    shopifyDashPrimeLib.distModelsPriceUnderscoreRuleUnderscoreDiscountUnderscoreCodeMod.PriceRuleDiscountCode
  ] = js.native
  /**
       * Updates a single discount code for a given price rule.
       */
  def update(
    priceRuleId: scala.Double,
    id: scala.Double,
    discount: shopifyDashPrimeLib.distModelsPriceUnderscoreRuleUnderscoreDiscountUnderscoreCodeMod.PriceRuleDiscountCode
  ): stdLib.Promise[
    shopifyDashPrimeLib.distModelsPriceUnderscoreRuleUnderscoreDiscountUnderscoreCodeMod.PriceRuleDiscountCode
  ] = js.native
}

