package typings.shopifyDashBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var checkout: CheckoutResource
  var collection: CollectionResource
  var image: Image
  var product: ProductResource
  var shop: ShopResource
  def fetchNextPage[T /* <: GraphModel */](nextArray: js.Array[T]): js.Array[T]
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
}

