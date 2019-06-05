package typings
package sipDotJsLib.libClientContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/ClientContext", "ClientContext")
@js.native
class ClientContext protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(ua: sipDotJsLib.libUAMod.UA, method: java.lang.String, target: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, method: java.lang.String, target: sipDotJsLib.libCoreMod.URI) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, method: java.lang.String, target: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, method: java.lang.String, target: sipDotJsLib.libCoreMod.URI, options: js.Any) = this()
  var body: js.UndefOr[sipDotJsLib.libSessionDashDescriptionDashHandlerMod.BodyObj] = js.native
  var data: js.Any = js.native
  var localIdentity: sipDotJsLib.libCoreMod.NameAddrHeader = js.native
  var logger: sipDotJsLib.libCoreMod.Logger = js.native
  var method: java.lang.String = js.native
  var remoteIdentity: sipDotJsLib.libCoreMod.NameAddrHeader = js.native
  var request: sipDotJsLib.libCoreMod.OutgoingRequestMessage = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  var ua: sipDotJsLib.libUAMod.UA = js.native
  def onRequestTimeout(): scala.Unit = js.native
  def onTransportError(): scala.Unit = js.native
  def receiveResponse(response: sipDotJsLib.libCoreMod.IncomingResponseMessage): scala.Unit = js.native
  def send(): this.type = js.native
}

/* static members */
@JSImport("sip.js/lib/ClientContext", "ClientContext")
@js.native
object ClientContext extends js.Object {
  def initializer(
    objToConstruct: sipDotJsLib.libClientContextMod.ClientContext,
    ua: sipDotJsLib.libUAMod.UA,
    method: java.lang.String,
    originalTarget: java.lang.String
  ): scala.Unit = js.native
  def initializer(
    objToConstruct: sipDotJsLib.libClientContextMod.ClientContext,
    ua: sipDotJsLib.libUAMod.UA,
    method: java.lang.String,
    originalTarget: java.lang.String,
    options: js.Any
  ): scala.Unit = js.native
  def initializer(
    objToConstruct: sipDotJsLib.libClientContextMod.ClientContext,
    ua: sipDotJsLib.libUAMod.UA,
    method: java.lang.String,
    originalTarget: sipDotJsLib.libCoreMod.URI
  ): scala.Unit = js.native
  def initializer(
    objToConstruct: sipDotJsLib.libClientContextMod.ClientContext,
    ua: sipDotJsLib.libUAMod.UA,
    method: java.lang.String,
    originalTarget: sipDotJsLib.libCoreMod.URI,
    options: js.Any
  ): scala.Unit = js.native
}

