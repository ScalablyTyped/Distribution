package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodMod {
  
  @JSImport("@pulumi/aws/apigateway/method", "Method")
  @js.native
  class Method protected () extends CustomResource {
    /**
      * Create a Method resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MethodArgs) = this()
    def this(name: String, args: MethodArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specify if the method requires an API key
      */
    val apiKeyRequired: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
      */
    val authorization: Output_[String] = js.native
    
    /**
      * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
      */
    val authorizationScopes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
      */
    val authorizerId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
      */
    val httpMethod: Output_[String] = js.native
    
    /**
      * A map of the API models used for the request's content type
      * where key is the content type (e.g. `application/json`)
      * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`'s `name`.
      */
    val requestModels: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
      * For example: `requestParameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
      */
    val requestParameters: Output_[js.UndefOr[StringDictionary[Boolean]]] = js.native
    
    /**
      * The ID of a `aws.apigateway.RequestValidator`
      */
    val requestValidatorId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The API resource ID
      */
    val resourceId: Output_[String] = js.native
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Output_[String] = js.native
  }
  /* static members */
  object Method {
    
    @JSImport("@pulumi/aws/apigateway/method", "Method")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Method resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Method = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Method]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Method = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Method]
    inline def get(name: String, id: Input[ID], state: MethodState): Method = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Method]
    inline def get(name: String, id: Input[ID], state: MethodState, opts: CustomResourceOptions): Method = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Method]
    
    /**
      * Returns true if the given object is an instance of Method.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/method.Method */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/method.Method */ Boolean]
  }
  
  trait MethodArgs extends StObject {
    
    /**
      * Specify if the method requires an API key
      */
    val apiKeyRequired: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
      */
    val authorization: Input[String]
    
    /**
      * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
      */
    val authorizationScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
      */
    val authorizerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
      */
    val httpMethod: Input[String]
    
    /**
      * A map of the API models used for the request's content type
      * where key is the content type (e.g. `application/json`)
      * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`'s `name`.
      */
    val requestModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
      * For example: `requestParameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
      */
    val requestParameters: js.UndefOr[Input[StringDictionary[Input[Boolean]]]] = js.undefined
    
    /**
      * The ID of a `aws.apigateway.RequestValidator`
      */
    val requestValidatorId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The API resource ID
      */
    val resourceId: Input[String]
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Input[String | RestApi]
  }
  object MethodArgs {
    
    inline def apply(
      authorization: Input[String],
      httpMethod: Input[String],
      resourceId: Input[String],
      restApi: Input[String | RestApi]
    ): MethodArgs = {
      val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodArgs]
    }
    
    extension [Self <: MethodArgs](x: Self) {
      
      inline def setApiKeyRequired(value: Input[Boolean]): Self = StObject.set(x, "apiKeyRequired", value.asInstanceOf[js.Any])
      
      inline def setApiKeyRequiredUndefined: Self = StObject.set(x, "apiKeyRequired", js.undefined)
      
      inline def setAuthorization(value: Input[String]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "authorizationScopes", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationScopesUndefined: Self = StObject.set(x, "authorizationScopes", js.undefined)
      
      inline def setAuthorizationScopesVarargs(value: Input[String]*): Self = StObject.set(x, "authorizationScopes", js.Array(value :_*))
      
      inline def setAuthorizerId(value: Input[String]): Self = StObject.set(x, "authorizerId", value.asInstanceOf[js.Any])
      
      inline def setAuthorizerIdUndefined: Self = StObject.set(x, "authorizerId", js.undefined)
      
      inline def setHttpMethod(value: Input[String]): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setRequestModels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestModels", value.asInstanceOf[js.Any])
      
      inline def setRequestModelsUndefined: Self = StObject.set(x, "requestModels", js.undefined)
      
      inline def setRequestParameters(value: Input[StringDictionary[Input[Boolean]]]): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
      
      inline def setRequestParametersUndefined: Self = StObject.set(x, "requestParameters", js.undefined)
      
      inline def setRequestValidatorId(value: Input[String]): Self = StObject.set(x, "requestValidatorId", value.asInstanceOf[js.Any])
      
      inline def setRequestValidatorIdUndefined: Self = StObject.set(x, "requestValidatorId", js.undefined)
      
      inline def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      inline def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
    }
  }
  
  trait MethodState extends StObject {
    
    /**
      * Specify if the method requires an API key
      */
    val apiKeyRequired: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
      */
    val authorization: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
      */
    val authorizationScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
      */
    val authorizerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
      */
    val httpMethod: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of the API models used for the request's content type
      * where key is the content type (e.g. `application/json`)
      * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`'s `name`.
      */
    val requestModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
      * For example: `requestParameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
      */
    val requestParameters: js.UndefOr[Input[StringDictionary[Input[Boolean]]]] = js.undefined
    
    /**
      * The ID of a `aws.apigateway.RequestValidator`
      */
    val requestValidatorId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The API resource ID
      */
    val resourceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the associated REST API
      */
    val restApi: js.UndefOr[Input[String | RestApi]] = js.undefined
  }
  object MethodState {
    
    inline def apply(): MethodState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MethodState]
    }
    
    extension [Self <: MethodState](x: Self) {
      
      inline def setApiKeyRequired(value: Input[Boolean]): Self = StObject.set(x, "apiKeyRequired", value.asInstanceOf[js.Any])
      
      inline def setApiKeyRequiredUndefined: Self = StObject.set(x, "apiKeyRequired", js.undefined)
      
      inline def setAuthorization(value: Input[String]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "authorizationScopes", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationScopesUndefined: Self = StObject.set(x, "authorizationScopes", js.undefined)
      
      inline def setAuthorizationScopesVarargs(value: Input[String]*): Self = StObject.set(x, "authorizationScopes", js.Array(value :_*))
      
      inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
      
      inline def setAuthorizerId(value: Input[String]): Self = StObject.set(x, "authorizerId", value.asInstanceOf[js.Any])
      
      inline def setAuthorizerIdUndefined: Self = StObject.set(x, "authorizerId", js.undefined)
      
      inline def setHttpMethod(value: Input[String]): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      inline def setRequestModels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestModels", value.asInstanceOf[js.Any])
      
      inline def setRequestModelsUndefined: Self = StObject.set(x, "requestModels", js.undefined)
      
      inline def setRequestParameters(value: Input[StringDictionary[Input[Boolean]]]): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
      
      inline def setRequestParametersUndefined: Self = StObject.set(x, "requestParameters", js.undefined)
      
      inline def setRequestValidatorId(value: Input[String]): Self = StObject.set(x, "requestValidatorId", value.asInstanceOf[js.Any])
      
      inline def setRequestValidatorIdUndefined: Self = StObject.set(x, "requestValidatorId", js.undefined)
      
      inline def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      
      inline def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      inline def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
    }
  }
}
