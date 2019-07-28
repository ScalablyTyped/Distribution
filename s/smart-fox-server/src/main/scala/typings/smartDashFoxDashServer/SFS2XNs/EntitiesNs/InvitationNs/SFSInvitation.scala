package typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.InvitationNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.Invitation.SFSInvitation")
@js.native
class SFSInvitation protected () extends js.Object {
  /**
    * Creates a new SFSInvitation instance.
    * @param {SFSUser} inviter          A SFSUser object corresponding to the user who sent the invitation.
    * @param {SFSUser} invitee          A SFSUser object corresponding to the user who received the invitation.
    * @param {number}  secondsForAnswer The number of seconds available to the invitee to reply to the invitation.
    * @param {Object}  params           An object containing a custom set of parameters representing the invitation details.
    */
  def this(inviter: SFSUser, invitee: SFSUser, secondsForAnswer: Double, params: js.Object) = this()
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

