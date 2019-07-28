package typings.spdy.spdyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spdy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createAgent(base: js.Any, options: AgentOptions): Agent | PlainAgent = js.native
  def createAgent(options: AgentOptions): Agent | PlainAgent = js.native
  def createServer(
    base: js.Any,
    options: ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server = js.native
  def createServer(
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server = js.native
  def createServer(
    options: ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server = js.native
}

