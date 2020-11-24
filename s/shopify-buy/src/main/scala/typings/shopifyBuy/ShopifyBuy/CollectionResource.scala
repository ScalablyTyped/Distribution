package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionResource extends js.Object {
  
  def fetch(id: String): js.Promise[js.Array[Product]] = js.native
  
   // TODO fix to be a type: Docs: Fetches a single collection by ID on the shop, not including products.
  def fetchAll(): js.Promise[js.Array[_]] = js.native
  def fetchAll(pageSizeopt: Double): js.Promise[js.Array[_]] = js.native
  
   // TODO fix to be a type: Docs: Fetches all collections on the shop, not including products.
  def fetchAllWithProducts(): js.Promise[js.Array[_]] = js.native
  
   // TODO fix to be a type: DOC: Fetches all collections on the shop, including products.
  def fetchByHandle(handle: String): js.Promise[js.Array[_]] = js.native
  
   // TODO fix to be a type: DOC: Fetches a collection by handle on the shop. Assuming it does not give products
  def fetchQuery(query: Query): js.Promise[js.Array[_]] = js.native
  
  def fetchWithProducts(id: String): js.Promise[js.Array[_]] = js.native
}
