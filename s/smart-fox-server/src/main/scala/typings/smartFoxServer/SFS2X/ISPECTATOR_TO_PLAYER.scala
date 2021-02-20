package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISPECTATOR_TO_PLAYER extends StObject {
  
  var playerId: Double = js.native
  
  var room: SFSRoom = js.native
  
  var user: SFSUser = js.native
}
object ISPECTATOR_TO_PLAYER {
  
  @scala.inline
  def apply(playerId: Double, room: SFSRoom, user: SFSUser): ISPECTATOR_TO_PLAYER = {
    val __obj = js.Dynamic.literal(playerId = playerId.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISPECTATOR_TO_PLAYER]
  }
  
  @scala.inline
  implicit class ISPECTATOR_TO_PLAYERMutableBuilder[Self <: ISPECTATOR_TO_PLAYER] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayerId(value: Double): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: SFSUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
