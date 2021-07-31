package typings.sipJs.coreMod

import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import typings.sipJs.userAgentServerMod.ServerTransactionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "UserAgentServer")
@js.native
class UserAgentServer protected ()
  extends typings.sipJs.userAgentsMod.UserAgentServer {
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
