package typings.spdy.spdyMod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spdy", "server.create")
@js.native
object create extends js.Object {
  def apply(
    base: js.Any,
    options: typings.node.httpsMod.ServerOptions,
    handler: js.Function2[
      /* request */ typings.spdy.spdyMod.server.IncomingMessage, 
      /* response */ typings.spdy.spdyMod.server.ServerResponse | typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): typings.spdy.spdyMod.server.Server = js.native
  def apply(
    handler: js.Function2[
      /* request */ typings.spdy.spdyMod.server.IncomingMessage, 
      /* response */ typings.spdy.spdyMod.server.ServerResponse | typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): typings.spdy.spdyMod.server.Server = js.native
  def apply(
    options: typings.node.httpsMod.ServerOptions,
    handler: js.Function2[
      /* request */ typings.spdy.spdyMod.server.IncomingMessage, 
      /* response */ typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): typings.spdy.spdyMod.server.Server = js.native
}

