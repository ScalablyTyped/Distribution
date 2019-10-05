package typings.atPulumiAws.typesInputMod.apigateway

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodSettingsSettings extends js.Object {
  /**
    * Specifies whether the cached responses are encrypted.
    */
  var cacheDataEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached.
    */
  var cacheTtlInSeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached.
    */
  var cachingEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies whether data trace logging is enabled for this method, which effects the log entries pushed to Amazon CloudWatch Logs.
    */
  var dataTraceEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies the logging level for this method, which effects the log entries pushed to Amazon CloudWatch Logs. The available levels are `OFF`, `ERROR`, and `INFO`.
    */
  var loggingLevel: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies whether Amazon CloudWatch metrics are enabled for this method.
    */
  var metricsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies whether authorization is required for a cache invalidation request.
    */
  var requireAuthorizationForCacheControl: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies the throttling burst limit.
    */
  var throttlingBurstLimit: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Specifies the throttling rate limit.
    */
  var throttlingRateLimit: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Specifies how to handle unauthorized requests for cache invalidation. The available values are `FAIL_WITH_403`, `SUCCEED_WITH_RESPONSE_HEADER`, `SUCCEED_WITHOUT_RESPONSE_HEADER`.
    */
  var unauthorizedCacheControlHeaderStrategy: js.UndefOr[Input[String]] = js.undefined
}

object MethodSettingsSettings {
  @scala.inline
  def apply(
    cacheDataEncrypted: Input[Boolean] = null,
    cacheTtlInSeconds: Input[Double] = null,
    cachingEnabled: Input[Boolean] = null,
    dataTraceEnabled: Input[Boolean] = null,
    loggingLevel: Input[String] = null,
    metricsEnabled: Input[Boolean] = null,
    requireAuthorizationForCacheControl: Input[Boolean] = null,
    throttlingBurstLimit: Input[Double] = null,
    throttlingRateLimit: Input[Double] = null,
    unauthorizedCacheControlHeaderStrategy: Input[String] = null
  ): MethodSettingsSettings = {
    val __obj = js.Dynamic.literal()
    if (cacheDataEncrypted != null) __obj.updateDynamic("cacheDataEncrypted")(cacheDataEncrypted.asInstanceOf[js.Any])
    if (cacheTtlInSeconds != null) __obj.updateDynamic("cacheTtlInSeconds")(cacheTtlInSeconds.asInstanceOf[js.Any])
    if (cachingEnabled != null) __obj.updateDynamic("cachingEnabled")(cachingEnabled.asInstanceOf[js.Any])
    if (dataTraceEnabled != null) __obj.updateDynamic("dataTraceEnabled")(dataTraceEnabled.asInstanceOf[js.Any])
    if (loggingLevel != null) __obj.updateDynamic("loggingLevel")(loggingLevel.asInstanceOf[js.Any])
    if (metricsEnabled != null) __obj.updateDynamic("metricsEnabled")(metricsEnabled.asInstanceOf[js.Any])
    if (requireAuthorizationForCacheControl != null) __obj.updateDynamic("requireAuthorizationForCacheControl")(requireAuthorizationForCacheControl.asInstanceOf[js.Any])
    if (throttlingBurstLimit != null) __obj.updateDynamic("throttlingBurstLimit")(throttlingBurstLimit.asInstanceOf[js.Any])
    if (throttlingRateLimit != null) __obj.updateDynamic("throttlingRateLimit")(throttlingRateLimit.asInstanceOf[js.Any])
    if (unauthorizedCacheControlHeaderStrategy != null) __obj.updateDynamic("unauthorizedCacheControlHeaderStrategy")(unauthorizedCacheControlHeaderStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodSettingsSettings]
  }
}

