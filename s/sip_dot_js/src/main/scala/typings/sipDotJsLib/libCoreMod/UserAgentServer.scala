package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "UserAgentServer")
@js.native
class UserAgentServer protected ()
  extends sipDotJsLib.libCoreUserDashAgentsMod.UserAgentServer {
  def this(transactionConstructor: sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashServerMod.ServerTransactionConstructor, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
  def this(transactionConstructor: sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashServerMod.ServerTransactionConstructor, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
}

