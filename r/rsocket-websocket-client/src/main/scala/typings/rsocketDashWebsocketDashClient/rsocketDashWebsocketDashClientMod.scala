package typings.rsocketDashWebsocketDashClient

import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashWebsocketDashClient.rSocketWebSocketClientMod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-websocket-client", JSImport.Namespace)
@js.native
object rsocketDashWebsocketDashClientMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.rsocketDashWebsocketDashClient.rSocketWebSocketClientMod.default {
    def this(options: ClientOptions) = this()
    def this(options: ClientOptions, encoders: Encoders[_]) = this()
  }
  
}

