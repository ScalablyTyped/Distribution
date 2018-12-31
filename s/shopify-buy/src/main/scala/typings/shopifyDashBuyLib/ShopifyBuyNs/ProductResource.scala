package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductResource extends js.Object {
  def fetch(id: java.lang.String): js.Promise[Product] = js.native
  def fetchAll(): js.Promise[js.Array[Product]] = js.native
  def fetchAll(pageSizeopt: scala.Double): js.Promise[js.Array[Product]] = js.native
  def fetchByHandle(handle: java.lang.String): js.Promise[Product] = js.native
  def fetchMultiple(ids: js.Array[java.lang.String]): js.Promise[js.Array[Product]] = js.native
  def fetchQuery(query: Query): js.Promise[js.Array[Product]] = js.native
  /**
    *   Product Helper Namespace
    *   @link https://shopify.github.io/js-buy-sdk/ProductResource.html
    */
  def variantForOptions(product: Product, options: Option): ProductVariant = js.native
}

