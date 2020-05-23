package typings.regression.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The number of terms to solve for (and therefore
    * the number of coefficients to calculate). Only
    * relevant for polynomial fitting.
    */
  var order: js.UndefOr[Double] = js.undefined
  /**
    * The number of decimal places to round to.
    * This is used to round the calculated fitting coefficients,
    * the output predictions, and the value of r^2.
    */
  var precision: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(order: js.UndefOr[Double] = js.undefined, precision: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

