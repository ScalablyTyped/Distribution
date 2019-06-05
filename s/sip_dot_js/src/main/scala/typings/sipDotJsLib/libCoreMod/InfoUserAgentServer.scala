package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "InfoUserAgentServer")
@js.native
class InfoUserAgentServer protected ()
  extends sipDotJsLib.libCoreUserDashAgentsMod.InfoUserAgentServer {
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
}

