package typings.sipDotJs.libCoreUserDashAgentsPublishDashUserDashAgentDashClientMod

import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashClientMod.UserAgentClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.sipDotJs.libCoreMessagesMethodsPublishMod.OutgoingPublishRequest because Already inherited */ @JSImport("sip.js/lib/core/user-agents/publish-user-agent-client", "PublishUserAgentClient")
@js.native
class PublishUserAgentClient protected () extends UserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
}

