package typings.shopifyBuy.mod

import typings.shopifyBuy.anon.First
import typings.shopifyBuy.anon.ProductsFirst
import typings.shopifyBuy.anon.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collection resource
  *
  * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/collection-resource.js
  */
@JSImport("shopify-buy", "CollectionResource")
@js.native
open class CollectionResource protected () extends Resource {
  def this(client: GraphQLJSClient) = this()
  
  /**
    * Fetches a single collection by ID on the shop, not including products.
    * To fetch the collection with products use [fetchWithProducts]{@link Client#fetchWithProducts}.
    */
  def fetch(id: ID): js.Promise[Collection] = js.native
  
  /**
    * Fetches all collections on the shop, not including products.
    * To fetch collections with products use [fetchAllsWithProducts]{@link Client#fetchAllsWithProducts}.
    */
  def fetchAll(): js.Promise[js.Array[Collection]] = js.native
  def fetchAll(first: Double): js.Promise[js.Array[Collection]] = js.native
  
  /**
    * Fetches all collections on the shop, including products.
    */
  def fetchAllWithProducts(): js.Promise[js.Array[Collection]] = js.native
  def fetchAllWithProducts(options: First): js.Promise[js.Array[Collection]] = js.native
  
  /**
    * Fetches a collection by handle on the shop.
    */
  def fetchByHandle(handle: String): js.Promise[Collection] = js.native
  
  /**
    * Fetches all collections on the shop that match the query.
    */
  def fetchQuery(): js.Promise[js.Array[Collection]] = js.native
  def fetchQuery(options: Query): js.Promise[js.Array[Collection]] = js.native
  
  /**
    * Fetches a single collection by ID on the shop, including products.
    */
  def fetchWithProducts(id: ID): js.Promise[Collection] = js.native
  def fetchWithProducts(id: ID, options: ProductsFirst): js.Promise[Collection] = js.native
}
