package typings.relayDashRuntime

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheConfig extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
  var operation: OperationDescriptor
  var updater: js.UndefOr[SelectorStoreUpdater | Null] = js.undefined
}

object Anon_CacheConfig {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    cacheConfig: CacheConfig = null,
    updater: (/* store */ RecordSourceSelectorProxy, /* data */ js.Any) => Unit = null
  ): Anon_CacheConfig = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig)
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2(updater))
    __obj.asInstanceOf[Anon_CacheConfig]
  }
}

