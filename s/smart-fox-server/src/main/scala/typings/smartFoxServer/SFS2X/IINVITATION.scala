package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.Invitation.SFSInvitation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IINVITATION extends StObject {
  
  var invitation: SFSInvitation
}
object IINVITATION {
  
  inline def apply(invitation: SFSInvitation): IINVITATION = {
    val __obj = js.Dynamic.literal(invitation = invitation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IINVITATION]
  }
  
  extension [Self <: IINVITATION](x: Self) {
    
    inline def setInvitation(value: SFSInvitation): Self = StObject.set(x, "invitation", value.asInstanceOf[js.Any])
  }
}
