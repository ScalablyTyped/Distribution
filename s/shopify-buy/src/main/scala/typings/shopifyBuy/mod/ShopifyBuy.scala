package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShopifyBuy extends StObject {
  
  var checkout: CheckoutResource
  
  var collection: CollectionResource
  
  /**
    * Fetches the next page of models
    */
  def fetchNextPage[T /* <: Node */](models: js.Array[T]): js.Promise[js.Array[T]]
  
  var graphQLClient: GraphQLJSClient
  
  var image: ImageResource
  
  var product: ProductResource
  
  var shop: ShopResource
}
object ShopifyBuy {
  
  inline def apply(
    checkout: CheckoutResource,
    collection: CollectionResource,
    fetchNextPage: js.Array[Any] => js.Promise[js.Array[Any]],
    graphQLClient: GraphQLJSClient,
    image: ImageResource,
    product: ProductResource,
    shop: ShopResource
  ): ShopifyBuy = {
    val __obj = js.Dynamic.literal(checkout = checkout.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], fetchNextPage = js.Any.fromFunction1(fetchNextPage), graphQLClient = graphQLClient.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], shop = shop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShopifyBuy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShopifyBuy] (val x: Self) extends AnyVal {
    
    inline def setCheckout(value: CheckoutResource): Self = StObject.set(x, "checkout", value.asInstanceOf[js.Any])
    
    inline def setCollection(value: CollectionResource): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setFetchNextPage(value: js.Array[Any] => js.Promise[js.Array[Any]]): Self = StObject.set(x, "fetchNextPage", js.Any.fromFunction1(value))
    
    inline def setGraphQLClient(value: GraphQLJSClient): Self = StObject.set(x, "graphQLClient", value.asInstanceOf[js.Any])
    
    inline def setImage(value: ImageResource): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: ProductResource): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setShop(value: ShopResource): Self = StObject.set(x, "shop", value.asInstanceOf[js.Any])
  }
}
