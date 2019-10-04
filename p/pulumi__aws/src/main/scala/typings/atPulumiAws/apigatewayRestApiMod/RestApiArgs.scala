package typings.atPulumiAws.apigatewayRestApiMod

import typings.atPulumiAws.typesInputMod.apigatewayNs.RestApiEndpointConfiguration
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestApiArgs extends js.Object {
  /**
    * The source of the API key for requests. Valid values are HEADER (default) and AUTHORIZER.
    */
  val apiKeySource: js.UndefOr[Input[String]] = js.undefined
  /**
    * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
    */
  val binaryMediaTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * An OpenAPI specification that defines the set of routes and integrations to create as part of the REST API.
    */
  val body: js.UndefOr[Input[String]] = js.undefined
  /**
    * The description of the REST API
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Nested argument defining API endpoint configuration including endpoint type. Defined below.
    */
  val endpointConfiguration: js.UndefOr[Input[RestApiEndpointConfiguration]] = js.undefined
  /**
    * Minimum response size to compress for the REST API. Integer between -1 and 10485760 (10MB). Setting a value greater than -1 will enable compression, -1 disables compression (default).
    */
  val minimumCompressionSize: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The name of the REST API
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * JSON formatted policy document that controls access to the API Gateway.
    */
  val policy: js.UndefOr[Input[String]] = js.undefined
}

object RestApiArgs {
  @scala.inline
  def apply(
    apiKeySource: Input[String] = null,
    binaryMediaTypes: Input[js.Array[Input[String]]] = null,
    body: Input[String] = null,
    description: Input[String] = null,
    endpointConfiguration: Input[RestApiEndpointConfiguration] = null,
    minimumCompressionSize: Input[Double] = null,
    name: Input[String] = null,
    policy: Input[String] = null
  ): RestApiArgs = {
    val __obj = js.Dynamic.literal()
    if (apiKeySource != null) __obj.updateDynamic("apiKeySource")(apiKeySource.asInstanceOf[js.Any])
    if (binaryMediaTypes != null) __obj.updateDynamic("binaryMediaTypes")(binaryMediaTypes.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endpointConfiguration != null) __obj.updateDynamic("endpointConfiguration")(endpointConfiguration.asInstanceOf[js.Any])
    if (minimumCompressionSize != null) __obj.updateDynamic("minimumCompressionSize")(minimumCompressionSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestApiArgs]
  }
}

