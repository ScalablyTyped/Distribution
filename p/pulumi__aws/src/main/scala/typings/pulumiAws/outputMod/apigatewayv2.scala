package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apigatewayv2 {
  
  @js.native
  trait ApiCorsConfiguration extends StObject {
    
    /**
      * Whether credentials are included in the CORS request.
      */
    var allowCredentials: js.UndefOr[Boolean] = js.native
    
    /**
      * The set of allowed HTTP headers.
      */
    var allowHeaders: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The set of allowed HTTP methods.
      */
    var allowMethods: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The set of allowed origins.
      */
    var allowOrigins: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The set of exposed HTTP headers.
      */
    var exposeHeaders: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The number of seconds that the browser should cache preflight request results.
      */
    var maxAge: js.UndefOr[Double] = js.native
  }
  object ApiCorsConfiguration {
    
    @scala.inline
    def apply(): ApiCorsConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiCorsConfiguration]
    }
    
    @scala.inline
    implicit class ApiCorsConfigurationMutableBuilder[Self <: ApiCorsConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowCredentials(value: Boolean): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
      
      @scala.inline
      def setAllowHeaders(value: js.Array[String]): Self = StObject.set(x, "allowHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHeadersUndefined: Self = StObject.set(x, "allowHeaders", js.undefined)
      
      @scala.inline
      def setAllowHeadersVarargs(value: String*): Self = StObject.set(x, "allowHeaders", js.Array(value :_*))
      
      @scala.inline
      def setAllowMethods(value: js.Array[String]): Self = StObject.set(x, "allowMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMethodsUndefined: Self = StObject.set(x, "allowMethods", js.undefined)
      
      @scala.inline
      def setAllowMethodsVarargs(value: String*): Self = StObject.set(x, "allowMethods", js.Array(value :_*))
      
      @scala.inline
      def setAllowOrigins(value: js.Array[String]): Self = StObject.set(x, "allowOrigins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowOriginsUndefined: Self = StObject.set(x, "allowOrigins", js.undefined)
      
      @scala.inline
      def setAllowOriginsVarargs(value: String*): Self = StObject.set(x, "allowOrigins", js.Array(value :_*))
      
      @scala.inline
      def setExposeHeaders(value: js.Array[String]): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposeHeadersUndefined: Self = StObject.set(x, "exposeHeaders", js.undefined)
      
      @scala.inline
      def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "exposeHeaders", js.Array(value :_*))
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
  
  @js.native
  trait AuthorizerJwtConfiguration extends StObject {
    
    /**
      * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in this list.
      */
    var audiences: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The base domain of the identity provider that issues JSON Web Tokens, such as the `endpoint` attribute of the `aws.cognito.UserPool` resource.
      */
    var issuer: js.UndefOr[String] = js.native
  }
  object AuthorizerJwtConfiguration {
    
    @scala.inline
    def apply(): AuthorizerJwtConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizerJwtConfiguration]
    }
    
    @scala.inline
    implicit class AuthorizerJwtConfigurationMutableBuilder[Self <: AuthorizerJwtConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudiences(value: js.Array[String]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
      
      @scala.inline
      def setAudiencesVarargs(value: String*): Self = StObject.set(x, "audiences", js.Array(value :_*))
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    }
  }
  
  @js.native
  trait DomainNameDomainNameConfiguration extends StObject {
    
    /**
      * The ARN of an AWS-managed certificate that will be used by the endpoint for the domain name. AWS Certificate Manager is the only supported source.
      * Use the `aws.acm.Certificate` resource to configure an ACM certificate.
      */
    var certificateArn: String = js.native
    
    /**
      * The endpoint type. Valid values: `REGIONAL`.
      */
    var endpointType: String = js.native
    
    /**
      * The Amazon Route 53 Hosted Zone ID of the endpoint.
      */
    var hostedZoneId: String = js.native
    
    /**
      * The Transport Layer Security (TLS) version of the [security policy](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-custom-domain-tls-version.html) for the domain name. Valid values: `TLS_1_2`.
      */
    var securityPolicy: String = js.native
    
    /**
      * The target domain name.
      */
    var targetDomainName: String = js.native
  }
  object DomainNameDomainNameConfiguration {
    
    @scala.inline
    def apply(
      certificateArn: String,
      endpointType: String,
      hostedZoneId: String,
      securityPolicy: String,
      targetDomainName: String
    ): DomainNameDomainNameConfiguration = {
      val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any], endpointType = endpointType.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any], securityPolicy = securityPolicy.asInstanceOf[js.Any], targetDomainName = targetDomainName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainNameDomainNameConfiguration]
    }
    
    @scala.inline
    implicit class DomainNameDomainNameConfigurationMutableBuilder[Self <: DomainNameDomainNameConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificateArn(value: String): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointType(value: String): Self = StObject.set(x, "endpointType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostedZoneId(value: String): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetDomainName(value: String): Self = StObject.set(x, "targetDomainName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IntegrationTlsConfig extends StObject {
    
    /**
      * If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate. The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
      */
    var serverNameToVerify: js.UndefOr[String] = js.native
  }
  object IntegrationTlsConfig {
    
    @scala.inline
    def apply(): IntegrationTlsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntegrationTlsConfig]
    }
    
    @scala.inline
    implicit class IntegrationTlsConfigMutableBuilder[Self <: IntegrationTlsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServerNameToVerify(value: String): Self = StObject.set(x, "serverNameToVerify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerNameToVerifyUndefined: Self = StObject.set(x, "serverNameToVerify", js.undefined)
    }
  }
  
  @js.native
  trait StageAccessLogSettings extends StObject {
    
    /**
      * The ARN of the CloudWatch Logs log group to receive access logs. Any trailing `:*` is trimmed from the ARN.
      */
    var destinationArn: String = js.native
    
    /**
      * A single line [format](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#apigateway-cloudwatch-log-formats) of the access logs of data, as specified by [selected $context variables](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-logging.html).
      */
    var format: String = js.native
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
  
  @js.native
  trait StageDefaultRouteSettings extends StObject {
    
    /**
      * Whether data trace logging is enabled for the default route. Affects the log entries pushed to Amazon CloudWatch Logs.
      * Defaults to `false`. Supported only for WebSocket APIs.
      */
    var dataTraceEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether detailed metrics are enabled for the default route. Defaults to `false`.
      */
    var detailedMetricsEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * The logging level for the default route. Affects the log entries pushed to Amazon CloudWatch Logs.
      * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
      */
    var loggingLevel: String = js.native
    
    /**
      * The throttling burst limit for the default route.
      */
    var throttlingBurstLimit: js.UndefOr[Double] = js.native
    
    /**
      * The throttling rate limit for the default route.
      */
    var throttlingRateLimit: js.UndefOr[Double] = js.native
  }
  object StageDefaultRouteSettings {
    
    @scala.inline
    def apply(loggingLevel: String): StageDefaultRouteSettings = {
      val __obj = js.Dynamic.literal(loggingLevel = loggingLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[StageDefaultRouteSettings]
    }
    
    @scala.inline
    implicit class StageDefaultRouteSettingsMutableBuilder[Self <: StageDefaultRouteSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataTraceEnabled(value: Boolean): Self = StObject.set(x, "dataTraceEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTraceEnabledUndefined: Self = StObject.set(x, "dataTraceEnabled", js.undefined)
      
      @scala.inline
      def setDetailedMetricsEnabled(value: Boolean): Self = StObject.set(x, "detailedMetricsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailedMetricsEnabledUndefined: Self = StObject.set(x, "detailedMetricsEnabled", js.undefined)
      
      @scala.inline
      def setLoggingLevel(value: String): Self = StObject.set(x, "loggingLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottlingBurstLimit(value: Double): Self = StObject.set(x, "throttlingBurstLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottlingBurstLimitUndefined: Self = StObject.set(x, "throttlingBurstLimit", js.undefined)
      
      @scala.inline
      def setThrottlingRateLimit(value: Double): Self = StObject.set(x, "throttlingRateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottlingRateLimitUndefined: Self = StObject.set(x, "throttlingRateLimit", js.undefined)
    }
  }
  
  @js.native
  trait StageRouteSetting extends StObject {
    
    /**
      * Whether data trace logging is enabled for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
      * Defaults to `false`. Supported only for WebSocket APIs.
      */
    var dataTraceEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether detailed metrics are enabled for the route. Defaults to `false`.
      */
    var detailedMetricsEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * The logging level for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
      * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
      */
    var loggingLevel: String = js.native
    
    /**
      * Route key.
      */
    var routeKey: String = js.native
    
    /**
      * The throttling burst limit for the route.
      */
    var throttlingBurstLimit: js.UndefOr[Double] = js.native
    
    /**
      * The throttling rate limit for the route.
      */
    var throttlingRateLimit: js.UndefOr[Double] = js.native
  }
  object StageRouteSetting {
    
    @scala.inline
    def apply(loggingLevel: String, routeKey: String): StageRouteSetting = {
      val __obj = js.Dynamic.literal(loggingLevel = loggingLevel.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[StageRouteSetting]
    }
    
    @scala.inline
    implicit class StageRouteSettingMutableBuilder[Self <: StageRouteSetting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataTraceEnabled(value: Boolean): Self = StObject.set(x, "dataTraceEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTraceEnabledUndefined: Self = StObject.set(x, "dataTraceEnabled", js.undefined)
      
      @scala.inline
      def setDetailedMetricsEnabled(value: Boolean): Self = StObject.set(x, "detailedMetricsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailedMetricsEnabledUndefined: Self = StObject.set(x, "detailedMetricsEnabled", js.undefined)
      
      @scala.inline
      def setLoggingLevel(value: String): Self = StObject.set(x, "loggingLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteKey(value: String): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottlingBurstLimit(value: Double): Self = StObject.set(x, "throttlingBurstLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottlingBurstLimitUndefined: Self = StObject.set(x, "throttlingBurstLimit", js.undefined)
      
      @scala.inline
      def setThrottlingRateLimit(value: Double): Self = StObject.set(x, "throttlingRateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottlingRateLimitUndefined: Self = StObject.set(x, "throttlingRateLimit", js.undefined)
    }
  }
}
