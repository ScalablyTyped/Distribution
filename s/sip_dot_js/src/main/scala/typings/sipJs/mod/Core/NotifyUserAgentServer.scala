package typings.sipJs.mod.Core

import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.NotifyUserAgentServer")
@js.native
class NotifyUserAgentServer protected ()
  extends typings.sipJs.coreMod.NotifyUserAgentServer {
  /**
    * NOTIFY UAS constructor.
    * @param dialogOrCore - Dialog for in dialog NOTIFY, UserAgentCore for out of dialog NOTIFY (deprecated).
    * @param message - Incoming NOTIFY request message.
    */
  def this(
    dialogOrCore: typings.sipJs.dialogsMod.Dialog,
    message: typings.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typings.sipJs.dialogsMod.Dialog,
    message: typings.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
  def this(
    dialogOrCore: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
