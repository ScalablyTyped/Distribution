package typings.reactNativeModals.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableViewProps extends StObject {
  
  var onMove: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  
  var onRelease: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  
  var onSwipeOut: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  
  var onSwiping: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  
  var onSwipingOut: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var swipeDirection: js.UndefOr[SwipeDirection | js.Array[SwipeDirection]] = js.undefined
  
  var swipeThreshold: js.UndefOr[Double] = js.undefined
}
object DraggableViewProps {
  
  inline def apply(): DraggableViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableViewProps]
  }
  
  extension [Self <: DraggableViewProps](x: Self) {
    
    inline def setOnMove(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction1(value))
    
    inline def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
    
    inline def setOnRelease(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
    
    inline def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
    
    inline def setOnSwipeOut(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onSwipeOut", js.Any.fromFunction1(value))
    
    inline def setOnSwipeOutUndefined: Self = StObject.set(x, "onSwipeOut", js.undefined)
    
    inline def setOnSwiping(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onSwiping", js.Any.fromFunction1(value))
    
    inline def setOnSwipingOut(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onSwipingOut", js.Any.fromFunction1(value))
    
    inline def setOnSwipingOutUndefined: Self = StObject.set(x, "onSwipingOut", js.undefined)
    
    inline def setOnSwipingUndefined: Self = StObject.set(x, "onSwiping", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSwipeDirection(value: SwipeDirection | js.Array[SwipeDirection]): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
    
    inline def setSwipeDirectionUndefined: Self = StObject.set(x, "swipeDirection", js.undefined)
    
    inline def setSwipeDirectionVarargs(value: SwipeDirection*): Self = StObject.set(x, "swipeDirection", js.Array(value*))
    
    inline def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
    
    inline def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
  }
}
