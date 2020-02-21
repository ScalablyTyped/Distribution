package typings.socketclusterServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serverMod {
  type handshakeMiddlewareFunction = js.Function1[/* stream */ typings.writableConsumableStream.mod.^[js.Any], scala.Unit]
  type inboundMiddlewareFunction = js.Function1[/* stream */ typings.writableConsumableStream.mod.^[js.Any], scala.Unit]
  type inboundRawMiddlewareFunction = js.Function1[/* stream */ typings.writableConsumableStream.mod.^[js.Any], scala.Unit]
  type outboundMiddlewareFunction = js.Function1[/* stream */ typings.writableConsumableStream.mod.^[js.Any], scala.Unit]
}
