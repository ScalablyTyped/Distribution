package typings.sipJs.mod.Core

import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.SubscribeUserAgentServer")
@js.native
open class SubscribeUserAgentServer protected ()
  extends typings.sipJs.libCoreMod.SubscribeUserAgentServer {
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
