package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var checkout: CheckoutResource
  
  var collection: CollectionResource
  
  def fetchNextPage[T /* <: GraphModel */](nextArray: js.Array[T]): js.Array[T]
  
  var image: Image
  
  var product: ProductResource
  
  var shop: ShopResource
}
object Client {
  
  inline def apply(
    checkout: CheckoutResource,
    collection: CollectionResource,
    fetchNextPage: js.Array[Any] => js.Array[Any],
    image: Image,
    product: ProductResource,
    shop: ShopResource
  ): Client = {
    val __obj = js.Dynamic.literal(checkout = checkout.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], fetchNextPage = js.Any.fromFunction1(fetchNextPage), image = image.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], shop = shop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  extension [Self <: Client](x: Self) {
    
    inline def setCheckout(value: CheckoutResource): Self = StObject.set(x, "checkout", value.asInstanceOf[js.Any])
    
    inline def setCollection(value: CollectionResource): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setFetchNextPage(value: js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "fetchNextPage", js.Any.fromFunction1(value))
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: ProductResource): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setShop(value: ShopResource): Self = StObject.set(x, "shop", value.asInstanceOf[js.Any])
  }
}
