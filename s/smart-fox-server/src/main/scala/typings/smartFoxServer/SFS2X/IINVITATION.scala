package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.Invitation.SFSInvitation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IINVITATION extends js.Object {
  var invitation: SFSInvitation
}

object IINVITATION {
  @scala.inline
  def apply(invitation: SFSInvitation): IINVITATION = {
    val __obj = js.Dynamic.literal(invitation = invitation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IINVITATION]
  }
}

