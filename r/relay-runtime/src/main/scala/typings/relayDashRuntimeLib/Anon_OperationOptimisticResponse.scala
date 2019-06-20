package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OperationOptimisticResponse extends js.Object {
  var operation: relayDashRuntimeLib.relayDashRuntimeMod.OperationDescriptor
  var optimisticResponse: js.UndefOr[js.Object] = js.undefined
  var optimisticUpdater: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_] | scala.Null] = js.undefined
}

object Anon_OperationOptimisticResponse {
  @scala.inline
  def apply(
    operation: relayDashRuntimeLib.relayDashRuntimeMod.OperationDescriptor,
    optimisticResponse: js.Object = null,
    optimisticUpdater: relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_] = null
  ): Anon_OperationOptimisticResponse = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse)
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(optimisticUpdater)
    __obj.asInstanceOf[Anon_OperationOptimisticResponse]
  }
}

