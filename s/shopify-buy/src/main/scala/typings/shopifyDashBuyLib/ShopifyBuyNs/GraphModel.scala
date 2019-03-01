package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphModel extends js.Object {
  var attrs: js.UndefOr[js.Any] = js.undefined
  var onlineStoreUrl: js.UndefOr[java.lang.String] = js.undefined
}

object GraphModel {
  @scala.inline
  def apply(attrs: js.Any = null, onlineStoreUrl: java.lang.String = null): GraphModel = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (onlineStoreUrl != null) __obj.updateDynamic("onlineStoreUrl")(onlineStoreUrl)
    __obj.asInstanceOf[GraphModel]
  }
}

