package typings
package sipDotJsLib.typesServerDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/server-context", "ServerContext")
@js.native
class ServerContext protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(ua: sipDotJsLib.typesUaMod.UA, request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest) = this()
  var assertedIdentity: js.UndefOr[sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader] = js.native
  var body: js.Any = js.native
  var contentType: js.UndefOr[java.lang.String] = js.native
  var data: js.Any = js.native
  var localIdentity: sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader = js.native
  var logger: sipDotJsLib.typesLoggerDashFactoryMod.Logger = js.native
  var method: java.lang.String = js.native
  var remoteIdentity: sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader = js.native
  var request: sipDotJsLib.typesSipDashMessageMod.IncomingMessage = js.native
  var transaction: sipDotJsLib.typesTransactionsMod.InviteServerTransaction | sipDotJsLib.typesTransactionsMod.NonInviteServerTransaction = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  var ua: sipDotJsLib.typesUaMod.UA = js.native
   // TODO
  def accept(): this.type = js.native
  def accept(options: js.Any): this.type = js.native
   // TODO
  def onRequestTimeout(): scala.Unit = js.native
  def onTransportError(): scala.Unit = js.native
  def progress(): this.type = js.native
  def progress(options: js.Any): this.type = js.native
   // TODO
  def reject(): this.type = js.native
  def reject(options: js.Any): this.type = js.native
   // TODO
  def reply(): this.type = js.native
  def reply(options: js.Any): this.type = js.native
}

@JSImport("sip.js/types/server-context", "ServerContext")
@js.native
object ServerContext extends js.Object {
  def initializer(
    objectToConstruct: sipDotJsLib.typesServerDashContextMod.ServerContext,
    ua: sipDotJsLib.typesUaMod.UA,
    request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest
  ): scala.Unit = js.native
}

