package typings.shopifyDashBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphModel extends js.Object {
  var attrs: js.UndefOr[js.Any] = js.undefined
  var onlineStoreUrl: js.UndefOr[String] = js.undefined
}

object GraphModel {
  @scala.inline
  def apply(attrs: js.Any = null, onlineStoreUrl: String = null): GraphModel = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (onlineStoreUrl != null) __obj.updateDynamic("onlineStoreUrl")(onlineStoreUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphModel]
  }
}

