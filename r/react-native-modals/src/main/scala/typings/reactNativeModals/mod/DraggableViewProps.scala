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
  
  @scala.inline
  def apply(): DraggableViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableViewProps]
  }
  
  @scala.inline
  implicit class DraggableViewPropsMutableBuilder[Self <: DraggableViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnMove(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
    
    @scala.inline
    def setOnRelease(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
    
    @scala.inline
    def setOnSwipeOut(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onSwipeOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSwipeOutUndefined: Self = StObject.set(x, "onSwipeOut", js.undefined)
    
    @scala.inline
    def setOnSwiping(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onSwiping", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSwipingOut(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onSwipingOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSwipingOutUndefined: Self = StObject.set(x, "onSwipingOut", js.undefined)
    
    @scala.inline
    def setOnSwipingUndefined: Self = StObject.set(x, "onSwiping", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSwipeDirection(value: SwipeDirection | js.Array[SwipeDirection]): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeDirectionUndefined: Self = StObject.set(x, "swipeDirection", js.undefined)
    
    @scala.inline
    def setSwipeDirectionVarargs(value: SwipeDirection*): Self = StObject.set(x, "swipeDirection", js.Array(value :_*))
    
    @scala.inline
    def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
  }
}
