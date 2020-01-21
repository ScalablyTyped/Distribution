package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var product_id: js.UndefOr[Double] = js.undefined
}

object AnonId {
  @scala.inline
  def apply(id: Int | Double = null, position: Int | Double = null, product_id: Int | Double = null): AnonId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (product_id != null) __obj.updateDynamic("product_id")(product_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

