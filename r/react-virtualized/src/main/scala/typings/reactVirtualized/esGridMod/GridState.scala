package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridState extends StObject {
  
  var isScrolling: Boolean
  
  var scrollDirectionHorizontal: ScrollDirection
  
  var scrollDirectionVertical: ScrollDirection
  
  var scrollLeft: Double
  
  var scrollTop: Double
}
object GridState {
  
  inline def apply(
    isScrolling: Boolean,
    scrollDirectionHorizontal: ScrollDirection,
    scrollDirectionVertical: ScrollDirection,
    scrollLeft: Double,
    scrollTop: Double
  ): GridState = {
    val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any], scrollDirectionHorizontal = scrollDirectionHorizontal.asInstanceOf[js.Any], scrollDirectionVertical = scrollDirectionVertical.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridState]
  }
  
  extension [Self <: GridState](x: Self) {
    
    inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollDirectionHorizontal(value: ScrollDirection): Self = StObject.set(x, "scrollDirectionHorizontal", value.asInstanceOf[js.Any])
    
    inline def setScrollDirectionVertical(value: ScrollDirection): Self = StObject.set(x, "scrollDirectionVertical", value.asInstanceOf[js.Any])
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
