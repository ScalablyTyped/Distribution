package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IROOM_VARIABLES_UPDATE extends js.Object {
  
  var changedVars: js.Array[String] = js.native
  
  var room: SFSRoom = js.native
}
object IROOM_VARIABLES_UPDATE {
  
  @scala.inline
  def apply(changedVars: js.Array[String], room: SFSRoom): IROOM_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(changedVars = changedVars.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_VARIABLES_UPDATE]
  }
  
  @scala.inline
  implicit class IROOM_VARIABLES_UPDATEOps[Self <: IROOM_VARIABLES_UPDATE] (val x: Self) extends AnyVal {
    
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
    def setChangedVarsVarargs(value: String*): Self = this.set("changedVars", js.Array(value :_*))
    
    @scala.inline
    def setChangedVars(value: js.Array[String]): Self = this.set("changedVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: SFSRoom): Self = this.set("room", value.asInstanceOf[js.Any])
  }
}
