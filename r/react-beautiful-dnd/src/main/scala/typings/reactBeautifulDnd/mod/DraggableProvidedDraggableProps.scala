package typings.reactBeautifulDnd.mod

import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableProvidedDraggableProps extends StObject {
  
  // used for shared global styles
  var `data-rbd-draggable-context-id`: String = js.native
  
  var `data-rbd-draggable-id`: String = js.native
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[_]] = js.native
  
  // inline style
  var style: js.UndefOr[DraggingStyle | NotDraggingStyle] = js.native
}
object DraggableProvidedDraggableProps {
  
  @scala.inline
  def apply(`data-rbd-draggable-context-id`: String, `data-rbd-draggable-id`: String): DraggableProvidedDraggableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-rbd-draggable-context-id")(`data-rbd-draggable-context-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-draggable-id")(`data-rbd-draggable-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProvidedDraggableProps]
  }
  
  @scala.inline
  implicit class DraggableProvidedDraggablePropsMutableBuilder[Self <: DraggableProvidedDraggableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setData-rbd-draggable-context-id`(value: String): Self = StObject.set(x, "data-rbd-draggable-context-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-rbd-draggable-id`(value: String): Self = StObject.set(x, "data-rbd-draggable-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTransitionEnd(value: TransitionEvent[_] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    @scala.inline
    def setStyle(value: DraggingStyle | NotDraggingStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
