package typings.sipDotJs.libClientContextMod

import typings.node.eventsMod.EventEmitter
import typings.sipDotJs.libClientContextMod.ClientContextNs.Options
import typings.sipDotJs.libCoreMod.IncomingResponseMessage
import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libCoreMod.NameAddrHeader
import typings.sipDotJs.libCoreMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreMod.URI
import typings.sipDotJs.libEnumsMod.TypeStrings
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.BodyObj
import typings.sipDotJs.libUAMod.UA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/ClientContext", "ClientContext")
@js.native
class ClientContext protected () extends EventEmitter {
  def this(ua: UA, method: String, target: String) = this()
  def this(ua: UA, method: String, target: URI) = this()
  def this(ua: UA, method: String, target: String, options: Options) = this()
  def this(ua: UA, method: String, target: URI, options: Options) = this()
  var body: js.UndefOr[BodyObj] = js.native
  var data: js.Any = js.native
  var localIdentity: NameAddrHeader = js.native
  var logger: Logger = js.native
  var method: String = js.native
  var remoteIdentity: NameAddrHeader = js.native
  var request: OutgoingRequestMessage = js.native
  var `type`: TypeStrings = js.native
  var ua: UA = js.native
  def onRequestTimeout(): Unit = js.native
  def onTransportError(): Unit = js.native
  def receiveResponse(response: IncomingResponseMessage): Unit = js.native
  def send(): this.type = js.native
}

/* static members */
@JSImport("sip.js/lib/ClientContext", "ClientContext")
@js.native
object ClientContext extends js.Object {
  def initializer(objToConstruct: ClientContext, ua: UA, method: String, originalTarget: String): Unit = js.native
  def initializer(objToConstruct: ClientContext, ua: UA, method: String, originalTarget: String, options: Options): Unit = js.native
  def initializer(objToConstruct: ClientContext, ua: UA, method: String, originalTarget: URI): Unit = js.native
  def initializer(objToConstruct: ClientContext, ua: UA, method: String, originalTarget: URI, options: Options): Unit = js.native
}

