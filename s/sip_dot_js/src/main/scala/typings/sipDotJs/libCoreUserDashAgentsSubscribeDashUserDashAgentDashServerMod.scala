package typings.sipDotJs

import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/subscribe-user-agent-server", JSImport.Namespace)
@js.native
object libCoreUserDashAgentsSubscribeDashUserDashAgentDashServerMod extends js.Object {
  @js.native
  class SubscribeUserAgentServer protected () extends UserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
}

