package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayNetworkTypesMod.UploadableMap
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var operation: OperationDescriptor
  var optimisticResponse: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
  var uploadables: js.UndefOr[UploadableMap | Null] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    optimisticResponse: StringDictionary[js.Any] = null,
    optimisticUpdater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit = null,
    updater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit = null,
    uploadables: UploadableMap = null
  ): AnonKey = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(js.Any.fromFunction2(optimisticUpdater))
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2(updater))
    if (uploadables != null) __obj.updateDynamic("uploadables")(uploadables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

