package typings.sipJs

import typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore
import typings.sipJs.libCoreUserAgentsUserAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsSubscribeUserAgentServerMod {
  
  @JSImport("sip.js/lib/core/user-agents/subscribe-user-agent-server", "SubscribeUserAgentServer")
  @js.native
  open class SubscribeUserAgentServer protected () extends UserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
}
