package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appsync {
  
  trait DataSourceDynamodbConfig extends StObject {
    
    /**
      * AWS region of Elasticsearch domain. Defaults to current region.
      */
    var region: String
    
    /**
      * Name of the DynamoDB table.
      */
    var tableName: String
    
    /**
      * Set to `true` to use Amazon Cognito credentials with this data source.
      */
    var useCallerCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object DataSourceDynamodbConfig {
    
    @scala.inline
    def apply(region: String, tableName: String): DataSourceDynamodbConfig = {
      val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSourceDynamodbConfig]
    }
    
    @scala.inline
    implicit class DataSourceDynamodbConfigMutableBuilder[Self <: DataSourceDynamodbConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCallerCredentials(value: Boolean): Self = StObject.set(x, "useCallerCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCallerCredentialsUndefined: Self = StObject.set(x, "useCallerCredentials", js.undefined)
    }
  }
  
  trait DataSourceElasticsearchConfig extends StObject {
    
    /**
      * HTTP URL.
      */
    var endpoint: String
    
    /**
      * AWS region of Elasticsearch domain. Defaults to current region.
      */
    var region: String
  }
  object DataSourceElasticsearchConfig {
    
    @scala.inline
    def apply(endpoint: String, region: String): DataSourceElasticsearchConfig = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSourceElasticsearchConfig]
    }
    
    @scala.inline
    implicit class DataSourceElasticsearchConfigMutableBuilder[Self <: DataSourceElasticsearchConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataSourceHttpConfig extends StObject {
    
    /**
      * HTTP URL.
      */
    var endpoint: String
  }
  object DataSourceHttpConfig {
    
    @scala.inline
    def apply(endpoint: String): DataSourceHttpConfig = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSourceHttpConfig]
    }
    
    @scala.inline
    implicit class DataSourceHttpConfigMutableBuilder[Self <: DataSourceHttpConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataSourceLambdaConfig extends StObject {
    
    /**
      * The ARN for the Lambda function.
      */
    var functionArn: String
  }
  object DataSourceLambdaConfig {
    
    @scala.inline
    def apply(functionArn: String): DataSourceLambdaConfig = {
      val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSourceLambdaConfig]
    }
    
    @scala.inline
    implicit class DataSourceLambdaConfigMutableBuilder[Self <: DataSourceLambdaConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionArn(value: String): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait GraphQLApiAdditionalAuthenticationProvider extends StObject {
    
    /**
      * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
      */
    var authenticationType: String
    
    /**
      * Nested argument containing OpenID Connect configuration. Defined below.
      */
    var openidConnectConfig: js.UndefOr[GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig] = js.undefined
    
    /**
      * The Amazon Cognito User Pool configuration. Defined below.
      */
    var userPoolConfig: js.UndefOr[GraphQLApiAdditionalAuthenticationProviderUserPoolConfig] = js.undefined
  }
  object GraphQLApiAdditionalAuthenticationProvider {
    
    @scala.inline
    def apply(authenticationType: String): GraphQLApiAdditionalAuthenticationProvider = {
      val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLApiAdditionalAuthenticationProvider]
    }
    
    @scala.inline
    implicit class GraphQLApiAdditionalAuthenticationProviderMutableBuilder[Self <: GraphQLApiAdditionalAuthenticationProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticationType(value: String): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenidConnectConfig(value: GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig): Self = StObject.set(x, "openidConnectConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenidConnectConfigUndefined: Self = StObject.set(x, "openidConnectConfig", js.undefined)
      
      @scala.inline
      def setUserPoolConfig(value: GraphQLApiAdditionalAuthenticationProviderUserPoolConfig): Self = StObject.set(x, "userPoolConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolConfigUndefined: Self = StObject.set(x, "userPoolConfig", js.undefined)
    }
  }
  
  trait GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig extends StObject {
    
    /**
      * Number of milliseconds a token is valid after being authenticated.
      */
    var authTtl: js.UndefOr[Double] = js.undefined
    
    /**
      * Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
      */
    var clientId: js.UndefOr[String] = js.undefined
    
    /**
      * Number of milliseconds a token is valid after being issued to a user.
      */
    var iatTtl: js.UndefOr[Double] = js.undefined
    
    /**
      * Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
      */
    var issuer: String
  }
  object GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig {
    
    @scala.inline
    def apply(issuer: String): GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig = {
      val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig]
    }
    
    @scala.inline
    implicit class GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigMutableBuilder[Self <: GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthTtl(value: Double): Self = StObject.set(x, "authTtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTtlUndefined: Self = StObject.set(x, "authTtl", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setIatTtl(value: Double): Self = StObject.set(x, "iatTtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIatTtlUndefined: Self = StObject.set(x, "iatTtl", js.undefined)
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    }
  }
  
  trait GraphQLApiAdditionalAuthenticationProviderUserPoolConfig extends StObject {
    
    /**
      * A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
      */
    var appIdClientRegex: js.UndefOr[String] = js.undefined
    
    /**
      * The AWS region in which the user pool was created.
      */
    var awsRegion: String
    
    /**
      * The user pool ID.
      */
    var userPoolId: String
  }
  object GraphQLApiAdditionalAuthenticationProviderUserPoolConfig {
    
    @scala.inline
    def apply(awsRegion: String, userPoolId: String): GraphQLApiAdditionalAuthenticationProviderUserPoolConfig = {
      val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLApiAdditionalAuthenticationProviderUserPoolConfig]
    }
    
    @scala.inline
    implicit class GraphQLApiAdditionalAuthenticationProviderUserPoolConfigMutableBuilder[Self <: GraphQLApiAdditionalAuthenticationProviderUserPoolConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppIdClientRegex(value: String): Self = StObject.set(x, "appIdClientRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdClientRegexUndefined: Self = StObject.set(x, "appIdClientRegex", js.undefined)
      
      @scala.inline
      def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolId(value: String): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GraphQLApiLogConfig extends StObject {
    
    /**
      * Amazon Resource Name of the service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
      */
    var cloudwatchLogsRoleArn: String
    
    /**
      * Set to TRUE to exclude sections that contain information such as headers, context, and evaluated mapping templates, regardless of logging  level. Valid values: `true`, `false`. Default value: `false`
      */
    var excludeVerboseContent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Field logging level. Valid values: `ALL`, `ERROR`, `NONE`.
      */
    var fieldLogLevel: String
  }
  object GraphQLApiLogConfig {
    
    @scala.inline
    def apply(cloudwatchLogsRoleArn: String, fieldLogLevel: String): GraphQLApiLogConfig = {
      val __obj = js.Dynamic.literal(cloudwatchLogsRoleArn = cloudwatchLogsRoleArn.asInstanceOf[js.Any], fieldLogLevel = fieldLogLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLApiLogConfig]
    }
    
    @scala.inline
    implicit class GraphQLApiLogConfigMutableBuilder[Self <: GraphQLApiLogConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudwatchLogsRoleArn(value: String): Self = StObject.set(x, "cloudwatchLogsRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeVerboseContent(value: Boolean): Self = StObject.set(x, "excludeVerboseContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeVerboseContentUndefined: Self = StObject.set(x, "excludeVerboseContent", js.undefined)
      
      @scala.inline
      def setFieldLogLevel(value: String): Self = StObject.set(x, "fieldLogLevel", value.asInstanceOf[js.Any])
    }
  }
  
  trait GraphQLApiOpenidConnectConfig extends StObject {
    
    /**
      * Number of milliseconds a token is valid after being authenticated.
      */
    var authTtl: js.UndefOr[Double] = js.undefined
    
    /**
      * Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
      */
    var clientId: js.UndefOr[String] = js.undefined
    
    /**
      * Number of milliseconds a token is valid after being issued to a user.
      */
    var iatTtl: js.UndefOr[Double] = js.undefined
    
    /**
      * Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
      */
    var issuer: String
  }
  object GraphQLApiOpenidConnectConfig {
    
    @scala.inline
    def apply(issuer: String): GraphQLApiOpenidConnectConfig = {
      val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLApiOpenidConnectConfig]
    }
    
    @scala.inline
    implicit class GraphQLApiOpenidConnectConfigMutableBuilder[Self <: GraphQLApiOpenidConnectConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthTtl(value: Double): Self = StObject.set(x, "authTtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTtlUndefined: Self = StObject.set(x, "authTtl", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setIatTtl(value: Double): Self = StObject.set(x, "iatTtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIatTtlUndefined: Self = StObject.set(x, "iatTtl", js.undefined)
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    }
  }
  
  trait GraphQLApiUserPoolConfig extends StObject {
    
    /**
      * A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
      */
    var appIdClientRegex: js.UndefOr[String] = js.undefined
    
    /**
      * The AWS region in which the user pool was created.
      */
    var awsRegion: String
    
    /**
      * The action that you want your GraphQL API to take when a request that uses Amazon Cognito User Pool authentication doesn't match the Amazon Cognito User Pool configuration. Valid: `ALLOW` and `DENY`
      */
    var defaultAction: String
    
    /**
      * The user pool ID.
      */
    var userPoolId: String
  }
  object GraphQLApiUserPoolConfig {
    
    @scala.inline
    def apply(awsRegion: String, defaultAction: String, userPoolId: String): GraphQLApiUserPoolConfig = {
      val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], defaultAction = defaultAction.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLApiUserPoolConfig]
    }
    
    @scala.inline
    implicit class GraphQLApiUserPoolConfigMutableBuilder[Self <: GraphQLApiUserPoolConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppIdClientRegex(value: String): Self = StObject.set(x, "appIdClientRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdClientRegexUndefined: Self = StObject.set(x, "appIdClientRegex", js.undefined)
      
      @scala.inline
      def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAction(value: String): Self = StObject.set(x, "defaultAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolId(value: String): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolverCachingConfig extends StObject {
    
    /**
      * The list of caching key.
      */
    var cachingKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The TTL in seconds.
      */
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object ResolverCachingConfig {
    
    @scala.inline
    def apply(): ResolverCachingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolverCachingConfig]
    }
    
    @scala.inline
    implicit class ResolverCachingConfigMutableBuilder[Self <: ResolverCachingConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCachingKeys(value: js.Array[String]): Self = StObject.set(x, "cachingKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachingKeysUndefined: Self = StObject.set(x, "cachingKeys", js.undefined)
      
      @scala.inline
      def setCachingKeysVarargs(value: String*): Self = StObject.set(x, "cachingKeys", js.Array(value :_*))
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait ResolverPipelineConfig extends StObject {
    
    /**
      * The list of Function ID.
      */
    var functions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ResolverPipelineConfig {
    
    @scala.inline
    def apply(): ResolverPipelineConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolverPipelineConfig]
    }
    
    @scala.inline
    implicit class ResolverPipelineConfigMutableBuilder[Self <: ResolverPipelineConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctions(value: js.Array[String]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      @scala.inline
      def setFunctionsVarargs(value: String*): Self = StObject.set(x, "functions", js.Array(value :_*))
    }
  }
}
