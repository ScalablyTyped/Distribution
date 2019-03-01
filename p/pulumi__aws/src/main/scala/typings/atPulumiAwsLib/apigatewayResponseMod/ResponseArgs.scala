package typings
package atPulumiAwsLib.apigatewayResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseArgs extends js.Object {
  /**
    * A map specifying the templates used to transform the response body.
    */
  val responseParameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
    */
  val responseTemplates: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * The response type of the associated GatewayResponse.
    */
  val responseType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The string identifier of the associated REST API.
    */
  val restApiId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The HTTP status code of the Gateway Response.
    */
  val statusCode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ResponseArgs {
  @scala.inline
  def apply(
    responseType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    restApiId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    responseParameters: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    responseTemplates: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    statusCode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ResponseArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    __obj.updateDynamic("restApiId")(restApiId.asInstanceOf[js.Any])
    if (responseParameters != null) __obj.updateDynamic("responseParameters")(responseParameters.asInstanceOf[js.Any])
    if (responseTemplates != null) __obj.updateDynamic("responseTemplates")(responseTemplates.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseArgs]
  }
}

