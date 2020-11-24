package typings.pulumiAws.apigatewayIntegrationResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegrationResponseState extends js.Object {
  
  /**
    * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
    */
  val contentHandling: js.UndefOr[Input[String]] = js.native
  
  /**
    * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: js.UndefOr[Input[String]] = js.native
  
  /**
    * The API resource ID
    */
  val resourceId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of response parameters that can be read from the backend response.
    * For example: `responseParameters = { "method.response.header.X-Some-Header" = "integration.response.header.X-Some-Other-Header" }`
    */
  val responseParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A map specifying the templates used to transform the integration response body
    */
  val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The ID of the associated REST API
    */
  val restApi: js.UndefOr[Input[String | RestApi]] = js.native
  
  /**
    * Specifies the regular expression pattern used to choose
    * an integration response based on the response from the backend. Setting this to `-` makes the integration the default one.
    * If the backend is an `AWS` Lambda function, the AWS Lambda function error header is matched.
    * For all other `HTTP` and `AWS` backends, the HTTP status code is matched.
    */
  val selectionPattern: js.UndefOr[Input[String]] = js.native
  
  /**
    * The HTTP status code
    */
  val statusCode: js.UndefOr[Input[String]] = js.native
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
    def setContentHandling(value: Input[String]): Self = this.set("contentHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentHandling: Self = this.set("contentHandling", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: Input[String]): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    
    @scala.inline
    def setResourceId(value: Input[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setResponseParameters(value: Input[StringDictionary[Input[String]]]): Self = this.set("responseParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseParameters: Self = this.set("responseParameters", js.undefined)
    
    @scala.inline
    def setResponseTemplates(value: Input[StringDictionary[Input[String]]]): Self = this.set("responseTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTemplates: Self = this.set("responseTemplates", js.undefined)
    
    @scala.inline
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestApi: Self = this.set("restApi", js.undefined)
    
    @scala.inline
    def setSelectionPattern(value: Input[String]): Self = this.set("selectionPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionPattern: Self = this.set("selectionPattern", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Input[String]): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
}
