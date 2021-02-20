package typings.reactScrollbar

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import typings.reactScrollbar.anon.ContainerHeight
import org.scalablytyped.runtime.StObject
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
  implicit class ScrollAreaPropsMutableBuilder[Self <: ScrollAreaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
    
    @scala.inline
    def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    @scala.inline
    def setContentWindow(value: js.Any): Self = StObject.set(x, "contentWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWindowUndefined: Self = StObject.set(x, "contentWindow", js.undefined)
    
    @scala.inline
    def setFocusableTabIndex(value: Double): Self = StObject.set(x, "focusableTabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableTabIndexUndefined: Self = StObject.set(x, "focusableTabIndex", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalContainerStyle(value: CSSProperties): Self = StObject.set(x, "horizontalContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalContainerStyleUndefined: Self = StObject.set(x, "horizontalContainerStyle", js.undefined)
    
    @scala.inline
    def setHorizontalScrollbarStyle(value: CSSProperties): Self = StObject.set(x, "horizontalScrollbarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalScrollbarStyleUndefined: Self = StObject.set(x, "horizontalScrollbarStyle", js.undefined)
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setMinScrollSize(value: Double): Self = StObject.set(x, "minScrollSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScrollSizeUndefined: Self = StObject.set(x, "minScrollSize", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* value */ ContainerHeight => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOwnerDocument(value: js.Any): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerDocumentUndefined: Self = StObject.set(x, "ownerDocument", js.undefined)
    
    @scala.inline
    def setSmoothScrolling(value: Boolean): Self = StObject.set(x, "smoothScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothScrollingUndefined: Self = StObject.set(x, "smoothScrolling", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setStopScrollPropagation(value: Boolean): Self = StObject.set(x, "stopScrollPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopScrollPropagationUndefined: Self = StObject.set(x, "stopScrollPropagation", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSwapWheelAxes(value: Boolean): Self = StObject.set(x, "swapWheelAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapWheelAxesUndefined: Self = StObject.set(x, "swapWheelAxes", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalContainerStyle(value: CSSProperties): Self = StObject.set(x, "verticalContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalContainerStyleUndefined: Self = StObject.set(x, "verticalContainerStyle", js.undefined)
    
    @scala.inline
    def setVerticalScrollbarStyle(value: CSSProperties): Self = StObject.set(x, "verticalScrollbarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalScrollbarStyleUndefined: Self = StObject.set(x, "verticalScrollbarStyle", js.undefined)
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
