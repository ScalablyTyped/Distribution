package typings.relayDashRuntime

import typings.relayDashRuntime.relayDashRuntimeMod.OperationDescriptor
import typings.relayDashRuntime.relayDashRuntimeMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OperationOptimisticResponse extends js.Object {
  var operation: OperationDescriptor
  var optimisticResponse: js.UndefOr[js.Object] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[_] | Null] = js.undefined
}

object Anon_OperationOptimisticResponse {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    optimisticResponse: js.Object = null,
    optimisticUpdater: SelectorStoreUpdater[_] = null
  ): Anon_OperationOptimisticResponse = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse)
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(optimisticUpdater)
    __obj.asInstanceOf[Anon_OperationOptimisticResponse]
  }
}

