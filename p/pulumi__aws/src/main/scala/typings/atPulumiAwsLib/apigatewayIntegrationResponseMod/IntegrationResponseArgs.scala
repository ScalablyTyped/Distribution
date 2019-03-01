package typings
package atPulumiAwsLib.apigatewayIntegrationResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegrationResponseArgs extends js.Object {
  /**
    * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
    */
  val contentHandling: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The API resource ID
    */
  val resourceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A map of response parameters that can be read from the backend response.
    * For example: `response_parameters = { "method.response.header.X-Some-Header" = "integration.response.header.X-Some-Other-Header" }`,
    */
  val responseParameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * **Deprecated**, use `response_parameters` instead.
    */
  val responseParametersInJson: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A map specifying the templates used to transform the integration response body
    */
  val responseTemplates: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
  /**
    * Specifies the regular expression pattern used to choose
    * an integration response based on the response from the backend. Setting this to `-` makes the integration the default one.
    * If the backend is an `AWS` Lambda function, the AWS Lambda function error header is matched.
    * For all other `HTTP` and `AWS` backends, the HTTP status code is matched.
    */
  val selectionPattern: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The HTTP status code
    */
  val statusCode: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object IntegrationResponseArgs {
  @scala.inline
  def apply(
    httpMethod: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    resourceId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi],
    statusCode: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    contentHandling: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    responseParameters: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    responseParametersInJson: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    responseTemplates: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    selectionPattern: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): IntegrationResponseArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (contentHandling != null) __obj.updateDynamic("contentHandling")(contentHandling.asInstanceOf[js.Any])
    if (responseParameters != null) __obj.updateDynamic("responseParameters")(responseParameters.asInstanceOf[js.Any])
    if (responseParametersInJson != null) __obj.updateDynamic("responseParametersInJson")(responseParametersInJson.asInstanceOf[js.Any])
    if (responseTemplates != null) __obj.updateDynamic("responseTemplates")(responseTemplates.asInstanceOf[js.Any])
    if (selectionPattern != null) __obj.updateDynamic("selectionPattern")(selectionPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationResponseArgs]
  }
}

