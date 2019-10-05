package typings.relayDashRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.UploadableMap
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var operation: OperationDescriptor
  var optimisticResponse: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater | Null] = js.undefined
  var updater: js.UndefOr[SelectorStoreUpdater | Null] = js.undefined
  var uploadables: js.UndefOr[UploadableMap | Null] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    optimisticResponse: StringDictionary[js.Any] = null,
    optimisticUpdater: (/* store */ RecordSourceSelectorProxy, /* data */ js.Any) => Unit = null,
    updater: (/* store */ RecordSourceSelectorProxy, /* data */ js.Any) => Unit = null,
    uploadables: UploadableMap = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse)
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(js.Any.fromFunction2(optimisticUpdater))
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2(updater))
    if (uploadables != null) __obj.updateDynamic("uploadables")(uploadables)
    __obj.asInstanceOf[Anon_Key]
  }
}

