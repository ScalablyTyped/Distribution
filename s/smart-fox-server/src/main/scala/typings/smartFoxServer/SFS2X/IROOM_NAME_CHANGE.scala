package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IROOM_NAME_CHANGE extends js.Object {
  
  var oldName: String = js.native
  
  var room: SFSRoom = js.native
}
object IROOM_NAME_CHANGE {
  
  @scala.inline
  def apply(oldName: String, room: SFSRoom): IROOM_NAME_CHANGE = {
    val __obj = js.Dynamic.literal(oldName = oldName.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_NAME_CHANGE]
  }
  
  @scala.inline
  implicit class IROOM_NAME_CHANGEOps[Self <: IROOM_NAME_CHANGE] (val x: Self) extends AnyVal {
    
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
    def setOldName(value: String): Self = this.set("oldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: SFSRoom): Self = this.set("room", value.asInstanceOf[js.Any])
  }
}
