package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheConfig[TReaderNode, TNormalizationNode, TRequest] extends js.Object {
  var cacheConfig: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig | scala.Null] = js.undefined
  var operation: relayDashRuntimeLib.relayDashRuntimeMod.COperationDescriptor[TReaderNode, TNormalizationNode, TRequest]
  var updater: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_] | scala.Null] = js.undefined
}

object Anon_CacheConfig {
  @scala.inline
  def apply[TReaderNode, TNormalizationNode, TRequest](
    operation: relayDashRuntimeLib.relayDashRuntimeMod.COperationDescriptor[TReaderNode, TNormalizationNode, TRequest],
    cacheConfig: relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig = null,
    updater: relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_] = null
  ): Anon_CacheConfig[TReaderNode, TNormalizationNode, TRequest] = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig)
    if (updater != null) __obj.updateDynamic("updater")(updater)
    __obj.asInstanceOf[Anon_CacheConfig[TReaderNode, TNormalizationNode, TRequest]]
  }
}

