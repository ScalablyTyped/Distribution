package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPRIVATE_MESSAGE extends StObject {
  
  var data: js.Object
  
  var message: String
  
  var sender: SFSUser
}
object IPRIVATE_MESSAGE {
  
  inline def apply(data: js.Object, message: String, sender: SFSUser): IPRIVATE_MESSAGE = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPRIVATE_MESSAGE]
  }
  
  extension [Self <: IPRIVATE_MESSAGE](x: Self) {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSender(value: SFSUser): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
