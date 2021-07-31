package typings.reactCalendarTimeline.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactEventHandler
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<react-calendar-timeline.react-calendar-timeline.ItemRendererGetItemPropsReturnType, 'key' | 'ref'>> */
trait GetItemsProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var onContextMenu: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var onMouseDown: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var onMouseUp: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  
  var onTouchStart: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object GetItemsProps {
  
  @scala.inline
  def apply(): GetItemsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetItemsProps]
  }
  
  @scala.inline
  implicit class GetItemsPropsMutableBuilder[Self <: GetItemsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: SyntheticEvent[Element, Event] => scala.Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[Element, NativeMouseEvent] => scala.Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: MouseEvent[Element, NativeMouseEvent] => scala.Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: MouseEvent[Element, NativeMouseEvent] => scala.Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[Element] => scala.Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: TouchEvent[Element] => scala.Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
