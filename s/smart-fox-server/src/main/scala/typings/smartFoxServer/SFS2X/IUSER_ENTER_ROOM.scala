package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUSER_ENTER_ROOM extends StObject {
  
  var room: SFSRoom
  
  var user: SFSUser
}
object IUSER_ENTER_ROOM {
  
  @scala.inline
  def apply(room: SFSRoom, user: SFSUser): IUSER_ENTER_ROOM = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUSER_ENTER_ROOM]
  }
  
  @scala.inline
  implicit class IUSER_ENTER_ROOMMutableBuilder[Self <: IUSER_ENTER_ROOM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: SFSUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
