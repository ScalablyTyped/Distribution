package typings.sipJs.libCoreMod

import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ReSubscribeUserAgentServer")
@js.native
open class ReSubscribeUserAgentServer protected ()
  extends typings.sipJs.libCoreUserAgentsMod.ReSubscribeUserAgentServer {
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
