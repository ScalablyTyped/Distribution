package typings.shopifyDashPrime

import typings.shopifyDashPrime.distInfrastructureMod.BaseService
import typings.shopifyDashPrime.distModelsDiscountMod.Discount
import typings.shopifyDashPrime.distOptionsBaseMod.ListOptions
import typings.shopifyDashPrime.distServicesDiscountsMod.Discounts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/discounts", JSImport.Namespace)
@js.native
object distServicesDiscountsMod extends js.Object {
  @js.native
  class Discounts protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Creates a new discount.
      */
    def create(discount: Discount): js.Promise[Discount] = js.native
    /**
      * Deletes the discount with the given id.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    /**
      * Disable a discount.
      */
    def disable(id: Double): js.Promise[Discount] = js.native
    /**
      * Enables a discount.
      */
    def enable(id: Double): js.Promise[Discount] = js.native
    /**
      * Retrieves the discount with the given id.
      * @param options Options for filtering the results.
      */
    def get(id: Double): js.Promise[Discount] = js.native
    /**
      * Gets a list of up to 250 of the shop's discounts.
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[Discount]] = js.native
    def list(options: ListOptions): js.Promise[js.Array[Discount]] = js.native
  }
  
  @js.native
  class default protected () extends Discounts {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

