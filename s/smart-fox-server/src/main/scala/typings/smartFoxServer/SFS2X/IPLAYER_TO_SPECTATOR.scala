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
  
  inline def apply(room: SFSRoom, user: SFSUser): IPLAYER_TO_SPECTATOR = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPLAYER_TO_SPECTATOR]
  }
  
  extension [Self <: IPLAYER_TO_SPECTATOR](x: Self) {
    
    inline def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    inline def setUser(value: SFSUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
