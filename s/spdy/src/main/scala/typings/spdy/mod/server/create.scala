package typings.spdy.mod.server

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
      /* request */ IncomingMessage, 
      /* response */ ServerResponse | typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server = js.native
  def apply(
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ ServerResponse | typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server = js.native
  def apply(
    options: typings.node.httpsMod.ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server = js.native
}

