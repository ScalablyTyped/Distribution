package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IROOM_NAME_CHANGE extends StObject {
  
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
  implicit class IROOM_NAME_CHANGEMutableBuilder[Self <: IROOM_NAME_CHANGE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldName(value: String): Self = StObject.set(x, "oldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
