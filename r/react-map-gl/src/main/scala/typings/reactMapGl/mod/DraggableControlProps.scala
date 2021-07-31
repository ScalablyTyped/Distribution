package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableControlProps
  extends StObject
     with BaseControlProps {
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var onDrag: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  
  var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
}
object DraggableControlProps {
  
  @scala.inline
  def apply(): DraggableControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableControlProps]
  }
  
  @scala.inline
  implicit class DraggableControlPropsMutableBuilder[Self <: DraggableControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setOnDrag(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnd(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* event */ DragEvent => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
  }
}
