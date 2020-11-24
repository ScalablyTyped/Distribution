package typings.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverscanIndicesGetterParams extends js.Object {
  
  var cellCount: Double = js.native
  
  var direction: js.UndefOr[SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL] = js.native
  
  var overscanCellsCount: Double = js.native
  
  var scrollDirection: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL = js.native
  
  var startIndex: Double = js.native
  
  var stopIndex: Double = js.native
}
object OverscanIndicesGetterParams {
  
  @scala.inline
  def apply(
    cellCount: Double,
    overscanCellsCount: Double,
    scrollDirection: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL,
    startIndex: Double,
    stopIndex: Double
  ): OverscanIndicesGetterParams = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], overscanCellsCount = overscanCellsCount.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], stopIndex = stopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverscanIndicesGetterParams]
  }
  
  @scala.inline
  implicit class OverscanIndicesGetterParamsOps[Self <: OverscanIndicesGetterParams] (val x: Self) extends AnyVal {
    
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
    def setCellCount(value: Double): Self = this.set("cellCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanCellsCount(value: Double): Self = this.set("overscanCellsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDirection(value: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL): Self = this.set("scrollDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopIndex(value: Double): Self = this.set("stopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
  }
}
