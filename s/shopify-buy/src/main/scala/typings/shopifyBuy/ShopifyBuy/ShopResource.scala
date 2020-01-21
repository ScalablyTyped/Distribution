package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShopResource extends js.Object {
  def fetchInfo(): js.Promise[Shop]
  def fetchPolicies(): js.Promise[Shop]
}

object ShopResource {
  @scala.inline
  def apply(fetchInfo: () => js.Promise[Shop], fetchPolicies: () => js.Promise[Shop]): ShopResource = {
    val __obj = js.Dynamic.literal(fetchInfo = js.Any.fromFunction0(fetchInfo), fetchPolicies = js.Any.fromFunction0(fetchPolicies))
  
    __obj.asInstanceOf[ShopResource]
  }
}

