package typings.pulumiAws.integrationResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegrationResponseState extends js.Object {
  
  /**
    * The API identifier.
    */
  val apiId: js.UndefOr[Input[String]] = js.native
  
  /**
    * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
    */
  val contentHandlingStrategy: js.UndefOr[Input[String]] = js.native
  
  /**
    * The identifier of the `aws.apigatewayv2.Integration`.
    */
  val integrationId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The integration response key.
    */
  val integrationResponseKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
    */
  val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
    */
  val templateSelectionExpression: js.UndefOr[Input[String]] = js.native
}
object IntegrationResponseState {
  
  @scala.inline
  def apply(): IntegrationResponseState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegrationResponseState]
  }
  
  @scala.inline
  implicit class IntegrationResponseStateOps[Self <: IntegrationResponseState] (val x: Self) extends AnyVal {
    
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
    def setContentHandlingStrategy(value: Input[String]): Self = this.set("contentHandlingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentHandlingStrategy: Self = this.set("contentHandlingStrategy", js.undefined)
    
    @scala.inline
    def setIntegrationId(value: Input[String]): Self = this.set("integrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrationId: Self = this.set("integrationId", js.undefined)
    
    @scala.inline
    def setIntegrationResponseKey(value: Input[String]): Self = this.set("integrationResponseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrationResponseKey: Self = this.set("integrationResponseKey", js.undefined)
    
    @scala.inline
    def setResponseTemplates(value: Input[StringDictionary[Input[String]]]): Self = this.set("responseTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTemplates: Self = this.set("responseTemplates", js.undefined)
    
    @scala.inline
    def setTemplateSelectionExpression(value: Input[String]): Self = this.set("templateSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateSelectionExpression: Self = this.set("templateSelectionExpression", js.undefined)
  }
}
