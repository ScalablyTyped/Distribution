package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CellRenderer extends js.Object {
  /**
    * Responsible for rendering a cell given an row and column index.
    * Should implement the following interface: ({ columnIndex: number, rowIndex: number }): PropTypes.node
    */
  @JSName("cellRenderer")
  var cellRenderer_Original: reactDashVirtualizedLib.distEsGridMod.GridCellRenderer = js.native
  /**
    * Number of columns in grid.
    */
  var columnCount: scala.Double = js.native
  /**
    * Either a fixed column width (number) or a function that returns the width of a column given its index.
    * Should implement the following interface: (index: number): number
    */
  var columnWidth: scala.Double | (js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double]) = js.native
  /**
    * Responsible for rendering a cell given an row and column index.
    * Should implement the following interface: ({ columnIndex: number, rowIndex: number }): PropTypes.node
    */
  def cellRenderer(props: reactDashVirtualizedLib.distEsGridMod.GridCellProps): reactLib.reactMod.ReactNs.ReactNode = js.native
}

