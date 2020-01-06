package typings.atPulumiAws.apigatewayResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseArgs extends js.Object {
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
  val responseType: Input[String] = js.native
  /**
    * The string identifier of the associated REST API.
    */
  val restApiId: Input[String] = js.native
  /**
    * The HTTP status code of the Gateway Response.
    */
  val statusCode: js.UndefOr[Input[String]] = js.native
}

object ResponseArgs {
  @scala.inline
  def apply(
    responseType: Input[String],
    restApiId: Input[String],
    responseParameters: Input[StringDictionary[Input[String]]] = null,
    responseTemplates: Input[StringDictionary[Input[String]]] = null,
    statusCode: Input[String] = null
  ): ResponseArgs = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    if (responseParameters != null) __obj.updateDynamic("responseParameters")(responseParameters.asInstanceOf[js.Any])
    if (responseTemplates != null) __obj.updateDynamic("responseTemplates")(responseTemplates.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseArgs]
  }
}

