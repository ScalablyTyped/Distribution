package typings.shopifyDashPrime

import typings.shopifyDashPrime.distInfrastructureMod.BaseService
import typings.shopifyDashPrime.distModelsPriceUnderscoreRuleUnderscoreDiscountUnderscoreCodeMod.PriceRuleDiscountCode
import typings.shopifyDashPrime.distOptionsBaseMod.ListOptions
import typings.shopifyDashPrime.distServicesPriceUnderscoreRuleUnderscoreDiscountsMod.PriceRuleDiscounts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/price_rule_discounts", JSImport.Namespace)
@js.native
object distServicesPriceUnderscoreRuleUnderscoreDiscountsMod extends js.Object {
  @js.native
  class PriceRuleDiscounts protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Creates a new discount code for a given price rule.
      * Note: Currently, you can only create a single discount code per price rule.
      */
    def create(priceRuleId: Double, discount: PriceRuleDiscountCode): js.Promise[PriceRuleDiscountCode] = js.native
    /**
      * Deletes an existing discount code object.
      */
    def delete(priceRuleId: Double, id: Double): js.Promise[Unit] = js.native
    /**
      * Returns details about a single discount code object.
      */
    def get(priceRuleId: Double, id: Double): js.Promise[PriceRuleDiscountCode] = js.native
    /* private */ def getPath(priceRuleId: js.Any, path: js.Any): js.Any = js.native
    /**
      * Returns a list of discount codes belonging to a specified price rule.
      * @param options Options for filtering the results.
      */
    def list(priceRuleId: Double): js.Promise[js.Array[PriceRuleDiscountCode]] = js.native
    def list(priceRuleId: Double, options: ListOptions): js.Promise[js.Array[PriceRuleDiscountCode]] = js.native
    /**
      * Search by discount code.
      *
      * The lookup endpoint does not return the discount code object, rather it returns the location of the
      * discount code in the location header.
      *
      * // https://your-store-domain.myshopify.com/admin/discount_codes/lookup?code=discountCode
      */
    def lookup(priceRuleId: Double, code: String): js.Promise[PriceRuleDiscountCode] = js.native
    /**
      * Updates a single discount code for a given price rule.
      */
    def update(priceRuleId: Double, id: Double, discount: PriceRuleDiscountCode): js.Promise[PriceRuleDiscountCode] = js.native
  }
  
  @js.native
  class default protected () extends PriceRuleDiscounts {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

