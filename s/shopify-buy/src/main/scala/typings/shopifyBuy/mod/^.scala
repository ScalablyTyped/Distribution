package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shopify-buy", JSImport.Namespace)
@js.native
open class ^ protected ()
  extends StObject
     with ShopifyBuy {
  def this(config: Config) = this()
  def this(config: Config, GraphQLClientClass: GraphQLJSClient) = this()
  def this(config: Config, GraphQLClientClass: Unit, fetchFunction: FetchFunction) = this()
  def this(config: Config, GraphQLClientClass: GraphQLJSClient, fetchFunction: FetchFunction) = this()
  
  /* CompleteClass */
  var checkout: CheckoutResource = js.native
  
  /* CompleteClass */
  var collection: CollectionResource = js.native
  
  /**
    * Fetches the next page of models
    */
  /* CompleteClass */
  override def fetchNextPage[T /* <: Node */](models: js.Array[T]): js.Promise[js.Array[T]] = js.native
  
  /* CompleteClass */
  var graphQLClient: GraphQLJSClient = js.native
  
  /* CompleteClass */
  var image: ImageResource = js.native
  
  /* CompleteClass */
  var product: ProductResource = js.native
  
  /* CompleteClass */
  var shop: ShopResource = js.native
}
@JSImport("shopify-buy", JSImport.Namespace)
@js.native
object ^ extends StObject
