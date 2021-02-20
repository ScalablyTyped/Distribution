package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverscanIndicesGetterParams extends StObject {
  
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
  implicit class OverscanIndicesGetterParamsMutableBuilder[Self <: OverscanIndicesGetterParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellCount(value: Double): Self = StObject.set(x, "cellCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setOverscanCellsCount(value: Double): Self = StObject.set(x, "overscanCellsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDirection(value: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL): Self = StObject.set(x, "scrollDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopIndex(value: Double): Self = StObject.set(x, "stopIndex", value.asInstanceOf[js.Any])
  }
}
