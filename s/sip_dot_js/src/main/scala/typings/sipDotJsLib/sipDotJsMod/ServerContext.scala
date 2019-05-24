package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ServerContext")
@js.native
class ServerContext protected ()
  extends sipDotJsLib.libServerContextMod.ServerContext {
  def this(ua: sipDotJsLib.libUAMod.UA, incomingRequest: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequest) = this()
}

/* static members */
@JSImport("sip.js", "ServerContext")
@js.native
object ServerContext extends js.Object {
  def initializer(
    objectToConstruct: sipDotJsLib.libServerContextMod.ServerContext,
    ua: sipDotJsLib.libUAMod.UA,
    incomingRequest: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequest
  ): scala.Unit = js.native
}

