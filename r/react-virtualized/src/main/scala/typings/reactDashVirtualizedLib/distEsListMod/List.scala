package typings
package reactDashVirtualizedLib.distEsListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/List", "List")
@js.native
class List ()
  extends reactLib.reactMod.PureComponent[ListProps, js.Object, js.Any] {
  var Grid: js.UndefOr[reactDashVirtualizedLib.distEsGridMod.Grid] = js.native
  def forceUpdateGrid(): scala.Unit = js.native
  /** See Grid#getOffsetForCell */
  def getOffsetForRow(params: reactDashVirtualizedLib.Anon_Alignment): scala.Double = js.native
  /** CellMeasurer compatibility */
  def invalidateCellSizeAfterRender(hasColumnIndexRowIndex: reactDashVirtualizedLib.distEsCellMeasurerMod.CellPosition): scala.Unit = js.native
  /** See Grid#measureAllCells */
  def measureAllRows(): scala.Unit = js.native
  /** CellMeasurer compatibility */
  def recomputeGridSize(): scala.Unit = js.native
  /** CellMeasurer compatibility */
  def recomputeGridSize(params: stdLib.Partial[reactDashVirtualizedLib.distEsCellMeasurerMod.CellPosition]): scala.Unit = js.native
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

@JSImport("react-virtualized/dist/es/List", "List")
@js.native
object List extends js.Object {
  var defaultProps: reactDashVirtualizedLib.Anon_EstimatedRowSize30 = js.native
}

