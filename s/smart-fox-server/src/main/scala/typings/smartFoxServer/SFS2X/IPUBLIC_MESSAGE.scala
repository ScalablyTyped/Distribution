package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPUBLIC_MESSAGE extends StObject {
  
  var data: js.Object
  
  var message: String
  
  var room: SFSRoom
  
  var sender: SFSUser
}
object IPUBLIC_MESSAGE {
  
  @scala.inline
  def apply(data: js.Object, message: String, room: SFSRoom, sender: SFSUser): IPUBLIC_MESSAGE = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPUBLIC_MESSAGE]
  }
  
  @scala.inline
  implicit class IPUBLIC_MESSAGEMutableBuilder[Self <: IPUBLIC_MESSAGE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: SFSUser): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
