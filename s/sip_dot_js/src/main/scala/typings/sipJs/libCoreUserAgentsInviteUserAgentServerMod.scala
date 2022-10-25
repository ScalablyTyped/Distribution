package typings.sipJs

import typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore
import typings.sipJs.libCoreUserAgentsUserAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsInviteUserAgentServerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequest because Already inherited
  - typings.sipJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest because var conflicts: delegate, message. Inlined  */ @JSImport("sip.js/lib/core/user-agents/invite-user-agent-server", "InviteUserAgentServer")
  @js.native
  open class InviteUserAgentServer protected () extends UserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    
    /** The confirmed dialog, if any. */
    /* private */ var confirmedDialog: Any = js.native
    
    /** The early dialog, if any. */
    /* private */ var earlyDialog: Any = js.native
  }
}
