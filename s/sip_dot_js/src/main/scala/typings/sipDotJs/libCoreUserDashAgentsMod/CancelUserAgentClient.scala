package typings.sipDotJs.libCoreUserDashAgentsMod

import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "CancelUserAgentClient")
@js.native
class CancelUserAgentClient protected ()
  extends typings.sipDotJs.libCoreUserDashAgentsCancelDashUserDashAgentDashClientMod.CancelUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
}

