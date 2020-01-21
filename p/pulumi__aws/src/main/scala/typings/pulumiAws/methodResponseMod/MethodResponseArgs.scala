package typings.pulumiAws.methodResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.restApiMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val restApi: Input[RestApi] = js.native
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

