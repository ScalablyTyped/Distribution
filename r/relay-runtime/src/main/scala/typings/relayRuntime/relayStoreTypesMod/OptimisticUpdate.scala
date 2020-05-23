package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction
  - typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateRelayPayload
*/
trait OptimisticUpdate extends js.Object

object OptimisticUpdate {
  @scala.inline
  def OptimisticUpdateFunction(storeUpdater: RecordSourceProxy => Unit): OptimisticUpdate = {
    val __obj = js.Dynamic.literal(storeUpdater = js.Any.fromFunction1(storeUpdater))
    __obj.asInstanceOf[OptimisticUpdate]
  }
  @scala.inline
  def OptimisticUpdateRelayPayload(
    operation: OperationDescriptor,
    payload: RelayResponsePayload,
    updater: js.UndefOr[Null | ((/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit)] = js.undefined
  ): OptimisticUpdate = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    if (!js.isUndefined(updater)) __obj.updateDynamic("updater")(if (updater != null) js.Any.fromFunction2(updater.asInstanceOf[(/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit]) else null)
    __obj.asInstanceOf[OptimisticUpdate]
  }
}

