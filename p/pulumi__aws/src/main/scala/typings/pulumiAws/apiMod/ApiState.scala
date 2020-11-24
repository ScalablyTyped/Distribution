package typings.pulumiAws.apiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.apigatewayv2.ApiCorsConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiState extends js.Object {
  
  /**
    * The URI of the API, of the form `{api-id}.execute-api.{region}.amazonaws.com`.
    */
  val apiEndpoint: js.UndefOr[Input[String]] = js.native
  
  /**
    * An [API key selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions).
    * Valid values: `$context.authorizer.usageIdentifierKey`, `$request.header.x-api-key`. Defaults to `$request.header.x-api-key`.
    * Applicable for WebSocket APIs.
    */
  val apiKeySelectionExpression: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the API.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * An OpenAPI specification that defines the set of routes and integrations to create as part of the HTTP APIs. Supported only for HTTP APIs.
    */
  val body: js.UndefOr[Input[String]] = js.native
  
  /**
    * The cross-origin resource sharing (CORS) [configuration](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html). Applicable for HTTP APIs.
    */
  val corsConfiguration: js.UndefOr[Input[ApiCorsConfiguration]] = js.native
  
  /**
    * Part of _quick create_. Specifies any credentials required for the integration. Applicable for HTTP APIs.
    */
  val credentialsArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The description of the API. Must be less than or equal to 1024 characters in length.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether clients can invoke the API by using the default `execute-api` endpoint.
    * By default, clients can invoke the API with the default `{api_id}.execute-api.{region}.amazonaws.com endpoint`.
    * To require that clients use a custom domain name to invoke the API, disable the default endpoint.
    */
  val disableExecuteApiEndpoint: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The ARN prefix to be used in an `aws.lambda.Permission`'s `sourceArn` attribute
    * or in an `aws.iam.Policy` to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
    * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
    */
  val executionArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the API. Must be less than or equal to 128 characters in length.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The API protocol. Valid values: `HTTP`, `WEBSOCKET`.
    */
  val protocolType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Part of _quick create_. Specifies any [route key](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-routes.html). Applicable for HTTP APIs.
    */
  val routeKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * The [route selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-selection-expressions) for the API.
    * Defaults to `$request.method $request.path`.
    */
  val routeSelectionExpression: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the API.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Part of _quick create_. Quick create produces an API with an integration, a default catch-all route, and a default stage which is configured to automatically deploy changes.
    * For HTTP integrations, specify a fully qualified URL. For Lambda integrations, specify a function ARN.
    * The type of the integration will be `HTTP_PROXY` or `AWS_PROXY`, respectively. Applicable for HTTP APIs.
    */
  val target: js.UndefOr[Input[String]] = js.native
  
  /**
    * A version identifier for the API. Must be between 1 and 64 characters in length.
    */
  val version: js.UndefOr[Input[String]] = js.native
}
object ApiState {
  
  @scala.inline
  def apply(): ApiState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiState]
  }
  
  @scala.inline
  implicit class ApiStateOps[Self <: ApiState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiEndpoint(value: Input[String]): Self = this.set("apiEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiEndpoint: Self = this.set("apiEndpoint", js.undefined)
    
    @scala.inline
    def setApiKeySelectionExpression(value: Input[String]): Self = this.set("apiKeySelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKeySelectionExpression: Self = this.set("apiKeySelectionExpression", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setBody(value: Input[String]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCorsConfiguration(value: Input[ApiCorsConfiguration]): Self = this.set("corsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorsConfiguration: Self = this.set("corsConfiguration", js.undefined)
    
    @scala.inline
    def setCredentialsArn(value: Input[String]): Self = this.set("credentialsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialsArn: Self = this.set("credentialsArn", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisableExecuteApiEndpoint(value: Input[Boolean]): Self = this.set("disableExecuteApiEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableExecuteApiEndpoint: Self = this.set("disableExecuteApiEndpoint", js.undefined)
    
    @scala.inline
    def setExecutionArn(value: Input[String]): Self = this.set("executionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionArn: Self = this.set("executionArn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProtocolType(value: Input[String]): Self = this.set("protocolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolType: Self = this.set("protocolType", js.undefined)
    
    @scala.inline
    def setRouteKey(value: Input[String]): Self = this.set("routeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteKey: Self = this.set("routeKey", js.undefined)
    
    @scala.inline
    def setRouteSelectionExpression(value: Input[String]): Self = this.set("routeSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteSelectionExpression: Self = this.set("routeSelectionExpression", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTarget(value: Input[String]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
