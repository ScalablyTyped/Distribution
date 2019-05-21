package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellRenderer extends js.Object {
  /**
    * Responsible for rendering a cell given an row and column index.
    * Should implement the following interface: ({ columnIndex: number, rowIndex: number }): PropTypes.node
    */
  var cellRenderer: reactDashVirtualizedLib.distEsGridMod.GridCellRenderer
  /**
    * Number of columns in grid.
    */
  var columnCount: scala.Double
  /**
    * Either a fixed column width (number) or a function that returns the width of a column given its index.
    * Should implement the following interface: (index: number): number
    */
  var columnWidth: scala.Double | (js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double])
}

object Anon_CellRenderer {
  @scala.inline
  def apply(
    cellRenderer: reactDashVirtualizedLib.distEsGridMod.GridCellRenderer,
    columnCount: scala.Double,
    columnWidth: scala.Double | (js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double])
  ): Anon_CellRenderer = {
    val __obj = js.Dynamic.literal(cellRenderer = cellRenderer, columnCount = columnCount, columnWidth = columnWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CellRenderer]
  }
}

