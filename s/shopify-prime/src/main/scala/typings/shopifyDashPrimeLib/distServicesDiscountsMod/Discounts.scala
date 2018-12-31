package typings
package shopifyDashPrimeLib.distServicesDiscountsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/discounts", "Discounts")
@js.native
class Discounts protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
    * Creates a new discount.
    */
  def create(discount: shopifyDashPrimeLib.distModelsDiscountMod.Discount): js.Promise[shopifyDashPrimeLib.distModelsDiscountMod.Discount] = js.native
  /**
    * Deletes the discount with the given id.
    */
  def delete(id: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Disable a discount.
    */
  def disable(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsDiscountMod.Discount] = js.native
  /**
    * Enables a discount.
    */
  def enable(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsDiscountMod.Discount] = js.native
  /**
    * Retrieves the discount with the given id.
    * @param options Options for filtering the results.
    */
  def get(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsDiscountMod.Discount] = js.native
  /**
    * Gets a list of up to 250 of the shop's discounts.
    * @param options Options for filtering the results.
    */
  def list(): js.Promise[js.Array[shopifyDashPrimeLib.distModelsDiscountMod.Discount]] = js.native
  def list(options: shopifyDashPrimeLib.distOptionsBaseMod.ListOptions): js.Promise[js.Array[shopifyDashPrimeLib.distModelsDiscountMod.Discount]] = js.native
}

