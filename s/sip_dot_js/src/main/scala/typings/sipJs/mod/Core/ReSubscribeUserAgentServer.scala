package typings.sipJs.mod.Core

import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.ReSubscribeUserAgentServer")
@js.native
open class ReSubscribeUserAgentServer protected ()
  extends typings.sipJs.coreMod.ReSubscribeUserAgentServer {
  def this(dialog: typings.sipJs.dialogsMod.Dialog, message: typings.sipJs.messagesMod.IncomingRequestMessage) = this()
  def this(
    dialog: typings.sipJs.dialogsMod.Dialog,
    message: typings.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
