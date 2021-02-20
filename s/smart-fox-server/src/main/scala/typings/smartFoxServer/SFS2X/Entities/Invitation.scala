package typings.smartFoxServer.SFS2X.Entities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Invitation
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Invitation.html
object Invitation {
  
  @js.native
  trait InvitationReply extends StObject
  
  @js.native
  trait SFSInvitation extends StObject {
    
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
    implicit class SFSInvitationMutableBuilder[Self <: SFSInvitation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvitee(value: SFSUser): Self = StObject.set(x, "invitee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInviter(value: SFSUser): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsForAnswer(value: Double): Self = StObject.set(x, "secondsForAnswer", value.asInstanceOf[js.Any])
    }
  }
}
