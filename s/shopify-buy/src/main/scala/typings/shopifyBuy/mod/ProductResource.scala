package typings.shopifyBuy.mod

import typings.shopifyBuy.anon.Reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Product resource
  *
  * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/product-resource.js
  */
@JSImport("shopify-buy", "ProductResource")
@js.native
open class ProductResource protected () extends Resource {
  def this(client: GraphQLJSClient) = this()
  
  /**
    * Fetches a single product by ID on the shop.
    */
  def fetch(id: ID): js.Promise[Product] = js.native
  
  /**
    * Fetches all products on the shop.
    */
  def fetchAll(): js.Promise[js.Array[Product]] = js.native
  def fetchAll(first: Double): js.Promise[js.Array[Product]] = js.native
  
  /**
    * Fetches a single product by handle on the shop.
    */
  def fetchByHandle(handle: String): js.Promise[Product] = js.native
  
  /**
    * Fetches multiple products by ID on the shop.
    */
  def fetchMultiple(ids: js.Array[ID]): js.Promise[js.Array[Product]] = js.native
  
  /**
    * Fetches all products on the shop that match the query.
    */
  def fetchQuery(): js.Promise[js.Array[Product]] = js.native
  def fetchQuery(options: Reverse): js.Promise[js.Array[Product]] = js.native
  
  /**
    * Find recommended products related to a given productId.
    * To learn more about how recommendations are generated, see https://shopify.dev/themes/product-merchandising/recommendations.
    */
  def fetchRecommendations(productId: ID): js.Promise[js.Array[Product]] = js.native
}
