package typings.reactDashVirtualized.distEsTableMod

import typings.react.reactMod.Component
import typings.reactDashVirtualized.Anon_0110
import typings.reactDashVirtualized.Anon_AlignmentIndex
import typings.reactDashVirtualized.Anon_ArialabelAutoHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Table", "Table")
@js.native
class Table ()
  extends Component[TableProps, js.Object, js.Any] {
  var Grid: typings.reactDashVirtualized.distEsGridMod.Grid = js.native
  def forceUpdateGrid(): Unit = js.native
  /** See Grid#getOffsetForCell */
  def getOffsetForRow(params: Anon_AlignmentIndex): Double = js.native
  /** See Grid#measureAllCells */
  def measureAllRows(): Unit = js.native
  /** See Grid#recomputeGridSize */
  def recomputeRowHeights(): Unit = js.native
  def recomputeRowHeights(index: Double): Unit = js.native
  /** See Grid#scrollToPosition */
  def scrollToPosition(): Unit = js.native
  def scrollToPosition(scrollTop: Double): Unit = js.native
  /** See Grid#scrollToCell */
  def scrollToRow(): Unit = js.native
  def scrollToRow(index: Double): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/Table", "Table")
@js.native
object Table extends js.Object {
  var defaultProps: Anon_0110 = js.native
  var propTypes: Anon_ArialabelAutoHeight = js.native
}

