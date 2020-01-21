package typings.reactRelay

import typings.reactRelay.mod.FetchPolicy
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheConfig extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
}

object AnonCacheConfig {
  @scala.inline
  def apply(cacheConfig: CacheConfig = null, fetchPolicy: FetchPolicy = null): AnonCacheConfig = {
    val __obj = js.Dynamic.literal()
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCacheConfig]
  }
}

