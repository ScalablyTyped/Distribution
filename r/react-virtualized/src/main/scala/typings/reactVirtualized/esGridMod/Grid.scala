package typings.reactVirtualized.esGridMod

import typings.react.mod.Component
import typings.reactVirtualized.Anon01
import typings.reactVirtualized.AnonAlignment
import typings.reactVirtualized.AnonColumnIndex
import typings.reactVirtualized.AnonColumnIndexRowIndex
import typings.reactVirtualized.AnonScrollLeft
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Grid", "Grid")
@js.native
class Grid ()
  extends Component[GridProps, GridState, js.Any] {
  /**
    * Gets offsets for a given cell and alignment.
    */
  def getOffsetForCell(): ScrollOffset = js.native
  def getOffsetForCell(params: AnonAlignment): ScrollOffset = js.native
  /**
    * This method handles a scroll event originating from an external scroll control.
    * It's an advanced method and should probably not be used unless you're implementing a custom scroll-bar solution.
    */
  def handleScrollEvent(params: Partial[ScrollOffset]): Unit = js.native
  /**
    * Invalidate Grid size and recompute visible cells.
    * This is a deferred wrapper for recomputeGridSize().
    * It sets a flag to be evaluated on cDM/cDU to avoid unnecessary renders.
    * This method is intended for advanced use-cases like CellMeasurer.
    */
  // @TODO (bvaughn) Add automated test coverage for this.
  def invalidateCellSizeAfterRender(params: AnonColumnIndex): Unit = js.native
  /**
    * Pre-measure all columns and rows in a Grid.
    * Typically cells are only measured as needed and estimated sizes are used for cells that have not yet been measured.
    * This method ensures that the next call to getTotalSize() returns an exact size (as opposed to just an estimated one).
    */
  def measureAllCells(): Unit = js.native
  /**
    * Forced recompute of row heights and column widths.
    * This function should be called if dynamic column or row sizes have changed but nothing else has.
    * Since Grid only receives :columnCount and :rowCount it has no way of detecting when the underlying data changes.
    */
  def recomputeGridSize(): Unit = js.native
  def recomputeGridSize(params: AnonColumnIndexRowIndex): Unit = js.native
  /**
    * Ensure column and row are visible.
    */
  def scrollToCell(params: AnonColumnIndex): Unit = js.native
  /**
    * Scroll to the specified offset(s).
    * Useful for animating position changes.
    */
  def scrollToPosition(): Unit = js.native
  def scrollToPosition(params: AnonScrollLeft): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/Grid", "Grid")
@js.native
object Grid extends js.Object {
  var defaultProps: Anon01 = js.native
}

