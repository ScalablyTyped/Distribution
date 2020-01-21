package typings.reactVirtualized

import typings.react.mod.ReactNode
import typings.reactVirtualized.esGridMod.GridCellProps
import typings.reactVirtualized.esGridMod.GridCellRenderer
import typings.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellRenderer extends js.Object {
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

object AnonCellRenderer {
  @scala.inline
  def apply(
    cellRenderer: /* props */ GridCellProps => ReactNode,
    columnCount: Double,
    columnWidth: Double | (js.Function1[/* params */ Index, Double])
  ): AnonCellRenderer = {
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction1(cellRenderer), columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCellRenderer]
  }
}

