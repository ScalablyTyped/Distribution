package typings.sipJs.mod.Core

import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.ReferUserAgentServer")
@js.native
open class ReferUserAgentServer protected ()
  extends typings.sipJs.libCoreMod.ReferUserAgentServer {
  /**
    * REFER UAS constructor.
    * @param dialogOrCore - Dialog for in dialog REFER, UserAgentCore for out of dialog REFER.
    * @param message - Incoming REFER request message.
    */
  def this(
    dialogOrCore: typings.sipJs.libCoreDialogsMod.SessionDialog,
    message: typings.sipJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typings.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typings.sipJs.libCoreDialogsMod.SessionDialog,
    message: typings.sipJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
  def this(
    dialogOrCore: typings.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
