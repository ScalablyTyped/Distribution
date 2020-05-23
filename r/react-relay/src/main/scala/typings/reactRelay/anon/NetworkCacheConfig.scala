package typings.reactRelay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkCacheConfig extends js.Object {
  var networkCacheConfig: js.UndefOr[typings.relayRuntime.relayRuntimeTypesMod.CacheConfig] = js.undefined
}

object NetworkCacheConfig {
  @scala.inline
  def apply(networkCacheConfig: typings.relayRuntime.relayRuntimeTypesMod.CacheConfig = null): NetworkCacheConfig = {
    val __obj = js.Dynamic.literal()
    if (networkCacheConfig != null) __obj.updateDynamic("networkCacheConfig")(networkCacheConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkCacheConfig]
  }
}

