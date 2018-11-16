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

