package typings.relayDashRuntime

import typings.relayDashRuntime.relayDashRuntimeMod.CacheConfig
import typings.relayDashRuntime.relayDashRuntimeMod.OperationDescriptor
import typings.relayDashRuntime.relayDashRuntimeMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheConfigOperation extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
  var operation: OperationDescriptor
  var updater: js.UndefOr[SelectorStoreUpdater[_] | Null] = js.undefined
}

object Anon_CacheConfigOperation {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    cacheConfig: CacheConfig = null,
    updater: SelectorStoreUpdater[_] = null
  ): Anon_CacheConfigOperation = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig)
    if (updater != null) __obj.updateDynamic("updater")(updater)
    __obj.asInstanceOf[Anon_CacheConfigOperation]
  }
}

