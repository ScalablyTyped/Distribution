package typings.reactRelay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheConfig extends js.Object {
  var cacheConfig: js.UndefOr[typings.relayRuntime.relayRuntimeTypesMod.CacheConfig | Null] = js.undefined
  var fetchPolicy: js.UndefOr[typings.reactRelay.mod.FetchPolicy] = js.undefined
}

object CacheConfig {
  @scala.inline
  def apply(
    cacheConfig: js.UndefOr[Null | typings.relayRuntime.relayRuntimeTypesMod.CacheConfig] = js.undefined,
    fetchPolicy: typings.reactRelay.mod.FetchPolicy = null
  ): CacheConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheConfig)) __obj.updateDynamic("cacheConfig")(cacheConfig.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheConfig]
  }
}

