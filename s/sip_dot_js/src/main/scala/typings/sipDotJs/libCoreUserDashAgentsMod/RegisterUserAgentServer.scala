package typings.sipDotJs.libCoreUserDashAgentsMod

import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "RegisterUserAgentServer")
@js.native
class RegisterUserAgentServer protected ()
  extends typings.sipDotJs.libCoreUserDashAgentsRegisterDashUserDashAgentDashServerMod.RegisterUserAgentServer {
  def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
  def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}

