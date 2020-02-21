package typings.socketclusterClient.transportMod

import typings.socketclusterClient.authMod.AGAuthEngine
import typings.socketclusterClient.clientsocketMod.ClientOptions
import typings.socketclusterServer.serverMod.CodecEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-client/lib/transport", JSImport.Namespace)
@js.native
class ^ protected () extends AGTransport {
  def this(authEngine: AGAuthEngine, codecEngine: CodecEngine, options: ClientOptions) = this()
  def this(
    authEngine: AGAuthEngine,
    codecEngine: CodecEngine,
    options: ClientOptions,
    wsOptions: typings.ws.mod.ClientOptions
  ) = this()
  def this(
    authEngine: AGAuthEngine,
    codecEngine: CodecEngine,
    options: ClientOptions,
    wsOptions: typings.ws.mod.ClientOptions,
    handlers: TransportHandlers
  ) = this()
}

