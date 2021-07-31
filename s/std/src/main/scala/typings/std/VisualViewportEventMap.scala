package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualViewportEventMap extends StObject {
  
  var resize: UIEvent
  
  var scroll: Event
}
object VisualViewportEventMap {
  
  @scala.inline
  def apply(resize: UIEvent, scroll: Event): VisualViewportEventMap = {
    val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualViewportEventMap]
  }
  
  @scala.inline
  implicit class VisualViewportEventMapMutableBuilder[Self <: VisualViewportEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResize(value: UIEvent): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: Event): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
  }
}
