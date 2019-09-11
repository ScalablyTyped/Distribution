package typings.reconnectingwebsocket.reconnectingwebsocketMod

import typings.reconnectingwebsocket.reconnectingwebsocketStrings.message
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageEvent
  extends CustomEvent[js.Any] {
  var data: /* import warning: ImportType.apply Failed type conversion: reconnectingwebsocket.GlobalMessageEvent['data'] */ js.Any = js.native
  @JSName("type")
  var type_MessageEvent: message = js.native
}

