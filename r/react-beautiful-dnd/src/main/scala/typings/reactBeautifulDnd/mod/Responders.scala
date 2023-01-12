package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responders extends StObject {
  
  var onBeforeCapture: js.UndefOr[OnBeforeCaptureResponder] = js.undefined
  
  var onBeforeDragStart: js.UndefOr[OnBeforeDragStartResponder] = js.undefined
  
  // always required
  var onDragEnd: OnDragEndResponder
  
  var onDragStart: js.UndefOr[OnDragStartResponder] = js.undefined
  
  var onDragUpdate: js.UndefOr[OnDragUpdateResponder] = js.undefined
}
object Responders {
  
  inline def apply(onDragEnd: (/* result */ DropResult, /* provided */ ResponderProvided) => Unit): Responders = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    __obj.asInstanceOf[Responders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responders] (val x: Self) extends AnyVal {
    
    inline def setOnBeforeCapture(value: /* before */ BeforeCapture => Unit): Self = StObject.set(x, "onBeforeCapture", js.Any.fromFunction1(value))
    
    inline def setOnBeforeCaptureUndefined: Self = StObject.set(x, "onBeforeCapture", js.undefined)
    
    inline def setOnBeforeDragStart(value: /* start */ DragStart => Unit): Self = StObject.set(x, "onBeforeDragStart", js.Any.fromFunction1(value))
    
    inline def setOnBeforeDragStartUndefined: Self = StObject.set(x, "onBeforeDragStart", js.undefined)
    
    inline def setOnDragEnd(value: (/* result */ DropResult, /* provided */ ResponderProvided) => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction2(value))
    
    inline def setOnDragStart(value: (/* start */ DragStart, /* provided */ ResponderProvided) => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUpdate(value: (/* update */ DragUpdate, /* provided */ ResponderProvided) => Unit): Self = StObject.set(x, "onDragUpdate", js.Any.fromFunction2(value))
    
    inline def setOnDragUpdateUndefined: Self = StObject.set(x, "onDragUpdate", js.undefined)
  }
}
