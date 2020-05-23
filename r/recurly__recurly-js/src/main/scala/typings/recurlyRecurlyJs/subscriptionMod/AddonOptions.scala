package typings.recurlyRecurlyJs.subscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddonOptions extends js.Object {
  var quantity: js.UndefOr[Double] = js.undefined
}

object AddonOptions {
  @scala.inline
  def apply(quantity: js.UndefOr[Double] = js.undefined): AddonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonOptions]
  }
}

