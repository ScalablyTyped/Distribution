package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DroppablePublish extends js.Object {
  
  var droppableId: DroppableId = js.native
  
  var scroll: Position = js.native
}
object DroppablePublish {
  
  @scala.inline
  def apply(droppableId: DroppableId, scroll: Position): DroppablePublish = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppablePublish]
  }
  
  @scala.inline
  implicit class DroppablePublishOps[Self <: DroppablePublish] (val x: Self) extends AnyVal {
    
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
    def setDroppableId(value: DroppableId): Self = this.set("droppableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: Position): Self = this.set("scroll", value.asInstanceOf[js.Any])
  }
}
