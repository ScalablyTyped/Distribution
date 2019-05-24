package typings
package sipDotJsLib.libServerContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/ServerContext", "ServerContext")
@js.native
class ServerContext protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(ua: sipDotJsLib.libUAMod.UA, incomingRequest: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequest) = this()
  var assertedIdentity: js.UndefOr[sipDotJsLib.libNameAddrHeaderMod.NameAddrHeader] = js.native
  var body: js.Any = js.native
  var contentType: js.UndefOr[java.lang.String] = js.native
  var data: js.Any = js.native
  var incomingRequest: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequest = js.native
  var localIdentity: sipDotJsLib.libNameAddrHeaderMod.NameAddrHeader = js.native
  var logger: sipDotJsLib.libLoggerFactoryMod.Logger = js.native
  var method: java.lang.String = js.native
  var remoteIdentity: sipDotJsLib.libNameAddrHeaderMod.NameAddrHeader = js.native
  var request: sipDotJsLib.libSIPMessageMod.IncomingRequest = js.native
  var transaction: sipDotJsLib.libCoreTransactionsMod.InviteServerTransaction | sipDotJsLib.libCoreTransactionsMod.NonInviteServerTransaction = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  var ua: sipDotJsLib.libUAMod.UA = js.native
  def accept(): js.Any = js.native
  def accept(options: js.Any): js.Any = js.native
  def onRequestTimeout(): scala.Unit = js.native
  def onTransportError(): scala.Unit = js.native
  def progress(): js.Any = js.native
  def progress(options: js.Any): js.Any = js.native
  def reject(): js.Any = js.native
  def reject(options: js.Any): js.Any = js.native
  def reply(): js.Any = js.native
  def reply(options: js.Any): js.Any = js.native
}

/* static members */
@JSImport("sip.js/lib/ServerContext", "ServerContext")
@js.native
object ServerContext extends js.Object {
  def initializer(
    objectToConstruct: sipDotJsLib.libServerContextMod.ServerContext,
    ua: sipDotJsLib.libUAMod.UA,
    incomingRequest: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequest
  ): scala.Unit = js.native
}

