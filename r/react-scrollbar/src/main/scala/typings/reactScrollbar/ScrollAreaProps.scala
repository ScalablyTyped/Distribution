package typings.reactScrollbar

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import typings.reactScrollbar.anon.ContainerHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollAreaProps extends Props[ScrollArea] {
  
  var className: js.UndefOr[String] = js.native
  
  var contentClassName: js.UndefOr[String] = js.native
  
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  
  var contentWindow: js.UndefOr[js.Any] = js.native
  
  var focusableTabIndex: js.UndefOr[Double] = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var horizontalContainerStyle: js.UndefOr[CSSProperties] = js.native
  
  var horizontalScrollbarStyle: js.UndefOr[CSSProperties] = js.native
  
  var minScrollSize: js.UndefOr[Double] = js.native
  
  var onScroll: js.UndefOr[js.Function1[/* value */ ContainerHeight, Unit]] = js.native
  
  var ownerDocument: js.UndefOr[js.Any] = js.native
  
  var smoothScrolling: js.UndefOr[Boolean] = js.native
  
  var speed: js.UndefOr[Double] = js.native
  
  var stopScrollPropagation: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var swapWheelAxes: js.UndefOr[Boolean] = js.native
  
  var vertical: js.UndefOr[Boolean] = js.native
  
  var verticalContainerStyle: js.UndefOr[CSSProperties] = js.native
  
  var verticalScrollbarStyle: js.UndefOr[CSSProperties] = js.native
}
object ScrollAreaProps {
  
  @scala.inline
  def apply(): ScrollAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollAreaProps]
  }
  
  @scala.inline
  implicit class ScrollAreaPropsOps[Self <: ScrollAreaProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    
    @scala.inline
    def setContentStyle(value: CSSProperties): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    
    @scala.inline
    def setContentWindow(value: js.Any): Self = this.set("contentWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentWindow: Self = this.set("contentWindow", js.undefined)
    
    @scala.inline
    def setFocusableTabIndex(value: Double): Self = this.set("focusableTabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusableTabIndex: Self = this.set("focusableTabIndex", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setHorizontalContainerStyle(value: CSSProperties): Self = this.set("horizontalContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalContainerStyle: Self = this.set("horizontalContainerStyle", js.undefined)
    
    @scala.inline
    def setHorizontalScrollbarStyle(value: CSSProperties): Self = this.set("horizontalScrollbarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalScrollbarStyle: Self = this.set("horizontalScrollbarStyle", js.undefined)
    
    @scala.inline
    def setMinScrollSize(value: Double): Self = this.set("minScrollSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinScrollSize: Self = this.set("minScrollSize", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* value */ ContainerHeight => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOwnerDocument(value: js.Any): Self = this.set("ownerDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerDocument: Self = this.set("ownerDocument", js.undefined)
    
    @scala.inline
    def setSmoothScrolling(value: Boolean): Self = this.set("smoothScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmoothScrolling: Self = this.set("smoothScrolling", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setStopScrollPropagation(value: Boolean): Self = this.set("stopScrollPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopScrollPropagation: Self = this.set("stopScrollPropagation", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSwapWheelAxes(value: Boolean): Self = this.set("swapWheelAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwapWheelAxes: Self = this.set("swapWheelAxes", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    
    @scala.inline
    def setVerticalContainerStyle(value: CSSProperties): Self = this.set("verticalContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalContainerStyle: Self = this.set("verticalContainerStyle", js.undefined)
    
    @scala.inline
    def setVerticalScrollbarStyle(value: CSSProperties): Self = this.set("verticalScrollbarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalScrollbarStyle: Self = this.set("verticalScrollbarStyle", js.undefined)
  }
}
