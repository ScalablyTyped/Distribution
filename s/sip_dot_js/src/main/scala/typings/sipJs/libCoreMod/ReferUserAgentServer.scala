package typings.sipJs.libCoreMod

import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ReferUserAgentServer")
@js.native
open class ReferUserAgentServer protected ()
  extends typings.sipJs.libCoreUserAgentsMod.ReferUserAgentServer {
  /**
    * REFER UAS constructor.
    * @param dialogOrCore - Dialog for in dialog REFER, UserAgentCore for out of dialog REFER.
    * @param message - Incoming REFER request message.
    */
  def this(
    dialogOrCore: typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog,
    message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog,
    message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
  def this(
    dialogOrCore: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
