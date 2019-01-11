package typings
package spdyLib.spdyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spdy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createAgent(base: js.Any, options: spdyLib.spdyMod.AgentOptions): spdyLib.spdyMod.Agent | spdyLib.spdyMod.PlainAgent = js.native
  def createAgent(options: spdyLib.spdyMod.AgentOptions): spdyLib.spdyMod.Agent | spdyLib.spdyMod.PlainAgent = js.native
  def createServer(
    base: js.Any,
    options: spdyLib.spdyMod.ServerOptions,
    handler: js.Function2[
      /* request */ spdyLib.spdyMod.IncomingMessage, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): spdyLib.spdyMod.Server = js.native
  def createServer(
    handler: js.Function2[
      /* request */ spdyLib.spdyMod.IncomingMessage, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): spdyLib.spdyMod.Server = js.native
  def createServer(
    options: spdyLib.spdyMod.ServerOptions,
    handler: js.Function2[
      /* request */ spdyLib.spdyMod.IncomingMessage, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): spdyLib.spdyMod.Server = js.native
}

