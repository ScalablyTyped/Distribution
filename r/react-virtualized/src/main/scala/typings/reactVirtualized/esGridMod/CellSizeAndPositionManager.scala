package typings.reactVirtualized.esGridMod

import typings.reactVirtualized.anon.ContainerSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellSizeAndPositionManager extends js.Object {
  
  def areOffsetsAdjusted(): Boolean = js.native
  
  def configure(hasCellCountEstimatedCellSize: ConfigureParams): Unit = js.native
  
  def getCellCount(): Double = js.native
  
  def getEstimatedCellSize(): Double = js.native
  
  def getLastMeasuredIndex(): Double = js.native
  
  def getOffsetAdjustment(hasContainerSizeOffset: ContainerSizeAndOffset): Double = js.native
  
  /**
    * This method returns the size and position for the cell at the specified index.
    * It just-in-time calculates (or used cached values) for cells leading up to the index.
    */
  def getSizeAndPositionOfCell(index: Double): SizeAndPositionData = js.native
  
  def getSizeAndPositionOfLastMeasuredCell(): SizeAndPositionData = js.native
  
  /**
    * Total size of all cells being measured.
    * This value will be completedly estimated initially.
    * As cells as measured the estimate will be updated.
    */
  def getTotalSize(): Double = js.native
  
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
  def getUpdatedOffsetForIndex(params: ContainerSize): Double = js.native
  
  def getVisibleCellRange(params: GetVisibleCellRangeParams): VisibleCellRange = js.native
  
  /**
    * Clear all cached values for cells after the specified index.
    * This method should be called for any cell that has changed its size.
    * It will not immediately perform any calculations; they'll be performed the next time getSizeAndPositionOfCell() is called.
    */
  def resetCell(index: Double): Unit = js.native
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
  implicit class CellSizeAndPositionManagerOps[Self <: CellSizeAndPositionManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAreOffsetsAdjusted(value: () => Boolean): Self = this.set("areOffsetsAdjusted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConfigure(value: ConfigureParams => Unit): Self = this.set("configure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCellCount(value: () => Double): Self = this.set("getCellCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEstimatedCellSize(value: () => Double): Self = this.set("getEstimatedCellSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastMeasuredIndex(value: () => Double): Self = this.set("getLastMeasuredIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOffsetAdjustment(value: ContainerSizeAndOffset => Double): Self = this.set("getOffsetAdjustment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSizeAndPositionOfCell(value: Double => SizeAndPositionData): Self = this.set("getSizeAndPositionOfCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSizeAndPositionOfLastMeasuredCell(value: () => SizeAndPositionData): Self = this.set("getSizeAndPositionOfLastMeasuredCell", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTotalSize(value: () => Double): Self = this.set("getTotalSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpdatedOffsetForIndex(value: ContainerSize => Double): Self = this.set("getUpdatedOffsetForIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVisibleCellRange(value: GetVisibleCellRangeParams => VisibleCellRange): Self = this.set("getVisibleCellRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetCell(value: Double => Unit): Self = this.set("resetCell", js.Any.fromFunction1(value))
  }
}
