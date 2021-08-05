package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apigateway {
  
  trait AccountThrottleSettings extends StObject {
    
    /**
      * The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
      */
    var burstLimit: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The number of times API Gateway allows the API to be called per second on average (RPS).
      */
    var rateLimit: js.UndefOr[Input[Double]] = js.undefined
  }
  object AccountThrottleSettings {
    
    inline def apply(): AccountThrottleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountThrottleSettings]
    }
    
    extension [Self <: AccountThrottleSettings](x: Self) {
      
      inline def setBurstLimit(value: Input[Double]): Self = StObject.set(x, "burstLimit", value.asInstanceOf[js.Any])
      
      inline def setBurstLimitUndefined: Self = StObject.set(x, "burstLimit", js.undefined)
      
      inline def setRateLimit(value: Input[Double]): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
    }
  }
  
  trait DocumentationPartLocation extends StObject {
    
    /**
      * The HTTP verb of a method. The default value is `*` for any method.
      */
    var method: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the targeted API entity.
      */
    var name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The URL path of the target. The default value is `/` for the root resource.
      */
    var path: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The HTTP status code of a response. The default value is `*` for any status code.
      */
    var statusCode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of API entity to which the documentation content applies. e.g. `API`, `METHOD` or `REQUEST_BODY`
      */
    var `type`: Input[String]
  }
  object DocumentationPartLocation {
    
    inline def apply(`type`: Input[String]): DocumentationPartLocation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentationPartLocation]
    }
    
    extension [Self <: DocumentationPartLocation](x: Self) {
      
      inline def setMethod(value: Input[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainNameEndpointConfiguration extends StObject {
    
    /**
      * A list of endpoint types. This resource currently only supports managing a single value. Valid values: `EDGE` or `REGIONAL`. If unspecified, defaults to `EDGE`. Must be declared as `REGIONAL` in non-Commercial partitions. Refer to the [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/create-regional-api.html) for more information on the difference between edge-optimized and regional APIs.
      */
    var types: Input[String]
  }
  object DomainNameEndpointConfiguration {
    
    inline def apply(types: Input[String]): DomainNameEndpointConfiguration = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainNameEndpointConfiguration]
    }
    
    extension [Self <: DomainNameEndpointConfiguration](x: Self) {
      
      inline def setTypes(value: Input[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait MethodSettingsSettings extends StObject {
    
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
      * Specifies the throttling burst limit. Default: `-1` (throttling disabled).
      */
    var throttlingBurstLimit: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Specifies the throttling rate limit. Default: `-1` (throttling disabled).
      */
    var throttlingRateLimit: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Specifies how to handle unauthorized requests for cache invalidation. The available values are `FAIL_WITH_403`, `SUCCEED_WITH_RESPONSE_HEADER`, `SUCCEED_WITHOUT_RESPONSE_HEADER`.
      */
    var unauthorizedCacheControlHeaderStrategy: js.UndefOr[Input[String]] = js.undefined
  }
  object MethodSettingsSettings {
    
    inline def apply(): MethodSettingsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MethodSettingsSettings]
    }
    
    extension [Self <: MethodSettingsSettings](x: Self) {
      
      inline def setCacheDataEncrypted(value: Input[Boolean]): Self = StObject.set(x, "cacheDataEncrypted", value.asInstanceOf[js.Any])
      
      inline def setCacheDataEncryptedUndefined: Self = StObject.set(x, "cacheDataEncrypted", js.undefined)
      
      inline def setCacheTtlInSeconds(value: Input[Double]): Self = StObject.set(x, "cacheTtlInSeconds", value.asInstanceOf[js.Any])
      
      inline def setCacheTtlInSecondsUndefined: Self = StObject.set(x, "cacheTtlInSeconds", js.undefined)
      
      inline def setCachingEnabled(value: Input[Boolean]): Self = StObject.set(x, "cachingEnabled", value.asInstanceOf[js.Any])
      
      inline def setCachingEnabledUndefined: Self = StObject.set(x, "cachingEnabled", js.undefined)
      
      inline def setDataTraceEnabled(value: Input[Boolean]): Self = StObject.set(x, "dataTraceEnabled", value.asInstanceOf[js.Any])
      
      inline def setDataTraceEnabledUndefined: Self = StObject.set(x, "dataTraceEnabled", js.undefined)
      
      inline def setLoggingLevel(value: Input[String]): Self = StObject.set(x, "loggingLevel", value.asInstanceOf[js.Any])
      
      inline def setLoggingLevelUndefined: Self = StObject.set(x, "loggingLevel", js.undefined)
      
      inline def setMetricsEnabled(value: Input[Boolean]): Self = StObject.set(x, "metricsEnabled", value.asInstanceOf[js.Any])
      
      inline def setMetricsEnabledUndefined: Self = StObject.set(x, "metricsEnabled", js.undefined)
      
      inline def setRequireAuthorizationForCacheControl(value: Input[Boolean]): Self = StObject.set(x, "requireAuthorizationForCacheControl", value.asInstanceOf[js.Any])
      
      inline def setRequireAuthorizationForCacheControlUndefined: Self = StObject.set(x, "requireAuthorizationForCacheControl", js.undefined)
      
      inline def setThrottlingBurstLimit(value: Input[Double]): Self = StObject.set(x, "throttlingBurstLimit", value.asInstanceOf[js.Any])
      
      inline def setThrottlingBurstLimitUndefined: Self = StObject.set(x, "throttlingBurstLimit", js.undefined)
      
      inline def setThrottlingRateLimit(value: Input[Double]): Self = StObject.set(x, "throttlingRateLimit", value.asInstanceOf[js.Any])
      
      inline def setThrottlingRateLimitUndefined: Self = StObject.set(x, "throttlingRateLimit", js.undefined)
      
      inline def setUnauthorizedCacheControlHeaderStrategy(value: Input[String]): Self = StObject.set(x, "unauthorizedCacheControlHeaderStrategy", value.asInstanceOf[js.Any])
      
      inline def setUnauthorizedCacheControlHeaderStrategyUndefined: Self = StObject.set(x, "unauthorizedCacheControlHeaderStrategy", js.undefined)
    }
  }
  
  trait RestApiEndpointConfiguration extends StObject {
    
    /**
      * A list of endpoint types. This resource currently only supports managing a single value. Valid values: `EDGE`, `REGIONAL` or `PRIVATE`. If unspecified, defaults to `EDGE`. Must be declared as `REGIONAL` in non-Commercial partitions. Refer to the [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/create-regional-api.html) for more information on the difference between edge-optimized and regional APIs.
      */
    var types: Input[String]
    
    /**
      * A list of VPC Endpoint Ids. It is only supported for PRIVATE endpoint type.
      */
    var vpcEndpointIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object RestApiEndpointConfiguration {
    
    inline def apply(types: Input[String]): RestApiEndpointConfiguration = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestApiEndpointConfiguration]
    }
    
    extension [Self <: RestApiEndpointConfiguration](x: Self) {
      
      inline def setTypes(value: Input[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setVpcEndpointIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcEndpointIds", value.asInstanceOf[js.Any])
      
      inline def setVpcEndpointIdsUndefined: Self = StObject.set(x, "vpcEndpointIds", js.undefined)
      
      inline def setVpcEndpointIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcEndpointIds", js.Array(value :_*))
    }
  }
  
  trait StageAccessLogSettings extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with `amazon-apigateway-`. Automatically removes trailing `:*` if present.
      */
    var destinationArn: Input[String]
    
    /**
      * The formatting and values recorded in the logs.
      * For more information on configuring the log format rules visit the AWS [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html)
      */
    var format: Input[String]
  }
  object StageAccessLogSettings {
    
    inline def apply(destinationArn: Input[String], format: Input[String]): StageAccessLogSettings = {
      val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[StageAccessLogSettings]
    }
    
    extension [Self <: StageAccessLogSettings](x: Self) {
      
      inline def setDestinationArn(value: Input[String]): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Input[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsagePlanApiStage extends StObject {
    
    /**
      * API Id of the associated API stage in a usage plan.
      */
    var apiId: Input[String]
    
    /**
      * API stage name of the associated API stage in a usage plan.
      */
    var stage: Input[String]
  }
  object UsagePlanApiStage {
    
    inline def apply(apiId: Input[String], stage: Input[String]): UsagePlanApiStage = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsagePlanApiStage]
    }
    
    extension [Self <: UsagePlanApiStage](x: Self) {
      
      inline def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setStage(value: Input[String]): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsagePlanQuotaSettings extends StObject {
    
    /**
      * The maximum number of requests that can be made in a given time period.
      */
    var limit: Input[Double]
    
    /**
      * The number of requests subtracted from the given limit in the initial time period.
      */
    var offset: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
      */
    var period: Input[String]
  }
  object UsagePlanQuotaSettings {
    
    inline def apply(limit: Input[Double], period: Input[String]): UsagePlanQuotaSettings = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsagePlanQuotaSettings]
    }
    
    extension [Self <: UsagePlanQuotaSettings](x: Self) {
      
      inline def setLimit(value: Input[Double]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Input[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPeriod(value: Input[String]): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsagePlanThrottleSettings extends StObject {
    
    /**
      * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
      */
    var burstLimit: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The API request steady-state rate limit.
      */
    var rateLimit: js.UndefOr[Input[Double]] = js.undefined
  }
  object UsagePlanThrottleSettings {
    
    inline def apply(): UsagePlanThrottleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsagePlanThrottleSettings]
    }
    
    extension [Self <: UsagePlanThrottleSettings](x: Self) {
      
      inline def setBurstLimit(value: Input[Double]): Self = StObject.set(x, "burstLimit", value.asInstanceOf[js.Any])
      
      inline def setBurstLimitUndefined: Self = StObject.set(x, "burstLimit", js.undefined)
      
      inline def setRateLimit(value: Input[Double]): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
    }
  }
}
