package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends StObject {
  
  var checkout: CheckoutResource = js.native
  
  var collection: CollectionResource = js.native
  
  def fetchNextPage[T /* <: GraphModel */](nextArray: js.Array[T]): js.Array[T] = js.native
  
  var image: Image = js.native
  
  var product: ProductResource = js.native
  
  var shop: ShopResource = js.native
}
object Client {
  
  @scala.inline
  def apply(
    checkout: CheckoutResource,
    collection: CollectionResource,
    fetchNextPage: js.Array[js.Any] => js.Array[js.Any],
    image: Image,
    product: ProductResource,
    shop: ShopResource
  ): Client = {
    val __obj = js.Dynamic.literal(checkout = checkout.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], fetchNextPage = js.Any.fromFunction1(fetchNextPage), image = image.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], shop = shop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckout(value: CheckoutResource): Self = StObject.set(x, "checkout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection(value: CollectionResource): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchNextPage(value: js.Array[js.Any] => js.Array[js.Any]): Self = StObject.set(x, "fetchNextPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: ProductResource): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShop(value: ShopResource): Self = StObject.set(x, "shop", value.asInstanceOf[js.Any])
  }
}
