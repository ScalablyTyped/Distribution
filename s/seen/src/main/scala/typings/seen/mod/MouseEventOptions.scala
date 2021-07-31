package typings.seen.mod

import typings.std.Event
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseEventOptions extends StObject {
  
  var drag: js.UndefOr[EventListener] = js.undefined
  
  var dragEnd: js.UndefOr[EventListener] = js.undefined
  
  var dragStart: js.UndefOr[EventListener] = js.undefined
  
  var mouseDown: js.UndefOr[EventListener] = js.undefined
  
  var mouseMove: js.UndefOr[EventListener] = js.undefined
  
  var mouseUp: js.UndefOr[EventListener] = js.undefined
  
  var mouseWheel: js.UndefOr[EventListener] = js.undefined
}
object MouseEventOptions {
  
  @scala.inline
  def apply(): MouseEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseEventOptions]
  }
  
  @scala.inline
  implicit class MouseEventOptionsMutableBuilder[Self <: MouseEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrag(value: /* evt */ Event => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragEnd(value: /* evt */ Event => Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
    
    @scala.inline
    def setDragStart(value: /* evt */ Event => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setMouseDown(value: /* evt */ Event => Unit): Self = StObject.set(x, "mouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseDownUndefined: Self = StObject.set(x, "mouseDown", js.undefined)
    
    @scala.inline
    def setMouseMove(value: /* evt */ Event => Unit): Self = StObject.set(x, "mouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseMoveUndefined: Self = StObject.set(x, "mouseMove", js.undefined)
    
    @scala.inline
    def setMouseUp(value: /* evt */ Event => Unit): Self = StObject.set(x, "mouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseUpUndefined: Self = StObject.set(x, "mouseUp", js.undefined)
    
    @scala.inline
    def setMouseWheel(value: /* evt */ Event => Unit): Self = StObject.set(x, "mouseWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseWheelUndefined: Self = StObject.set(x, "mouseWheel", js.undefined)
  }
}
