package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBUDDY_ONLINE_STATE_CHANGE extends StObject {
  
  var buddy: SFSBuddy
  
  var isItMe: Boolean
}
object IBUDDY_ONLINE_STATE_CHANGE {
  
  inline def apply(buddy: SFSBuddy, isItMe: Boolean): IBUDDY_ONLINE_STATE_CHANGE = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any], isItMe = isItMe.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_ONLINE_STATE_CHANGE]
  }
  
  extension [Self <: IBUDDY_ONLINE_STATE_CHANGE](x: Self) {
    
    inline def setBuddy(value: SFSBuddy): Self = StObject.set(x, "buddy", value.asInstanceOf[js.Any])
    
    inline def setIsItMe(value: Boolean): Self = StObject.set(x, "isItMe", value.asInstanceOf[js.Any])
  }
}
