package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QRow extends js.Object {
  
  var cells: js.Array[QDimensionCell | QMeasureCell] = js.native
  
  var dimensions: js.Array[QDimensionCell] = js.native
  
  var measures: js.Array[QMeasureCell] = js.native
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
  
  @scala.inline
  implicit class QRowOps[Self <: QRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellsVarargs(value: (QDimensionCell | QMeasureCell)*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[QDimensionCell | QMeasureCell]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsVarargs(value: QDimensionCell*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[QDimensionCell]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasuresVarargs(value: QMeasureCell*): Self = this.set("measures", js.Array(value :_*))
    
    @scala.inline
    def setMeasures(value: js.Array[QMeasureCell]): Self = this.set("measures", value.asInstanceOf[js.Any])
  }
}
