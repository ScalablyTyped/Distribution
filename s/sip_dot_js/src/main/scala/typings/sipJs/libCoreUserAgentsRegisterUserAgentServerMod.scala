package typings.sipJs

import typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore
import typings.sipJs.libCoreUserAgentsUserAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsRegisterUserAgentServerMod {
  
  @JSImport("sip.js/lib/core/user-agents/register-user-agent-server", "RegisterUserAgentServer")
  @js.native
  open class RegisterUserAgentServer protected () extends UserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
}
