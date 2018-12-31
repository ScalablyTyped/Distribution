package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionResource extends js.Object {
  def fetch(id: java.lang.String): js.Promise[js.Array[Product]] = js.native
   // TODO fix to be a type: Docs: Fetches a single collection by ID on the shop, not including products.
  def fetchAll(): js.Promise[js.Array[_]] = js.native
  def fetchAll(pageSizeopt: scala.Double): js.Promise[js.Array[_]] = js.native
   // TODO fix to be a type: Docs: Fetches all collections on the shop, not including products.
  def fetchAllWithProducts(): js.Promise[js.Array[_]] = js.native
   // TODO fix to be a type: DOC: Fetches all collections on the shop, including products.
  def fetchByHandle(handle: java.lang.String): js.Promise[js.Array[_]] = js.native
   // TODO fix to be a type: DOC: Fetches a collection by handle on the shop. Assuming it does not give products
  def fetchQuery(query: Query): js.Promise[js.Array[_]] = js.native
  def fetchWithProducts(id: java.lang.String): js.Promise[js.Array[_]] = js.native
}

