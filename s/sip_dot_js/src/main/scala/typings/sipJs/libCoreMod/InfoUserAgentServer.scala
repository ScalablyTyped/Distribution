package typings.sipJs.libCoreMod

import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "InfoUserAgentServer")
@js.native
open class InfoUserAgentServer protected ()
  extends typings.sipJs.libCoreUserAgentsMod.InfoUserAgentServer {
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
