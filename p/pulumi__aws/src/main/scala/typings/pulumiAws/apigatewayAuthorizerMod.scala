package typings.pulumiAws

import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apigatewayAuthorizerMod {
  
  @JSImport("@pulumi/aws/apigateway/authorizer", "Authorizer")
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
      * The credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
      */
    val authorizerCredentials: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The TTL of cached authorizer results in seconds. Defaults to `300`.
      */
    val authorizerResultTtlInSeconds: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The authorizer's Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
      * e.g. `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
      */
    val authorizerUri: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g. `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
      */
    val identitySource: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn't match, the client receives a 401 Unauthorized response.
      */
    val identityValidationExpression: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the authorizer
      */
    val name: Output_[String] = js.native
    
    /**
      * A list of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
      */
    val providerArns: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Output_[String] = js.native
    
    /**
      * The type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
      */
    val `type`: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Authorizer {
    
    @JSImport("@pulumi/aws/apigateway/authorizer", "Authorizer")
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
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/authorizer.Authorizer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/authorizer.Authorizer */ Boolean]
  }
  
  trait AuthorizerArgs extends StObject {
    
    /**
      * The credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
      */
    val authorizerCredentials: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The TTL of cached authorizer results in seconds. Defaults to `300`.
      */
    val authorizerResultTtlInSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The authorizer's Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
      * e.g. `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
      */
    val authorizerUri: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g. `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
      */
    val identitySource: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn't match, the client receives a 401 Unauthorized response.
      */
    val identityValidationExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the authorizer
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
      */
    val providerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Input[String | RestApi]
    
    /**
      * The type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object AuthorizerArgs {
    
    @scala.inline
    def apply(restApi: Input[String | RestApi]): AuthorizerArgs = {
      val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizerArgs]
    }
    
    @scala.inline
    implicit class AuthorizerArgsMutableBuilder[Self <: AuthorizerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizerCredentials(value: Input[String]): Self = StObject.set(x, "authorizerCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerCredentialsUndefined: Self = StObject.set(x, "authorizerCredentials", js.undefined)
      
      @scala.inline
      def setAuthorizerResultTtlInSeconds(value: Input[Double]): Self = StObject.set(x, "authorizerResultTtlInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerResultTtlInSecondsUndefined: Self = StObject.set(x, "authorizerResultTtlInSeconds", js.undefined)
      
      @scala.inline
      def setAuthorizerUri(value: Input[String]): Self = StObject.set(x, "authorizerUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerUriUndefined: Self = StObject.set(x, "authorizerUri", js.undefined)
      
      @scala.inline
      def setIdentitySource(value: Input[String]): Self = StObject.set(x, "identitySource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentitySourceUndefined: Self = StObject.set(x, "identitySource", js.undefined)
      
      @scala.inline
      def setIdentityValidationExpression(value: Input[String]): Self = StObject.set(x, "identityValidationExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityValidationExpressionUndefined: Self = StObject.set(x, "identityValidationExpression", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProviderArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "providerArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderArnsUndefined: Self = StObject.set(x, "providerArns", js.undefined)
      
      @scala.inline
      def setProviderArnsVarargs(value: Input[String]*): Self = StObject.set(x, "providerArns", js.Array(value :_*))
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AuthorizerState extends StObject {
    
    /**
      * The credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
      */
    val authorizerCredentials: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The TTL of cached authorizer results in seconds. Defaults to `300`.
      */
    val authorizerResultTtlInSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The authorizer's Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
      * e.g. `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
      */
    val authorizerUri: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g. `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
      */
    val identitySource: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn't match, the client receives a 401 Unauthorized response.
      */
    val identityValidationExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the authorizer
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
      */
    val providerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ID of the associated REST API
      */
    val restApi: js.UndefOr[Input[String | RestApi]] = js.undefined
    
    /**
      * The type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
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
      def setAuthorizerCredentials(value: Input[String]): Self = StObject.set(x, "authorizerCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerCredentialsUndefined: Self = StObject.set(x, "authorizerCredentials", js.undefined)
      
      @scala.inline
      def setAuthorizerResultTtlInSeconds(value: Input[Double]): Self = StObject.set(x, "authorizerResultTtlInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerResultTtlInSecondsUndefined: Self = StObject.set(x, "authorizerResultTtlInSeconds", js.undefined)
      
      @scala.inline
      def setAuthorizerUri(value: Input[String]): Self = StObject.set(x, "authorizerUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerUriUndefined: Self = StObject.set(x, "authorizerUri", js.undefined)
      
      @scala.inline
      def setIdentitySource(value: Input[String]): Self = StObject.set(x, "identitySource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentitySourceUndefined: Self = StObject.set(x, "identitySource", js.undefined)
      
      @scala.inline
      def setIdentityValidationExpression(value: Input[String]): Self = StObject.set(x, "identityValidationExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityValidationExpressionUndefined: Self = StObject.set(x, "identityValidationExpression", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProviderArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "providerArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderArnsUndefined: Self = StObject.set(x, "providerArns", js.undefined)
      
      @scala.inline
      def setProviderArnsVarargs(value: Input[String]*): Self = StObject.set(x, "providerArns", js.Array(value :_*))
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
