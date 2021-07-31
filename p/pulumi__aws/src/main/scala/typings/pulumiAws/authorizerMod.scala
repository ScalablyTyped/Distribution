package typings.pulumiAws

import typings.pulumiAws.outputMod.apigatewayv2.AuthorizerJwtConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorizerMod {
  
  @JSImport("@pulumi/aws/apigatewayv2/authorizer", "Authorizer")
  @js.native
  class Authorizer protected () extends CustomResource {
    /**
      * Create a Authorizer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AuthorizerArgs) = this()
    def this(name: String, args: AuthorizerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The API identifier.
      */
    val apiId: Output_[String] = js.native
    
    /**
      * The required credentials as an IAM role for API Gateway to invoke the authorizer.
      * Supported only for `REQUEST` authorizers.
      */
    val authorizerCredentialsArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The format of the payload sent to an HTTP API Lambda authorizer. Required for HTTP API Lambda authorizers.
      * Valid values: `1.0`, `2.0`.
      */
    val authorizerPayloadFormatVersion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The time to live (TTL) for cached authorizer results, in seconds. If it equals 0, authorization caching is disabled.
      * If it is greater than 0, API Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Defaults to `300`.
      * Supported only for HTTP API Lambda authorizers.
      */
    val authorizerResultTtlInSeconds: Output_[Double] = js.native
    
    /**
      * The authorizer type. Valid values: `JWT`, `REQUEST`.
      * Specify `REQUEST` for a Lambda function using incoming request parameters.
      * For HTTP APIs, specify `JWT` to use JSON Web Tokens.
      */
    val authorizerType: Output_[String] = js.native
    
    /**
      * The authorizer's Uniform Resource Identifier (URI).
      * For `REQUEST` authorizers this must be a well-formed Lambda function URI, such as the `invokeArn` attribute of the `aws.lambda.Function` resource.
      * Supported only for `REQUEST` authorizers. Must be between 1 and 2048 characters in length.
      */
    val authorizerUri: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether a Lambda authorizer returns a response in a simple format. If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
      * Supported only for HTTP APIs.
      */
    val enableSimpleResponses: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The identity sources for which authorization is requested.
      * For `REQUEST` authorizers the value is a list of one or more mapping expressions of the specified request parameters.
      * For `JWT` authorizers the single entry specifies where to extract the JSON Web Token (JWT) from inbound requests.
      */
    val identitySources: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The configuration of a JWT authorizer. Required for the `JWT` authorizer type.
      * Supported only for HTTP APIs.
      */
    val jwtConfiguration: Output_[js.UndefOr[AuthorizerJwtConfiguration]] = js.native
    
    /**
      * The name of the authorizer. Must be between 1 and 128 characters in length.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object Authorizer {
    
    @JSImport("@pulumi/aws/apigatewayv2/authorizer", "Authorizer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Authorizer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Authorizer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Authorizer]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Authorizer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Authorizer]
    @scala.inline
    def get(name: String, id: Input[ID], state: AuthorizerState): Authorizer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Authorizer]
    @scala.inline
    def get(name: String, id: Input[ID], state: AuthorizerState, opts: CustomResourceOptions): Authorizer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Authorizer]
    
    /**
      * Returns true if the given object is an instance of Authorizer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/authorizer.Authorizer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/authorizer.Authorizer */ Boolean]
  }
  
  trait AuthorizerArgs extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: Input[String]
    
    /**
      * The required credentials as an IAM role for API Gateway to invoke the authorizer.
      * Supported only for `REQUEST` authorizers.
      */
    val authorizerCredentialsArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The format of the payload sent to an HTTP API Lambda authorizer. Required for HTTP API Lambda authorizers.
      * Valid values: `1.0`, `2.0`.
      */
    val authorizerPayloadFormatVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The time to live (TTL) for cached authorizer results, in seconds. If it equals 0, authorization caching is disabled.
      * If it is greater than 0, API Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Defaults to `300`.
      * Supported only for HTTP API Lambda authorizers.
      */
    val authorizerResultTtlInSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The authorizer type. Valid values: `JWT`, `REQUEST`.
      * Specify `REQUEST` for a Lambda function using incoming request parameters.
      * For HTTP APIs, specify `JWT` to use JSON Web Tokens.
      */
    val authorizerType: Input[String]
    
    /**
      * The authorizer's Uniform Resource Identifier (URI).
      * For `REQUEST` authorizers this must be a well-formed Lambda function URI, such as the `invokeArn` attribute of the `aws.lambda.Function` resource.
      * Supported only for `REQUEST` authorizers. Must be between 1 and 2048 characters in length.
      */
    val authorizerUri: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether a Lambda authorizer returns a response in a simple format. If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
      * Supported only for HTTP APIs.
      */
    val enableSimpleResponses: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The identity sources for which authorization is requested.
      * For `REQUEST` authorizers the value is a list of one or more mapping expressions of the specified request parameters.
      * For `JWT` authorizers the single entry specifies where to extract the JSON Web Token (JWT) from inbound requests.
      */
    val identitySources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The configuration of a JWT authorizer. Required for the `JWT` authorizer type.
      * Supported only for HTTP APIs.
      */
    val jwtConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.apigatewayv2.AuthorizerJwtConfiguration]] = js.undefined
    
    /**
      * The name of the authorizer. Must be between 1 and 128 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object AuthorizerArgs {
    
    @scala.inline
    def apply(apiId: Input[String], authorizerType: Input[String]): AuthorizerArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], authorizerType = authorizerType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizerArgs]
    }
    
    @scala.inline
    implicit class AuthorizerArgsMutableBuilder[Self <: AuthorizerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerCredentialsArn(value: Input[String]): Self = StObject.set(x, "authorizerCredentialsArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerCredentialsArnUndefined: Self = StObject.set(x, "authorizerCredentialsArn", js.undefined)
      
      @scala.inline
      def setAuthorizerPayloadFormatVersion(value: Input[String]): Self = StObject.set(x, "authorizerPayloadFormatVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerPayloadFormatVersionUndefined: Self = StObject.set(x, "authorizerPayloadFormatVersion", js.undefined)
      
      @scala.inline
      def setAuthorizerResultTtlInSeconds(value: Input[Double]): Self = StObject.set(x, "authorizerResultTtlInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerResultTtlInSecondsUndefined: Self = StObject.set(x, "authorizerResultTtlInSeconds", js.undefined)
      
      @scala.inline
      def setAuthorizerType(value: Input[String]): Self = StObject.set(x, "authorizerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerUri(value: Input[String]): Self = StObject.set(x, "authorizerUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerUriUndefined: Self = StObject.set(x, "authorizerUri", js.undefined)
      
      @scala.inline
      def setEnableSimpleResponses(value: Input[Boolean]): Self = StObject.set(x, "enableSimpleResponses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSimpleResponsesUndefined: Self = StObject.set(x, "enableSimpleResponses", js.undefined)
      
      @scala.inline
      def setIdentitySources(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "identitySources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentitySourcesUndefined: Self = StObject.set(x, "identitySources", js.undefined)
      
      @scala.inline
      def setIdentitySourcesVarargs(value: Input[String]*): Self = StObject.set(x, "identitySources", js.Array(value :_*))
      
      @scala.inline
      def setJwtConfiguration(value: Input[typings.pulumiAws.inputMod.apigatewayv2.AuthorizerJwtConfiguration]): Self = StObject.set(x, "jwtConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtConfigurationUndefined: Self = StObject.set(x, "jwtConfiguration", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait AuthorizerState extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The required credentials as an IAM role for API Gateway to invoke the authorizer.
      * Supported only for `REQUEST` authorizers.
      */
    val authorizerCredentialsArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The format of the payload sent to an HTTP API Lambda authorizer. Required for HTTP API Lambda authorizers.
      * Valid values: `1.0`, `2.0`.
      */
    val authorizerPayloadFormatVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The time to live (TTL) for cached authorizer results, in seconds. If it equals 0, authorization caching is disabled.
      * If it is greater than 0, API Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Defaults to `300`.
      * Supported only for HTTP API Lambda authorizers.
      */
    val authorizerResultTtlInSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The authorizer type. Valid values: `JWT`, `REQUEST`.
      * Specify `REQUEST` for a Lambda function using incoming request parameters.
      * For HTTP APIs, specify `JWT` to use JSON Web Tokens.
      */
    val authorizerType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The authorizer's Uniform Resource Identifier (URI).
      * For `REQUEST` authorizers this must be a well-formed Lambda function URI, such as the `invokeArn` attribute of the `aws.lambda.Function` resource.
      * Supported only for `REQUEST` authorizers. Must be between 1 and 2048 characters in length.
      */
    val authorizerUri: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether a Lambda authorizer returns a response in a simple format. If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
      * Supported only for HTTP APIs.
      */
    val enableSimpleResponses: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The identity sources for which authorization is requested.
      * For `REQUEST` authorizers the value is a list of one or more mapping expressions of the specified request parameters.
      * For `JWT` authorizers the single entry specifies where to extract the JSON Web Token (JWT) from inbound requests.
      */
    val identitySources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The configuration of a JWT authorizer. Required for the `JWT` authorizer type.
      * Supported only for HTTP APIs.
      */
    val jwtConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.apigatewayv2.AuthorizerJwtConfiguration]] = js.undefined
    
    /**
      * The name of the authorizer. Must be between 1 and 128 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object AuthorizerState {
    
    @scala.inline
    def apply(): AuthorizerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizerState]
    }
    
    @scala.inline
    implicit class AuthorizerStateMutableBuilder[Self <: AuthorizerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      @scala.inline
      def setAuthorizerCredentialsArn(value: Input[String]): Self = StObject.set(x, "authorizerCredentialsArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerCredentialsArnUndefined: Self = StObject.set(x, "authorizerCredentialsArn", js.undefined)
      
      @scala.inline
      def setAuthorizerPayloadFormatVersion(value: Input[String]): Self = StObject.set(x, "authorizerPayloadFormatVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerPayloadFormatVersionUndefined: Self = StObject.set(x, "authorizerPayloadFormatVersion", js.undefined)
      
      @scala.inline
      def setAuthorizerResultTtlInSeconds(value: Input[Double]): Self = StObject.set(x, "authorizerResultTtlInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerResultTtlInSecondsUndefined: Self = StObject.set(x, "authorizerResultTtlInSeconds", js.undefined)
      
      @scala.inline
      def setAuthorizerType(value: Input[String]): Self = StObject.set(x, "authorizerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerTypeUndefined: Self = StObject.set(x, "authorizerType", js.undefined)
      
      @scala.inline
      def setAuthorizerUri(value: Input[String]): Self = StObject.set(x, "authorizerUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerUriUndefined: Self = StObject.set(x, "authorizerUri", js.undefined)
      
      @scala.inline
      def setEnableSimpleResponses(value: Input[Boolean]): Self = StObject.set(x, "enableSimpleResponses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSimpleResponsesUndefined: Self = StObject.set(x, "enableSimpleResponses", js.undefined)
      
      @scala.inline
      def setIdentitySources(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "identitySources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentitySourcesUndefined: Self = StObject.set(x, "identitySources", js.undefined)
      
      @scala.inline
      def setIdentitySourcesVarargs(value: Input[String]*): Self = StObject.set(x, "identitySources", js.Array(value :_*))
      
      @scala.inline
      def setJwtConfiguration(value: Input[typings.pulumiAws.inputMod.apigatewayv2.AuthorizerJwtConfiguration]): Self = StObject.set(x, "jwtConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtConfigurationUndefined: Self = StObject.set(x, "jwtConfiguration", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
