package typings.slickCarousel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CurX extends StObject {
    
    var curX: js.UndefOr[Double] = js.undefined
    
    var curY: js.UndefOr[Double] = js.undefined
    
    var edgeHit: js.UndefOr[Boolean] = js.undefined
    
    var fingerCount: js.UndefOr[Double] = js.undefined
    
    var minSwipe: js.UndefOr[Double] = js.undefined
    
    var startX: js.UndefOr[Double] = js.undefined
    
    var startY: js.UndefOr[Double] = js.undefined
    
    var swipeLength: js.UndefOr[Double] = js.undefined
    
    var verticalSwiping: js.UndefOr[Boolean] = js.undefined
  }
  object CurX {
    
    inline def apply(): CurX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurX]
    }
    
    extension [Self <: CurX](x: Self) {
      
      inline def setCurX(value: Double): Self = StObject.set(x, "curX", value.asInstanceOf[js.Any])
      
      inline def setCurXUndefined: Self = StObject.set(x, "curX", js.undefined)
      
      inline def setCurY(value: Double): Self = StObject.set(x, "curY", value.asInstanceOf[js.Any])
      
      inline def setCurYUndefined: Self = StObject.set(x, "curY", js.undefined)
      
      inline def setEdgeHit(value: Boolean): Self = StObject.set(x, "edgeHit", value.asInstanceOf[js.Any])
      
      inline def setEdgeHitUndefined: Self = StObject.set(x, "edgeHit", js.undefined)
      
      inline def setFingerCount(value: Double): Self = StObject.set(x, "fingerCount", value.asInstanceOf[js.Any])
      
      inline def setFingerCountUndefined: Self = StObject.set(x, "fingerCount", js.undefined)
      
      inline def setMinSwipe(value: Double): Self = StObject.set(x, "minSwipe", value.asInstanceOf[js.Any])
      
      inline def setMinSwipeUndefined: Self = StObject.set(x, "minSwipe", js.undefined)
      
      inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      inline def setStartXUndefined: Self = StObject.set(x, "startX", js.undefined)
      
      inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
      
      inline def setStartYUndefined: Self = StObject.set(x, "startY", js.undefined)
      
      inline def setSwipeLength(value: Double): Self = StObject.set(x, "swipeLength", value.asInstanceOf[js.Any])
      
      inline def setSwipeLengthUndefined: Self = StObject.set(x, "swipeLength", js.undefined)
      
      inline def setVerticalSwiping(value: Boolean): Self = StObject.set(x, "verticalSwiping", value.asInstanceOf[js.Any])
      
      inline def setVerticalSwipingUndefined: Self = StObject.set(x, "verticalSwiping", js.undefined)
    }
  }
}
