package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShopResource extends js.Object {
  def fetchInfo(): js.Promise[Shop]
  def fetchPolicies(): js.Promise[Shop]
}

object ShopResource {
  @scala.inline
  def apply(fetchInfo: js.Function0[js.Promise[Shop]], fetchPolicies: js.Function0[js.Promise[Shop]]): ShopResource = {
    val __obj = js.Dynamic.literal(fetchInfo = fetchInfo, fetchPolicies = fetchPolicies)
  
    __obj.asInstanceOf[ShopResource]
  }
}

