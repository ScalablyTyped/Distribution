package typings.smartFoxServer.global.SFS2X.Entities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Invitation
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Invitation.html
@JSGlobal("SFS2X.Entities.Invitation")
@js.native
object Invitation extends js.Object {
  @js.native
  class InvitationReply ()
    extends typings.smartFoxServer.SFS2X.Entities.Invitation.InvitationReply
  
  @js.native
  class SFSInvitation protected ()
    extends typings.smartFoxServer.SFS2X.Entities.Invitation.SFSInvitation {
    /**
      * Creates a new SFSInvitation instance.
      * @param {SFSUser} inviter          A SFSUser object corresponding to the user who sent the invitation.
      * @param {SFSUser} invitee          A SFSUser object corresponding to the user who received the invitation.
      * @param {number}  secondsForAnswer The number of seconds available to the invitee to reply to the invitation.
      * @param {Object}  params           An object containing a custom set of parameters representing the invitation details.
      */
    def this(
      inviter: typings.smartFoxServer.SFS2X.Entities.SFSUser,
      invitee: typings.smartFoxServer.SFS2X.Entities.SFSUser,
      secondsForAnswer: Double,
      params: js.Object
    ) = this()
  }
  
  /* static members */
  @js.native
  object InvitationReply extends js.Object {
    /** @type {number} Invitation is accepted. */
    var ACCEPT: Double = js.native
    /** @type {number} Invitation is refused. */
    var REFUSE: Double = js.native
  }
  
}

