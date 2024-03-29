package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IROOM_FIND_RESULT extends StObject {
  
  var rooms: js.Array[SFSRoom]
}
object IROOM_FIND_RESULT {
  
  inline def apply(rooms: js.Array[SFSRoom]): IROOM_FIND_RESULT = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_FIND_RESULT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IROOM_FIND_RESULT] (val x: Self) extends AnyVal {
    
    inline def setRooms(value: js.Array[SFSRoom]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
    
    inline def setRoomsVarargs(value: SFSRoom*): Self = StObject.set(x, "rooms", js.Array(value*))
  }
}
