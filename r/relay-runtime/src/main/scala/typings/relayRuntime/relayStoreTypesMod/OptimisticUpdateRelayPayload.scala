package typings.relayRuntime.relayStoreTypesMod

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
    updater: js.UndefOr[Null | ((/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit)] = js.undefined
  ): OptimisticUpdateRelayPayload = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    if (!js.isUndefined(updater)) __obj.updateDynamic("updater")(if (updater != null) js.Any.fromFunction2(updater.asInstanceOf[(/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit]) else null)
    __obj.asInstanceOf[OptimisticUpdateRelayPayload]
  }
}

