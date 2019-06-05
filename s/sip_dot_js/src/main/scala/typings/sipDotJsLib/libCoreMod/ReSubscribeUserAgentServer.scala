package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReSubscribeUserAgentServer")
@js.native
class ReSubscribeUserAgentServer protected ()
  extends sipDotJsLib.libCoreUserDashAgentsMod.ReSubscribeUserAgentServer {
  def this(dialog: sipDotJsLib.libCoreDialogsMod.Dialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
  def this(dialog: sipDotJsLib.libCoreDialogsMod.Dialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
}

