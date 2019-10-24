package typings.sailthruDashClient.sailthruDashClientMod

import typings.sailthruDashClient.Anon_Full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseItem extends js.Object {
  var id: String | Double
  var images: js.UndefOr[Anon_Full] = js.undefined
  var price: Double
  var qty: Double
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var title: String
  var url: String
  var vars: js.UndefOr[js.Object] = js.undefined
}

object PurchaseItem {
  @scala.inline
  def apply(
    id: String | Double,
    price: Double,
    qty: Double,
    title: String,
    url: String,
    images: Anon_Full = null,
    tags: js.Array[String] = null,
    vars: js.Object = null
  ): PurchaseItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], price = price, qty = qty, title = title, url = url)
    if (images != null) __obj.updateDynamic("images")(images)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (vars != null) __obj.updateDynamic("vars")(vars)
    __obj.asInstanceOf[PurchaseItem]
  }
}

