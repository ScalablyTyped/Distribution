package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IROOM_CAPACITY_CHANGE extends StObject {
  
  var room: SFSRoom = js.native
}
object IROOM_CAPACITY_CHANGE {
  
  @scala.inline
  def apply(room: SFSRoom): IROOM_CAPACITY_CHANGE = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_CAPACITY_CHANGE]
  }
  
  @scala.inline
  implicit class IROOM_CAPACITY_CHANGEMutableBuilder[Self <: IROOM_CAPACITY_CHANGE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
