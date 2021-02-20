package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiftRequest extends StObject {
  
  var draggableId: DraggableId = js.native
  
  var scrollOptions: ScrollOptions = js.native
}
object LiftRequest {
  
  @scala.inline
  def apply(draggableId: DraggableId, scrollOptions: ScrollOptions): LiftRequest = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], scrollOptions = scrollOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiftRequest]
  }
  
  @scala.inline
  implicit class LiftRequestMutableBuilder[Self <: LiftRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggableId(value: DraggableId): Self = StObject.set(x, "draggableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOptions(value: ScrollOptions): Self = StObject.set(x, "scrollOptions", value.asInstanceOf[js.Any])
  }
}
