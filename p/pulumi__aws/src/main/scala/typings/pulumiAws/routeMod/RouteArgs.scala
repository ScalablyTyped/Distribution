package typings.pulumiAws.routeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteArgs extends js.Object {
  
  /**
    * The API identifier.
    */
  val apiId: Input[String] = js.native
  
  /**
    * Boolean whether an API key is required for the route. Defaults to `false`.
    */
  val apiKeyRequired: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The authorization scopes supported by this route. The scopes are used with a JWT authorizer to authorize the method invocation.
    */
  val authorizationScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The authorization type for the route.
    * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
    * For HTTP APIs, valid values are `NONE` for open access, or `JWT` for using JSON Web Tokens.
    * Defaults to `NONE`.
    */
  val authorizationType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The identifier of the `aws.apigatewayv2.Authorizer` resource to be associated with this route, if the authorizationType is `CUSTOM`.
    */
  val authorizerId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route.
    */
  val modelSelectionExpression: js.UndefOr[Input[String]] = js.native
  
  /**
    * The operation name for the route. Must be between 1 and 64 characters in length.
    */
  val operationName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The request models for the route.
    */
  val requestModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The route key for the route. For HTTP APIs, the route key can be either `$default`, or a combination of an HTTP method and resource path, for example, `GET /pets`.
    */
  val routeKey: Input[String] = js.native
  
  /**
    * The [route response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-response-selection-expressions) for the route.
    */
  val routeResponseSelectionExpression: js.UndefOr[Input[String]] = js.native
  
  /**
    * The target for the route. Must be between 1 and 128 characters in length.
    */
  val target: js.UndefOr[Input[String]] = js.native
}
object RouteArgs {
  
  @scala.inline
  def apply(apiId: Input[String], routeKey: Input[String]): RouteArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteArgs]
  }
  
  @scala.inline
  implicit class RouteArgsOps[Self <: RouteArgs] (val x: Self) extends AnyVal {
    
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
    def setApiId(value: Input[String]): Self = this.set("apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteKey(value: Input[String]): Self = this.set("routeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeyRequired(value: Input[Boolean]): Self = this.set("apiKeyRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKeyRequired: Self = this.set("apiKeyRequired", js.undefined)
    
    @scala.inline
    def setAuthorizationScopesVarargs(value: Input[String]*): Self = this.set("authorizationScopes", js.Array(value :_*))
    
    @scala.inline
    def setAuthorizationScopes(value: Input[js.Array[Input[String]]]): Self = this.set("authorizationScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationScopes: Self = this.set("authorizationScopes", js.undefined)
    
    @scala.inline
    def setAuthorizationType(value: Input[String]): Self = this.set("authorizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationType: Self = this.set("authorizationType", js.undefined)
    
    @scala.inline
    def setAuthorizerId(value: Input[String]): Self = this.set("authorizerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerId: Self = this.set("authorizerId", js.undefined)
    
    @scala.inline
    def setModelSelectionExpression(value: Input[String]): Self = this.set("modelSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelSelectionExpression: Self = this.set("modelSelectionExpression", js.undefined)
    
    @scala.inline
    def setOperationName(value: Input[String]): Self = this.set("operationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    
    @scala.inline
    def setRequestModels(value: Input[StringDictionary[Input[String]]]): Self = this.set("requestModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestModels: Self = this.set("requestModels", js.undefined)
    
    @scala.inline
    def setRouteResponseSelectionExpression(value: Input[String]): Self = this.set("routeResponseSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteResponseSelectionExpression: Self = this.set("routeResponseSelectionExpression", js.undefined)
    
    @scala.inline
    def setTarget(value: Input[String]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
