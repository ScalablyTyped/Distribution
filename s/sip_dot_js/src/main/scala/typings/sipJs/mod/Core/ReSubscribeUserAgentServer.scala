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
    dialog: typings.sipJs.libCoreDialogsDialogMod.Dialog,
    message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsDialogMod.Dialog,
    message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
