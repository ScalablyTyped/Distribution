package typings.slickCarousel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CurX extends StObject {
    
    var curX: js.UndefOr[Double] = js.native
    
    var curY: js.UndefOr[Double] = js.native
    
    var edgeHit: js.UndefOr[Boolean] = js.native
    
    var fingerCount: js.UndefOr[Double] = js.native
    
    var minSwipe: js.UndefOr[Double] = js.native
    
    var startX: js.UndefOr[Double] = js.native
    
    var startY: js.UndefOr[Double] = js.native
    
    var swipeLength: js.UndefOr[Double] = js.native
    
    var verticalSwiping: js.UndefOr[Boolean] = js.native
  }
  object CurX {
    
    @scala.inline
    def apply(): CurX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurX]
    }
    
    @scala.inline
    implicit class CurXMutableBuilder[Self <: CurX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurX(value: Double): Self = StObject.set(x, "curX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurXUndefined: Self = StObject.set(x, "curX", js.undefined)
      
      @scala.inline
      def setCurY(value: Double): Self = StObject.set(x, "curY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurYUndefined: Self = StObject.set(x, "curY", js.undefined)
      
      @scala.inline
      def setEdgeHit(value: Boolean): Self = StObject.set(x, "edgeHit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeHitUndefined: Self = StObject.set(x, "edgeHit", js.undefined)
      
      @scala.inline
      def setFingerCount(value: Double): Self = StObject.set(x, "fingerCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerCountUndefined: Self = StObject.set(x, "fingerCount", js.undefined)
      
      @scala.inline
      def setMinSwipe(value: Double): Self = StObject.set(x, "minSwipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSwipeUndefined: Self = StObject.set(x, "minSwipe", js.undefined)
      
      @scala.inline
      def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartXUndefined: Self = StObject.set(x, "startX", js.undefined)
      
      @scala.inline
      def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartYUndefined: Self = StObject.set(x, "startY", js.undefined)
      
      @scala.inline
      def setSwipeLength(value: Double): Self = StObject.set(x, "swipeLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeLengthUndefined: Self = StObject.set(x, "swipeLength", js.undefined)
      
      @scala.inline
      def setVerticalSwiping(value: Boolean): Self = StObject.set(x, "verticalSwiping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalSwipingUndefined: Self = StObject.set(x, "verticalSwiping", js.undefined)
    }
  }
}
