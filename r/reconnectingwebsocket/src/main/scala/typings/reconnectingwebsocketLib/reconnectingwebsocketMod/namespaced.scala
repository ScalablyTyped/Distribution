package typings
package reconnectingwebsocketLib.reconnectingwebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reconnectingwebsocket", JSImport.Namespace)
@js.native
class namespaced protected () extends ReconnectingWebSocket {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, protocols: js.Array[java.lang.String]) = this()
  def this(url: java.lang.String, protocols: js.Array[java.lang.String], options: reconnectingwebsocketLib.reconnectingwebsocketMod.ReconnectingWebSocketNs.Options) = this()
}

/* static members */
@JSImport("reconnectingwebsocket", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var CLOSED: scala.Double = js.native
  var CLOSING: scala.Double = js.native
  var CONNECTING: scala.Double = js.native
  var OPEN: scala.Double = js.native
  var debugAll: scala.Boolean = js.native
}

