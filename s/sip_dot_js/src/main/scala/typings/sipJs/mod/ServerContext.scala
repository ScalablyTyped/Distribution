package typings.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ServerContext")
@js.native
class ServerContext protected ()
  extends typings.sipJs.serverContextMod.ServerContext {
  def this(ua: typings.sipJs.uAMod.UA, incomingRequest: typings.sipJs.incomingRequestMod.IncomingRequest) = this()
}

/* static members */
@JSImport("sip.js", "ServerContext")
@js.native
object ServerContext extends js.Object {
  def initializer(
    objectToConstruct: typings.sipJs.serverContextMod.ServerContext,
    ua: typings.sipJs.uAMod.UA,
    incomingRequest: typings.sipJs.incomingRequestMod.IncomingRequest
  ): Unit = js.native
}

