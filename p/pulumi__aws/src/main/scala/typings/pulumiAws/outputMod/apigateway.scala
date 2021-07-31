package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apigateway {
  
  trait AccountThrottleSettings extends StObject {
    
    /**
      * The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
      */
    var burstLimit: Double
    
    /**
      * The number of times API Gateway allows the API to be called per second on average (RPS).
      */
    var rateLimit: Double
  }
  object AccountThrottleSettings {
    
    @scala.inline
    def apply(burstLimit: Double, rateLimit: Double): AccountThrottleSettings = {
      val __obj = js.Dynamic.literal(burstLimit = burstLimit.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountThrottleSettings]
    }
    
    @scala.inline
    implicit class AccountThrottleSettingsMutableBuilder[Self <: AccountThrottleSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBurstLimit(value: Double): Self = StObject.set(x, "burstLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateLimit(value: Double): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocumentationPartLocation extends StObject {
    
    /**
      * The HTTP verb of a method. The default value is `*` for any method.
      */
    var method: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the targeted API entity.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The URL path of the target. The default value is `/` for the root resource.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The HTTP status code of a response. The default value is `*` for any status code.
      */
    var statusCode: js.UndefOr[String] = js.undefined
    
    /**
      * The type of API entity to which the documentation content applies. e.g. `API`, `METHOD` or `REQUEST_BODY`
      */
    var `type`: String
  }
  object DocumentationPartLocation {
    
    @scala.inline
    def apply(`type`: String): DocumentationPartLocation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentationPartLocation]
    }
    
    @scala.inline
    implicit class DocumentationPartLocationMutableBuilder[Self <: DocumentationPartLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainNameEndpointConfiguration extends StObject {
    
    /**
      * A list of endpoint types. This resource currently only supports managing a single value. Valid values: `EDGE` or `REGIONAL`. If unspecified, defaults to `EDGE`. Must be declared as `REGIONAL` in non-Commercial partitions. Refer to the [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/create-regional-api.html) for more information on the difference between edge-optimized and regional APIs.
      */
    var types: String
  }
  object DomainNameEndpointConfiguration {
    
    @scala.inline
    def apply(types: String): DomainNameEndpointConfiguration = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainNameEndpointConfiguration]
    }
    
    @scala.inline
    implicit class DomainNameEndpointConfigurationMutableBuilder[Self <: DomainNameEndpointConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRestApiEndpointConfiguration extends StObject {
    
    var types: js.Array[String]
    
    var vpcEndpointIds: js.Array[String]
  }
  object GetRestApiEndpointConfiguration {
    
    @scala.inline
    def apply(types: js.Array[String], vpcEndpointIds: js.Array[String]): GetRestApiEndpointConfiguration = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], vpcEndpointIds = vpcEndpointIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRestApiEndpointConfiguration]
    }
    
    @scala.inline
    implicit class GetRestApiEndpointConfigurationMutableBuilder[Self <: GetRestApiEndpointConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
      
      @scala.inline
      def setVpcEndpointIds(value: js.Array[String]): Self = StObject.set(x, "vpcEndpointIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointIdsVarargs(value: String*): Self = StObject.set(x, "vpcEndpointIds", js.Array(value :_*))
    }
  }
  
  trait MethodSettingsSettings extends StObject {
    
    /**
      * Specifies whether the cached responses are encrypted.
      */
    var cacheDataEncrypted: Boolean
    
    /**
      * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached.
      */
    var cacheTtlInSeconds: Double
    
    /**
      * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached.
      */
    var cachingEnabled: Boolean
    
    /**
      * Specifies whether data trace logging is enabled for this method, which effects the log entries pushed to Amazon CloudWatch Logs.
      */
    var dataTraceEnabled: Boolean
    
    /**
      * Specifies the logging level for this method, which effects the log entries pushed to Amazon CloudWatch Logs. The available levels are `OFF`, `ERROR`, and `INFO`.
      */
    var loggingLevel: String
    
    /**
      * Specifies whether Amazon CloudWatch metrics are enabled for this method.
      */
    var metricsEnabled: Boolean
    
    /**
      * Specifies whether authorization is required for a cache invalidation request.
      */
    var requireAuthorizationForCacheControl: Boolean
    
    /**
      * Specifies the throttling burst limit. Default: `-1` (throttling disabled).
      */
    var throttlingBurstLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the throttling rate limit. Default: `-1` (throttling disabled).
      */
    var throttlingRateLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies how to handle unauthorized requests for cache invalidation. The available values are `FAIL_WITH_403`, `SUCCEED_WITH_RESPONSE_HEADER`, `SUCCEED_WITHOUT_RESPONSE_HEADER`.
      */
    var unauthorizedCacheControlHeaderStrategy: String
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
    implicit class MethodSettingsSettingsMutableBuilder[Self <: MethodSettingsSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheDataEncrypted(value: Boolean): Self = StObject.set(x, "cacheDataEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheTtlInSeconds(value: Double): Self = StObject.set(x, "cacheTtlInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachingEnabled(value: Boolean): Self = StObject.set(x, "cachingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTraceEnabled(value: Boolean): Self = StObject.set(x, "dataTraceEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingLevel(value: String): Self = StObject.set(x, "loggingLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsEnabled(value: Boolean): Self = StObject.set(x, "metricsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireAuthorizationForCacheControl(value: Boolean): Self = StObject.set(x, "requireAuthorizationForCacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottlingBurstLimit(value: Double): Self = StObject.set(x, "throttlingBurstLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottlingBurstLimitUndefined: Self = StObject.set(x, "throttlingBurstLimit", js.undefined)
      
      @scala.inline
      def setThrottlingRateLimit(value: Double): Self = StObject.set(x, "throttlingRateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottlingRateLimitUndefined: Self = StObject.set(x, "throttlingRateLimit", js.undefined)
      
      @scala.inline
      def setUnauthorizedCacheControlHeaderStrategy(value: String): Self = StObject.set(x, "unauthorizedCacheControlHeaderStrategy", value.asInstanceOf[js.Any])
    }
  }
  
  trait RestApiEndpointConfiguration extends StObject {
    
    /**
      * A list of endpoint types. This resource currently only supports managing a single value. Valid values: `EDGE`, `REGIONAL` or `PRIVATE`. If unspecified, defaults to `EDGE`. Must be declared as `REGIONAL` in non-Commercial partitions. Refer to the [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/create-regional-api.html) for more information on the difference between edge-optimized and regional APIs.
      */
    var types: String
    
    /**
      * A list of VPC Endpoint Ids. It is only supported for PRIVATE endpoint type.
      */
    var vpcEndpointIds: js.UndefOr[js.Array[String]] = js.undefined
  }
  object RestApiEndpointConfiguration {
    
    @scala.inline
    def apply(types: String): RestApiEndpointConfiguration = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestApiEndpointConfiguration]
    }
    
    @scala.inline
    implicit class RestApiEndpointConfigurationMutableBuilder[Self <: RestApiEndpointConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointIds(value: js.Array[String]): Self = StObject.set(x, "vpcEndpointIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointIdsUndefined: Self = StObject.set(x, "vpcEndpointIds", js.undefined)
      
      @scala.inline
      def setVpcEndpointIdsVarargs(value: String*): Self = StObject.set(x, "vpcEndpointIds", js.Array(value :_*))
    }
  }
  
  trait StageAccessLogSettings extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with `amazon-apigateway-`. Automatically removes trailing `:*` if present.
      */
    var destinationArn: String
    
    /**
      * The formatting and values recorded in the logs.
      * For more information on configuring the log format rules visit the AWS [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html)
      */
    var format: String
  }
  object StageAccessLogSettings {
    
    @scala.inline
    def apply(destinationArn: String, format: String): StageAccessLogSettings = {
      val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[StageAccessLogSettings]
    }
    
    @scala.inline
    implicit class StageAccessLogSettingsMutableBuilder[Self <: StageAccessLogSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationArn(value: String): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsagePlanApiStage extends StObject {
    
    /**
      * API Id of the associated API stage in a usage plan.
      */
    var apiId: String
    
    /**
      * API stage name of the associated API stage in a usage plan.
      */
    var stage: String
  }
  object UsagePlanApiStage {
    
    @scala.inline
    def apply(apiId: String, stage: String): UsagePlanApiStage = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsagePlanApiStage]
    }
    
    @scala.inline
    implicit class UsagePlanApiStageMutableBuilder[Self <: UsagePlanApiStage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsagePlanQuotaSettings extends StObject {
    
    /**
      * The maximum number of requests that can be made in a given time period.
      */
    var limit: Double
    
    /**
      * The number of requests subtracted from the given limit in the initial time period.
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
      */
    var period: String
  }
  object UsagePlanQuotaSettings {
    
    @scala.inline
    def apply(limit: Double, period: String): UsagePlanQuotaSettings = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsagePlanQuotaSettings]
    }
    
    @scala.inline
    implicit class UsagePlanQuotaSettingsMutableBuilder[Self <: UsagePlanQuotaSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsagePlanThrottleSettings extends StObject {
    
    /**
      * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
      */
    var burstLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * The API request steady-state rate limit.
      */
    var rateLimit: js.UndefOr[Double] = js.undefined
  }
  object UsagePlanThrottleSettings {
    
    @scala.inline
    def apply(): UsagePlanThrottleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsagePlanThrottleSettings]
    }
    
    @scala.inline
    implicit class UsagePlanThrottleSettingsMutableBuilder[Self <: UsagePlanThrottleSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBurstLimit(value: Double): Self = StObject.set(x, "burstLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBurstLimitUndefined: Self = StObject.set(x, "burstLimit", js.undefined)
      
      @scala.inline
      def setRateLimit(value: Double): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
    }
  }
}
