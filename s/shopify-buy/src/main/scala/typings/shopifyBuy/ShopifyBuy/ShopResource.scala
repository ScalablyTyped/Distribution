package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShopResource extends js.Object {
  def fetchInfo(): js.Promise[Shop] = js.native
  def fetchPolicies(): js.Promise[Shop] = js.native
}

object ShopResource {
  @scala.inline
  def apply(fetchInfo: () => js.Promise[Shop], fetchPolicies: () => js.Promise[Shop]): ShopResource = {
    val __obj = js.Dynamic.literal(fetchInfo = js.Any.fromFunction0(fetchInfo), fetchPolicies = js.Any.fromFunction0(fetchPolicies))
    __obj.asInstanceOf[ShopResource]
  }
  @scala.inline
  implicit class ShopResourceOps[Self <: ShopResource] (val x: Self) extends AnyVal {
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
    def setFetchInfo(value: () => js.Promise[Shop]): Self = this.set("fetchInfo", js.Any.fromFunction0(value))
    @scala.inline
    def setFetchPolicies(value: () => js.Promise[Shop]): Self = this.set("fetchPolicies", js.Any.fromFunction0(value))
  }
  
}

