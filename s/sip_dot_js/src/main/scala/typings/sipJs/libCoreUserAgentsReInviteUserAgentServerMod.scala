package typings.sipJs

import typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog
import typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import typings.sipJs.libCoreUserAgentsUserAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsReInviteUserAgentServerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequest because Already inherited
  - typings.sipJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest because var conflicts: delegate, message. Inlined  */ @JSImport("sip.js/lib/core/user-agents/re-invite-user-agent-server", "ReInviteUserAgentServer")
  @js.native
  open class ReInviteUserAgentServer protected () extends UserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    
    /* private */ var dialog: Any = js.native
  }
}
