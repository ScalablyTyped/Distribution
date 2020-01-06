package typings.atPulumiAws.apigatewayMethodResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodResponseState extends js.Object {
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: js.UndefOr[Input[String]] = js.native
  /**
    * The API resource ID
    */
  val resourceId: js.UndefOr[Input[String]] = js.native
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
  val restApi: js.UndefOr[Input[RestApi]] = js.native
  /**
    * The HTTP status code
    */
  val statusCode: js.UndefOr[Input[String]] = js.native
}

object MethodResponseState {
  @scala.inline
  def apply(
    httpMethod: Input[String] = null,
    resourceId: Input[String] = null,
    responseModels: Input[StringDictionary[Input[String]]] = null,
    responseParameters: Input[StringDictionary[Input[Boolean]]] = null,
    restApi: Input[RestApi] = null,
    statusCode: Input[String] = null
  ): MethodResponseState = {
    val __obj = js.Dynamic.literal()
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (responseModels != null) __obj.updateDynamic("responseModels")(responseModels.asInstanceOf[js.Any])
    if (responseParameters != null) __obj.updateDynamic("responseParameters")(responseParameters.asInstanceOf[js.Any])
    if (restApi != null) __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodResponseState]
  }
}

