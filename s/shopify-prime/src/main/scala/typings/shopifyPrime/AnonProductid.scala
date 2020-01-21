package typings.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProductid extends js.Object {
  var product_id: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AnonProductid {
  @scala.inline
  def apply(product_id: Int | Double = null, title: String = null): AnonProductid = {
    val __obj = js.Dynamic.literal()
    if (product_id != null) __obj.updateDynamic("product_id")(product_id.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProductid]
  }
}

