package typings.relayRuntime

import typings.relayRuntime.relayNetworkTypesMod.FetchFunction
import typings.relayRuntime.relayNetworkTypesMod.Network
import typings.relayRuntime.relayNetworkTypesMod.SubscribeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime/lib/network/RelayNetwork", JSImport.Namespace)
@js.native
object relayNetworkMod extends js.Object {
  
  @js.native
  object RelayNetwork extends js.Object {
    
    def create(fetchFn: FetchFunction): Network = js.native
    def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): Network = js.native
  }
}
