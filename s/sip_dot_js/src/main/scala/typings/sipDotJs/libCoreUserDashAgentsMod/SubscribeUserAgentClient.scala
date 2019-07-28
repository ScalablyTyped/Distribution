package typings.sipDotJs.libCoreUserDashAgentsMod

import typings.sipDotJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate
import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "SubscribeUserAgentClient")
@js.native
class SubscribeUserAgentClient protected ()
  extends typings.sipDotJs.libCoreUserDashAgentsSubscribeDashUserDashAgentDashClientMod.SubscribeUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingSubscribeRequestDelegate) = this()
}

