package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualViewportEventMap extends StObject {
  
  /* standard dom */
  var resize: Event
  
  /* standard dom */
  var scroll: Event
}
object VisualViewportEventMap {
  
  inline def apply(resize: Event, scroll: Event): VisualViewportEventMap = {
    val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualViewportEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualViewportEventMap] (val x: Self) extends AnyVal {
    
    inline def setResize(value: Event): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: Event): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
  }
}
