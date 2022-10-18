package typings.sipJs.mod.Core

import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.ByeUserAgentServer")
@js.native
open class ByeUserAgentServer protected ()
  extends typings.sipJs.libCoreMod.ByeUserAgentServer {
  def this(
    dialog: typings.sipJs.libCoreDialogsMod.SessionDialog,
    message: typings.sipJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typings.sipJs.libCoreDialogsMod.SessionDialog,
    message: typings.sipJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
