package typings.sipJs.mod.Core

import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreUserAgentsUserAgentClientMod.ClientTransactionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.UserAgentClient")
@js.native
open class UserAgentClient protected ()
  extends typings.sipJs.libCoreMod.UserAgentClient {
  def this(
    transactionConstructor: ClientTransactionConstructor,
    core: typings.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ClientTransactionConstructor,
    core: typings.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    message: typings.sipJs.libCoreMessagesMod.OutgoingRequestMessage,
    delegate: OutgoingRequestDelegate
  ) = this()
}
