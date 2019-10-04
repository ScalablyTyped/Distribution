package typings.atPulumiAws.apigatewayResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseState extends js.Object {
  /**
    * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
    */
  val responseParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * A map specifying the templates used to transform the response body.
    */
  val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * The response type of the associated GatewayResponse.
    */
  val responseType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The string identifier of the associated REST API.
    */
  val restApiId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The HTTP status code of the Gateway Response.
    */
  val statusCode: js.UndefOr[Input[String]] = js.undefined
}

object ResponseState {
  @scala.inline
  def apply(
    responseParameters: Input[StringDictionary[Input[String]]] = null,
    responseTemplates: Input[StringDictionary[Input[String]]] = null,
    responseType: Input[String] = null,
    restApiId: Input[String] = null,
    statusCode: Input[String] = null
  ): ResponseState = {
    val __obj = js.Dynamic.literal()
    if (responseParameters != null) __obj.updateDynamic("responseParameters")(responseParameters.asInstanceOf[js.Any])
    if (responseTemplates != null) __obj.updateDynamic("responseTemplates")(responseTemplates.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (restApiId != null) __obj.updateDynamic("restApiId")(restApiId.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseState]
  }
}

