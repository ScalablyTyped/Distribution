package typings.pulumiAws.responseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseState extends js.Object {
  
  /**
    * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
    */
  val responseParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A map specifying the templates used to transform the response body.
    */
  val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The response type of the associated GatewayResponse.
    */
  val responseType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The string identifier of the associated REST API.
    */
  val restApiId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The HTTP status code of the Gateway Response.
    */
  val statusCode: js.UndefOr[Input[String]] = js.native
}
object ResponseState {
  
  @scala.inline
  def apply(): ResponseState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseState]
  }
  
  @scala.inline
  implicit class ResponseStateOps[Self <: ResponseState] (val x: Self) extends AnyVal {
    
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
    def setResponseParameters(value: Input[StringDictionary[Input[String]]]): Self = this.set("responseParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseParameters: Self = this.set("responseParameters", js.undefined)
    
    @scala.inline
    def setResponseTemplates(value: Input[StringDictionary[Input[String]]]): Self = this.set("responseTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTemplates: Self = this.set("responseTemplates", js.undefined)
    
    @scala.inline
    def setResponseType(value: Input[String]): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setRestApiId(value: Input[String]): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestApiId: Self = this.set("restApiId", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Input[String]): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
}
