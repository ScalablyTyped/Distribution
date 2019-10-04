package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.FetchFunction
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.SubscribeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Network")
@js.native
object Network extends js.Object {
  def create(fetchFn: FetchFunction): typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.Network = js.native
  def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.Network = js.native
}

