package typings.sipJs.coreMod

import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "PrackUserAgentServer")
@js.native
open class PrackUserAgentServer protected ()
  extends typings.sipJs.userAgentsMod.PrackUserAgentServer {
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
