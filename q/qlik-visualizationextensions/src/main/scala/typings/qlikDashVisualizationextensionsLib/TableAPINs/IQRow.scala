package typings
package qlikDashVisualizationextensionsLib.TableAPINs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cells")(cells)
    __obj.updateDynamic("dimensions")(dimensions)
    __obj.updateDynamic("measures")(measures)
    __obj.asInstanceOf[IQRow]
  }
}

