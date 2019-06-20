package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheConfigOperation extends js.Object {
  var cacheConfig: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig | scala.Null] = js.undefined
  var operation: relayDashRuntimeLib.relayDashRuntimeMod.OperationDescriptor
  var updater: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_] | scala.Null] = js.undefined
}

object Anon_CacheConfigOperation {
  @scala.inline
  def apply(
    operation: relayDashRuntimeLib.relayDashRuntimeMod.OperationDescriptor,
    cacheConfig: relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig = null,
    updater: relayDashRuntimeLib.relayDashRuntimeMod.SelectorStoreUpdater[_] = null
  ): Anon_CacheConfigOperation = {
    val __obj = js.Dynamic.literal(operation = operation)
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig)
    if (updater != null) __obj.updateDynamic("updater")(updater)
    __obj.asInstanceOf[Anon_CacheConfigOperation]
  }
}

