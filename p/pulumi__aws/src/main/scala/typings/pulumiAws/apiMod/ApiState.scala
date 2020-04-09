package typings.pulumiAws.apiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiState extends js.Object {
  /**
    * The URI of the API, of the form `{api-id}.execute-api.{region}.amazonaws.com`.
    */
  val apiEndpoint: js.UndefOr[Input[String]] = js.native
  /**
    * An [API key selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions).
    * Valid values: `$context.authorizer.usageIdentifierKey`, `$request.header.x-api-key`. Defaults to `$request.header.x-api-key`.
    * Applicable for WebSocket APIs.
    */
  val apiKeySelectionExpression: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the API.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the API.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN prefix to be used in an [`aws.lambda.Permission`](https://www.terraform.io/docs/providers/aws/r/lambda_permission.html)'s `sourceArn` attribute
    * or in an [`aws.iam.Policy`](https://www.terraform.io/docs/providers/aws/r/iam_policy.html) to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
    * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
    */
  val executionArn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the API.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The API protocol. Valid values: `HTTP`, `WEBSOCKET`.
    */
  val protocolType: js.UndefOr[Input[String]] = js.native
  /**
    * The [route selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-selection-expressions) for the API.
    * Defaults to `$request.method $request.path`.
    */
  val routeSelectionExpression: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the API.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A version identifier for the API.
    */
  val version: js.UndefOr[Input[String]] = js.native
}

object ApiState {
  @scala.inline
  def apply(
    apiEndpoint: Input[String] = null,
    apiKeySelectionExpression: Input[String] = null,
    arn: Input[String] = null,
    description: Input[String] = null,
    executionArn: Input[String] = null,
    name: Input[String] = null,
    protocolType: Input[String] = null,
    routeSelectionExpression: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    version: Input[String] = null
  ): ApiState = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint.asInstanceOf[js.Any])
    if (apiKeySelectionExpression != null) __obj.updateDynamic("apiKeySelectionExpression")(apiKeySelectionExpression.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (executionArn != null) __obj.updateDynamic("executionArn")(executionArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (protocolType != null) __obj.updateDynamic("protocolType")(protocolType.asInstanceOf[js.Any])
    if (routeSelectionExpression != null) __obj.updateDynamic("routeSelectionExpression")(routeSelectionExpression.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiState]
  }
}

