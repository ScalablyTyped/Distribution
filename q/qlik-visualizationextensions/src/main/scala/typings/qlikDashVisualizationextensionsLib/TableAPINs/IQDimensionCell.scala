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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPercent")(getPercent)
    __obj.updateDynamic("getPercentOfMax")(getPercentOfMax)
    __obj.updateDynamic("qElemNumber")(qElemNumber)
    __obj.updateDynamic("qState")(qState)
    __obj.updateDynamic("qText")(qText)
    __obj.updateDynamic("select")(select)
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQDimensionCell]
  }
}

