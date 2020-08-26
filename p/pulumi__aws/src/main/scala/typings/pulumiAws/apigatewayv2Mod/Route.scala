package typings.pulumiAws.apigatewayv2Mod

import typings.pulumiAws.routeMod.RouteArgs
import typings.pulumiAws.routeMod.RouteState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigatewayv2", "Route")
@js.native
class Route protected ()
  extends typings.pulumiAws.routeMod.Route {
  /**
    * Create a Route resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RouteArgs) = this()
  def this(name: String, args: RouteArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigatewayv2", "Route")
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
  def get(name: String, id: Input[ID]): typings.pulumiAws.routeMod.Route = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.routeMod.Route = js.native
  def get(name: String, id: Input[ID], state: RouteState): typings.pulumiAws.routeMod.Route = js.native
  def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typings.pulumiAws.routeMod.Route = js.native
  /**
    * Returns true if the given object is an instance of Route.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/route.Route */ Boolean = js.native
}

