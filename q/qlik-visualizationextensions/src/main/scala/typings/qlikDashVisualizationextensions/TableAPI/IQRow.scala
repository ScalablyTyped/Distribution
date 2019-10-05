package typings.qlikDashVisualizationextensions.TableAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQRow extends js.Object {
  /**
    * All cells, in the order they are defined in the properties.
    */
  var cells: js.Array[_]
  /**
    * Dimension cells.
    */
  var dimensions: js.Array[IQDimensionCell]
  /**
    * Measure cells.
    */
  var measures: js.Array[IQMeasureCell]
}

object IQRow {
  @scala.inline
  def apply(cells: js.Array[_], dimensions: js.Array[IQDimensionCell], measures: js.Array[IQMeasureCell]): IQRow = {
    val __obj = js.Dynamic.literal(cells = cells, dimensions = dimensions, measures = measures)
  
    __obj.asInstanceOf[IQRow]
  }
}

