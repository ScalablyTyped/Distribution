package typings.sipJs.coreMod

import typings.sipJs.inviteMod.OutgoingInviteRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "InviteUserAgentClient")
@js.native
class InviteUserAgentClient protected ()
  extends typings.sipJs.userAgentsMod.InviteUserAgentClient {
  def this(
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.OutgoingRequestMessage,
    delegate: OutgoingInviteRequestDelegate
  ) = this()
}

