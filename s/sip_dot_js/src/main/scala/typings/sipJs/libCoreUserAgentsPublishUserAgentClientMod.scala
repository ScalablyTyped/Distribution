package typings.sipJs

import typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage
import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore
import typings.sipJs.libCoreUserAgentsUserAgentClientMod.UserAgentClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsPublishUserAgentClientMod {
  
  @JSImport("sip.js/lib/core/user-agents/publish-user-agent-client", "PublishUserAgentClient")
  @js.native
  open class PublishUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
}
