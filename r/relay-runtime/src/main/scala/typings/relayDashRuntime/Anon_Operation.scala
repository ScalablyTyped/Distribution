package typings.relayDashRuntime

import typings.relayDashRuntime.relayDashRuntimeMod.OperationDescriptor
import typings.relayDashRuntime.relayDashRuntimeMod.SelectorStoreUpdater
import typings.relayDashRuntime.relayDashRuntimeMod.UploadableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Operation extends js.Object {
  var operation: OperationDescriptor
  var optimisticResponse: js.UndefOr[js.Object | Null] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[_] | Null] = js.undefined
  var updater: js.UndefOr[SelectorStoreUpdater[_] | Null] = js.undefined
  var uploadables: js.UndefOr[UploadableMap | Null] = js.undefined
}

object Anon_Operation {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    optimisticResponse: js.Object = null,
    optimisticUpdater: SelectorStoreUpdater[_] = null,
    updater: SelectorStoreUpdater[_] = null,
    uploadables: UploadableMap = null
  ): Anon_Operation = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse)
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(optimisticUpdater)
    if (updater != null) __obj.updateDynamic("updater")(updater)
    if (uploadables != null) __obj.updateDynamic("uploadables")(uploadables)
    __obj.asInstanceOf[Anon_Operation]
  }
}

