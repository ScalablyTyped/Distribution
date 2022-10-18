package typings.sipJs.mod.Core

import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.ReSubscribeUserAgentServer")
@js.native
open class ReSubscribeUserAgentServer protected ()
  extends typings.sipJs.libCoreMod.ReSubscribeUserAgentServer {
  def this(
    dialog: typings.sipJs.libCoreDialogsMod.Dialog,
    message: typings.sipJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsMod.Dialog,
    message: typings.sipJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
