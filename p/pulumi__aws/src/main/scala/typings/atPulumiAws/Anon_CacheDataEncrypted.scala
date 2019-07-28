package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheDataEncrypted extends js.Object {
  var cacheDataEncrypted: js.UndefOr[Boolean] = js.undefined
  var cacheTtlInSeconds: js.UndefOr[Double] = js.undefined
  var cachingEnabled: js.UndefOr[Boolean] = js.undefined
  var dataTraceEnabled: js.UndefOr[Boolean] = js.undefined
  var loggingLevel: js.UndefOr[String] = js.undefined
  var metricsEnabled: js.UndefOr[Boolean] = js.undefined
  var requireAuthorizationForCacheControl: js.UndefOr[Boolean] = js.undefined
  var throttlingBurstLimit: js.UndefOr[Double] = js.undefined
  var throttlingRateLimit: js.UndefOr[Double] = js.undefined
  var unauthorizedCacheControlHeaderStrategy: js.UndefOr[String] = js.undefined
}

object Anon_CacheDataEncrypted {
  @scala.inline
  def apply(
    cacheDataEncrypted: js.UndefOr[Boolean] = js.undefined,
    cacheTtlInSeconds: Int | Double = null,
    cachingEnabled: js.UndefOr[Boolean] = js.undefined,
    dataTraceEnabled: js.UndefOr[Boolean] = js.undefined,
    loggingLevel: String = null,
    metricsEnabled: js.UndefOr[Boolean] = js.undefined,
    requireAuthorizationForCacheControl: js.UndefOr[Boolean] = js.undefined,
    throttlingBurstLimit: Int | Double = null,
    throttlingRateLimit: Int | Double = null,
    unauthorizedCacheControlHeaderStrategy: String = null
  ): Anon_CacheDataEncrypted = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheDataEncrypted)) __obj.updateDynamic("cacheDataEncrypted")(cacheDataEncrypted)
    if (cacheTtlInSeconds != null) __obj.updateDynamic("cacheTtlInSeconds")(cacheTtlInSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(cachingEnabled)) __obj.updateDynamic("cachingEnabled")(cachingEnabled)
    if (!js.isUndefined(dataTraceEnabled)) __obj.updateDynamic("dataTraceEnabled")(dataTraceEnabled)
    if (loggingLevel != null) __obj.updateDynamic("loggingLevel")(loggingLevel)
    if (!js.isUndefined(metricsEnabled)) __obj.updateDynamic("metricsEnabled")(metricsEnabled)
    if (!js.isUndefined(requireAuthorizationForCacheControl)) __obj.updateDynamic("requireAuthorizationForCacheControl")(requireAuthorizationForCacheControl)
    if (throttlingBurstLimit != null) __obj.updateDynamic("throttlingBurstLimit")(throttlingBurstLimit.asInstanceOf[js.Any])
    if (throttlingRateLimit != null) __obj.updateDynamic("throttlingRateLimit")(throttlingRateLimit.asInstanceOf[js.Any])
    if (unauthorizedCacheControlHeaderStrategy != null) __obj.updateDynamic("unauthorizedCacheControlHeaderStrategy")(unauthorizedCacheControlHeaderStrategy)
    __obj.asInstanceOf[Anon_CacheDataEncrypted]
  }
}

