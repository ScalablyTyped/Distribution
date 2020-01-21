package typings.reactVirtualized.esTableMod

import typings.react.mod.Component
import typings.reactVirtualized.Anon0110
import typings.reactVirtualized.AnonAlignmentIndex
import typings.reactVirtualized.AnonArialabelAutoHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Table", "Table")
@js.native
class Table ()
  extends Component[TableProps, js.Object, js.Any] {
  var Grid: typings.reactVirtualized.esGridMod.Grid = js.native
  def forceUpdateGrid(): Unit = js.native
  /** See Grid#getOffsetForCell */
  def getOffsetForRow(params: AnonAlignmentIndex): Double = js.native
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
  var defaultProps: Anon0110 = js.native
  var propTypes: AnonArialabelAutoHeight = js.native
}

