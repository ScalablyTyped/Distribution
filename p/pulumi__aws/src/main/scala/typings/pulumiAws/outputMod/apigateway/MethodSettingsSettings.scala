package typings.pulumiAws.outputMod.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodSettingsSettings extends js.Object {
  
  /**
    * Specifies whether the cached responses are encrypted.
    */
  var cacheDataEncrypted: Boolean = js.native
  
  /**
    * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached.
    */
  var cacheTtlInSeconds: Double = js.native
  
  /**
    * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached.
    */
  var cachingEnabled: Boolean = js.native
  
  /**
    * Specifies whether data trace logging is enabled for this method, which effects the log entries pushed to Amazon CloudWatch Logs.
    */
  var dataTraceEnabled: Boolean = js.native
  
  /**
    * Specifies the logging level for this method, which effects the log entries pushed to Amazon CloudWatch Logs. The available levels are `OFF`, `ERROR`, and `INFO`.
    */
  var loggingLevel: String = js.native
  
  /**
    * Specifies whether Amazon CloudWatch metrics are enabled for this method.
    */
  var metricsEnabled: Boolean = js.native
  
  /**
    * Specifies whether authorization is required for a cache invalidation request.
    */
  var requireAuthorizationForCacheControl: Boolean = js.native
  
  /**
    * Specifies the throttling burst limit. Default: `-1` (throttling disabled).
    */
  var throttlingBurstLimit: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the throttling rate limit. Default: `-1` (throttling disabled).
    */
  var throttlingRateLimit: js.UndefOr[Double] = js.native
  
  /**
    * Specifies how to handle unauthorized requests for cache invalidation. The available values are `FAIL_WITH_403`, `SUCCEED_WITH_RESPONSE_HEADER`, `SUCCEED_WITHOUT_RESPONSE_HEADER`.
    */
  var unauthorizedCacheControlHeaderStrategy: String = js.native
}
object MethodSettingsSettings {
  
  @scala.inline
  def apply(
    cacheDataEncrypted: Boolean,
    cacheTtlInSeconds: Double,
    cachingEnabled: Boolean,
    dataTraceEnabled: Boolean,
    loggingLevel: String,
    metricsEnabled: Boolean,
    requireAuthorizationForCacheControl: Boolean,
    unauthorizedCacheControlHeaderStrategy: String
  ): MethodSettingsSettings = {
    val __obj = js.Dynamic.literal(cacheDataEncrypted = cacheDataEncrypted.asInstanceOf[js.Any], cacheTtlInSeconds = cacheTtlInSeconds.asInstanceOf[js.Any], cachingEnabled = cachingEnabled.asInstanceOf[js.Any], dataTraceEnabled = dataTraceEnabled.asInstanceOf[js.Any], loggingLevel = loggingLevel.asInstanceOf[js.Any], metricsEnabled = metricsEnabled.asInstanceOf[js.Any], requireAuthorizationForCacheControl = requireAuthorizationForCacheControl.asInstanceOf[js.Any], unauthorizedCacheControlHeaderStrategy = unauthorizedCacheControlHeaderStrategy.asInstanceOf[js.Any])
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
    def setCacheDataEncrypted(value: Boolean): Self = this.set("cacheDataEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheTtlInSeconds(value: Double): Self = this.set("cacheTtlInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachingEnabled(value: Boolean): Self = this.set("cachingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTraceEnabled(value: Boolean): Self = this.set("dataTraceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingLevel(value: String): Self = this.set("loggingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsEnabled(value: Boolean): Self = this.set("metricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireAuthorizationForCacheControl(value: Boolean): Self = this.set("requireAuthorizationForCacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnauthorizedCacheControlHeaderStrategy(value: String): Self = this.set("unauthorizedCacheControlHeaderStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottlingBurstLimit(value: Double): Self = this.set("throttlingBurstLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottlingBurstLimit: Self = this.set("throttlingBurstLimit", js.undefined)
    
    @scala.inline
    def setThrottlingRateLimit(value: Double): Self = this.set("throttlingRateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottlingRateLimit: Self = this.set("throttlingRateLimit", js.undefined)
  }
}
