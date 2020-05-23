package typings.pulumiAws.outputMod.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodSettingsSettings extends js.Object {
  /**
    * Specifies whether the cached responses are encrypted.
    */
  var cacheDataEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached.
    */
  var cacheTtlInSeconds: js.UndefOr[Double] = js.native
  /**
    * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached.
    */
  var cachingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether data trace logging is enabled for this method, which effects the log entries pushed to Amazon CloudWatch Logs.
    */
  var dataTraceEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the logging level for this method, which effects the log entries pushed to Amazon CloudWatch Logs. The available levels are `OFF`, `ERROR`, and `INFO`.
    */
  var loggingLevel: js.UndefOr[String] = js.native
  /**
    * Specifies whether Amazon CloudWatch metrics are enabled for this method.
    */
  var metricsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether authorization is required for a cache invalidation request.
    */
  var requireAuthorizationForCacheControl: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the throttling burst limit.
    */
  var throttlingBurstLimit: js.UndefOr[Double] = js.native
  /**
    * Specifies the throttling rate limit.
    */
  var throttlingRateLimit: js.UndefOr[Double] = js.native
  /**
    * Specifies how to handle unauthorized requests for cache invalidation. The available values are `FAIL_WITH_403`, `SUCCEED_WITH_RESPONSE_HEADER`, `SUCCEED_WITHOUT_RESPONSE_HEADER`.
    */
  var unauthorizedCacheControlHeaderStrategy: js.UndefOr[String] = js.native
}

object MethodSettingsSettings {
  @scala.inline
  def apply(
    cacheDataEncrypted: js.UndefOr[Boolean] = js.undefined,
    cacheTtlInSeconds: js.UndefOr[Double] = js.undefined,
    cachingEnabled: js.UndefOr[Boolean] = js.undefined,
    dataTraceEnabled: js.UndefOr[Boolean] = js.undefined,
    loggingLevel: String = null,
    metricsEnabled: js.UndefOr[Boolean] = js.undefined,
    requireAuthorizationForCacheControl: js.UndefOr[Boolean] = js.undefined,
    throttlingBurstLimit: js.UndefOr[Double] = js.undefined,
    throttlingRateLimit: js.UndefOr[Double] = js.undefined,
    unauthorizedCacheControlHeaderStrategy: String = null
  ): MethodSettingsSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheDataEncrypted)) __obj.updateDynamic("cacheDataEncrypted")(cacheDataEncrypted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheTtlInSeconds)) __obj.updateDynamic("cacheTtlInSeconds")(cacheTtlInSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cachingEnabled)) __obj.updateDynamic("cachingEnabled")(cachingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dataTraceEnabled)) __obj.updateDynamic("dataTraceEnabled")(dataTraceEnabled.get.asInstanceOf[js.Any])
    if (loggingLevel != null) __obj.updateDynamic("loggingLevel")(loggingLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(metricsEnabled)) __obj.updateDynamic("metricsEnabled")(metricsEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requireAuthorizationForCacheControl)) __obj.updateDynamic("requireAuthorizationForCacheControl")(requireAuthorizationForCacheControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throttlingBurstLimit)) __obj.updateDynamic("throttlingBurstLimit")(throttlingBurstLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throttlingRateLimit)) __obj.updateDynamic("throttlingRateLimit")(throttlingRateLimit.get.asInstanceOf[js.Any])
    if (unauthorizedCacheControlHeaderStrategy != null) __obj.updateDynamic("unauthorizedCacheControlHeaderStrategy")(unauthorizedCacheControlHeaderStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodSettingsSettings]
  }
}

