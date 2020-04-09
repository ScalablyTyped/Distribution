package typings.pulumiAws.apiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigatewayv2/api", "Api")
@js.native
class Api protected () extends CustomResource {
  /**
    * Create a Api resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApiArgs) = this()
  def this(name: String, args: ApiArgs, opts: CustomResourceOptions) = this()
  /**
    * The URI of the API, of the form `{api-id}.execute-api.{region}.amazonaws.com`.
    */
  val apiEndpoint: Output_[String] = js.native
  /**
    * An [API key selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions).
    * Valid values: `$context.authorizer.usageIdentifierKey`, `$request.header.x-api-key`. Defaults to `$request.header.x-api-key`.
    * Applicable for WebSocket APIs.
    */
  val apiKeySelectionExpression: Output_[js.UndefOr[String]] = js.native
  /**
    * The ARN of the API.
    */
  val arn: Output_[String] = js.native
  /**
    * The description of the API.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The ARN prefix to be used in an [`aws.lambda.Permission`](https://www.terraform.io/docs/providers/aws/r/lambda_permission.html)'s `sourceArn` attribute
    * or in an [`aws.iam.Policy`](https://www.terraform.io/docs/providers/aws/r/iam_policy.html) to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
    * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
    */
  val executionArn: Output_[String] = js.native
  /**
    * The name of the API.
    */
  val name: Output_[String] = js.native
  /**
    * The API protocol. Valid values: `HTTP`, `WEBSOCKET`.
    */
  val protocolType: Output_[String] = js.native
  /**
    * The [route selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-selection-expressions) for the API.
    * Defaults to `$request.method $request.path`.
    */
  val routeSelectionExpression: Output_[js.UndefOr[String]] = js.native
  /**
    * A mapping of tags to assign to the API.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * A version identifier for the API.
    */
  val version: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigatewayv2/api", "Api")
@js.native
object Api extends js.Object {
  /**
    * Get an existing Api resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Api = js.native
  def get(name: String, id: Input[ID], state: ApiState): Api = js.native
  def get(name: String, id: Input[ID], state: ApiState, opts: CustomResourceOptions): Api = js.native
  /**
    * Returns true if the given object is an instance of Api.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/api.Api */ Boolean = js.native
}

