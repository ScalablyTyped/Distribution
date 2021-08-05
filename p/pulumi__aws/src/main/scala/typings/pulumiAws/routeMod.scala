package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeMod {
  
  @JSImport("@pulumi/aws/apigatewayv2/route", "Route")
  @js.native
  class Route protected () extends CustomResource {
    /**
      * Create a Route resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteArgs) = this()
    def this(name: String, args: RouteArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The API identifier.
      */
    val apiId: Output_[String] = js.native
    
    /**
      * Boolean whether an API key is required for the route. Defaults to `false`.
      */
    val apiKeyRequired: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The authorization scopes supported by this route. The scopes are used with a JWT authorizer to authorize the method invocation.
      */
    val authorizationScopes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The authorization type for the route.
      * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
      * For HTTP APIs, valid values are `NONE` for open access, or `JWT` for using JSON Web Tokens.
      * Defaults to `NONE`.
      */
    val authorizationType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The identifier of the `aws.apigatewayv2.Authorizer` resource to be associated with this route, if the authorizationType is `CUSTOM`.
      */
    val authorizerId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route.
      */
    val modelSelectionExpression: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The operation name for the route. Must be between 1 and 64 characters in length.
      */
    val operationName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The request models for the route.
      */
    val requestModels: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The route key for the route. For HTTP APIs, the route key can be either `$default`, or a combination of an HTTP method and resource path, for example, `GET /pets`.
      */
    val routeKey: Output_[String] = js.native
    
    /**
      * The [route response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-response-selection-expressions) for the route.
      */
    val routeResponseSelectionExpression: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The target for the route. Must be between 1 and 128 characters in length.
      */
    val target: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Route {
    
    @JSImport("@pulumi/aws/apigatewayv2/route", "Route")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Route]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Route]
    inline def get(name: String, id: Input[ID], state: RouteState): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Route]
    inline def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Route]
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/route.Route */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/route.Route */ Boolean]
  }
  
  trait RouteArgs extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: Input[String]
    
    /**
      * Boolean whether an API key is required for the route. Defaults to `false`.
      */
    val apiKeyRequired: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The authorization scopes supported by this route. The scopes are used with a JWT authorizer to authorize the method invocation.
      */
    val authorizationScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The authorization type for the route.
      * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
      * For HTTP APIs, valid values are `NONE` for open access, or `JWT` for using JSON Web Tokens.
      * Defaults to `NONE`.
      */
    val authorizationType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier of the `aws.apigatewayv2.Authorizer` resource to be associated with this route, if the authorizationType is `CUSTOM`.
      */
    val authorizerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route.
      */
    val modelSelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The operation name for the route. Must be between 1 and 64 characters in length.
      */
    val operationName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The request models for the route.
      */
    val requestModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The route key for the route. For HTTP APIs, the route key can be either `$default`, or a combination of an HTTP method and resource path, for example, `GET /pets`.
      */
    val routeKey: Input[String]
    
    /**
      * The [route response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-response-selection-expressions) for the route.
      */
    val routeResponseSelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The target for the route. Must be between 1 and 128 characters in length.
      */
    val target: js.UndefOr[Input[String]] = js.undefined
  }
  object RouteArgs {
    
    inline def apply(apiId: Input[String], routeKey: Input[String]): RouteArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteArgs]
    }
    
    extension [Self <: RouteArgs](x: Self) {
      
      inline def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setApiKeyRequired(value: Input[Boolean]): Self = StObject.set(x, "apiKeyRequired", value.asInstanceOf[js.Any])
      
      inline def setApiKeyRequiredUndefined: Self = StObject.set(x, "apiKeyRequired", js.undefined)
      
      inline def setAuthorizationScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "authorizationScopes", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationScopesUndefined: Self = StObject.set(x, "authorizationScopes", js.undefined)
      
      inline def setAuthorizationScopesVarargs(value: Input[String]*): Self = StObject.set(x, "authorizationScopes", js.Array(value :_*))
      
      inline def setAuthorizationType(value: Input[String]): Self = StObject.set(x, "authorizationType", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationTypeUndefined: Self = StObject.set(x, "authorizationType", js.undefined)
      
      inline def setAuthorizerId(value: Input[String]): Self = StObject.set(x, "authorizerId", value.asInstanceOf[js.Any])
      
      inline def setAuthorizerIdUndefined: Self = StObject.set(x, "authorizerId", js.undefined)
      
      inline def setModelSelectionExpression(value: Input[String]): Self = StObject.set(x, "modelSelectionExpression", value.asInstanceOf[js.Any])
      
      inline def setModelSelectionExpressionUndefined: Self = StObject.set(x, "modelSelectionExpression", js.undefined)
      
      inline def setOperationName(value: Input[String]): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
      
      inline def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
      
      inline def setRequestModels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestModels", value.asInstanceOf[js.Any])
      
      inline def setRequestModelsUndefined: Self = StObject.set(x, "requestModels", js.undefined)
      
      inline def setRouteKey(value: Input[String]): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
      
      inline def setRouteResponseSelectionExpression(value: Input[String]): Self = StObject.set(x, "routeResponseSelectionExpression", value.asInstanceOf[js.Any])
      
      inline def setRouteResponseSelectionExpressionUndefined: Self = StObject.set(x, "routeResponseSelectionExpression", js.undefined)
      
      inline def setTarget(value: Input[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait RouteState extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean whether an API key is required for the route. Defaults to `false`.
      */
    val apiKeyRequired: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The authorization scopes supported by this route. The scopes are used with a JWT authorizer to authorize the method invocation.
      */
    val authorizationScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The authorization type for the route.
      * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
      * For HTTP APIs, valid values are `NONE` for open access, or `JWT` for using JSON Web Tokens.
      * Defaults to `NONE`.
      */
    val authorizationType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier of the `aws.apigatewayv2.Authorizer` resource to be associated with this route, if the authorizationType is `CUSTOM`.
      */
    val authorizerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route.
      */
    val modelSelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The operation name for the route. Must be between 1 and 64 characters in length.
      */
    val operationName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The request models for the route.
      */
    val requestModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The route key for the route. For HTTP APIs, the route key can be either `$default`, or a combination of an HTTP method and resource path, for example, `GET /pets`.
      */
    val routeKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [route response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-response-selection-expressions) for the route.
      */
    val routeResponseSelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The target for the route. Must be between 1 and 128 characters in length.
      */
    val target: js.UndefOr[Input[String]] = js.undefined
  }
  object RouteState {
    
    inline def apply(): RouteState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteState]
    }
    
    extension [Self <: RouteState](x: Self) {
      
      inline def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      inline def setApiKeyRequired(value: Input[Boolean]): Self = StObject.set(x, "apiKeyRequired", value.asInstanceOf[js.Any])
      
      inline def setApiKeyRequiredUndefined: Self = StObject.set(x, "apiKeyRequired", js.undefined)
      
      inline def setAuthorizationScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "authorizationScopes", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationScopesUndefined: Self = StObject.set(x, "authorizationScopes", js.undefined)
      
      inline def setAuthorizationScopesVarargs(value: Input[String]*): Self = StObject.set(x, "authorizationScopes", js.Array(value :_*))
      
      inline def setAuthorizationType(value: Input[String]): Self = StObject.set(x, "authorizationType", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationTypeUndefined: Self = StObject.set(x, "authorizationType", js.undefined)
      
      inline def setAuthorizerId(value: Input[String]): Self = StObject.set(x, "authorizerId", value.asInstanceOf[js.Any])
      
      inline def setAuthorizerIdUndefined: Self = StObject.set(x, "authorizerId", js.undefined)
      
      inline def setModelSelectionExpression(value: Input[String]): Self = StObject.set(x, "modelSelectionExpression", value.asInstanceOf[js.Any])
      
      inline def setModelSelectionExpressionUndefined: Self = StObject.set(x, "modelSelectionExpression", js.undefined)
      
      inline def setOperationName(value: Input[String]): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
      
      inline def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
      
      inline def setRequestModels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestModels", value.asInstanceOf[js.Any])
      
      inline def setRequestModelsUndefined: Self = StObject.set(x, "requestModels", js.undefined)
      
      inline def setRouteKey(value: Input[String]): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
      
      inline def setRouteKeyUndefined: Self = StObject.set(x, "routeKey", js.undefined)
      
      inline def setRouteResponseSelectionExpression(value: Input[String]): Self = StObject.set(x, "routeResponseSelectionExpression", value.asInstanceOf[js.Any])
      
      inline def setRouteResponseSelectionExpressionUndefined: Self = StObject.set(x, "routeResponseSelectionExpression", js.undefined)
      
      inline def setTarget(value: Input[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
