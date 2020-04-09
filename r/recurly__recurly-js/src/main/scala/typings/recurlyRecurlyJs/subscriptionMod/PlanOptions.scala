package typings.recurlyRecurlyJs.subscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanOptions extends js.Object {
  var quantity: js.UndefOr[Double] = js.undefined
}

object PlanOptions {
  @scala.inline
  def apply(quantity: Int | Double = null): PlanOptions = {
    val __obj = js.Dynamic.literal()
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanOptions]
  }
}

