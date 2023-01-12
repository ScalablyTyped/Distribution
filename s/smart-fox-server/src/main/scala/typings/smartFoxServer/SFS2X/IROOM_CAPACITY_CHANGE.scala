package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IROOM_CAPACITY_CHANGE extends StObject {
  
  var room: SFSRoom
}
object IROOM_CAPACITY_CHANGE {
  
  inline def apply(room: SFSRoom): IROOM_CAPACITY_CHANGE = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_CAPACITY_CHANGE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IROOM_CAPACITY_CHANGE] (val x: Self) extends AnyVal {
    
    inline def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
