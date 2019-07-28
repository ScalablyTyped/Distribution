package typings.sipDotJs.libCoreUserDashAgentsMod

import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashClientMod.ClientTransactionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "UserAgentClient")
@js.native
class UserAgentClient protected ()
  extends typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashClientMod.UserAgentClient {
  def this(
    transactionConstructor: ClientTransactionConstructor,
    core: UserAgentCore,
    message: OutgoingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ClientTransactionConstructor,
    core: UserAgentCore,
    message: OutgoingRequestMessage,
    delegate: OutgoingRequestDelegate
  ) = this()
}

