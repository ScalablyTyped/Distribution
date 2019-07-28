package typings.shopifyDashBuy.ShopifyBuyNs

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
    val __obj = js.Dynamic.literal(checkout = checkout, collection = collection, fetchNextPage = js.Any.fromFunction1(fetchNextPage), image = image, product = product, shop = shop)
  
    __obj.asInstanceOf[Client]
  }
}

