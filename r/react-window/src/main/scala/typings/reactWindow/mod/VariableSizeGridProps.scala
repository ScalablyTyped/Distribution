package typings.reactWindow.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableSizeGridProps extends GridProps {
  
  /**
    * Returns the width of the specified column.
    */
  def columnWidth(index: Double): Double = js.native
  
  /**
    * Average (or estimated) column width for unrendered columns.
    *
    * This value is used to calculated the estimated total width of a Grid before its columns have all been measured.
    * The estimated width impacts user scrolling behavior. It is updated whenever new columns are measured.
    */
  var estimatedColumnWidth: js.UndefOr[Double] = js.native
  
  /**
    * Average (or estimated) row height for unrendered rows.
    *
    * This value is used to calculated the estimated total height of a Grid before its rows have all been measured.
    * The estimated height impacts user scrolling behavior. It is updated whenever new rows are measured.
    */
  var estimatedRowHeight: js.UndefOr[Double] = js.native
  
  /**
    * Returns the height of the specified row.
    */
  def rowHeight(index: Double): Double = js.native
}
object VariableSizeGridProps {
  
  @scala.inline
  def apply(
    children: ComponentType[GridChildComponentProps],
    columnCount: Double,
    columnWidth: Double => Double,
    height: Double,
    rowCount: Double,
    rowHeight: Double => Double,
    width: Double
  ): VariableSizeGridProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnWidth = js.Any.fromFunction1(columnWidth), height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = js.Any.fromFunction1(rowHeight), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableSizeGridProps]
  }
  
  @scala.inline
  implicit class VariableSizeGridPropsOps[Self <: VariableSizeGridProps] (val x: Self) extends AnyVal {
    
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
    def setColumnWidth(value: Double => Double): Self = this.set("columnWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowHeight(value: Double => Double): Self = this.set("rowHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEstimatedColumnWidth(value: Double): Self = this.set("estimatedColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedColumnWidth: Self = this.set("estimatedColumnWidth", js.undefined)
    
    @scala.inline
    def setEstimatedRowHeight(value: Double): Self = this.set("estimatedRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedRowHeight: Self = this.set("estimatedRowHeight", js.undefined)
  }
}
