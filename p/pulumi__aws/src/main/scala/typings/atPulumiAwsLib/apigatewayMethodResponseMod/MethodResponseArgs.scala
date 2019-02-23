package typings
package atPulumiAwsLib.apigatewayMethodResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodResponseArgs extends js.Object {
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The API resource ID
    */
  val resourceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A map of the API models used for the response's content type
    */
  val responseModels: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * A map of response parameters that can be sent to the caller.
    * For example: `response_parameters = { "method.response.header.X-Some-Header" = true }`
    * would define that the header `X-Some-Header` can be provided on the response.
    */
  val responseParameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[scala.Boolean]]
    ]
  ] = js.undefined
  /**
    * **Deprecated**, use `response_parameters` instead.
    */
  val responseParametersInJson: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
  /**
    * The HTTP status code
    */
  val statusCode: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

