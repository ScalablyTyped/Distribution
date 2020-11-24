package typings.sipJs.mod.Core

import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.ByeUserAgentServer")
@js.native
class ByeUserAgentServer protected ()
  extends typings.sipJs.coreMod.ByeUserAgentServer {
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
