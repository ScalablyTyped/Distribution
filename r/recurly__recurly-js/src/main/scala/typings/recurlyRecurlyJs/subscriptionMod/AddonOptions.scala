package typings.recurlyRecurlyJs.subscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddonOptions extends js.Object {
  var quantity: js.UndefOr[Double] = js.undefined
}

object AddonOptions {
  @scala.inline
  def apply(quantity: Int | Double = null): AddonOptions = {
    val __obj = js.Dynamic.literal()
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonOptions]
  }
}

