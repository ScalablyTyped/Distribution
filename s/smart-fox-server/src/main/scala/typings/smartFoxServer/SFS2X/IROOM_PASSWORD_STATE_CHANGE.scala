package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IROOM_PASSWORD_STATE_CHANGE extends StObject {
  
  var room: SFSRoom
}
object IROOM_PASSWORD_STATE_CHANGE {
  
  inline def apply(room: SFSRoom): IROOM_PASSWORD_STATE_CHANGE = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_PASSWORD_STATE_CHANGE]
  }
  
  extension [Self <: IROOM_PASSWORD_STATE_CHANGE](x: Self) {
    
    inline def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
