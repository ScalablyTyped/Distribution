package typings.smartDashFoxDashServer.SFS2XNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSUser
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
    val __obj = js.Dynamic.literal(data = data, invitee = invitee, reply = reply)
  
    __obj.asInstanceOf[IINVITATION_REPLY]
  }
}

