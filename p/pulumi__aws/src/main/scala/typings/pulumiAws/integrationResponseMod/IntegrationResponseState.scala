package typings.pulumiAws.integrationResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.restApiMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val restApi: js.UndefOr[Input[RestApi]] = js.native
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
  def apply(
    contentHandling: Input[String] = null,
    httpMethod: Input[String] = null,
    resourceId: Input[String] = null,
    responseParameters: Input[StringDictionary[Input[String]]] = null,
    responseTemplates: Input[StringDictionary[Input[String]]] = null,
    restApi: Input[RestApi] = null,
    selectionPattern: Input[String] = null,
    statusCode: Input[String] = null
  ): IntegrationResponseState = {
    val __obj = js.Dynamic.literal()
    if (contentHandling != null) __obj.updateDynamic("contentHandling")(contentHandling.asInstanceOf[js.Any])
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (responseParameters != null) __obj.updateDynamic("responseParameters")(responseParameters.asInstanceOf[js.Any])
    if (responseTemplates != null) __obj.updateDynamic("responseTemplates")(responseTemplates.asInstanceOf[js.Any])
    if (restApi != null) __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    if (selectionPattern != null) __obj.updateDynamic("selectionPattern")(selectionPattern.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationResponseState]
  }
}

