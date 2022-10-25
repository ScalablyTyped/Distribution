package typings.sipJs.mod.Core

import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.PrackUserAgentServer")
@js.native
open class PrackUserAgentServer protected ()
  extends typings.sipJs.libCoreMod.PrackUserAgentServer {
  def this(
    dialog: typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog,
    message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog,
    message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
