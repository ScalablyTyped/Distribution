package typings
package sipDotJsLib.typesTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/transport", "Transport")
@js.native
abstract class Transport protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(logger: sipDotJsLib.typesLoggerDashFactoryMod.Logger, options: js.Any) = this()
  var server: js.Any = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  def afterConnected(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def connect(): js.Promise[_] = js.native
  def connect(options: js.Any): js.Promise[_] = js.native
  def disconnect(): js.Promise[_] = js.native
  def disconnect(options: js.Any): js.Promise[_] = js.native
  def isConnected(): scala.Boolean = js.native
  def send(msg: java.lang.String): js.Promise[_] = js.native
  def send(msg: java.lang.String, options: js.Any): js.Promise[_] = js.native
  def send(msg: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest): js.Promise[_] = js.native
  def send(msg: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest, options: js.Any): js.Promise[_] = js.native
  def waitForConnected(): js.Promise[_] = js.native
}

