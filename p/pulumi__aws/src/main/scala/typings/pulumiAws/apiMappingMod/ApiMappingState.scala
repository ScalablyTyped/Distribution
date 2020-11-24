package typings.pulumiAws.apiMappingMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiMappingState extends js.Object {
  
  /**
    * The API identifier.
    */
  val apiId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
    */
  val apiMappingKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
    */
  val stage: js.UndefOr[Input[String]] = js.native
}
object ApiMappingState {
  
  @scala.inline
  def apply(): ApiMappingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiMappingState]
  }
  
  @scala.inline
  implicit class ApiMappingStateOps[Self <: ApiMappingState] (val x: Self) extends AnyVal {
    
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
    def setApiMappingKey(value: Input[String]): Self = this.set("apiMappingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiMappingKey: Self = this.set("apiMappingKey", js.undefined)
    
    @scala.inline
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setStage(value: Input[String]): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
  }
}
