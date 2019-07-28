package typings.reactDashImgpro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
}

object Anon_Amount {
  @scala.inline
  def apply(amount: Int | Double = null, color: String = null): Anon_Amount = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Anon_Amount]
  }
}

