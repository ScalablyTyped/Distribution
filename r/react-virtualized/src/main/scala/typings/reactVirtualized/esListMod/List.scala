package typings.reactVirtualized.esListMod

import typings.react.mod.Component
import typings.reactVirtualized.AnonAlignmentIndex
import typings.reactVirtualized.AnonAutoHeight
import typings.reactVirtualized.PartialCellPosition
import typings.reactVirtualized.esCellMeasurerMod.CellPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/List", "List")
@js.native
class List ()
  extends Component[ListProps, js.Object, js.Any] {
  var Grid: js.UndefOr[typings.reactVirtualized.esGridMod.Grid] = js.native
  def forceUpdateGrid(): Unit = js.native
  /** See Grid#getOffsetForCell */
  def getOffsetForRow(params: AnonAlignmentIndex): Double = js.native
  /** CellMeasurer compatibility */
  def invalidateCellSizeAfterRender(hasColumnIndexRowIndex: CellPosition): Unit = js.native
  /** See Grid#measureAllCells */
  def measureAllRows(): Unit = js.native
  /** CellMeasurer compatibility */
  def recomputeGridSize(): Unit = js.native
  def recomputeGridSize(params: PartialCellPosition): Unit = js.native
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
@JSImport("react-virtualized/dist/es/List", "List")
@js.native
object List extends js.Object {
  var defaultProps: AnonAutoHeight = js.native
}

