package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IROOM_FIND_RESULT extends js.Object {
  
  var rooms: js.Array[SFSRoom] = js.native
}
object IROOM_FIND_RESULT {
  
  @scala.inline
  def apply(rooms: js.Array[SFSRoom]): IROOM_FIND_RESULT = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_FIND_RESULT]
  }
  
  @scala.inline
  implicit class IROOM_FIND_RESULTOps[Self <: IROOM_FIND_RESULT] (val x: Self) extends AnyVal {
    
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
    def setRoomsVarargs(value: SFSRoom*): Self = this.set("rooms", js.Array(value :_*))
    
    @scala.inline
    def setRooms(value: js.Array[SFSRoom]): Self = this.set("rooms", value.asInstanceOf[js.Any])
  }
}
