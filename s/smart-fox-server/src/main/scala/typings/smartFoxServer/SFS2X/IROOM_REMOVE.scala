package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IROOM_REMOVE extends StObject {
  
  var room: SFSRoom
}
object IROOM_REMOVE {
  
  @scala.inline
  def apply(room: SFSRoom): IROOM_REMOVE = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_REMOVE]
  }
  
  @scala.inline
  implicit class IROOM_REMOVEMutableBuilder[Self <: IROOM_REMOVE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
