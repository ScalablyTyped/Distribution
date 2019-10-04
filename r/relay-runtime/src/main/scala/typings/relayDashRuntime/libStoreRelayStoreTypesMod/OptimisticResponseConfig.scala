package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimisticResponseConfig extends js.Object {
  var operation: OperationDescriptor = js.native
  var response: PayloadData = js.native
  @JSName("updater")
  var updater_Original: SelectorStoreUpdater[js.Object] = js.native
  def updater(store: RecordSourceSelectorProxy, data: js.Object): Unit = js.native
}

