package typings.pulumiAws.ec2transitgatewayRouteMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2transitgateway/route", "Route")
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
    * Indicates whether to drop traffic that matches this route (default to `false`).
    */
  val blackhole: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
    */
  val destinationCidrBlock: Output_[String] = js.native
  /**
    * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
    */
  val transitGatewayAttachmentId: Output_[js.UndefOr[String]] = js.native
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2transitgateway/route", "Route")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/route.Route */ Boolean = js.native
}

