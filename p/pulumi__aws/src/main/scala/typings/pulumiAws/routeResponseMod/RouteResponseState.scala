package typings.pulumiAws.routeResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteResponseState extends js.Object {
  
  /**
    * The API identifier.
    */
  val apiId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
    */
  val modelSelectionExpression: js.UndefOr[Input[String]] = js.native
  
  /**
    * The response models for the route response.
    */
  val responseModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The identifier of the `aws.apigatewayv2.Route`.
    */
  val routeId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The route response key.
    */
  val routeResponseKey: js.UndefOr[Input[String]] = js.native
}
object RouteResponseState {
  
  @scala.inline
  def apply(): RouteResponseState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteResponseState]
  }
  
  @scala.inline
  implicit class RouteResponseStateOps[Self <: RouteResponseState] (val x: Self) extends AnyVal {
    
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
    def deleteApiId: Self = this.set("apiId", js.undefined)
    
    @scala.inline
    def setModelSelectionExpression(value: Input[String]): Self = this.set("modelSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelSelectionExpression: Self = this.set("modelSelectionExpression", js.undefined)
    
    @scala.inline
    def setResponseModels(value: Input[StringDictionary[Input[String]]]): Self = this.set("responseModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseModels: Self = this.set("responseModels", js.undefined)
    
    @scala.inline
    def setRouteId(value: Input[String]): Self = this.set("routeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteId: Self = this.set("routeId", js.undefined)
    
    @scala.inline
    def setRouteResponseKey(value: Input[String]): Self = this.set("routeResponseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteResponseKey: Self = this.set("routeResponseKey", js.undefined)
  }
}
