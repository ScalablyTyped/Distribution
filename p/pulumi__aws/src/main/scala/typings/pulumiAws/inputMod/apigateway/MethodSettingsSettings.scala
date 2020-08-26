package typings.pulumiAws.inputMod.apigateway

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodSettingsSettings extends js.Object {
  /**
    * Specifies whether the cached responses are encrypted.
    */
  var cacheDataEncrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached.
    */
  var cacheTtlInSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached.
    */
  var cachingEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether data trace logging is enabled for this method, which effects the log entries pushed to Amazon CloudWatch Logs.
    */
  var dataTraceEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies the logging level for this method, which effects the log entries pushed to Amazon CloudWatch Logs. The available levels are `OFF`, `ERROR`, and `INFO`.
    */
  var loggingLevel: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether Amazon CloudWatch metrics are enabled for this method.
    */
  var metricsEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether authorization is required for a cache invalidation request.
    */
  var requireAuthorizationForCacheControl: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies the throttling burst limit.
    */
  var throttlingBurstLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies the throttling rate limit.
    */
  var throttlingRateLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies how to handle unauthorized requests for cache invalidation. The available values are `FAIL_WITH_403`, `SUCCEED_WITH_RESPONSE_HEADER`, `SUCCEED_WITHOUT_RESPONSE_HEADER`.
    */
  var unauthorizedCacheControlHeaderStrategy: js.UndefOr[Input[String]] = js.native
}

object MethodSettingsSettings {
  @scala.inline
  def apply(): MethodSettingsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodSettingsSettings]
  }
  @scala.inline
  implicit class MethodSettingsSettingsOps[Self <: MethodSettingsSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCacheDataEncrypted(value: Input[Boolean]): Self = this.set("cacheDataEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheDataEncrypted: Self = this.set("cacheDataEncrypted", js.undefined)
    @scala.inline
    def setCacheTtlInSeconds(value: Input[Double]): Self = this.set("cacheTtlInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheTtlInSeconds: Self = this.set("cacheTtlInSeconds", js.undefined)
    @scala.inline
    def setCachingEnabled(value: Input[Boolean]): Self = this.set("cachingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachingEnabled: Self = this.set("cachingEnabled", js.undefined)
    @scala.inline
    def setDataTraceEnabled(value: Input[Boolean]): Self = this.set("dataTraceEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTraceEnabled: Self = this.set("dataTraceEnabled", js.undefined)
    @scala.inline
    def setLoggingLevel(value: Input[String]): Self = this.set("loggingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingLevel: Self = this.set("loggingLevel", js.undefined)
    @scala.inline
    def setMetricsEnabled(value: Input[Boolean]): Self = this.set("metricsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricsEnabled: Self = this.set("metricsEnabled", js.undefined)
    @scala.inline
    def setRequireAuthorizationForCacheControl(value: Input[Boolean]): Self = this.set("requireAuthorizationForCacheControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireAuthorizationForCacheControl: Self = this.set("requireAuthorizationForCacheControl", js.undefined)
    @scala.inline
    def setThrottlingBurstLimit(value: Input[Double]): Self = this.set("throttlingBurstLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottlingBurstLimit: Self = this.set("throttlingBurstLimit", js.undefined)
    @scala.inline
    def setThrottlingRateLimit(value: Input[Double]): Self = this.set("throttlingRateLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottlingRateLimit: Self = this.set("throttlingRateLimit", js.undefined)
    @scala.inline
    def setUnauthorizedCacheControlHeaderStrategy(value: Input[String]): Self = this.set("unauthorizedCacheControlHeaderStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnauthorizedCacheControlHeaderStrategy: Self = this.set("unauthorizedCacheControlHeaderStrategy", js.undefined)
  }
  
}

