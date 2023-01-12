package typings.smartFoxServer.SFS2X.Entities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Invitation
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Invitation.html
object Invitation {
  
  trait InvitationReply extends StObject
  
  trait SFSInvitation extends StObject {
    
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
    
    inline def apply(id: Double, invitee: SFSUser, inviter: SFSUser, params: js.Object, secondsForAnswer: Double): SFSInvitation = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], secondsForAnswer = secondsForAnswer.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFSInvitation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SFSInvitation] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInvitee(value: SFSUser): Self = StObject.set(x, "invitee", value.asInstanceOf[js.Any])
      
      inline def setInviter(value: SFSUser): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setSecondsForAnswer(value: Double): Self = StObject.set(x, "secondsForAnswer", value.asInstanceOf[js.Any])
    }
  }
}
