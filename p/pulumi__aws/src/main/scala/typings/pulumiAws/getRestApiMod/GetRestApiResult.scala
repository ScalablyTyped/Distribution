package typings.pulumiAws.getRestApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.apigateway.GetRestApiEndpointConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRestApiResult extends js.Object {
  /**
    * The source of the API key for requests.
    */
  val apiKeySource: String = js.native
  /**
    * The ARN of the REST API.
    */
  val arn: String = js.native
  /**
    * The list of binary media types supported by the REST API.
    */
  val binaryMediaTypes: js.Array[String] = js.native
  /**
    * The description of the REST API.
    */
  val description: String = js.native
  /**
    * The endpoint configuration of this RestApi showing the endpoint types of the API.
    */
  val endpointConfigurations: js.Array[GetRestApiEndpointConfiguration] = js.native
  /**
    * The execution ARN part to be used in [`lambdaPermission`](https://www.terraform.io/docs/providers/aws/r/lambda_permission.html)'s `sourceArn` when allowing API Gateway to invoke a Lambda function, e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j`, which can be concatenated with allowed stage, method and resource path.
    */
  val executionArn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Minimum response size to compress for the REST API.
    */
  val minimumCompressionSize: Double = js.native
  val name: String = js.native
  /**
    * JSON formatted policy document that controls access to the API Gateway.
    */
  val policy: String = js.native
  /**
    * Set to the ID of the API Gateway Resource on the found REST API where the route matches '/'.
    */
  val rootResourceId: String = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: StringDictionary[js.Any] = js.native
}

object GetRestApiResult {
  @scala.inline
  def apply(
    apiKeySource: String,
    arn: String,
    binaryMediaTypes: js.Array[String],
    description: String,
    endpointConfigurations: js.Array[GetRestApiEndpointConfiguration],
    executionArn: String,
    id: String,
    minimumCompressionSize: Double,
    name: String,
    policy: String,
    rootResourceId: String,
    tags: StringDictionary[js.Any]
  ): GetRestApiResult = {
    val __obj = js.Dynamic.literal(apiKeySource = apiKeySource.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], binaryMediaTypes = binaryMediaTypes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endpointConfigurations = endpointConfigurations.asInstanceOf[js.Any], executionArn = executionArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], minimumCompressionSize = minimumCompressionSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], rootResourceId = rootResourceId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRestApiResult]
  }
}

