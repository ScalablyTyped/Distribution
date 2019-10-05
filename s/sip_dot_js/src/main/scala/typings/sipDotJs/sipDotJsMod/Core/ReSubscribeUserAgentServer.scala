package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ReSubscribeUserAgentServer")
@js.native
class ReSubscribeUserAgentServer protected ()
  extends typings.sipDotJs.libCoreMod.ReSubscribeUserAgentServer {
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

