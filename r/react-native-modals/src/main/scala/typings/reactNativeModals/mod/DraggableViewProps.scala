package typings.reactNativeModals.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableViewProps extends js.Object {
  
  var onMove: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  
  var onRelease: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  
  var onSwipeOut: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  
  var onSwiping: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  
  var onSwipingOut: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var swipeDirection: js.UndefOr[SwipeDirection | js.Array[SwipeDirection]] = js.native
  
  var swipeThreshold: js.UndefOr[Double] = js.native
}
object DraggableViewProps {
  
  @scala.inline
  def apply(): DraggableViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableViewProps]
  }
  
  @scala.inline
  implicit class DraggableViewPropsOps[Self <: DraggableViewProps] (val x: Self) extends AnyVal {
    
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
    def setOnMove(value: /* event */ DragEvent => Unit): Self = this.set("onMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMove: Self = this.set("onMove", js.undefined)
    
    @scala.inline
    def setOnRelease(value: /* event */ DragEvent => Unit): Self = this.set("onRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRelease: Self = this.set("onRelease", js.undefined)
    
    @scala.inline
    def setOnSwipeOut(value: /* event */ DragEvent => Unit): Self = this.set("onSwipeOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipeOut: Self = this.set("onSwipeOut", js.undefined)
    
    @scala.inline
    def setOnSwiping(value: /* event */ DragEvent => Unit): Self = this.set("onSwiping", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwiping: Self = this.set("onSwiping", js.undefined)
    
    @scala.inline
    def setOnSwipingOut(value: /* event */ DragEvent => Unit): Self = this.set("onSwipingOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwipingOut: Self = this.set("onSwipingOut", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setSwipeDirectionVarargs(value: SwipeDirection*): Self = this.set("swipeDirection", js.Array(value :_*))
    
    @scala.inline
    def setSwipeDirection(value: SwipeDirection | js.Array[SwipeDirection]): Self = this.set("swipeDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeDirection: Self = this.set("swipeDirection", js.undefined)
    
    @scala.inline
    def setSwipeThreshold(value: Double): Self = this.set("swipeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeThreshold: Self = this.set("swipeThreshold", js.undefined)
  }
}
