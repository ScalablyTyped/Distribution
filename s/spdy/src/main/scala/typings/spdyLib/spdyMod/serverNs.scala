package typings
package spdyLib.spdyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spdy", "server")
@js.native
object serverNs extends js.Object {
  
  trait PushOptions extends js.Object {
    var method: js.UndefOr[java.lang.String] = js.undefined
    var request: js.UndefOr[js.Any] = js.undefined
    var response: js.UndefOr[js.Any] = js.undefined
    var status: js.UndefOr[scala.Double] = js.undefined
  }
  
  
  trait ServerOptions
    extends nodeLib.tlsMod.TlsOptions {
    var spdy: js.UndefOr[spdyLib.Anon_Protocols] = js.undefined
  }
  
  @js.native
  trait ServerResponse
    extends nodeLib.httpMod.ServerResponse {
    def push(filename: java.lang.String, options: PushOptions): js.Any = js.native
  }
  
  def create(
    base: js.Any,
    options: nodeLib.httpsMod.ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ ServerResponse | nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): Server = js.native
  def create(
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ ServerResponse | nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): Server = js.native
  def create(
    options: nodeLib.httpsMod.ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): Server = js.native
  type IncomingMessage = nodeLib.httpMod.IncomingMessage
  type PlainServer = nodeLib.httpMod.Server
  type Protocol = spdyLib.spdyLibStrings.h2 | spdyLib.spdyLibStrings.`spdy/3DOT1` | spdyLib.spdyLibStrings.`spdy/3` | spdyLib.spdyLibStrings.`spdy/2` | spdyLib.spdyLibStrings.`http/1DOT1` | spdyLib.spdyLibStrings.`http/1DOT0`
  type Server = nodeLib.httpsMod.Server
}

