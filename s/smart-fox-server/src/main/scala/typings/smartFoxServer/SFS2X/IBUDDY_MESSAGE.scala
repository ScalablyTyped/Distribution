package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBUDDY_MESSAGE extends StObject {
  
  var buddy: SFSBuddy
  
  var data: js.Object
  
  var isItMe: Boolean
  
  var message: String
}
object IBUDDY_MESSAGE {
  
  inline def apply(buddy: SFSBuddy, data: js.Object, isItMe: Boolean, message: String): IBUDDY_MESSAGE = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isItMe = isItMe.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_MESSAGE]
  }
  
  extension [Self <: IBUDDY_MESSAGE](x: Self) {
    
    inline def setBuddy(value: SFSBuddy): Self = StObject.set(x, "buddy", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIsItMe(value: Boolean): Self = StObject.set(x, "isItMe", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
