package typings.sipJs

import typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage
import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore
import typings.sipJs.libCoreUserAgentsUserAgentClientMod.UserAgentClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsCancelUserAgentClientMod {
  
  @JSImport("sip.js/lib/core/user-agents/cancel-user-agent-client", "CancelUserAgentClient")
  @js.native
  open class CancelUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
}
