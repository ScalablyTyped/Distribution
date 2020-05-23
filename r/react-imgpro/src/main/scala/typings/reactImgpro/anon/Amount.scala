package typings.reactImgpro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amount extends js.Object {
  var amount: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
}

object Amount {
  @scala.inline
  def apply(amount: js.UndefOr[Double] = js.undefined, color: String = null): Amount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
}

