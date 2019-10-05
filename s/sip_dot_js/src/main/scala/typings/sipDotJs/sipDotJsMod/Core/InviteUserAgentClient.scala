package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.InviteUserAgentClient")
@js.native
class InviteUserAgentClient protected ()
  extends typings.sipDotJs.libCoreMod.InviteUserAgentClient {
  def this(
    core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
    delegate: OutgoingInviteRequestDelegate
  ) = this()
}

