package typings.reactVirtualized.esGridMod

import typings.reactVirtualized.anon.ContainerSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellSizeAndPositionManager extends StObject {
  
  def areOffsetsAdjusted(): Boolean
  
  def configure(hasCellCountEstimatedCellSize: ConfigureParams): Unit
  
  def getCellCount(): Double
  
  def getEstimatedCellSize(): Double
  
  def getLastMeasuredIndex(): Double
  
  def getOffsetAdjustment(hasContainerSizeOffset: ContainerSizeAndOffset): Double
  
  /**
    * This method returns the size and position for the cell at the specified index.
    * It just-in-time calculates (or used cached values) for cells leading up to the index.
    */
  def getSizeAndPositionOfCell(index: Double): SizeAndPositionData
  
  def getSizeAndPositionOfLastMeasuredCell(): SizeAndPositionData
  
  /**
    * Total size of all cells being measured.
    * This value will be completedly estimated initially.
    * As cells as measured the estimate will be updated.
    */
  def getTotalSize(): Double
  
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
  def getUpdatedOffsetForIndex(params: ContainerSize): Double
  
  def getVisibleCellRange(params: GetVisibleCellRangeParams): VisibleCellRange
  
  /**
    * Clear all cached values for cells after the specified index.
    * This method should be called for any cell that has changed its size.
    * It will not immediately perform any calculations; they'll be performed the next time getSizeAndPositionOfCell() is called.
    */
  def resetCell(index: Double): Unit
}
object CellSizeAndPositionManager {
  
  @scala.inline
  def apply(
    areOffsetsAdjusted: () => Boolean,
    configure: ConfigureParams => Unit,
    getCellCount: () => Double,
    getEstimatedCellSize: () => Double,
    getLastMeasuredIndex: () => Double,
    getOffsetAdjustment: ContainerSizeAndOffset => Double,
    getSizeAndPositionOfCell: Double => SizeAndPositionData,
    getSizeAndPositionOfLastMeasuredCell: () => SizeAndPositionData,
    getTotalSize: () => Double,
    getUpdatedOffsetForIndex: ContainerSize => Double,
    getVisibleCellRange: GetVisibleCellRangeParams => VisibleCellRange,
    resetCell: Double => Unit
  ): CellSizeAndPositionManager = {
    val __obj = js.Dynamic.literal(areOffsetsAdjusted = js.Any.fromFunction0(areOffsetsAdjusted), configure = js.Any.fromFunction1(configure), getCellCount = js.Any.fromFunction0(getCellCount), getEstimatedCellSize = js.Any.fromFunction0(getEstimatedCellSize), getLastMeasuredIndex = js.Any.fromFunction0(getLastMeasuredIndex), getOffsetAdjustment = js.Any.fromFunction1(getOffsetAdjustment), getSizeAndPositionOfCell = js.Any.fromFunction1(getSizeAndPositionOfCell), getSizeAndPositionOfLastMeasuredCell = js.Any.fromFunction0(getSizeAndPositionOfLastMeasuredCell), getTotalSize = js.Any.fromFunction0(getTotalSize), getUpdatedOffsetForIndex = js.Any.fromFunction1(getUpdatedOffsetForIndex), getVisibleCellRange = js.Any.fromFunction1(getVisibleCellRange), resetCell = js.Any.fromFunction1(resetCell))
    __obj.asInstanceOf[CellSizeAndPositionManager]
  }
  
  @scala.inline
  implicit class CellSizeAndPositionManagerMutableBuilder[Self <: CellSizeAndPositionManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreOffsetsAdjusted(value: () => Boolean): Self = StObject.set(x, "areOffsetsAdjusted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConfigure(value: ConfigureParams => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCellCount(value: () => Double): Self = StObject.set(x, "getCellCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEstimatedCellSize(value: () => Double): Self = StObject.set(x, "getEstimatedCellSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastMeasuredIndex(value: () => Double): Self = StObject.set(x, "getLastMeasuredIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOffsetAdjustment(value: ContainerSizeAndOffset => Double): Self = StObject.set(x, "getOffsetAdjustment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSizeAndPositionOfCell(value: Double => SizeAndPositionData): Self = StObject.set(x, "getSizeAndPositionOfCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSizeAndPositionOfLastMeasuredCell(value: () => SizeAndPositionData): Self = StObject.set(x, "getSizeAndPositionOfLastMeasuredCell", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTotalSize(value: () => Double): Self = StObject.set(x, "getTotalSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpdatedOffsetForIndex(value: ContainerSize => Double): Self = StObject.set(x, "getUpdatedOffsetForIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVisibleCellRange(value: GetVisibleCellRangeParams => VisibleCellRange): Self = StObject.set(x, "getVisibleCellRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetCell(value: Double => Unit): Self = StObject.set(x, "resetCell", js.Any.fromFunction1(value))
  }
}
