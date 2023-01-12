package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBUDDY_VARIABLES_UPDATE extends StObject {
  
  var buddy: SFSBuddy
  
  var changedVars: js.Array[String]
  
  var isItMe: Boolean
}
object IBUDDY_VARIABLES_UPDATE {
  
  inline def apply(buddy: SFSBuddy, changedVars: js.Array[String], isItMe: Boolean): IBUDDY_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any], changedVars = changedVars.asInstanceOf[js.Any], isItMe = isItMe.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_VARIABLES_UPDATE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBUDDY_VARIABLES_UPDATE] (val x: Self) extends AnyVal {
    
    inline def setBuddy(value: SFSBuddy): Self = StObject.set(x, "buddy", value.asInstanceOf[js.Any])
    
    inline def setChangedVars(value: js.Array[String]): Self = StObject.set(x, "changedVars", value.asInstanceOf[js.Any])
    
    inline def setChangedVarsVarargs(value: String*): Self = StObject.set(x, "changedVars", js.Array(value*))
    
    inline def setIsItMe(value: Boolean): Self = StObject.set(x, "isItMe", value.asInstanceOf[js.Any])
  }
}
