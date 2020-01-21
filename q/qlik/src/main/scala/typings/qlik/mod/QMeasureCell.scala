package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QMeasureCell extends js.Object {
  var qNum: js.UndefOr[Double] = js.undefined
  var qText: String
  def getPercent(): Double
  def getPercentOfMax(): Double
}

object QMeasureCell {
  @scala.inline
  def apply(getPercent: () => Double, getPercentOfMax: () => Double, qText: String, qNum: Int | Double = null): QMeasureCell = {
    val __obj = js.Dynamic.literal(getPercent = js.Any.fromFunction0(getPercent), getPercentOfMax = js.Any.fromFunction0(getPercentOfMax), qText = qText.asInstanceOf[js.Any])
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[QMeasureCell]
  }
}

