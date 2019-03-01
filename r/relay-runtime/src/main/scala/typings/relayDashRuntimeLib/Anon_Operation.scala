package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Operation extends js.Object {
  var operation: relayDashRuntimeLib.relayDashRuntimeMod.OperationSelector
  var optimisticResponse: js.UndefOr[js.Object] = js.undefined
  var optimisticUpdater: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_]] = js.undefined
}

object Anon_Operation {
  @scala.inline
  def apply(
    operation: relayDashRuntimeLib.relayDashRuntimeMod.OperationSelector,
    optimisticResponse: js.Object = null,
    optimisticUpdater: relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_] = null
  ): Anon_Operation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation")(operation)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse)
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(optimisticUpdater)
    __obj.asInstanceOf[Anon_Operation]
  }
}

