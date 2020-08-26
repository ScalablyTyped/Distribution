package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IINVITATION_REPLY extends js.Object {
  var data: js.Object = js.native
  var invitee: SFSUser = js.native
  var reply: Double = js.native
}

object IINVITATION_REPLY {
  @scala.inline
  def apply(data: js.Object, invitee: SFSUser, reply: Double): IINVITATION_REPLY = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[IINVITATION_REPLY]
  }
  @scala.inline
  implicit class IINVITATION_REPLYOps[Self <: IINVITATION_REPLY] (val x: Self) extends AnyVal {
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvitee(value: SFSUser): Self = this.set("invitee", value.asInstanceOf[js.Any])
    @scala.inline
    def setReply(value: Double): Self = this.set("reply", value.asInstanceOf[js.Any])
  }
  
}

