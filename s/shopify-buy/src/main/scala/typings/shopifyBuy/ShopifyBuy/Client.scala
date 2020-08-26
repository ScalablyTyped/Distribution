package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var checkout: CheckoutResource = js.native
  var collection: CollectionResource = js.native
  var image: Image = js.native
  var product: ProductResource = js.native
  var shop: ShopResource = js.native
  def fetchNextPage[T /* <: GraphModel */](nextArray: js.Array[T]): js.Array[T] = js.native
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
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheckout(value: CheckoutResource): Self = this.set("checkout", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollection(value: CollectionResource): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchNextPage(value: js.Array[js.Any] => js.Array[js.Any]): Self = this.set("fetchNextPage", js.Any.fromFunction1(value))
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduct(value: ProductResource): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def setShop(value: ShopResource): Self = this.set("shop", value.asInstanceOf[js.Any])
  }
  
}

