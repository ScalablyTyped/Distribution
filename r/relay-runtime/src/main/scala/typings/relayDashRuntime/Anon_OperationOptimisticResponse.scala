package typings.relayDashRuntime

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.UploadableMap
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OperationOptimisticResponse extends js.Object {
  var operation: OperationDescriptor
  var optimisticResponse: js.UndefOr[js.Object] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object]] = js.undefined
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object]] = js.undefined
  var uploadables: js.UndefOr[UploadableMap] = js.undefined
}

object Anon_OperationOptimisticResponse {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    optimisticResponse: js.Object = null,
    optimisticUpdater: SelectorStoreUpdater[js.Object] = null,
    updater: SelectorStoreUpdater[js.Object] = null,
    uploadables: UploadableMap = null
  ): Anon_OperationOptimisticResponse = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse)
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(optimisticUpdater)
    if (updater != null) __obj.updateDynamic("updater")(updater)
    if (uploadables != null) __obj.updateDynamic("uploadables")(uploadables)
    __obj.asInstanceOf[Anon_OperationOptimisticResponse]
  }
}

