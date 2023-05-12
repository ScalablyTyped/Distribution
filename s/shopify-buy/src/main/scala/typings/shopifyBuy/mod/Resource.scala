package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource
  *
  * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/resource.js
  */
@JSImport("shopify-buy", "Resource")
@js.native
open class Resource protected () extends StObject {
  def this(client: GraphQLJSClient) = this()
  
  var graphQLClient: GraphQLJSClient = js.native
}
