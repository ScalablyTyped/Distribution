package typings
package shopifyDashBuyLib.ShopifyBuyNs

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
    fetchNextPage: js.Function1[js.Array[js.Any], js.Array[js.Any]],
    image: Image,
    product: ProductResource,
    shop: ShopResource
  ): Client = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkout")(checkout)
    __obj.updateDynamic("collection")(collection)
    __obj.updateDynamic("fetchNextPage")(fetchNextPage)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("product")(product)
    __obj.updateDynamic("shop")(shop)
    __obj.asInstanceOf[Client]
  }
}

