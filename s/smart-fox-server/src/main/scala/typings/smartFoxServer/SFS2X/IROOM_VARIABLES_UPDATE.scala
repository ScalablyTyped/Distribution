package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IROOM_VARIABLES_UPDATE extends StObject {
  
  var changedVars: js.Array[String] = js.native
  
  var room: SFSRoom = js.native
}
object IROOM_VARIABLES_UPDATE {
  
  @scala.inline
  def apply(changedVars: js.Array[String], room: SFSRoom): IROOM_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(changedVars = changedVars.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_VARIABLES_UPDATE]
  }
  
  @scala.inline
  implicit class IROOM_VARIABLES_UPDATEMutableBuilder[Self <: IROOM_VARIABLES_UPDATE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangedVars(value: js.Array[String]): Self = StObject.set(x, "changedVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedVarsVarargs(value: String*): Self = StObject.set(x, "changedVars", js.Array(value :_*))
    
    @scala.inline
    def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
