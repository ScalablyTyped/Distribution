package typings
package qlikDashVisualizationextensionsLib.TableAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQDimensionCell extends IQMeasureCell {
  /**
    * Cell value index.
    */
  var qElemNumber: scala.Double
  /**
    * Cell state.
    */
  var qState: java.lang.String
  /**
    * Selects the value in this cell.
    */
  def select(): scala.Unit
}

object IQDimensionCell {
  @scala.inline
  def apply(
    getPercent: js.Function0[scala.Double],
    getPercentOfMax: js.Function0[scala.Double],
    qElemNumber: scala.Double,
    qState: java.lang.String,
    qText: java.lang.String,
    select: js.Function0[scala.Unit],
    qNum: scala.Int | scala.Double = null
  ): IQDimensionCell = {
    val __obj = js.Dynamic.literal(getPercent = getPercent, getPercentOfMax = getPercentOfMax, qElemNumber = qElemNumber, qState = qState, qText = qText, select = select)
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQDimensionCell]
  }
}

