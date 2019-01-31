package typings
package sipDotJsLib.typesClientDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/client-context", "ClientContext")
@js.native
class ClientContext protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(ua: sipDotJsLib.typesUaMod.UA, method: java.lang.String, target: java.lang.String) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, method: java.lang.String, target: sipDotJsLib.typesUriMod.URI) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, method: java.lang.String, target: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, method: java.lang.String, target: sipDotJsLib.typesUriMod.URI, options: js.Any) = this()
  var body: js.Any = js.native
  var data: js.Any = js.native
  var localIdentity: sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader = js.native
  var logger: sipDotJsLib.typesLoggerDashFactoryMod.Logger = js.native
  var method: java.lang.String = js.native
  var remoteIdentity: sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader = js.native
  var request: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  var ua: sipDotJsLib.typesUaMod.UA = js.native
  def onRequestTimeout(): scala.Unit = js.native
  def onTransportError(): scala.Unit = js.native
  def receiveResponse(response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse): scala.Unit = js.native
  def send(): this.type = js.native
}

@JSImport("sip.js/types/client-context", "ClientContext")
@js.native
object ClientContext extends js.Object {
  def initializer(
    objToConstruct: sipDotJsLib.typesClientDashContextMod.ClientContext,
    ua: sipDotJsLib.typesUaMod.UA,
    method: java.lang.String,
    originalTarget: java.lang.String
  ): scala.Unit = js.native
  def initializer(
    objToConstruct: sipDotJsLib.typesClientDashContextMod.ClientContext,
    ua: sipDotJsLib.typesUaMod.UA,
    method: java.lang.String,
    originalTarget: java.lang.String,
    options: js.Any
  ): scala.Unit = js.native
  def initializer(
    objToConstruct: sipDotJsLib.typesClientDashContextMod.ClientContext,
    ua: sipDotJsLib.typesUaMod.UA,
    method: java.lang.String,
    originalTarget: sipDotJsLib.typesUriMod.URI
  ): scala.Unit = js.native
  def initializer(
    objToConstruct: sipDotJsLib.typesClientDashContextMod.ClientContext,
    ua: sipDotJsLib.typesUaMod.UA,
    method: java.lang.String,
    originalTarget: sipDotJsLib.typesUriMod.URI,
    options: js.Any
  ): scala.Unit = js.native
}

