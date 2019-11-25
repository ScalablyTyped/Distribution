package typings.smartDashFoxDashServer.SFS2X

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IINVITATION_REPLY extends js.Object {
  var data: js.Object
  var invitee: SFSUser
  var reply: Double
}

object IINVITATION_REPLY {
  @scala.inline
  def apply(data: js.Object, invitee: SFSUser, reply: Double): IINVITATION_REPLY = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IINVITATION_REPLY]
  }
}

