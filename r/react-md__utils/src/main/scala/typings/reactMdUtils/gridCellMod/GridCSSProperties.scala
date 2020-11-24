package typings.reactMdUtils.gridCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridCSSProperties extends js.Object {
  
  /**
    * The column that the cell should stop at. When this is `undefined`, it will
    * just appear in normal order within the grid and span only 1 column. If the
    * `colSpan` property was provided, this will be ignored.
    */
  var colEnd: js.UndefOr[Double | String] = js.native
  
  /**
    * The number of columns that the cell should span. If this value is provided,
    * it will be used instead of the `colEnd` property.
    *
    * Note: If this value is larger than the number of columns allowed in the
    * current grid, it will shrink all the other columns.
    */
  var colSpan: js.UndefOr[Double] = js.native
  
  /**
    * The column that the cell should start at. When this is `undefined`, it will
    * just appear in normal order within the grid.
    */
  var colStart: js.UndefOr[Double | String] = js.native
  
  /**
    * The row that the cell should end at. This is a nice way to be able to
    * reorder cells within your grid but will be ignored if the `rowSpan`
    * property is provided.
    */
  var rowEnd: js.UndefOr[Double | String] = js.native
  
  /**
    * The number of rows that a cell should span. If this value is provided, it
    * will be used instead of the `rowEnd` property. When this is `undefined`, it
    * will span 1 row as normal.
    */
  var rowSpan: js.UndefOr[Double] = js.native
  
  /**
    * The row that the cell should start at. This is a nice way to be able to
    * reorder cells within your grid.
    */
  var rowStart: js.UndefOr[Double | String] = js.native
}
object GridCSSProperties {
  
  @scala.inline
  def apply(): GridCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridCSSProperties]
  }
  
  @scala.inline
  implicit class GridCSSPropertiesOps[Self <: GridCSSProperties] (val x: Self) extends AnyVal {
    
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
    def setColEnd(value: Double | String): Self = this.set("colEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColEnd: Self = this.set("colEnd", js.undefined)
    
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    
    @scala.inline
    def setColStart(value: Double | String): Self = this.set("colStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColStart: Self = this.set("colStart", js.undefined)
    
    @scala.inline
    def setRowEnd(value: Double | String): Self = this.set("rowEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowEnd: Self = this.set("rowEnd", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    
    @scala.inline
    def setRowStart(value: Double | String): Self = this.set("rowStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowStart: Self = this.set("rowStart", js.undefined)
  }
}
