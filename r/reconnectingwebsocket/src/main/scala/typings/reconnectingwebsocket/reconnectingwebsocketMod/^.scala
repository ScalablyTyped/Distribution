package typings.reconnectingwebsocket.reconnectingwebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reconnectingwebsocket", JSImport.Namespace)
@js.native
class ^ protected () extends ReconnectingWebSocket {
  def this(url: String) = this()
  def this(url: String, protocols: js.Array[String]) = this()
  def this(url: String, protocols: js.Array[String], options: Options) = this()
}

@JSImport("reconnectingwebsocket", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CLOSED: Double = js.native
  var CLOSING: Double = js.native
  var CONNECTING: Double = js.native
  var OPEN: Double = js.native
  var debugAll: Boolean = js.native
}

