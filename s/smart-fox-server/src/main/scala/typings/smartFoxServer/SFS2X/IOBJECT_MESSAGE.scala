package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOBJECT_MESSAGE extends StObject {
  
  var message: String
  
  var sender: SFSUser
}
object IOBJECT_MESSAGE {
  
  inline def apply(message: String, sender: SFSUser): IOBJECT_MESSAGE = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOBJECT_MESSAGE]
  }
  
  extension [Self <: IOBJECT_MESSAGE](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSender(value: SFSUser): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
