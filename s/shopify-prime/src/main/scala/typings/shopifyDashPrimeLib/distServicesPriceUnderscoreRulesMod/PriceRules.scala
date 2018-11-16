package typings
package shopifyDashPrimeLib.distServicesPriceUnderscoreRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/price_rules", "PriceRules")
@js.native
class PriceRules protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * The API is currently restricted to what the Shopify Discounts admin section offers. Note that for
       * a price rule to be accessible via the admin section of Shopify, you will need to create a
       * discount code as well.
       */
  def create(PriceRule: shopifyDashPrimeLib.distModelsPriceUnderscoreRuleMod.PriceRule): stdLib.Promise[shopifyDashPrimeLib.distModelsPriceUnderscoreRuleMod.PriceRule] = js.native
  /**
       * Deletes the Price Rule with the given id.
       */
  def delete(id: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Retrieves the Price Rule with the given id.
       * @param options Options for filtering the results.
       */
  def get(id: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsPriceUnderscoreRuleMod.PriceRule] = js.native
  /**
       * Gets a list of up to 250 of the shop's Price Rules.
       * @param options Options for filtering the results.
       */
  def list(): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsPriceUnderscoreRuleMod.PriceRule]] = js.native
  /**
       * Gets a list of up to 250 of the shop's Price Rules.
       * @param options Options for filtering the results.
       */
  def list(
    options: shopifyDashPrimeLib.distOptionsBaseMod.ListOptions with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
  ): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsPriceUnderscoreRuleMod.PriceRule]] = js.native
  /**
       * Updates the Price Rule with the given id.
       * @param tag The updated Price Rule.
       */
  def update(id: scala.Double, PriceRule: shopifyDashPrimeLib.distModelsPriceUnderscoreRuleMod.PriceRule): stdLib.Promise[shopifyDashPrimeLib.distModelsPriceUnderscoreRuleMod.PriceRule] = js.native
}

