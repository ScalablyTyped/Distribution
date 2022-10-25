package typings.sipJs.mod.Core

import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import typings.sipJs.libCoreUserAgentsUserAgentServerMod.ServerTransactionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.UserAgentServer")
@js.native
open class UserAgentServer protected ()
  extends typings.sipJs.libCoreMod.UserAgentServer {
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
