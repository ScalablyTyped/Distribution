package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ReInviteUserAgentServer")
@js.native
class ReInviteUserAgentServer protected ()
  extends typings.sipDotJs.libCoreMod.ReInviteUserAgentServer {
  def this(
    dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
    message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
    message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

