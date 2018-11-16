package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Table", "Table")
@js.native
class Table ()
  extends reactLib.reactMod.PureComponent[TableProps, js.Object, js.Any] {
  var Grid: reactDashVirtualizedLib.distEsGridMod.Grid = js.native
  def forceUpdateGrid(): scala.Unit = js.native
  /** See Grid#getOffsetForCell */
  def getOffsetForRow(params: reactDashVirtualizedLib.Anon_Alignment): scala.Double = js.native
  /** See Grid#measureAllCells */
  def measureAllRows(): scala.Unit = js.native
  /** See Grid#recomputeGridSize */
  def recomputeRowHeights(): scala.Unit = js.native
  /** See Grid#recomputeGridSize */
  def recomputeRowHeights(index: scala.Double): scala.Unit = js.native
  /** See Grid#scrollToPosition */
  def scrollToPosition(): scala.Unit = js.native
  /** See Grid#scrollToPosition */
  def scrollToPosition(scrollTop: scala.Double): scala.Unit = js.native
  /** See Grid#scrollToCell */
  def scrollToRow(): scala.Unit = js.native
  /** See Grid#scrollToCell */
  def scrollToRow(index: scala.Double): scala.Unit = js.native
}

@JSImport("react-virtualized/dist/es/Table", "Table")
@js.native
object Table extends js.Object {
  var defaultProps: reactDashVirtualizedLib.Anon_EstimatedRowSize = js.native
  var propTypes: reactDashVirtualizedLib.Anon_Children = js.native
}

