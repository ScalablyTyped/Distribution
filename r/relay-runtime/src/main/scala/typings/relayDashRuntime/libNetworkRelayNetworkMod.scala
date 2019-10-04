package typings.relayDashRuntime

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.FetchFunction
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.Network
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.SubscribeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/network/RelayNetwork", JSImport.Namespace)
@js.native
object libNetworkRelayNetworkMod extends js.Object {
  @js.native
  object RelayNetwork extends js.Object {
    def create(fetchFn: FetchFunction): Network = js.native
    def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): Network = js.native
  }
  
}

