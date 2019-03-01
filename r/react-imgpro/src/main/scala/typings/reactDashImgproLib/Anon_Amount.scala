package typings
package reactDashImgproLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Amount {
  @scala.inline
  def apply(amount: scala.Int | scala.Double = null, color: java.lang.String = null): Anon_Amount = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Anon_Amount]
  }
}

