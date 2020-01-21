package typings.sailthruClient.mod

import typings.sailthruClient.AnonFull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseItem extends js.Object {
  var id: String | Double
  var images: js.UndefOr[AnonFull] = js.undefined
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
    images: AnonFull = null,
    tags: js.Array[String] = null,
    vars: js.Object = null
  ): PurchaseItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], qty = qty.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vars != null) __obj.updateDynamic("vars")(vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseItem]
  }
}

