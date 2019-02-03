package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Network")
@js.native
class Network () extends js.Object

/* static members */
@JSImport("relay-runtime", "Network")
@js.native
object Network extends js.Object {
  /**
    * Creates an implementation of the `Network` interface defined in
    * `RelayNetworkTypes` given `fetch` and `subscribe` functions.
    */
  def create(fetchFn: relayDashRuntimeLib.relayDashRuntimeMod.FetchFunction): relayDashRuntimeLib.relayDashRuntimeMod.RelayNetwork = js.native
  def create(
    fetchFn: relayDashRuntimeLib.relayDashRuntimeMod.FetchFunction,
    subscribeFn: relayDashRuntimeLib.relayDashRuntimeMod.SubscribeFunction
  ): relayDashRuntimeLib.relayDashRuntimeMod.RelayNetwork = js.native
}

