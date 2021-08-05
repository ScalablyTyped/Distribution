package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverscanIndicesGetterParams extends StObject {
  
  var cellCount: Double
  
  var direction: js.UndefOr[SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL] = js.undefined
  
  var overscanCellsCount: Double
  
  var scrollDirection: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL
  
  var startIndex: Double
  
  var stopIndex: Double
}
object OverscanIndicesGetterParams {
  
  inline def apply(
    cellCount: Double,
    overscanCellsCount: Double,
    scrollDirection: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL,
    startIndex: Double,
    stopIndex: Double
  ): OverscanIndicesGetterParams = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], overscanCellsCount = overscanCellsCount.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], stopIndex = stopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverscanIndicesGetterParams]
  }
  
  extension [Self <: OverscanIndicesGetterParams](x: Self) {
    
    inline def setCellCount(value: Double): Self = StObject.set(x, "cellCount", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setOverscanCellsCount(value: Double): Self = StObject.set(x, "overscanCellsCount", value.asInstanceOf[js.Any])
    
    inline def setScrollDirection(value: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL): Self = StObject.set(x, "scrollDirection", value.asInstanceOf[js.Any])
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStopIndex(value: Double): Self = StObject.set(x, "stopIndex", value.asInstanceOf[js.Any])
  }
}
