package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apigatewayv2 {
  
  trait ApiCorsConfiguration extends StObject {
    
    /**
      * Whether credentials are included in the CORS request.
      */
    var allowCredentials: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The set of allowed HTTP headers.
      */
    var allowHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The set of allowed HTTP methods.
      */
    var allowMethods: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The set of allowed origins.
      */
    var allowOrigins: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The set of exposed HTTP headers.
      */
    var exposeHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The number of seconds that the browser should cache preflight request results.
      */
    var maxAge: js.UndefOr[Input[Double]] = js.undefined
  }
  object ApiCorsConfiguration {
    
    inline def apply(): ApiCorsConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiCorsConfiguration]
    }
    
    extension [Self <: ApiCorsConfiguration](x: Self) {
      
      inline def setAllowCredentials(value: Input[Boolean]): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
      
      inline def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
      
      inline def setAllowHeaders(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowHeaders", value.asInstanceOf[js.Any])
      
      inline def setAllowHeadersUndefined: Self = StObject.set(x, "allowHeaders", js.undefined)
      
      inline def setAllowHeadersVarargs(value: Input[String]*): Self = StObject.set(x, "allowHeaders", js.Array(value :_*))
      
      inline def setAllowMethods(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowMethods", value.asInstanceOf[js.Any])
      
      inline def setAllowMethodsUndefined: Self = StObject.set(x, "allowMethods", js.undefined)
      
      inline def setAllowMethodsVarargs(value: Input[String]*): Self = StObject.set(x, "allowMethods", js.Array(value :_*))
      
      inline def setAllowOrigins(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowOrigins", value.asInstanceOf[js.Any])
      
      inline def setAllowOriginsUndefined: Self = StObject.set(x, "allowOrigins", js.undefined)
      
      inline def setAllowOriginsVarargs(value: Input[String]*): Self = StObject.set(x, "allowOrigins", js.Array(value :_*))
      
      inline def setExposeHeaders(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
      
      inline def setExposeHeadersUndefined: Self = StObject.set(x, "exposeHeaders", js.undefined)
      
      inline def setExposeHeadersVarargs(value: Input[String]*): Self = StObject.set(x, "exposeHeaders", js.Array(value :_*))
      
      inline def setMaxAge(value: Input[Double]): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
  
  trait AuthorizerJwtConfiguration extends StObject {
    
    /**
      * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in this list.
      */
    var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The base domain of the identity provider that issues JSON Web Tokens, such as the `endpoint` attribute of the `aws.cognito.UserPool` resource.
      */
    var issuer: js.UndefOr[Input[String]] = js.undefined
  }
  object AuthorizerJwtConfiguration {
    
    inline def apply(): AuthorizerJwtConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizerJwtConfiguration]
    }
    
    extension [Self <: AuthorizerJwtConfiguration](x: Self) {
      
      inline def setAudiences(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
      
      inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
      
      inline def setAudiencesVarargs(value: Input[String]*): Self = StObject.set(x, "audiences", js.Array(value :_*))
      
      inline def setIssuer(value: Input[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    }
  }
  
  trait DomainNameDomainNameConfiguration extends StObject {
    
    /**
      * The ARN of an AWS-managed certificate that will be used by the endpoint for the domain name. AWS Certificate Manager is the only supported source.
      * Use the `aws.acm.Certificate` resource to configure an ACM certificate.
      */
    var certificateArn: Input[String]
    
    /**
      * The endpoint type. Valid values: `REGIONAL`.
      */
    var endpointType: Input[String]
    
    /**
      * The Amazon Route 53 Hosted Zone ID of the endpoint.
      */
    var hostedZoneId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Transport Layer Security (TLS) version of the [security policy](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-custom-domain-tls-version.html) for the domain name. Valid values: `TLS_1_2`.
      */
    var securityPolicy: Input[String]
    
    /**
      * The target domain name.
      */
    var targetDomainName: js.UndefOr[Input[String]] = js.undefined
  }
  object DomainNameDomainNameConfiguration {
    
    inline def apply(certificateArn: Input[String], endpointType: Input[String], securityPolicy: Input[String]): DomainNameDomainNameConfiguration = {
      val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any], endpointType = endpointType.asInstanceOf[js.Any], securityPolicy = securityPolicy.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainNameDomainNameConfiguration]
    }
    
    extension [Self <: DomainNameDomainNameConfiguration](x: Self) {
      
      inline def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      inline def setEndpointType(value: Input[String]): Self = StObject.set(x, "endpointType", value.asInstanceOf[js.Any])
      
      inline def setHostedZoneId(value: Input[String]): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
      
      inline def setHostedZoneIdUndefined: Self = StObject.set(x, "hostedZoneId", js.undefined)
      
      inline def setSecurityPolicy(value: Input[String]): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
      
      inline def setTargetDomainName(value: Input[String]): Self = StObject.set(x, "targetDomainName", value.asInstanceOf[js.Any])
      
      inline def setTargetDomainNameUndefined: Self = StObject.set(x, "targetDomainName", js.undefined)
    }
  }
  
  trait IntegrationTlsConfig extends StObject {
    
    /**
      * If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate. The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
      */
    var serverNameToVerify: js.UndefOr[Input[String]] = js.undefined
  }
  object IntegrationTlsConfig {
    
    inline def apply(): IntegrationTlsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntegrationTlsConfig]
    }
    
    extension [Self <: IntegrationTlsConfig](x: Self) {
      
      inline def setServerNameToVerify(value: Input[String]): Self = StObject.set(x, "serverNameToVerify", value.asInstanceOf[js.Any])
      
      inline def setServerNameToVerifyUndefined: Self = StObject.set(x, "serverNameToVerify", js.undefined)
    }
  }
  
  trait StageAccessLogSettings extends StObject {
    
    /**
      * The ARN of the CloudWatch Logs log group to receive access logs. Any trailing `:*` is trimmed from the ARN.
      */
    var destinationArn: Input[String]
    
    /**
      * A single line [format](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#apigateway-cloudwatch-log-formats) of the access logs of data, as specified by [selected $context variables](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-logging.html).
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
  
  trait StageDefaultRouteSettings extends StObject {
    
    /**
      * Whether data trace logging is enabled for the default route. Affects the log entries pushed to Amazon CloudWatch Logs.
      * Defaults to `false`. Supported only for WebSocket APIs.
      */
    var dataTraceEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether detailed metrics are enabled for the default route. Defaults to `false`.
      */
    var detailedMetricsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The logging level for the default route. Affects the log entries pushed to Amazon CloudWatch Logs.
      * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
      */
    var loggingLevel: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The throttling burst limit for the default route.
      */
    var throttlingBurstLimit: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The throttling rate limit for the default route.
      */
    var throttlingRateLimit: js.UndefOr[Input[Double]] = js.undefined
  }
  object StageDefaultRouteSettings {
    
    inline def apply(): StageDefaultRouteSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StageDefaultRouteSettings]
    }
    
    extension [Self <: StageDefaultRouteSettings](x: Self) {
      
      inline def setDataTraceEnabled(value: Input[Boolean]): Self = StObject.set(x, "dataTraceEnabled", value.asInstanceOf[js.Any])
      
      inline def setDataTraceEnabledUndefined: Self = StObject.set(x, "dataTraceEnabled", js.undefined)
      
      inline def setDetailedMetricsEnabled(value: Input[Boolean]): Self = StObject.set(x, "detailedMetricsEnabled", value.asInstanceOf[js.Any])
      
      inline def setDetailedMetricsEnabledUndefined: Self = StObject.set(x, "detailedMetricsEnabled", js.undefined)
      
      inline def setLoggingLevel(value: Input[String]): Self = StObject.set(x, "loggingLevel", value.asInstanceOf[js.Any])
      
      inline def setLoggingLevelUndefined: Self = StObject.set(x, "loggingLevel", js.undefined)
      
      inline def setThrottlingBurstLimit(value: Input[Double]): Self = StObject.set(x, "throttlingBurstLimit", value.asInstanceOf[js.Any])
      
      inline def setThrottlingBurstLimitUndefined: Self = StObject.set(x, "throttlingBurstLimit", js.undefined)
      
      inline def setThrottlingRateLimit(value: Input[Double]): Self = StObject.set(x, "throttlingRateLimit", value.asInstanceOf[js.Any])
      
      inline def setThrottlingRateLimitUndefined: Self = StObject.set(x, "throttlingRateLimit", js.undefined)
    }
  }
  
  trait StageRouteSetting extends StObject {
    
    /**
      * Whether data trace logging is enabled for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
      * Defaults to `false`. Supported only for WebSocket APIs.
      */
    var dataTraceEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether detailed metrics are enabled for the route. Defaults to `false`.
      */
    var detailedMetricsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The logging level for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
      * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
      */
    var loggingLevel: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Route key.
      */
    var routeKey: Input[String]
    
    /**
      * The throttling burst limit for the route.
      */
    var throttlingBurstLimit: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The throttling rate limit for the route.
      */
    var throttlingRateLimit: js.UndefOr[Input[Double]] = js.undefined
  }
  object StageRouteSetting {
    
    inline def apply(routeKey: Input[String]): StageRouteSetting = {
      val __obj = js.Dynamic.literal(routeKey = routeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[StageRouteSetting]
    }
    
    extension [Self <: StageRouteSetting](x: Self) {
      
      inline def setDataTraceEnabled(value: Input[Boolean]): Self = StObject.set(x, "dataTraceEnabled", value.asInstanceOf[js.Any])
      
      inline def setDataTraceEnabledUndefined: Self = StObject.set(x, "dataTraceEnabled", js.undefined)
      
      inline def setDetailedMetricsEnabled(value: Input[Boolean]): Self = StObject.set(x, "detailedMetricsEnabled", value.asInstanceOf[js.Any])
      
      inline def setDetailedMetricsEnabledUndefined: Self = StObject.set(x, "detailedMetricsEnabled", js.undefined)
      
      inline def setLoggingLevel(value: Input[String]): Self = StObject.set(x, "loggingLevel", value.asInstanceOf[js.Any])
      
      inline def setLoggingLevelUndefined: Self = StObject.set(x, "loggingLevel", js.undefined)
      
      inline def setRouteKey(value: Input[String]): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
      
      inline def setThrottlingBurstLimit(value: Input[Double]): Self = StObject.set(x, "throttlingBurstLimit", value.asInstanceOf[js.Any])
      
      inline def setThrottlingBurstLimitUndefined: Self = StObject.set(x, "throttlingBurstLimit", js.undefined)
      
      inline def setThrottlingRateLimit(value: Input[Double]): Self = StObject.set(x, "throttlingRateLimit", value.asInstanceOf[js.Any])
      
      inline def setThrottlingRateLimitUndefined: Self = StObject.set(x, "throttlingRateLimit", js.undefined)
    }
  }
}
