package typings.reactDashRelay

import typings.reactDashRelay.reactDashRelayMod.FetchPolicy
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheConfig extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
}

object Anon_CacheConfig {
  @scala.inline
  def apply(cacheConfig: CacheConfig = null, fetchPolicy: FetchPolicy = null): Anon_CacheConfig = {
    val __obj = js.Dynamic.literal()
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    __obj.asInstanceOf[Anon_CacheConfig]
  }
}

