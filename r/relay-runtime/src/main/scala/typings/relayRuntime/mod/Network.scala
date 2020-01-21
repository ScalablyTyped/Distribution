package typings.relayRuntime.mod

import typings.relayRuntime.relayNetworkTypesMod.FetchFunction
import typings.relayRuntime.relayNetworkTypesMod.SubscribeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Network")
@js.native
object Network extends js.Object {
  def create(fetchFn: FetchFunction): typings.relayRuntime.relayNetworkTypesMod.Network = js.native
  def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): typings.relayRuntime.relayNetworkTypesMod.Network = js.native
}

