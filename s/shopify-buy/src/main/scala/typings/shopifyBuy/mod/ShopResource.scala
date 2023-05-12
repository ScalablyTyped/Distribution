package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Shop Resource
  *
  * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/shop-resource.js
  */
@JSImport("shopify-buy", "ShopResource")
@js.native
open class ShopResource protected () extends Resource {
  def this(client: GraphQLJSClient) = this()
  
  /**
    * Fetches shop information (`currencyCode`, `description`, `moneyFormat`, `name`, and `primaryDomain`).
    * See the {@link https://help.shopify.com/api/storefront-api/reference/object/shop|Storefront API reference} for more information.
    */
  def fetchInfo(): js.Promise[Shop] = js.native
  
  /**
    * Fetches shop policies (privacy policy, terms of service and refund policy).
    */
  def fetchPolicies(): js.Promise[Shop] = js.native
}
