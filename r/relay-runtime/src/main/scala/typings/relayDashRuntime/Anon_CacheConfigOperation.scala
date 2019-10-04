package typings.relayDashRuntime

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheConfigOperation extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig] = js.undefined
  var operation: OperationDescriptor
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object]] = js.undefined
}

object Anon_CacheConfigOperation {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    cacheConfig: CacheConfig = null,
    updater: SelectorStoreUpdater[js.Object] = null
  ): Anon_CacheConfigOperation = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig)
    if (updater != null) __obj.updateDynamic("updater")(updater)
    __obj.asInstanceOf[Anon_CacheConfigOperation]
  }
}

