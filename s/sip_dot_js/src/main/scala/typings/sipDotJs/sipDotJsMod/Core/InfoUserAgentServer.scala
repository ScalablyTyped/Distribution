package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.InfoUserAgentServer")
@js.native
class InfoUserAgentServer protected ()
  extends typings.sipDotJs.libCoreMod.InfoUserAgentServer {
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

