package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ServerContext")
@js.native
class ServerContext protected ()
  extends sipDotJsLib.typesServerDashContextMod.ServerContext {
  def this(ua: sipDotJsLib.typesUaMod.UA, request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest) = this()
}

@JSImport("sip.js", "ServerContext")
@js.native
object ServerContext extends js.Object {
  def initializer(
    objectToConstruct: sipDotJsLib.typesServerDashContextMod.ServerContext,
    ua: sipDotJsLib.typesUaMod.UA,
    request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest
  ): scala.Unit = js.native
}

