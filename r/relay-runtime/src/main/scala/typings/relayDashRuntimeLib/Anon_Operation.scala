package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Operation extends js.Object {
  var operation: relayDashRuntimeLib.relayDashRuntimeMod.OperationDescriptor
  var optimisticResponse: js.UndefOr[js.Object | scala.Null] = js.undefined
  var optimisticUpdater: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_] | scala.Null] = js.undefined
  var updater: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_] | scala.Null] = js.undefined
  var uploadables: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.UploadableMap | scala.Null] = js.undefined
}

object Anon_Operation {
  @scala.inline
  def apply(
    operation: relayDashRuntimeLib.relayDashRuntimeMod.OperationDescriptor,
    optimisticResponse: js.Object = null,
    optimisticUpdater: relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_] = null,
    updater: relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_] = null,
    uploadables: relayDashRuntimeLib.relayDashRuntimeMod.UploadableMap = null
  ): Anon_Operation = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse)
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(optimisticUpdater)
    if (updater != null) __obj.updateDynamic("updater")(updater)
    if (uploadables != null) __obj.updateDynamic("uploadables")(uploadables)
    __obj.asInstanceOf[Anon_Operation]
  }
}

