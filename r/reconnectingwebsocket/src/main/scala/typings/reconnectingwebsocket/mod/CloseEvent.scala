package typings.reconnectingwebsocket.mod

import typings.reconnectingwebsocket.reconnectingwebsocketStrings.close
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseEvent
  extends CustomEvent[js.Any] {
  @JSName("type")
  var type_CloseEvent: close = js.native
}

