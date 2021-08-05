package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentAndElementEventHandlersEventMap extends StObject {
  
  var copy: ClipboardEvent
  
  var cut: ClipboardEvent
  
  var paste: ClipboardEvent
}
object DocumentAndElementEventHandlersEventMap {
  
  inline def apply(copy: ClipboardEvent, cut: ClipboardEvent, paste: ClipboardEvent): DocumentAndElementEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAndElementEventHandlersEventMap]
  }
  
  extension [Self <: DocumentAndElementEventHandlersEventMap](x: Self) {
    
    inline def setCopy(value: ClipboardEvent): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCut(value: ClipboardEvent): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
    
    inline def setPaste(value: ClipboardEvent): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
  }
}
