package typings.sipDotJs.libCoreMod

import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReSubscribeUserAgentServer")
@js.native
class ReSubscribeUserAgentServer protected ()
  extends typings.sipDotJs.libCoreUserDashAgentsMod.ReSubscribeUserAgentServer {
  def this(
    dialog: typings.sipDotJs.libCoreDialogsMod.Dialog,
    message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typings.sipDotJs.libCoreDialogsMod.Dialog,
    message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

