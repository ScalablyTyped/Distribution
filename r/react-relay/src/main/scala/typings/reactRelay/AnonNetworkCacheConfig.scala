package typings.reactRelay

import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNetworkCacheConfig extends js.Object {
  var networkCacheConfig: js.UndefOr[CacheConfig] = js.undefined
}

object AnonNetworkCacheConfig {
  @scala.inline
  def apply(networkCacheConfig: CacheConfig = null): AnonNetworkCacheConfig = {
    val __obj = js.Dynamic.literal()
    if (networkCacheConfig != null) __obj.updateDynamic("networkCacheConfig")(networkCacheConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNetworkCacheConfig]
  }
}

