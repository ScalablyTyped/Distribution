package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.WheelEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexibleWidthXYPlotProps extends StObject {
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var dontCheckIfEmpty: js.UndefOr[Boolean] = js.undefined
  
  var margin: js.UndefOr[Margin | Double] = js.undefined
  
  var onClick: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onDoubleClick: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onMouseDown: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onMouseEnter: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onMouseLeave: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onMouseMove: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onMouseUp: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onTouchCancel: js.UndefOr[RVTouchEventHandler] = js.undefined
  
  var onTouchEnd: js.UndefOr[RVTouchEventHandler] = js.undefined
  
  var onTouchMove: js.UndefOr[RVTouchEventHandler] = js.undefined
  
  var onTouchStart: js.UndefOr[RVTouchEventHandler] = js.undefined
  
  var onWheel: js.UndefOr[RVWheelEventHandler] = js.undefined
  
  var stackBy: js.UndefOr[StackDirections] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object FlexibleWidthXYPlotProps {
  
  @scala.inline
  def apply(): FlexibleWidthXYPlotProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexibleWidthXYPlotProps]
  }
  
  @scala.inline
  implicit class FlexibleWidthXYPlotPropsMutableBuilder[Self <: FlexibleWidthXYPlotProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String | AnimationParam | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDontCheckIfEmpty(value: Boolean): Self = StObject.set(x, "dontCheckIfEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontCheckIfEmptyUndefined: Self = StObject.set(x, "dontCheckIfEmpty", js.undefined)
    
    @scala.inline
    def setMargin(value: Margin | Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setOnWheel(value: WheelEvent[HTMLElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    @scala.inline
    def setStackBy(value: StackDirections): Self = StObject.set(x, "stackBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackByUndefined: Self = StObject.set(x, "stackBy", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
