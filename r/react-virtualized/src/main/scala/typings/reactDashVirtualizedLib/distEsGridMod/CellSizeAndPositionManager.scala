package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSizeAndPositionManager extends js.Object {
  def areOffsetsAdjusted(): scala.Boolean
  def configure(hasCellCountEstimatedCellSize: ConfigureParams): scala.Unit
  def getCellCount(): scala.Double
  def getEstimatedCellSize(): scala.Double
  def getLastMeasuredIndex(): scala.Double
  def getOffsetAdjustment(hasContainerSizeOffset: ContainerSizeAndOffset): scala.Double
  /**
    * This method returns the size and position for the cell at the specified index.
    * It just-in-time calculates (or used cached values) for cells leading up to the index.
    */
  def getSizeAndPositionOfCell(index: scala.Double): SizeAndPositionData
  def getSizeAndPositionOfLastMeasuredCell(): SizeAndPositionData
  /**
    * Total size of all cells being measured.
    * This value will be completedly estimated initially.
    * As cells as measured the estimate will be updated.
    */
  def getTotalSize(): scala.Double
  /**
    * Determines a new offset that ensures a certain cell is visible, given the current offset.
    * If the cell is already visible then the current offset will be returned.
    * If the current offset is too great or small, it will be adjusted just enough to ensure the specified index is visible.
    *
    * @param align Desired alignment within container; one of "auto" (default), "start", or "end"
    * @param containerSize Size (width or height) of the container viewport
    * @param currentOffset Container's current (x or y) offset
    * @param totalSize Total size (width or height) of all cells
    * @return Offset to use to ensure the specified cell is visible
    */
  def getUpdatedOffsetForIndex(params: reactDashVirtualizedLib.Anon_AlignContainerSize): scala.Double
  def getVisibleCellRange(params: GetVisibleCellRangeParams): VisibleCellRange
  /**
    * Clear all cached values for cells after the specified index.
    * This method should be called for any cell that has changed its size.
    * It will not immediately perform any calculations; they'll be performed the next time getSizeAndPositionOfCell() is called.
    */
  def resetCell(index: scala.Double): scala.Unit
}

object CellSizeAndPositionManager {
  @scala.inline
  def apply(
    areOffsetsAdjusted: () => scala.Boolean,
    configure: ConfigureParams => scala.Unit,
    getCellCount: () => scala.Double,
    getEstimatedCellSize: () => scala.Double,
    getLastMeasuredIndex: () => scala.Double,
    getOffsetAdjustment: ContainerSizeAndOffset => scala.Double,
    getSizeAndPositionOfCell: scala.Double => SizeAndPositionData,
    getSizeAndPositionOfLastMeasuredCell: () => SizeAndPositionData,
    getTotalSize: () => scala.Double,
    getUpdatedOffsetForIndex: reactDashVirtualizedLib.Anon_AlignContainerSize => scala.Double,
    getVisibleCellRange: GetVisibleCellRangeParams => VisibleCellRange,
    resetCell: scala.Double => scala.Unit
  ): CellSizeAndPositionManager = {
    val __obj = js.Dynamic.literal(areOffsetsAdjusted = js.Any.fromFunction0(areOffsetsAdjusted), configure = js.Any.fromFunction1(configure), getCellCount = js.Any.fromFunction0(getCellCount), getEstimatedCellSize = js.Any.fromFunction0(getEstimatedCellSize), getLastMeasuredIndex = js.Any.fromFunction0(getLastMeasuredIndex), getOffsetAdjustment = js.Any.fromFunction1(getOffsetAdjustment), getSizeAndPositionOfCell = js.Any.fromFunction1(getSizeAndPositionOfCell), getSizeAndPositionOfLastMeasuredCell = js.Any.fromFunction0(getSizeAndPositionOfLastMeasuredCell), getTotalSize = js.Any.fromFunction0(getTotalSize), getUpdatedOffsetForIndex = js.Any.fromFunction1(getUpdatedOffsetForIndex), getVisibleCellRange = js.Any.fromFunction1(getVisibleCellRange), resetCell = js.Any.fromFunction1(resetCell))
  
    __obj.asInstanceOf[CellSizeAndPositionManager]
  }
}

