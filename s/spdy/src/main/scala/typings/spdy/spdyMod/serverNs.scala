package typings.spdy.spdyMod

import typings.node.tlsMod.TlsOptions
import typings.spdy.Anon_Connection
import typings.spdy.spdyMod.serverNs.PushOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spdy", "server")
@js.native
object serverNs extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.spdy.spdyStrings.h2
    - typings.spdy.spdyStrings.`spdy/3DOT1`
    - typings.spdy.spdyStrings.`spdy/3`
    - typings.spdy.spdyStrings.`spdy/2`
    - typings.spdy.spdyStrings.`http/1DOT1`
    - typings.spdy.spdyStrings.`http/1DOT0`
  */
  trait Protocol extends js.Object
  
  trait PushOptions extends js.Object {
    var method: js.UndefOr[String] = js.undefined
    var request: js.UndefOr[js.Any] = js.undefined
    var response: js.UndefOr[js.Any] = js.undefined
    var status: js.UndefOr[Double] = js.undefined
  }
  
  trait ServerOptions
    extends TlsOptions
       with typings.node.httpMod.ServerOptions {
    var spdy: js.UndefOr[Anon_Connection] = js.undefined
  }
  
  @js.native
  trait ServerResponse
    extends typings.node.httpMod.ServerResponse {
    def push(filename: String, options: PushOptions): js.Any = js.native
  }
  
  def create(
    base: js.Any,
    options: typings.node.httpsMod.ServerOptions,
    handler: js.Function2[
      /* request */ typings.spdy.spdyMod.serverNs.IncomingMessage, 
      /* response */ typings.spdy.spdyMod.serverNs.ServerResponse | typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): typings.spdy.spdyMod.serverNs.Server = js.native
  def create(
    handler: js.Function2[
      /* request */ typings.spdy.spdyMod.serverNs.IncomingMessage, 
      /* response */ typings.spdy.spdyMod.serverNs.ServerResponse | typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): typings.spdy.spdyMod.serverNs.Server = js.native
  def create(
    options: typings.node.httpsMod.ServerOptions,
    handler: js.Function2[
      /* request */ typings.spdy.spdyMod.serverNs.IncomingMessage, 
      /* response */ typings.node.httpMod.ServerResponse, 
      Unit
    ]
  ): typings.spdy.spdyMod.serverNs.Server = js.native
  type IncomingMessage = typings.node.httpMod.IncomingMessage
  type PlainServer = typings.node.httpMod.Server
  type Server = typings.node.httpsMod.Server
}

