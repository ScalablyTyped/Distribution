package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiftRequest extends StObject {
  
  var draggableId: DraggableId
  
  var scrollOptions: ScrollOptions
}
object LiftRequest {
  
  inline def apply(draggableId: DraggableId, scrollOptions: ScrollOptions): LiftRequest = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], scrollOptions = scrollOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiftRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiftRequest] (val x: Self) extends AnyVal {
    
    inline def setDraggableId(value: DraggableId): Self = StObject.set(x, "draggableId", value.asInstanceOf[js.Any])
    
    inline def setScrollOptions(value: ScrollOptions): Self = StObject.set(x, "scrollOptions", value.asInstanceOf[js.Any])
  }
}
