package typings.relayRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkCacheConfig extends js.Object {
  var networkCacheConfig: js.UndefOr[typings.relayRuntime.relayRuntimeTypesMod.CacheConfig] = js.native
}

object NetworkCacheConfig {
  @scala.inline
  def apply(): NetworkCacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkCacheConfig]
  }
  @scala.inline
  implicit class NetworkCacheConfigOps[Self <: NetworkCacheConfig] (val x: Self) extends AnyVal {
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
    def setNetworkCacheConfig(value: typings.relayRuntime.relayRuntimeTypesMod.CacheConfig): Self = this.set("networkCacheConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkCacheConfig: Self = this.set("networkCacheConfig", js.undefined)
  }
  
}

