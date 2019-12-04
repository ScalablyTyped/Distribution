package typings.reactDashRelay

import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NetworkCacheConfig extends js.Object {
  var networkCacheConfig: js.UndefOr[CacheConfig] = js.undefined
}

object Anon_NetworkCacheConfig {
  @scala.inline
  def apply(networkCacheConfig: CacheConfig = null): Anon_NetworkCacheConfig = {
    val __obj = js.Dynamic.literal()
    if (networkCacheConfig != null) __obj.updateDynamic("networkCacheConfig")(networkCacheConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NetworkCacheConfig]
  }
}

