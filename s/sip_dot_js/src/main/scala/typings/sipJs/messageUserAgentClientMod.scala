package typings.sipJs

import typings.sipJs.messagesMod.OutgoingRequestMessage
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.userAgentClientMod.UserAgentClient
import typings.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/message-user-agent-client", JSImport.Namespace)
@js.native
object messageUserAgentClientMod extends js.Object {
  @js.native
  class MessageUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
}

