package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.Invitation.SFSInvitation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IINVITATION extends js.Object {
  
  var invitation: SFSInvitation = js.native
}
object IINVITATION {
  
  @scala.inline
  def apply(invitation: SFSInvitation): IINVITATION = {
    val __obj = js.Dynamic.literal(invitation = invitation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IINVITATION]
  }
  
  @scala.inline
  implicit class IINVITATIONOps[Self <: IINVITATION] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInvitation(value: SFSInvitation): Self = this.set("invitation", value.asInstanceOf[js.Any])
  }
}
