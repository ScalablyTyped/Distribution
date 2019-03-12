package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QMeasureCell extends js.Object {
  var qNum: js.UndefOr[scala.Double] = js.undefined
  var qText: java.lang.String
  def getPercent(): scala.Double
  def getPercentOfMax(): scala.Double
}

object QMeasureCell {
  @scala.inline
  def apply(
    getPercent: () => scala.Double,
    getPercentOfMax: () => scala.Double,
    qText: java.lang.String,
    qNum: scala.Int | scala.Double = null
  ): QMeasureCell = {
    val __obj = js.Dynamic.literal(getPercent = js.Any.fromFunction0(getPercent), getPercentOfMax = js.Any.fromFunction0(getPercentOfMax), qText = qText)
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[QMeasureCell]
  }
}

