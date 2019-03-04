package typings
package reactDashVirtualizedLib.distEsMultiGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/MultiGrid", "MultiGrid")
@js.native
class MultiGrid ()
  extends reactLib.reactMod.PureComponent[MultiGridProps, MultiGridState, js.Any] {
  def forceUpdateGrids(): scala.Unit = js.native
  /** See Grid#invalidateCellSizeAfterRender */
  def invalidateCellSizeAfterRender(): scala.Unit = js.native
  def invalidateCellSizeAfterRender(params: stdLib.Partial[reactDashVirtualizedLib.distEsCellMeasurerMod.CellPosition]): scala.Unit = js.native
  /** See Grid#measureAllCells */
  def measureAllCells(): scala.Unit = js.native
  /** See Grid#recomputeGridSize */
  def recomputeGridSize(): scala.Unit = js.native
  def recomputeGridSize(params: reactDashVirtualizedLib.Anon_ColumnIndexRowIndex): scala.Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/MultiGrid", "MultiGrid")
@js.native
object MultiGrid extends js.Object {
  var defaultProps: reactDashVirtualizedLib.Anon_ = js.native
  var propTypes: reactDashVirtualizedLib.Anon_ClassNameBottomLeftGrid = js.native
  def getDerivedStateFromProps(
    nextProps: reactDashVirtualizedLib.distEsMultiGridMod.MultiGridProps,
    prevState: reactDashVirtualizedLib.distEsMultiGridMod.MultiGridState
  ): reactDashVirtualizedLib.distEsMultiGridMod.MultiGridState | scala.Null = js.native
}

