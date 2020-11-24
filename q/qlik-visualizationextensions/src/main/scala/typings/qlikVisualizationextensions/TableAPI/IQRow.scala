package typings.qlikVisualizationextensions.TableAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQRow extends js.Object {
  
  /**
    * All cells, in the order they are defined in the properties.
    */
  var cells: js.Array[_] = js.native
  
  /**
    * Dimension cells.
    */
  var dimensions: js.Array[IQDimensionCell] = js.native
  
  /**
    * Measure cells.
    */
  var measures: js.Array[IQMeasureCell] = js.native
}
object IQRow {
  
  @scala.inline
  def apply(cells: js.Array[_], dimensions: js.Array[IQDimensionCell], measures: js.Array[IQMeasureCell]): IQRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], measures = measures.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQRow]
  }
  
  @scala.inline
  implicit class IQRowOps[Self <: IQRow] (val x: Self) extends AnyVal {
    
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
    def setCellsVarargs(value: js.Any*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[_]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsVarargs(value: IQDimensionCell*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[IQDimensionCell]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasuresVarargs(value: IQMeasureCell*): Self = this.set("measures", js.Array(value :_*))
    
    @scala.inline
    def setMeasures(value: js.Array[IQMeasureCell]): Self = this.set("measures", value.asInstanceOf[js.Any])
  }
}
