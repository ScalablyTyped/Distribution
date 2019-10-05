package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.NotifyUserAgentServer")
@js.native
class NotifyUserAgentServer protected ()
  extends typings.sipDotJs.libCoreMod.NotifyUserAgentServer {
  /**
    * NOTIFY UAS constructor.
    * @param dialogOrCore - Dialog for in dialog NOTIFY, UserAgentCore for out of dialog NOTIFY (deprecated).
    * @param message - Incoming NOTIFY request message.
    */
  def this(
    dialogOrCore: typings.sipDotJs.libCoreDialogsMod.Dialog,
    message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typings.sipDotJs.libCoreDialogsMod.Dialog,
    message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
  def this(
    dialogOrCore: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

