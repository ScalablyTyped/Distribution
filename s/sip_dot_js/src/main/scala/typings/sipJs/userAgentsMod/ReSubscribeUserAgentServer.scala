package typings.sipJs.userAgentsMod

import typings.sipJs.dialogsMod.Dialog
import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import typings.sipJs.messagesMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "ReSubscribeUserAgentServer")
@js.native
class ReSubscribeUserAgentServer protected ()
  extends typings.sipJs.reSubscribeUserAgentServerMod.ReSubscribeUserAgentServer {
  def this(dialog: Dialog, message: IncomingRequestMessage) = this()
  def this(dialog: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}

