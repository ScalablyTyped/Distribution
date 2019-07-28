package typings.reactDashVirtualized

import typings.reactDashVirtualized.distEsGridMod.GridCellRenderer
import typings.reactDashVirtualized.reactDashVirtualizedMod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellRenderer extends js.Object {
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

object Anon_CellRenderer {
  @scala.inline
  def apply(
    cellRenderer: GridCellRenderer,
    columnCount: Double,
    columnWidth: Double | (js.Function1[/* params */ Index, Double])
  ): Anon_CellRenderer = {
    val __obj = js.Dynamic.literal(cellRenderer = cellRenderer, columnCount = columnCount, columnWidth = columnWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CellRenderer]
  }
}

