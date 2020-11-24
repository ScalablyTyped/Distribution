package typings.rsocketWebsocketClient

import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketWebsocketClient.rsocketwebsocketclientMod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-websocket-client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default protected ()
    extends typings.rsocketWebsocketClient.rsocketwebsocketclientMod.default {
    def this(options: ClientOptions) = this()
    def this(options: ClientOptions, encoders: Encoders[_]) = this()
  }
}
