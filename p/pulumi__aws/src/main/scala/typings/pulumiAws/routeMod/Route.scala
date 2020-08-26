package typings.pulumiAws.routeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigatewayv2/route", "Route")
@js.native
class Route protected () extends CustomResource {
  /**
    * Create a Route resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RouteArgs) = this()
  def this(name: String, args: RouteArgs, opts: CustomResourceOptions) = this()
  /**
    * The API identifier.
    */
  val apiId: Output_[String] = js.native
  /**
    * Boolean whether an API key is required for the route. Defaults to `false`.
    */
  val apiKeyRequired: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The authorization scopes supported by this route. The scopes are used with a JWT authorizer to authorize the method invocation.
    */
  val authorizationScopes: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The authorization type for the route.
    * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
    * For HTTP APIs, valid values are `NONE` for open access, or `JWT` for using JSON Web Tokens.
    * Defaults to `NONE`.
    */
  val authorizationType: Output_[js.UndefOr[String]] = js.native
  /**
    * The identifier of the `aws.apigatewayv2.Authorizer` resource to be associated with this route, if the authorizationType is `CUSTOM`.
    */
  val authorizerId: Output_[js.UndefOr[String]] = js.native
  /**
    * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route.
    */
  val modelSelectionExpression: Output_[js.UndefOr[String]] = js.native
  /**
    * The operation name for the route.
    */
  val operationName: Output_[js.UndefOr[String]] = js.native
  /**
    * The request models for the route.
    */
  val requestModels: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The route key for the route.
    */
  val routeKey: Output_[String] = js.native
  /**
    * The [route response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-response-selection-expressions) for the route.
    */
  val routeResponseSelectionExpression: Output_[js.UndefOr[String]] = js.native
  /**
    * The target for the route.
    */
  val target: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigatewayv2/route", "Route")
@js.native
object Route extends js.Object {
  /**
    * Get an existing Route resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Route = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Route = js.native
  def get(name: String, id: Input[ID], state: RouteState): Route = js.native
  def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): Route = js.native
  /**
    * Returns true if the given object is an instance of Route.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/route.Route */ Boolean = js.native
}

