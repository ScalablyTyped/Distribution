package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DroppableDescriptor extends js.Object {
  
  var id: DroppableId = js.native
  
  var mode: DroppableMode = js.native
  
  var `type`: TypeId = js.native
}
object DroppableDescriptor {
  
  @scala.inline
  def apply(id: DroppableId, mode: DroppableMode, `type`: TypeId): DroppableDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableDescriptor]
  }
  
  @scala.inline
  implicit class DroppableDescriptorOps[Self <: DroppableDescriptor] (val x: Self) extends AnyVal {
    
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
    def setId(value: DroppableId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: DroppableMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TypeId): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
