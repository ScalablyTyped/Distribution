package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IINVITATION_REPLY extends js.Object {
  var data: js.Object
  var invitee: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser
  var reply: scala.Double
}

object IINVITATION_REPLY {
  @scala.inline
  def apply(
    data: js.Object,
    invitee: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser,
    reply: scala.Double
  ): IINVITATION_REPLY = {
    val __obj = js.Dynamic.literal(data = data, invitee = invitee, reply = reply)
  
    __obj.asInstanceOf[IINVITATION_REPLY]
  }
}

