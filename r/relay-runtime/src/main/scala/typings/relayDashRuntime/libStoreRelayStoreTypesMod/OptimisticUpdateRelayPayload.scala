package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimisticUpdateRelayPayload extends OptimisticUpdate {
  var operation: OperationDescriptor = js.native
  var payload: RelayResponsePayload = js.native
  @JSName("updater")
  var updater_Original: SelectorStoreUpdater[js.Object] = js.native
  def updater(store: RecordSourceSelectorProxy, data: js.Object): Unit = js.native
}

