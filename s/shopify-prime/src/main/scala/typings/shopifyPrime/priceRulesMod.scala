package typings.shopifyPrime

import typings.shopifyPrime.infrastructureMod.BaseService
import typings.shopifyPrime.optionsBaseMod.FieldOptions
import typings.shopifyPrime.optionsBaseMod.ListOptions
import typings.shopifyPrime.priceRuleMod.PriceRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/price_rules", JSImport.Namespace)
@js.native
object priceRulesMod extends js.Object {
  @js.native
  class PriceRules protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * The API is currently restricted to what the Shopify Discounts admin section offers. Note that for
      * a price rule to be accessible via the admin section of Shopify, you will need to create a
      * discount code as well.
      */
    def create(PriceRule: PriceRule): js.Promise[PriceRule] = js.native
    /**
      * Deletes the Price Rule with the given id.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    /**
      * Retrieves the Price Rule with the given id.
      * @param options Options for filtering the results.
      */
    def get(id: Double): js.Promise[PriceRule] = js.native
    /**
      * Gets a list of up to 250 of the shop's Price Rules.
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[PriceRule]] = js.native
    def list(options: ListOptions with FieldOptions): js.Promise[js.Array[PriceRule]] = js.native
    /**
      * Updates the Price Rule with the given id.
      * @param tag The updated Price Rule.
      */
    def update(id: Double, PriceRule: PriceRule): js.Promise[PriceRule] = js.native
  }
  
  @js.native
  class default protected () extends PriceRules {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

