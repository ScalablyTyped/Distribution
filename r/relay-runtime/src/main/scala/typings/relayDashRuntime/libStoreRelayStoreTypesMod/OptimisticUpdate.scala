package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateFunction
  - typings.relayDashRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateRelayPayload
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
    updater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit = null
  ): OptimisticUpdate = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2(updater))
    __obj.asInstanceOf[OptimisticUpdate]
  }
}

