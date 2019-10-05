package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticUpdateRelayPayload extends OptimisticUpdate {
  val operation: OperationDescriptor
  val payload: RelayResponsePayload
  val updater: js.UndefOr[SelectorStoreUpdater | Null] = js.undefined
}

object OptimisticUpdateRelayPayload {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    payload: RelayResponsePayload,
    updater: (/* store */ RecordSourceSelectorProxy, /* data */ js.Any) => Unit = null
  ): OptimisticUpdateRelayPayload = {
    val __obj = js.Dynamic.literal(operation = operation, payload = payload)
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2(updater))
    __obj.asInstanceOf[OptimisticUpdateRelayPayload]
  }
}

