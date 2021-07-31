package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.apigatewayv2.ApiCorsConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("@pulumi/aws/apigatewayv2/api", "Api")
  @js.native
  class Api protected () extends CustomResource {
    /**
      * Create a Api resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApiArgs) = this()
    def this(name: String, args: ApiArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The URI of the API, of the form `{api-id}.execute-api.{region}.amazonaws.com`.
      */
    val apiEndpoint: Output_[String] = js.native
    
    /**
      * An [API key selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions).
      * Valid values: `$context.authorizer.usageIdentifierKey`, `$request.header.x-api-key`. Defaults to `$request.header.x-api-key`.
      * Applicable for WebSocket APIs.
      */
    val apiKeySelectionExpression: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN of the API.
      */
    val arn: Output_[String] = js.native
    
    /**
      * An OpenAPI specification that defines the set of routes and integrations to create as part of the HTTP APIs. Supported only for HTTP APIs.
      */
    val body: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The cross-origin resource sharing (CORS) [configuration](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html). Applicable for HTTP APIs.
      */
    val corsConfiguration: Output_[js.UndefOr[ApiCorsConfiguration]] = js.native
    
    /**
      * Part of _quick create_. Specifies any credentials required for the integration. Applicable for HTTP APIs.
      */
    val credentialsArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The description of the API. Must be less than or equal to 1024 characters in length.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether clients can invoke the API by using the default `execute-api` endpoint.
      * By default, clients can invoke the API with the default `{api_id}.execute-api.{region}.amazonaws.com endpoint`.
      * To require that clients use a custom domain name to invoke the API, disable the default endpoint.
      */
    val disableExecuteApiEndpoint: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The ARN prefix to be used in an `aws.lambda.Permission`'s `sourceArn` attribute
      * or in an `aws.iam.Policy` to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
      * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
      */
    val executionArn: Output_[String] = js.native
    
    /**
      * The name of the API. Must be less than or equal to 128 characters in length.
      */
    val name: Output_[String] = js.native
    
    /**
      * The API protocol. Valid values: `HTTP`, `WEBSOCKET`.
      */
    val protocolType: Output_[String] = js.native
    
    /**
      * Part of _quick create_. Specifies any [route key](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-routes.html). Applicable for HTTP APIs.
      */
    val routeKey: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The [route selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-selection-expressions) for the API.
      * Defaults to `$request.method $request.path`.
      */
    val routeSelectionExpression: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the API.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Part of _quick create_. Quick create produces an API with an integration, a default catch-all route, and a default stage which is configured to automatically deploy changes.
      * For HTTP integrations, specify a fully qualified URL. For Lambda integrations, specify a function ARN.
      * The type of the integration will be `HTTP_PROXY` or `AWS_PROXY`, respectively. Applicable for HTTP APIs.
      */
    val target: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A version identifier for the API. Must be between 1 and 64 characters in length.
      */
    val version: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Api {
    
    @JSImport("@pulumi/aws/apigatewayv2/api", "Api")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Api resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Api]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Api]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApiState): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Api]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApiState, opts: CustomResourceOptions): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Api]
    
    /**
      * Returns true if the given object is an instance of Api.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/api.Api */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/api.Api */ Boolean]
  }
  
  trait ApiArgs extends StObject {
    
    /**
      * An [API key selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions).
      * Valid values: `$context.authorizer.usageIdentifierKey`, `$request.header.x-api-key`. Defaults to `$request.header.x-api-key`.
      * Applicable for WebSocket APIs.
      */
    val apiKeySelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An OpenAPI specification that defines the set of routes and integrations to create as part of the HTTP APIs. Supported only for HTTP APIs.
      */
    val body: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The cross-origin resource sharing (CORS) [configuration](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html). Applicable for HTTP APIs.
      */
    val corsConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.apigatewayv2.ApiCorsConfiguration]] = js.undefined
    
    /**
      * Part of _quick create_. Specifies any credentials required for the integration. Applicable for HTTP APIs.
      */
    val credentialsArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the API. Must be less than or equal to 1024 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether clients can invoke the API by using the default `execute-api` endpoint.
      * By default, clients can invoke the API with the default `{api_id}.execute-api.{region}.amazonaws.com endpoint`.
      * To require that clients use a custom domain name to invoke the API, disable the default endpoint.
      */
    val disableExecuteApiEndpoint: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the API. Must be less than or equal to 128 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The API protocol. Valid values: `HTTP`, `WEBSOCKET`.
      */
    val protocolType: Input[String]
    
    /**
      * Part of _quick create_. Specifies any [route key](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-routes.html). Applicable for HTTP APIs.
      */
    val routeKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [route selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-selection-expressions) for the API.
      * Defaults to `$request.method $request.path`.
      */
    val routeSelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the API.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Part of _quick create_. Quick create produces an API with an integration, a default catch-all route, and a default stage which is configured to automatically deploy changes.
      * For HTTP integrations, specify a fully qualified URL. For Lambda integrations, specify a function ARN.
      * The type of the integration will be `HTTP_PROXY` or `AWS_PROXY`, respectively. Applicable for HTTP APIs.
      */
    val target: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A version identifier for the API. Must be between 1 and 64 characters in length.
      */
    val version: js.UndefOr[Input[String]] = js.undefined
  }
  object ApiArgs {
    
    @scala.inline
    def apply(protocolType: Input[String]): ApiArgs = {
      val __obj = js.Dynamic.literal(protocolType = protocolType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiArgs]
    }
    
    @scala.inline
    implicit class ApiArgsMutableBuilder[Self <: ApiArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKeySelectionExpression(value: Input[String]): Self = StObject.set(x, "apiKeySelectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeySelectionExpressionUndefined: Self = StObject.set(x, "apiKeySelectionExpression", js.undefined)
      
      @scala.inline
      def setBody(value: Input[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCorsConfiguration(value: Input[typings.pulumiAws.inputMod.apigatewayv2.ApiCorsConfiguration]): Self = StObject.set(x, "corsConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorsConfigurationUndefined: Self = StObject.set(x, "corsConfiguration", js.undefined)
      
      @scala.inline
      def setCredentialsArn(value: Input[String]): Self = StObject.set(x, "credentialsArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsArnUndefined: Self = StObject.set(x, "credentialsArn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisableExecuteApiEndpoint(value: Input[Boolean]): Self = StObject.set(x, "disableExecuteApiEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableExecuteApiEndpointUndefined: Self = StObject.set(x, "disableExecuteApiEndpoint", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProtocolType(value: Input[String]): Self = StObject.set(x, "protocolType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteKey(value: Input[String]): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteKeyUndefined: Self = StObject.set(x, "routeKey", js.undefined)
      
      @scala.inline
      def setRouteSelectionExpression(value: Input[String]): Self = StObject.set(x, "routeSelectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteSelectionExpressionUndefined: Self = StObject.set(x, "routeSelectionExpression", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTarget(value: Input[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait ApiState extends StObject {
    
    /**
      * The URI of the API, of the form `{api-id}.execute-api.{region}.amazonaws.com`.
      */
    val apiEndpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An [API key selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions).
      * Valid values: `$context.authorizer.usageIdentifierKey`, `$request.header.x-api-key`. Defaults to `$request.header.x-api-key`.
      * Applicable for WebSocket APIs.
      */
    val apiKeySelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the API.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An OpenAPI specification that defines the set of routes and integrations to create as part of the HTTP APIs. Supported only for HTTP APIs.
      */
    val body: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The cross-origin resource sharing (CORS) [configuration](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html). Applicable for HTTP APIs.
      */
    val corsConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.apigatewayv2.ApiCorsConfiguration]] = js.undefined
    
    /**
      * Part of _quick create_. Specifies any credentials required for the integration. Applicable for HTTP APIs.
      */
    val credentialsArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the API. Must be less than or equal to 1024 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether clients can invoke the API by using the default `execute-api` endpoint.
      * By default, clients can invoke the API with the default `{api_id}.execute-api.{region}.amazonaws.com endpoint`.
      * To require that clients use a custom domain name to invoke the API, disable the default endpoint.
      */
    val disableExecuteApiEndpoint: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ARN prefix to be used in an `aws.lambda.Permission`'s `sourceArn` attribute
      * or in an `aws.iam.Policy` to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
      * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
      */
    val executionArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the API. Must be less than or equal to 128 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The API protocol. Valid values: `HTTP`, `WEBSOCKET`.
      */
    val protocolType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Part of _quick create_. Specifies any [route key](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-routes.html). Applicable for HTTP APIs.
      */
    val routeKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [route selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-selection-expressions) for the API.
      * Defaults to `$request.method $request.path`.
      */
    val routeSelectionExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the API.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Part of _quick create_. Quick create produces an API with an integration, a default catch-all route, and a default stage which is configured to automatically deploy changes.
      * For HTTP integrations, specify a fully qualified URL. For Lambda integrations, specify a function ARN.
      * The type of the integration will be `HTTP_PROXY` or `AWS_PROXY`, respectively. Applicable for HTTP APIs.
      */
    val target: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A version identifier for the API. Must be between 1 and 64 characters in length.
      */
    val version: js.UndefOr[Input[String]] = js.undefined
  }
  object ApiState {
    
    @scala.inline
    def apply(): ApiState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiState]
    }
    
    @scala.inline
    implicit class ApiStateMutableBuilder[Self <: ApiState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiEndpoint(value: Input[String]): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      @scala.inline
      def setApiKeySelectionExpression(value: Input[String]): Self = StObject.set(x, "apiKeySelectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeySelectionExpressionUndefined: Self = StObject.set(x, "apiKeySelectionExpression", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setBody(value: Input[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCorsConfiguration(value: Input[typings.pulumiAws.inputMod.apigatewayv2.ApiCorsConfiguration]): Self = StObject.set(x, "corsConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorsConfigurationUndefined: Self = StObject.set(x, "corsConfiguration", js.undefined)
      
      @scala.inline
      def setCredentialsArn(value: Input[String]): Self = StObject.set(x, "credentialsArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsArnUndefined: Self = StObject.set(x, "credentialsArn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisableExecuteApiEndpoint(value: Input[Boolean]): Self = StObject.set(x, "disableExecuteApiEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableExecuteApiEndpointUndefined: Self = StObject.set(x, "disableExecuteApiEndpoint", js.undefined)
      
      @scala.inline
      def setExecutionArn(value: Input[String]): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionArnUndefined: Self = StObject.set(x, "executionArn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProtocolType(value: Input[String]): Self = StObject.set(x, "protocolType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolTypeUndefined: Self = StObject.set(x, "protocolType", js.undefined)
      
      @scala.inline
      def setRouteKey(value: Input[String]): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteKeyUndefined: Self = StObject.set(x, "routeKey", js.undefined)
      
      @scala.inline
      def setRouteSelectionExpression(value: Input[String]): Self = StObject.set(x, "routeSelectionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteSelectionExpressionUndefined: Self = StObject.set(x, "routeSelectionExpression", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTarget(value: Input[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
