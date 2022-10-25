package typings.sipJs.libCoreMod

import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "PrackUserAgentServer")
@js.native
open class PrackUserAgentServer protected ()
  extends typings.sipJs.libCoreUserAgentsMod.PrackUserAgentServer {
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
