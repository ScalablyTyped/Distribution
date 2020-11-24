package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiftRequest extends js.Object {
  
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
  implicit class LiftRequestOps[Self <: LiftRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDraggableId(value: DraggableId): Self = this.set("draggableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOptions(value: ScrollOptions): Self = this.set("scrollOptions", value.asInstanceOf[js.Any])
  }
}
