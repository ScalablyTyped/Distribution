package typings.pulumiAws.restApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.apigateway.RestApiEndpointConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestApiArgs extends js.Object {
  /**
    * The source of the API key for requests. Valid values are HEADER (default) and AUTHORIZER.
    */
  val apiKeySource: js.UndefOr[Input[String]] = js.native
  /**
    * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
    */
  val binaryMediaTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * An OpenAPI specification that defines the set of routes and integrations to create as part of the REST API.
    */
  val body: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the REST API
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument defining API endpoint configuration including endpoint type. Defined below.
    */
  val endpointConfiguration: js.UndefOr[Input[RestApiEndpointConfiguration]] = js.native
  /**
    * Minimum response size to compress for the REST API. Integer between -1 and 10485760 (10MB). Setting a value greater than -1 will enable compression, -1 disables compression (default).
    */
  val minimumCompressionSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the REST API
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * JSON formatted policy document that controls access to the API Gateway.
    */
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
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
    policy: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
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
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestApiArgs]
  }
}

