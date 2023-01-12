package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IROOM_VARIABLES_UPDATE extends StObject {
  
  var changedVars: js.Array[String]
  
  var room: SFSRoom
}
object IROOM_VARIABLES_UPDATE {
  
  inline def apply(changedVars: js.Array[String], room: SFSRoom): IROOM_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(changedVars = changedVars.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_VARIABLES_UPDATE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IROOM_VARIABLES_UPDATE] (val x: Self) extends AnyVal {
    
    inline def setChangedVars(value: js.Array[String]): Self = StObject.set(x, "changedVars", value.asInstanceOf[js.Any])
    
    inline def setChangedVarsVarargs(value: String*): Self = StObject.set(x, "changedVars", js.Array(value*))
    
    inline def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
