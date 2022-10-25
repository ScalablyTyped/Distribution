package typings.sipJs

import typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage
import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore
import typings.sipJs.libCoreUserAgentsUserAgentClientMod.UserAgentClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsRegisterUserAgentClientMod {
  
  @JSImport("sip.js/lib/core/user-agents/register-user-agent-client", "RegisterUserAgentClient")
  @js.native
  open class RegisterUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
}
