package typings
package atPulumiAwsLib.apigatewayMethodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodArgs extends js.Object {
  /**
    * Specify if the method requires an API key
    */
  val apiKeyRequired: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
    */
  val authorization: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
    */
  val authorizationScopes: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
    */
  val authorizerId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A map of the API models used for the request's content type
    * where key is the content type (e.g. `application/json`)
    * and value is either `Error`, `Empty` (built-in models) or `aws_api_gateway_model`'s `name`.
    */
  val requestModels: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * A map of request query string parameters and headers that should be passed to the integration.
    * For example:
    * ```typescript
    * import * as pulumi from "@pulumi/pulumi";
    * ```
    * would define that the header `X-Some-Header` and the query string `some-query-param` must be provided on the request, or
    */
  val requestParameters: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]]
    ]
  ] = js.undefined
  /**
    * **Deprecated**, use `request_parameters` instead.
    */
  val requestParametersInJson: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of a `aws_api_gateway_request_validator`
    */
  val requestValidatorId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The API resource ID
    */
  val resourceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
}

