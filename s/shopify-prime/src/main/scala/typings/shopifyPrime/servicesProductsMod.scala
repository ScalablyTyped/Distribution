package typings.shopifyPrime

import typings.shopifyPrime.infrastructureMod.BaseService
import typings.shopifyPrime.optionsBaseMod.DateOptions
import typings.shopifyPrime.optionsBaseMod.FieldOptions
import typings.shopifyPrime.optionsBaseMod.ListOptions
import typings.shopifyPrime.optionsBaseMod.PublishedOptions
import typings.shopifyPrime.productMod.Product
import typings.shopifyPrime.productsMod.ProductBaseOptions
import typings.shopifyPrime.productsMod.ProductListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/products", JSImport.Namespace)
@js.native
object servicesProductsMod extends js.Object {
  @js.native
  class Products protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Gets a count of all of the shop's Products.
      * @param options Options for filtering the results.
      * @see https://help.shopify.com/api/reference/product#count
      */
    def count(): js.Promise[Double] = js.native
    def count(options: ProductBaseOptions with DateOptions with PublishedOptions): js.Promise[Double] = js.native
    /**
      * Creates an Product.
      * @param product The Product being created.
      * @param options Options for creating the Product.
      */
    def create(product: Product): js.Promise[Product] = js.native
    /**
      * Deletes an Product with the given id.
      * @param id The Product's id.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    /**
      * Gets the Product with the given id.
      * @param id The Product's id.
      * @param options Options for filtering the results.
      */
    def get(id: Double): js.Promise[Product] = js.native
    def get(id: Double, options: FieldOptions): js.Promise[Product] = js.native
    /**
      * Gets a list of up to 250 of the shop's Products.
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[Product]] = js.native
    def list(options: ProductListOptions with PublishedOptions with ListOptions with FieldOptions): js.Promise[js.Array[Product]] = js.native
    /**
      * Updates an Product with the given id.
      * @param id The Product's id.
      * @param product The updated Product.
      */
    def update(id: Double, product: Product): js.Promise[Product] = js.native
  }
  
  @js.native
  class default protected () extends Products {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

