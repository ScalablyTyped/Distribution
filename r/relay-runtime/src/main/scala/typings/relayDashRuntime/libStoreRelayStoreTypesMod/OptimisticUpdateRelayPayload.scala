package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticUpdateRelayPayload extends OptimisticUpdate {
  val operation: OperationDescriptor
  val payload: RelayResponsePayload
  val updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
}

object OptimisticUpdateRelayPayload {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    payload: RelayResponsePayload,
    updater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit = null
  ): OptimisticUpdateRelayPayload = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2(updater))
    __obj.asInstanceOf[OptimisticUpdateRelayPayload]
  }
}

