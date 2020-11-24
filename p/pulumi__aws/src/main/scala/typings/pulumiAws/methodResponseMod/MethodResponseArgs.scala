package typings.pulumiAws.methodResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodResponseArgs extends js.Object {
  
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: Input[String] = js.native
  
  /**
    * The API resource ID
    */
  val resourceId: Input[String] = js.native
  
  /**
    * A map of the API models used for the response's content type
    */
  val responseModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A map of response parameters that can be sent to the caller.
    * For example: `responseParameters = { "method.response.header.X-Some-Header" = true }`
    * would define that the header `X-Some-Header` can be provided on the response.
    */
  val responseParameters: js.UndefOr[Input[StringDictionary[Input[Boolean]]]] = js.native
  
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[String | RestApi] = js.native
  
  /**
    * The HTTP status code
    */
  val statusCode: Input[String] = js.native
}
object MethodResponseArgs {
  
  @scala.inline
  def apply(
    httpMethod: Input[String],
    resourceId: Input[String],
    restApi: Input[String | RestApi],
    statusCode: Input[String]
  ): MethodResponseArgs = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodResponseArgs]
  }
  
  @scala.inline
  implicit class MethodResponseArgsOps[Self <: MethodResponseArgs] (val x: Self) extends AnyVal {
    
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
    def setHttpMethod(value: Input[String]): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: Input[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Input[String]): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseModels(value: Input[StringDictionary[Input[String]]]): Self = this.set("responseModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseModels: Self = this.set("responseModels", js.undefined)
    
    @scala.inline
    def setResponseParameters(value: Input[StringDictionary[Input[Boolean]]]): Self = this.set("responseParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseParameters: Self = this.set("responseParameters", js.undefined)
  }
}
