package typings.sipJs

import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import typings.sipJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipJs.libCoreUserAgentCoreMod.UserAgentCore
import typings.sipJs.libCoreUserAgentsUserAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsMessageUserAgentServerMod {
  
  @JSImport("sip.js/lib/core/user-agents/message-user-agent-server", "MessageUserAgentServer")
  @js.native
  open class MessageUserAgentServer protected () extends UserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
}
