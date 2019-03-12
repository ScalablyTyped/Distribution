package typings
package qlikDashVisualizationextensionsLib.TableAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQMeasureCell extends js.Object {
  /**
    * Optional. Cell numeric value, if cell is numeric.
    */
  var qNum: js.UndefOr[scala.Double] = js.undefined
  /**
    * Cell value formatted as set up in properties.
    */
  var qText: java.lang.String
  /**
    * Gets the value of this cell as a percentage of the total.
    * Might be more than 100% if this is an average.
    */
  def getPercent(): scala.Double
  /**
    * Gets the value of this cell as a percentage of the maximum.
    */
  def getPercentOfMax(): scala.Double
}

object IQMeasureCell {
  @scala.inline
  def apply(
    getPercent: () => scala.Double,
    getPercentOfMax: () => scala.Double,
    qText: java.lang.String,
    qNum: scala.Int | scala.Double = null
  ): IQMeasureCell = {
    val __obj = js.Dynamic.literal(getPercent = js.Any.fromFunction0(getPercent), getPercentOfMax = js.Any.fromFunction0(getPercentOfMax), qText = qText)
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQMeasureCell]
  }
}

