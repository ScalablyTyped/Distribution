package typings.relayRuntime.anon

import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheConfig extends js.Object {
  var cacheConfig: js.UndefOr[typings.relayRuntime.relayRuntimeTypesMod.CacheConfig | Null] = js.native
  var operation: OperationDescriptor = js.native
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.native
}

object CacheConfig {
  @scala.inline
  def apply(operation: OperationDescriptor): CacheConfig = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheConfig]
  }
  @scala.inline
  implicit class CacheConfigOps[Self <: CacheConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOperation(value: OperationDescriptor): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheConfig(value: typings.relayRuntime.relayRuntimeTypesMod.CacheConfig): Self = this.set("cacheConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheConfig: Self = this.set("cacheConfig", js.undefined)
    @scala.inline
    def setCacheConfigNull: Self = this.set("cacheConfig", null)
    @scala.inline
    def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = this.set("updater", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdater: Self = this.set("updater", js.undefined)
    @scala.inline
    def setUpdaterNull: Self = this.set("updater", null)
  }
  
}

