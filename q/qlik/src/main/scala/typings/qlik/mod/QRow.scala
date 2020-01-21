package typings.qlik.mod

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
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], measures = measures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QRow]
  }
}

