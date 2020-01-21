package typings.sipJs.coreMod

import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReSubscribeUserAgentServer")
@js.native
class ReSubscribeUserAgentServer protected ()
  extends typings.sipJs.userAgentsMod.ReSubscribeUserAgentServer {
  def this(dialog: typings.sipJs.dialogsMod.Dialog, message: typings.sipJs.messagesMod.IncomingRequestMessage) = this()
  def this(
    dialog: typings.sipJs.dialogsMod.Dialog,
    message: typings.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

