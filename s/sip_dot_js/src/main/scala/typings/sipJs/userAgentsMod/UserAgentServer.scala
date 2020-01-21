package typings.sipJs.userAgentsMod

import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import typings.sipJs.messagesMod.IncomingRequestMessage
import typings.sipJs.userAgentCoreMod.UserAgentCore
import typings.sipJs.userAgentServerMod.ServerTransactionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "UserAgentServer")
@js.native
class UserAgentServer protected ()
  extends typings.sipJs.userAgentServerMod.UserAgentServer {
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: UserAgentCore,
    message: IncomingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: UserAgentCore,
    message: IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

