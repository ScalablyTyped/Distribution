package typings.qlikVisualizationextensions.TableAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQDimensionCell extends IQMeasureCell {
  /**
    * Cell value index.
    */
  var qElemNumber: Double
  /**
    * Cell state.
    */
  var qState: String
  /**
    * Selects the value in this cell.
    */
  def select(): Unit
}

object IQDimensionCell {
  @scala.inline
  def apply(
    getPercent: () => Double,
    getPercentOfMax: () => Double,
    qElemNumber: Double,
    qState: String,
    qText: String,
    select: () => Unit,
    qNum: Int | Double = null
  ): IQDimensionCell = {
    val __obj = js.Dynamic.literal(getPercent = js.Any.fromFunction0(getPercent), getPercentOfMax = js.Any.fromFunction0(getPercentOfMax), qElemNumber = qElemNumber.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], select = js.Any.fromFunction0(select))
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQDimensionCell]
  }
}

