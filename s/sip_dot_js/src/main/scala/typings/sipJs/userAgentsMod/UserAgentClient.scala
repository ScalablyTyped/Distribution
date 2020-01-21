package typings.sipJs.userAgentsMod

import typings.sipJs.messagesMod.OutgoingRequestMessage
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.userAgentClientMod.ClientTransactionConstructor
import typings.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "UserAgentClient")
@js.native
class UserAgentClient protected ()
  extends typings.sipJs.userAgentClientMod.UserAgentClient {
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

