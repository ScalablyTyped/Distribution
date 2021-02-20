package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentAndElementEventHandlersEventMap extends StObject {
  
  var copy: ClipboardEvent = js.native
  
  var cut: ClipboardEvent = js.native
  
  var paste: ClipboardEvent = js.native
}
object DocumentAndElementEventHandlersEventMap {
  
  @scala.inline
  def apply(copy: ClipboardEvent, cut: ClipboardEvent, paste: ClipboardEvent): DocumentAndElementEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAndElementEventHandlersEventMap]
  }
  
  @scala.inline
  implicit class DocumentAndElementEventHandlersEventMapMutableBuilder[Self <: DocumentAndElementEventHandlersEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: ClipboardEvent): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCut(value: ClipboardEvent): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaste(value: ClipboardEvent): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
  }
}
