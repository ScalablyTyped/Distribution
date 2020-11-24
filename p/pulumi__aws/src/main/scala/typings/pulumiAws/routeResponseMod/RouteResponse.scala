package typings.pulumiAws.routeResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/apigatewayv2/routeResponse", "RouteResponse")
@js.native
class RouteResponse protected () extends CustomResource {
  /**
    * Create a RouteResponse resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RouteResponseArgs) = this()
  def this(name: String, args: RouteResponseArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The API identifier.
    */
  val apiId: Output_[String] = js.native
  
  /**
    * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
    */
  val modelSelectionExpression: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The response models for the route response.
    */
  val responseModels: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The identifier of the `aws.apigatewayv2.Route`.
    */
  val routeId: Output_[String] = js.native
  
  /**
    * The route response key.
    */
  val routeResponseKey: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/apigatewayv2/routeResponse", "RouteResponse")
@js.native
object RouteResponse extends js.Object {
  
  /**
    * Get an existing RouteResponse resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): RouteResponse = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RouteResponse = js.native
  def get(name: String, id: Input[ID], state: RouteResponseState): RouteResponse = js.native
  def get(name: String, id: Input[ID], state: RouteResponseState, opts: CustomResourceOptions): RouteResponse = js.native
  
  /**
    * Returns true if the given object is an instance of RouteResponse.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/routeResponse.RouteResponse */ Boolean = js.native
}
