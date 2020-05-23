package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QDimensionCell extends js.Object {
  var qElemNumber: Double
  var qNum: js.UndefOr[Double] = js.undefined
  var qState: String
  var qText: String
  def select(): Unit
}

object QDimensionCell {
  @scala.inline
  def apply(
    qElemNumber: Double,
    qState: String,
    qText: String,
    select: () => Unit,
    qNum: js.UndefOr[Double] = js.undefined
  ): QDimensionCell = {
    val __obj = js.Dynamic.literal(qElemNumber = qElemNumber.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], select = js.Any.fromFunction0(select))
    if (!js.isUndefined(qNum)) __obj.updateDynamic("qNum")(qNum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDimensionCell]
  }
}

