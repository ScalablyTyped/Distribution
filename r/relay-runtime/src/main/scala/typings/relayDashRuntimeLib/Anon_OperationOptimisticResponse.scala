package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OperationOptimisticResponse extends js.Object {
  var operation: relayDashRuntimeLib.relayDashRuntimeMod.OperationSelector
  var optimisticResponse: js.UndefOr[js.Object] = js.undefined
  var optimisticUpdater: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_]] = js.undefined
  var updater: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_]] = js.undefined
  var uploadables: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.UploadableMap] = js.undefined
}

object Anon_OperationOptimisticResponse {
  @scala.inline
  def apply(
    operation: relayDashRuntimeLib.relayDashRuntimeMod.OperationSelector,
    optimisticResponse: js.Object = null,
    optimisticUpdater: relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_] = null,
    updater: relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_] = null,
    uploadables: relayDashRuntimeLib.relayDashRuntimeMod.UploadableMap = null
  ): Anon_OperationOptimisticResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation")(operation)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse)
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(optimisticUpdater)
    if (updater != null) __obj.updateDynamic("updater")(updater)
    if (uploadables != null) __obj.updateDynamic("uploadables")(uploadables)
    __obj.asInstanceOf[Anon_OperationOptimisticResponse]
  }
}

