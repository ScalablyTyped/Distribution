package typings.relayRuntime.anon

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayNetworkTypesMod.UploadableMap
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticResponse extends js.Object {
  var operation: OperationDescriptor
  var optimisticResponse: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
  var uploadables: js.UndefOr[UploadableMap | Null] = js.undefined
}

object OptimisticResponse {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    optimisticResponse: js.UndefOr[Null | StringDictionary[js.Any]] = js.undefined,
    optimisticUpdater: js.UndefOr[Null | ((/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit)] = js.undefined,
    updater: js.UndefOr[Null | ((/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit)] = js.undefined,
    uploadables: js.UndefOr[Null | UploadableMap] = js.undefined
  ): OptimisticResponse = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (!js.isUndefined(optimisticResponse)) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(optimisticUpdater)) __obj.updateDynamic("optimisticUpdater")(if (optimisticUpdater != null) js.Any.fromFunction2(optimisticUpdater.asInstanceOf[(/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit]) else null)
    if (!js.isUndefined(updater)) __obj.updateDynamic("updater")(if (updater != null) js.Any.fromFunction2(updater.asInstanceOf[(/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit]) else null)
    if (!js.isUndefined(uploadables)) __obj.updateDynamic("uploadables")(uploadables.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticResponse]
  }
}

