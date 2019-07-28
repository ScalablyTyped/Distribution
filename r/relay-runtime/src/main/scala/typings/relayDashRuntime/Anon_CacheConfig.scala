package typings.relayDashRuntime

import typings.relayDashRuntime.relayDashRuntimeMod.COperationDescriptor
import typings.relayDashRuntime.relayDashRuntimeMod.CacheConfig
import typings.relayDashRuntime.relayDashRuntimeMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheConfig[TReaderNode, TNormalizationNode, TRequest] extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
  var operation: COperationDescriptor[TReaderNode, TNormalizationNode, TRequest]
  var updater: js.UndefOr[SelectorStoreUpdater[_] | Null] = js.undefined
}

object Anon_CacheConfig {
  @scala.inline
  def apply[TReaderNode, TNormalizationNode, TRequest](
    operation: COperationDescriptor[TReaderNode, TNormalizationNode, TRequest],
    cacheConfig: CacheConfig = null,
    updater: SelectorStoreUpdater[_] = null
  ): Anon_CacheConfig[TReaderNode, TNormalizationNode, TRequest] = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig)
    if (updater != null) __obj.updateDynamic("updater")(updater)
    __obj.asInstanceOf[Anon_CacheConfig[TReaderNode, TNormalizationNode, TRequest]]
  }
}

