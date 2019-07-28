package typings.qlik.qlikMod

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
  def apply(qElemNumber: Double, qState: String, qText: String, select: () => Unit, qNum: Int | Double = null): QDimensionCell = {
    val __obj = js.Dynamic.literal(qElemNumber = qElemNumber, qState = qState, qText = qText, select = js.Any.fromFunction0(select))
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDimensionCell]
  }
}

