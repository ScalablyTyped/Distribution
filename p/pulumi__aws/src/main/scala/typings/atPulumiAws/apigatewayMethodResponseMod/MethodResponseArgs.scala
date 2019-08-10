package typings.atPulumiAws.apigatewayMethodResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodResponseArgs extends js.Object {
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: Input[String]
  /**
    * The API resource ID
    */
  val resourceId: Input[String]
  /**
    * A map of the API models used for the response's content type
    */
  val responseModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * A map of response parameters that can be sent to the caller.
    * For example: `responseParameters = { "method.response.header.X-Some-Header" = true }`
    * would define that the header `X-Some-Header` can be provided on the response.
    */
  val responseParameters: js.UndefOr[Input[StringDictionary[Input[Boolean]]]] = js.undefined
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[RestApi]
  /**
    * The HTTP status code
    */
  val statusCode: Input[String]
}

object MethodResponseArgs {
  @scala.inline
  def apply(
    httpMethod: Input[String],
    resourceId: Input[String],
    restApi: Input[RestApi],
    statusCode: Input[String],
    responseModels: Input[StringDictionary[Input[String]]] = null,
    responseParameters: Input[StringDictionary[Input[Boolean]]] = null
  ): MethodResponseArgs = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (responseModels != null) __obj.updateDynamic("responseModels")(responseModels.asInstanceOf[js.Any])
    if (responseParameters != null) __obj.updateDynamic("responseParameters")(responseParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodResponseArgs]
  }
}

