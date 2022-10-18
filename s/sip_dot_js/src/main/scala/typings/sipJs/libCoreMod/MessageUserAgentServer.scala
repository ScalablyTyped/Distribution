package typings.sipJs.libCoreMod

import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "MessageUserAgentServer")
@js.native
open class MessageUserAgentServer protected ()
  extends typings.sipJs.libCoreUserAgentsMod.MessageUserAgentServer {
  def this(
    core: typings.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    core: typings.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
