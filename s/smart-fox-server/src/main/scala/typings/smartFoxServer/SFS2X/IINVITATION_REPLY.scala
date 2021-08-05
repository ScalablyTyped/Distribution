package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IINVITATION_REPLY extends StObject {
  
  var data: js.Object
  
  var invitee: SFSUser
  
  var reply: Double
}
object IINVITATION_REPLY {
  
  inline def apply(data: js.Object, invitee: SFSUser, reply: Double): IINVITATION_REPLY = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[IINVITATION_REPLY]
  }
  
  extension [Self <: IINVITATION_REPLY](x: Self) {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setInvitee(value: SFSUser): Self = StObject.set(x, "invitee", value.asInstanceOf[js.Any])
    
    inline def setReply(value: Double): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
  }
}
