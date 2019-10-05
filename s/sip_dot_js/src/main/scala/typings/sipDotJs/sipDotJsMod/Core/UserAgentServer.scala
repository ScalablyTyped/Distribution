package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashServerMod.ServerTransactionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.UserAgentServer")
@js.native
class UserAgentServer protected ()
  extends typings.sipDotJs.libCoreMod.UserAgentServer {
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

