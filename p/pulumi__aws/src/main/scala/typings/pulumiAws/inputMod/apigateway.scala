package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apigateway {
  
  @js.native
  trait AccountThrottleSettings extends StObject {
    
    /**
      * The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
      */
    var burstLimit: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The number of times API Gateway allows the API to be called per second on average (RPS).
      */
    var rateLimit: js.UndefOr[Input[Double]] = js.native
  }
  object AccountThrottleSettings {
    
    @scala.inline
    def apply(): AccountThrottleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountThrottleSettings]
    }
    
    @scala.inline
    implicit class AccountThrottleSettingsMutableBuilder[Self <: AccountThrottleSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBurstLimit(value: Input[Double]): Self = StObject.set(x, "burstLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBurstLimitUndefined: Self = StObject.set(x, "burstLimit", js.undefined)
      
      @scala.inline
      def setRateLimit(value: Input[Double]): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
    }
  }
  
  @js.native
  trait DocumentationPartLocation extends StObject {
    
    /**
      * The HTTP verb of a method. The default value is `*` for any method.
      */
    var method: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the targeted API entity.
      */
    var name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The URL path of the target. The default value is `/` for the root resource.
      */
    var path: js.UndefOr[Input[String]] = js.native
    
    /**
      * The HTTP status code of a response. The default value is `*` for any status code.
      */
    var statusCode: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of API entity to which the documentation content applies. e.g. `API`, `METHOD` or `REQUEST_BODY`
      */
    var `type`: Input[String] = js.native
  }
  object DocumentationPartLocation {
    
    @scala.inline
    def apply(`type`: Input[String]): DocumentationPartLocation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentationPartLocation]
    }
    
    @scala.inline
    implicit class DocumentationPartLocationMutableBuilder[Self <: DocumentationPartLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: Input[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DomainNameEndpointConfiguration extends StObject {
    
    /**
      * A list of endpoint types. This resource currently only supports managing a single value. Valid values: `EDGE` or `REGIONAL`. If unspecified, defaults to `EDGE`. Must be declared as `REGIONAL` in non-Commercial partitions. Refer to the [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/create-regional-api.html) for more information on the difference between edge-optimized and regional APIs.
      */
    var types: Input[String] = js.native
  }
  object DomainNameEndpointConfiguration {
    
    @scala.inline
    def apply(types: Input[String]): DomainNameEndpointConfiguration = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainNameEndpointConfiguration]
    }
    
    @scala.inline
    implicit class DomainNameEndpointConfigurationMutableBuilder[Self <: DomainNameEndpointConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTypes(value: Input[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MethodSettingsSettings extends StObject {
    
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
      * Specifies the throttling burst limit. Default: `-1` (throttling disabled).
      */
    var throttlingBurstLimit: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Specifies the throttling rate limit. Default: `-1` (throttling disabled).
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
    implicit class MethodSettingsSettingsMutableBuilder[Self <: MethodSettingsSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheDataEncrypted(value: Input[Boolean]): Self = StObject.set(x, "cacheDataEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDataEncryptedUndefined: Self = StObject.set(x, "cacheDataEncrypted", js.undefined)
      
      @scala.inline
      def setCacheTtlInSeconds(value: Input[Double]): Self = StObject.set(x, "cacheTtlInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheTtlInSecondsUndefined: Self = StObject.set(x, "cacheTtlInSeconds", js.undefined)
      
      @scala.inline
      def setCachingEnabled(value: Input[Boolean]): Self = StObject.set(x, "cachingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachingEnabledUndefined: Self = StObject.set(x, "cachingEnabled", js.undefined)
      
      @scala.inline
      def setDataTraceEnabled(value: Input[Boolean]): Self = StObject.set(x, "dataTraceEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTraceEnabledUndefined: Self = StObject.set(x, "dataTraceEnabled", js.undefined)
      
      @scala.inline
      def setLoggingLevel(value: Input[String]): Self = StObject.set(x, "loggingLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingLevelUndefined: Self = StObject.set(x, "loggingLevel", js.undefined)
      
      @scala.inline
      def setMetricsEnabled(value: Input[Boolean]): Self = StObject.set(x, "metricsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsEnabledUndefined: Self = StObject.set(x, "metricsEnabled", js.undefined)
      
      @scala.inline
      def setRequireAuthorizationForCacheControl(value: Input[Boolean]): Self = StObject.set(x, "requireAuthorizationForCacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireAuthorizationForCacheControlUndefined: Self = StObject.set(x, "requireAuthorizationForCacheControl", js.undefined)
      
      @scala.inline
      def setThrottlingBurstLimit(value: Input[Double]): Self = StObject.set(x, "throttlingBurstLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottlingBurstLimitUndefined: Self = StObject.set(x, "throttlingBurstLimit", js.undefined)
      
      @scala.inline
      def setThrottlingRateLimit(value: Input[Double]): Self = StObject.set(x, "throttlingRateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottlingRateLimitUndefined: Self = StObject.set(x, "throttlingRateLimit", js.undefined)
      
      @scala.inline
      def setUnauthorizedCacheControlHeaderStrategy(value: Input[String]): Self = StObject.set(x, "unauthorizedCacheControlHeaderStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnauthorizedCacheControlHeaderStrategyUndefined: Self = StObject.set(x, "unauthorizedCacheControlHeaderStrategy", js.undefined)
    }
  }
  
  @js.native
  trait RestApiEndpointConfiguration extends StObject {
    
    /**
      * A list of endpoint types. This resource currently only supports managing a single value. Valid values: `EDGE`, `REGIONAL` or `PRIVATE`. If unspecified, defaults to `EDGE`. Must be declared as `REGIONAL` in non-Commercial partitions. Refer to the [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/create-regional-api.html) for more information on the difference between edge-optimized and regional APIs.
      */
    var types: Input[String] = js.native
    
    /**
      * A list of VPC Endpoint Ids. It is only supported for PRIVATE endpoint type.
      */
    var vpcEndpointIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object RestApiEndpointConfiguration {
    
    @scala.inline
    def apply(types: Input[String]): RestApiEndpointConfiguration = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestApiEndpointConfiguration]
    }
    
    @scala.inline
    implicit class RestApiEndpointConfigurationMutableBuilder[Self <: RestApiEndpointConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTypes(value: Input[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcEndpointIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointIdsUndefined: Self = StObject.set(x, "vpcEndpointIds", js.undefined)
      
      @scala.inline
      def setVpcEndpointIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcEndpointIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StageAccessLogSettings extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with `amazon-apigateway-`. Automatically removes trailing `:*` if present.
      */
    var destinationArn: Input[String] = js.native
    
    /**
      * The formatting and values recorded in the logs.
      * For more information on configuring the log format rules visit the AWS [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html)
      */
    var format: Input[String] = js.native
  }
  object StageAccessLogSettings {
    
    @scala.inline
    def apply(destinationArn: Input[String], format: Input[String]): StageAccessLogSettings = {
      val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[StageAccessLogSettings]
    }
    
    @scala.inline
    implicit class StageAccessLogSettingsMutableBuilder[Self <: StageAccessLogSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationArn(value: Input[String]): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: Input[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UsagePlanApiStage extends StObject {
    
    /**
      * API Id of the associated API stage in a usage plan.
      */
    var apiId: Input[String] = js.native
    
    /**
      * API stage name of the associated API stage in a usage plan.
      */
    var stage: Input[String] = js.native
  }
  object UsagePlanApiStage {
    
    @scala.inline
    def apply(apiId: Input[String], stage: Input[String]): UsagePlanApiStage = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsagePlanApiStage]
    }
    
    @scala.inline
    implicit class UsagePlanApiStageMutableBuilder[Self <: UsagePlanApiStage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStage(value: Input[String]): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UsagePlanQuotaSettings extends StObject {
    
    /**
      * The maximum number of requests that can be made in a given time period.
      */
    var limit: Input[Double] = js.native
    
    /**
      * The number of requests subtracted from the given limit in the initial time period.
      */
    var offset: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
      */
    var period: Input[String] = js.native
  }
  object UsagePlanQuotaSettings {
    
    @scala.inline
    def apply(limit: Input[Double], period: Input[String]): UsagePlanQuotaSettings = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsagePlanQuotaSettings]
    }
    
    @scala.inline
    implicit class UsagePlanQuotaSettingsMutableBuilder[Self <: UsagePlanQuotaSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Input[Double]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Input[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPeriod(value: Input[String]): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UsagePlanThrottleSettings extends StObject {
    
    /**
      * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
      */
    var burstLimit: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The API request steady-state rate limit.
      */
    var rateLimit: js.UndefOr[Input[Double]] = js.native
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
      def setBurstLimit(value: Input[Double]): Self = StObject.set(x, "burstLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBurstLimitUndefined: Self = StObject.set(x, "burstLimit", js.undefined)
      
      @scala.inline
      def setRateLimit(value: Input[Double]): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
    }
  }
}
