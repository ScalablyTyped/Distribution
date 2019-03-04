package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QDimensionCell extends js.Object {
  var qElemNumber: scala.Double
  var qNum: js.UndefOr[scala.Double] = js.undefined
  var qState: java.lang.String
  var qText: java.lang.String
  def select(): scala.Unit
}

object QDimensionCell {
  @scala.inline
  def apply(
    qElemNumber: scala.Double,
    qState: java.lang.String,
    qText: java.lang.String,
    select: js.Function0[scala.Unit],
    qNum: scala.Int | scala.Double = null
  ): QDimensionCell = {
    val __obj = js.Dynamic.literal(qElemNumber = qElemNumber, qState = qState, qText = qText, select = select)
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDimensionCell]
  }
}

