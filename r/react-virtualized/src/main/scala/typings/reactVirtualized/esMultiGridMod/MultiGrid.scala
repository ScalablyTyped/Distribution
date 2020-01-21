package typings.reactVirtualized.esMultiGridMod

import typings.react.mod.Component
import typings.reactVirtualized.Anon
import typings.reactVirtualized.AnonClassNameBottomLeftGrid
import typings.reactVirtualized.AnonColumnIndexRowIndex
import typings.reactVirtualized.esCellMeasurerMod.CellPosition
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/MultiGrid", "MultiGrid")
@js.native
class MultiGrid ()
  extends Component[MultiGridProps, MultiGridState, js.Any] {
  def forceUpdateGrids(): Unit = js.native
  /** See Grid#invalidateCellSizeAfterRender */
  def invalidateCellSizeAfterRender(): Unit = js.native
  def invalidateCellSizeAfterRender(params: Partial[CellPosition]): Unit = js.native
  /** See Grid#measureAllCells */
  def measureAllCells(): Unit = js.native
  /** See Grid#recomputeGridSize */
  def recomputeGridSize(): Unit = js.native
  def recomputeGridSize(params: AnonColumnIndexRowIndex): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/MultiGrid", "MultiGrid")
@js.native
object MultiGrid extends js.Object {
  var defaultProps: Anon = js.native
  var propTypes: AnonClassNameBottomLeftGrid = js.native
  def getDerivedStateFromProps(nextProps: MultiGridProps, prevState: MultiGridState): MultiGridState | Null = js.native
}

