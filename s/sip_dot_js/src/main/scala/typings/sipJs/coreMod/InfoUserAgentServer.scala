package typings.sipJs.coreMod

import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "InfoUserAgentServer")
@js.native
class InfoUserAgentServer protected ()
  extends typings.sipJs.userAgentsMod.InfoUserAgentServer {
  def this(
    dialog: typings.sipJs.dialogsMod.SessionDialog,
    message: typings.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typings.sipJs.dialogsMod.SessionDialog,
    message: typings.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

