package typings
package reactDashVirtualizedLib.distEsCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellPosition extends js.Object {
  var columnIndex: scala.Double
  var rowIndex: scala.Double
}

object CellPosition {
  @scala.inline
  def apply(columnIndex: scala.Double, rowIndex: scala.Double): CellPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnIndex")(columnIndex)
    __obj.updateDynamic("rowIndex")(rowIndex)
    __obj.asInstanceOf[CellPosition]
  }
}

