package typings.sipJs

import typings.sipJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage
import typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore
import typings.sipJs.libCoreUserAgentsUserAgentClientMod.UserAgentClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsInviteUserAgentClientMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequest because Already inherited
  - typings.sipJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest because var conflicts: delegate, message. Inlined  */ @JSImport("sip.js/lib/core/user-agents/invite-user-agent-client", "InviteUserAgentClient")
  @js.native
  open class InviteUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingInviteRequestDelegate) = this()
    
    /* private */ var confirmedDialogAcks: Any = js.native
    
    /* private */ var confirmedDialogs: Any = js.native
    
    @JSName("delegate")
    var delegate_InviteUserAgentClient: js.UndefOr[OutgoingInviteRequestDelegate] = js.native
    
    /* private */ var earlyDialogs: Any = js.native
  }
}
