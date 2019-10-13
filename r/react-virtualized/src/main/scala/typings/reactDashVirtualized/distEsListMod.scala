package typings.reactDashVirtualized

import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import typings.reactDashVirtualized.distEsCellMeasurerMod.CellPosition
import typings.reactDashVirtualized.distEsGridMod.GridCellProps
import typings.reactDashVirtualized.distEsGridMod.GridCoreProps
import typings.reactDashVirtualized.distEsListMod.ListProps
import typings.reactDashVirtualized.distEsListMod.ListRowProps
import typings.reactDashVirtualized.reactDashVirtualizedStrings.rowIndex
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/List", JSImport.Namespace)
@js.native
object distEsListMod extends js.Object {
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any] {
    var Grid: js.UndefOr[typings.reactDashVirtualized.distEsGridMod.Grid] = js.native
    def forceUpdateGrid(): Unit = js.native
    /** See Grid#getOffsetForCell */
    def getOffsetForRow(params: Anon_AlignmentIndex): Double = js.native
    /** CellMeasurer compatibility */
    def invalidateCellSizeAfterRender(hasColumnIndexRowIndex: CellPosition): Unit = js.native
    /** See Grid#measureAllCells */
    def measureAllRows(): Unit = js.native
    /** CellMeasurer compatibility */
    def recomputeGridSize(): Unit = js.native
    def recomputeGridSize(params: Partial[CellPosition]): Unit = js.native
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
  @js.native
  object List extends js.Object {
    var defaultProps: Anon_1 = js.native
  }
  
  type ListProps = GridCoreProps with Anon_AutoHeight
  type ListRowProps = (Pick[GridCellProps, Exclude[String, rowIndex]]) with Anon_Index
  type ListRowRenderer = js.Function1[/* props */ ListRowProps, ReactNode]
}

