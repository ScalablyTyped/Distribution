package typings.smartFoxServer.SFS2X.Entities.Invitation

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFSInvitation extends js.Object {
  /** @type {number} Indicates the id of the invitation. */
  var id: Double
  /** @type {SFSUser} Returns the SFSUser object corresponding to the user who received the invitation. */
  var invitee: SFSUser
  /** @type {SFSUser} Returns the SFSUser object corresponding to the user who sent the invitation. */
  var inviter: SFSUser
  /** @type {Object} Returns an object containing a custom set of parameters. */
  var params: js.Object
  /** @type {number} Returns the number of seconds available to the invitee to reply to the invitation, after which the invitation expires. */
  var secondsForAnswer: Double
}

object SFSInvitation {
  @scala.inline
  def apply(id: Double, invitee: SFSUser, inviter: SFSUser, params: js.Object, secondsForAnswer: Double): SFSInvitation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], secondsForAnswer = secondsForAnswer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSInvitation]
  }
}

