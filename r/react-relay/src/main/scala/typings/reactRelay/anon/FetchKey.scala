package typings.reactRelay.anon

import typings.reactRelay.queryResourceMod.RenderPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchKey extends js.Object {
  var UNSTABLE_renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
  var fetchKey: js.UndefOr[String | Double] = js.undefined
  var fetchPolicy: js.UndefOr[typings.reactRelay.queryResourceMod.FetchPolicy] = js.undefined
  var networkCacheConfig: js.UndefOr[typings.relayRuntime.relayRuntimeTypesMod.CacheConfig] = js.undefined
}

object FetchKey {
  @scala.inline
  def apply(
    UNSTABLE_renderPolicy: RenderPolicy = null,
    fetchKey: String | Double = null,
    fetchPolicy: typings.reactRelay.queryResourceMod.FetchPolicy = null,
    networkCacheConfig: typings.relayRuntime.relayRuntimeTypesMod.CacheConfig = null
  ): FetchKey = {
    val __obj = js.Dynamic.literal()
    if (UNSTABLE_renderPolicy != null) __obj.updateDynamic("UNSTABLE_renderPolicy")(UNSTABLE_renderPolicy.asInstanceOf[js.Any])
    if (fetchKey != null) __obj.updateDynamic("fetchKey")(fetchKey.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (networkCacheConfig != null) __obj.updateDynamic("networkCacheConfig")(networkCacheConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchKey]
  }
}

