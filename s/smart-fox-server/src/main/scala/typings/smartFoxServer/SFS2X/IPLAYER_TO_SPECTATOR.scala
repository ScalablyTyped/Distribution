package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPLAYER_TO_SPECTATOR extends StObject {
  
  var room: SFSRoom
  
  var user: SFSUser
}
object IPLAYER_TO_SPECTATOR {
  
  @scala.inline
  def apply(room: SFSRoom, user: SFSUser): IPLAYER_TO_SPECTATOR = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPLAYER_TO_SPECTATOR]
  }
  
  @scala.inline
  implicit class IPLAYER_TO_SPECTATORMutableBuilder[Self <: IPLAYER_TO_SPECTATOR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: SFSUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
