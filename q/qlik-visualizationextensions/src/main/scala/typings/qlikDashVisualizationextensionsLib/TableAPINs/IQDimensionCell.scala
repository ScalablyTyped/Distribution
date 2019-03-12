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
    getPercent: () => scala.Double,
    getPercentOfMax: () => scala.Double,
    qElemNumber: scala.Double,
    qState: java.lang.String,
    qText: java.lang.String,
    select: () => scala.Unit,
    qNum: scala.Int | scala.Double = null
  ): IQDimensionCell = {
    val __obj = js.Dynamic.literal(getPercent = js.Any.fromFunction0(getPercent), getPercentOfMax = js.Any.fromFunction0(getPercentOfMax), qElemNumber = qElemNumber, qState = qState, qText = qText, select = js.Any.fromFunction0(select))
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQDimensionCell]
  }
}

