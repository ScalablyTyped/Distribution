package typings.reactVirtualized.esGridMod

import typings.react.mod.ReactNode
import typings.reactVirtualized.mod.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridProps
  extends StObject
     with GridCoreProps {
  
  /**
    * Responsible for rendering a cell given an row and column index.
    * Should implement the following interface: ({ columnIndex: number, rowIndex: number }): PropTypes.node
    */
  var cellRenderer: GridCellRenderer
  
  /**
    * Number of columns in grid.
    */
  var columnCount: Double
  
  /**
    * Either a fixed column width (number) or a function that returns the width of a column given its index.
    * Should implement the following interface: (index: number): number
    */
  var columnWidth: Double | (js.Function1[/* params */ Index, Double])
}
object GridProps {
  
  @scala.inline
  def apply(
    cellRenderer: /* props */ GridCellProps => ReactNode,
    columnCount: Double,
    columnWidth: Double | (js.Function1[/* params */ Index, Double]),
    height: Double,
    rowCount: Double,
    rowHeight: Double | (js.Function1[/* params */ Index, Double]),
    width: Double
  ): GridProps = {
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction1(cellRenderer), columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
  
  @scala.inline
  implicit class GridPropsMutableBuilder[Self <: GridProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellRenderer(value: /* props */ GridCellProps => ReactNode): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidth(value: Double | (js.Function1[/* params */ Index, Double])): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthFunction1(value: /* params */ Index => Double): Self = StObject.set(x, "columnWidth", js.Any.fromFunction1(value))
  }
}
