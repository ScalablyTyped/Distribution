package typings.reactVirtualized.esCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellPosition extends js.Object {
  var columnIndex: Double
  var rowIndex: Double
}

object CellPosition {
  @scala.inline
  def apply(columnIndex: Double, rowIndex: Double): CellPosition = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellPosition]
  }
}

