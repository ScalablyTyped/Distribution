package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Responders extends StObject {
  
  var onBeforeCapture: js.UndefOr[OnBeforeCaptureResponder] = js.native
  
  var onBeforeDragStart: js.UndefOr[OnBeforeDragStartResponder] = js.native
  
  // always required
  var onDragEnd: OnDragEndResponder = js.native
  
  var onDragStart: js.UndefOr[OnDragStartResponder] = js.native
  
  var onDragUpdate: js.UndefOr[OnDragUpdateResponder] = js.native
}
object Responders {
  
  @scala.inline
  def apply(onDragEnd: (/* result */ DropResult, /* provided */ ResponderProvided) => Unit): Responders = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    __obj.asInstanceOf[Responders]
  }
  
  @scala.inline
  implicit class RespondersMutableBuilder[Self <: Responders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnBeforeCapture(value: /* before */ BeforeCapture => Unit): Self = StObject.set(x, "onBeforeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforeCaptureUndefined: Self = StObject.set(x, "onBeforeCapture", js.undefined)
    
    @scala.inline
    def setOnBeforeDragStart(value: /* start */ DragStart => Unit): Self = StObject.set(x, "onBeforeDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforeDragStartUndefined: Self = StObject.set(x, "onBeforeDragStart", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: (/* result */ DropResult, /* provided */ ResponderProvided) => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDragStart(value: (/* start */ DragStart, /* provided */ ResponderProvided) => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragUpdate(value: (/* update */ DragUpdate, /* provided */ ResponderProvided) => Unit): Self = StObject.set(x, "onDragUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDragUpdateUndefined: Self = StObject.set(x, "onDragUpdate", js.undefined)
  }
}
