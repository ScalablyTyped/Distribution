package typings.sipDotJs.libCoreMod

import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ByeUserAgentServer")
@js.native
class ByeUserAgentServer protected ()
  extends typings.sipDotJs.libCoreUserDashAgentsMod.ByeUserAgentServer {
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

