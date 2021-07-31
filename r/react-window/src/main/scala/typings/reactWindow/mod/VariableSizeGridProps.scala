package typings.reactWindow.mod

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableSizeGridProps
  extends StObject
     with GridProps {
  
  /**
    * Returns the width of the specified column.
    */
  def columnWidth(index: Double): Double
  
  /**
    * Average (or estimated) column width for unrendered columns.
    *
    * This value is used to calculated the estimated total width of a Grid before its columns have all been measured.
    * The estimated width impacts user scrolling behavior. It is updated whenever new columns are measured.
    */
  var estimatedColumnWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Average (or estimated) row height for unrendered rows.
    *
    * This value is used to calculated the estimated total height of a Grid before its rows have all been measured.
    * The estimated height impacts user scrolling behavior. It is updated whenever new rows are measured.
    */
  var estimatedRowHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Returns the height of the specified row.
    */
  def rowHeight(index: Double): Double
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
  implicit class VariableSizeGridPropsMutableBuilder[Self <: VariableSizeGridProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnWidth(value: Double => Double): Self = StObject.set(x, "columnWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEstimatedColumnWidth(value: Double): Self = StObject.set(x, "estimatedColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedColumnWidthUndefined: Self = StObject.set(x, "estimatedColumnWidth", js.undefined)
    
    @scala.inline
    def setEstimatedRowHeight(value: Double): Self = StObject.set(x, "estimatedRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedRowHeightUndefined: Self = StObject.set(x, "estimatedRowHeight", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double => Double): Self = StObject.set(x, "rowHeight", js.Any.fromFunction1(value))
  }
}
