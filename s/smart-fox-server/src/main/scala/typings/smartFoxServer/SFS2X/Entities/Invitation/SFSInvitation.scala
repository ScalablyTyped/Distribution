package typings.smartFoxServer.SFS2X.Entities.Invitation

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFSInvitation extends js.Object {
  /** @type {number} Indicates the id of the invitation. */
  var id: Double = js.native
  /** @type {SFSUser} Returns the SFSUser object corresponding to the user who received the invitation. */
  var invitee: SFSUser = js.native
  /** @type {SFSUser} Returns the SFSUser object corresponding to the user who sent the invitation. */
  var inviter: SFSUser = js.native
  /** @type {Object} Returns an object containing a custom set of parameters. */
  var params: js.Object = js.native
  /** @type {number} Returns the number of seconds available to the invitee to reply to the invitation, after which the invitation expires. */
  var secondsForAnswer: Double = js.native
}

object SFSInvitation {
  @scala.inline
  def apply(id: Double, invitee: SFSUser, inviter: SFSUser, params: js.Object, secondsForAnswer: Double): SFSInvitation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], secondsForAnswer = secondsForAnswer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSInvitation]
  }
  @scala.inline
  implicit class SFSInvitationOps[Self <: SFSInvitation] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvitee(value: SFSUser): Self = this.set("invitee", value.asInstanceOf[js.Any])
    @scala.inline
    def setInviter(value: SFSUser): Self = this.set("inviter", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondsForAnswer(value: Double): Self = this.set("secondsForAnswer", value.asInstanceOf[js.Any])
  }
  
}

