package typings.reactImgpro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmount extends js.Object {
  var amount: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
}

object AnonAmount {
  @scala.inline
  def apply(amount: Int | Double = null, color: String = null): AnonAmount = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmount]
  }
}

