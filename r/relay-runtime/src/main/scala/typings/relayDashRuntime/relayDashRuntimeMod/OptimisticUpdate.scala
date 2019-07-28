package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticUpdate extends js.Object {
  var fieldPayloads: js.UndefOr[js.Array[HandleFieldPayload] | Null] = js.undefined
  var operation: js.UndefOr[OperationDescriptor] = js.undefined
  var response: js.UndefOr[js.Object | Null] = js.undefined
  var selectorStoreUpdater: js.UndefOr[SelectorStoreUpdater[_] | Null] = js.undefined
  var source: js.UndefOr[RecordSource] = js.undefined
  var storeUpdater: js.UndefOr[StoreUpdater] = js.undefined
}

object OptimisticUpdate {
  @scala.inline
  def apply(
    fieldPayloads: js.Array[HandleFieldPayload] = null,
    operation: OperationDescriptor = null,
    response: js.Object = null,
    selectorStoreUpdater: SelectorStoreUpdater[_] = null,
    source: RecordSource = null,
    storeUpdater: StoreUpdater = null
  ): OptimisticUpdate = {
    val __obj = js.Dynamic.literal()
    if (fieldPayloads != null) __obj.updateDynamic("fieldPayloads")(fieldPayloads)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (response != null) __obj.updateDynamic("response")(response)
    if (selectorStoreUpdater != null) __obj.updateDynamic("selectorStoreUpdater")(selectorStoreUpdater)
    if (source != null) __obj.updateDynamic("source")(source)
    if (storeUpdater != null) __obj.updateDynamic("storeUpdater")(storeUpdater)
    __obj.asInstanceOf[OptimisticUpdate]
  }
}

