package typings.sipJs

import typings.sipJs.dialogsMod.SessionDialog
import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import typings.sipJs.messagesMod.IncomingRequestMessage
import typings.sipJs.userAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reInviteUserAgentServerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sipJs.incomingRequestMod.IncomingRequest because Already inherited
  - typings.sipJs.inviteMod.IncomingInviteRequest because var conflicts: delegate, message. Inlined  */ @JSImport("sip.js/lib/core/user-agents/re-invite-user-agent-server", "ReInviteUserAgentServer")
  @js.native
  class ReInviteUserAgentServer protected () extends UserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    
    var dialog: js.Any = js.native
  }
}
