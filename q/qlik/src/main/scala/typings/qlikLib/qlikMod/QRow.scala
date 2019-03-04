package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRow extends js.Object {
  var cells: js.Array[QDimensionCell | QMeasureCell]
  var dimensions: js.Array[QDimensionCell]
  var measures: js.Array[QMeasureCell]
}

object QRow {
  @scala.inline
  def apply(
    cells: js.Array[QDimensionCell | QMeasureCell],
    dimensions: js.Array[QDimensionCell],
    measures: js.Array[QMeasureCell]
  ): QRow = {
    val __obj = js.Dynamic.literal(cells = cells, dimensions = dimensions, measures = measures)
  
    __obj.asInstanceOf[QRow]
  }
}

