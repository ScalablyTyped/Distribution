package typings.relayDashRuntime

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.UploadableMap
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Operation extends js.Object {
  var operation: OperationDescriptor
  var optimisticResponse: js.UndefOr[js.Object | Null] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
  var uploadables: js.UndefOr[UploadableMap | Null] = js.undefined
}

object Anon_Operation {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    optimisticResponse: js.Object = null,
    optimisticUpdater: SelectorStoreUpdater[js.Object] = null,
    updater: SelectorStoreUpdater[js.Object] = null,
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

