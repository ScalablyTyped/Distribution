package typings.reactVirtualized.esListMod

import typings.react.mod.Component
import typings.reactVirtualized.anon.AlignmentIndex
import typings.reactVirtualized.anon.AutoHeight
import typings.reactVirtualized.anon.PartialCellPosition
import typings.reactVirtualized.esCellMeasurerMod.CellPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/es/List", "List")
@js.native
class List ()
  extends Component[ListProps, js.Object, js.Any] {
  
  var Grid: js.UndefOr[typings.reactVirtualized.esGridMod.Grid] = js.native
  
  def forceUpdateGrid(): Unit = js.native
  
  /** See Grid#getOffsetForCell */
  def getOffsetForRow(params: AlignmentIndex): Double = js.native
  
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
  
  var defaultProps: AutoHeight = js.native
}
