package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IROOM_NAME_CHANGE extends StObject {
  
  var oldName: String
  
  var room: SFSRoom
}
object IROOM_NAME_CHANGE {
  
  inline def apply(oldName: String, room: SFSRoom): IROOM_NAME_CHANGE = {
    val __obj = js.Dynamic.literal(oldName = oldName.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_NAME_CHANGE]
  }
  
  extension [Self <: IROOM_NAME_CHANGE](x: Self) {
    
    inline def setOldName(value: String): Self = StObject.set(x, "oldName", value.asInstanceOf[js.Any])
    
    inline def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
