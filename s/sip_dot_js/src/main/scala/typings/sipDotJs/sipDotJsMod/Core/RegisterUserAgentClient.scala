package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.RegisterUserAgentClient")
@js.native
class RegisterUserAgentClient protected ()
  extends typings.sipDotJs.libCoreMod.RegisterUserAgentClient {
  def this(
    core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
    delegate: OutgoingRequestDelegate
  ) = this()
}

