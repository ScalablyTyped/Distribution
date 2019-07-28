package typings.sipDotJs.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ServerContext")
@js.native
class ServerContext protected ()
  extends typings.sipDotJs.libServerContextMod.ServerContext {
  def this(
    ua: typings.sipDotJs.libUAMod.UA,
    incomingRequest: typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequest
  ) = this()
}

/* static members */
@JSImport("sip.js", "ServerContext")
@js.native
object ServerContext extends js.Object {
  def initializer(
    objectToConstruct: typings.sipDotJs.libServerContextMod.ServerContext,
    ua: typings.sipDotJs.libUAMod.UA,
    incomingRequest: typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequest
  ): Unit = js.native
}

