package typings
package shopifyDashPrimeLib.distServicesProductsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/products", "Products")
@js.native
class Products protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
    * Gets a count of all of the shop's Products.
    * @param options Options for filtering the results.
    * @see https://help.shopify.com/api/reference/product#count
    */
  def count(): js.Promise[scala.Double] = js.native
  def count(
    options: shopifyDashPrimeLib.distOptionsProductsMod.ProductBaseOptions with shopifyDashPrimeLib.distOptionsBaseMod.DateOptions with shopifyDashPrimeLib.distOptionsBaseMod.PublishedOptions
  ): js.Promise[scala.Double] = js.native
  /**
    * Creates an Product.
    * @param product The Product being created.
    * @param options Options for creating the Product.
    */
  def create(product: shopifyDashPrimeLib.distModelsProductMod.Product): js.Promise[shopifyDashPrimeLib.distModelsProductMod.Product] = js.native
  /**
    * Deletes an Product with the given id.
    * @param id The Product's id.
    */
  def delete(id: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Gets the Product with the given id.
    * @param id The Product's id.
    * @param options Options for filtering the results.
    */
  def get(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsProductMod.Product] = js.native
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[shopifyDashPrimeLib.distModelsProductMod.Product] = js.native
  /**
    * Gets a list of up to 250 of the shop's Products.
    * @param options Options for filtering the results.
    */
  def list(): js.Promise[js.Array[shopifyDashPrimeLib.distModelsProductMod.Product]] = js.native
  def list(
    options: shopifyDashPrimeLib.distOptionsProductsMod.ProductListOptions with shopifyDashPrimeLib.distOptionsBaseMod.PublishedOptions with shopifyDashPrimeLib.distOptionsBaseMod.ListOptions with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
  ): js.Promise[js.Array[shopifyDashPrimeLib.distModelsProductMod.Product]] = js.native
  /**
    * Updates an Product with the given id.
    * @param id The Product's id.
    * @param product The updated Product.
    */
  def update(id: scala.Double, product: shopifyDashPrimeLib.distModelsProductMod.Product): js.Promise[shopifyDashPrimeLib.distModelsProductMod.Product] = js.native
}

