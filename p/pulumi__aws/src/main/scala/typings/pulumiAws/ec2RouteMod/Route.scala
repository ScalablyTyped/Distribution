package typings.pulumiAws.ec2RouteMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/route", "Route")
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
    * The destination CIDR block.
    */
  val destinationCidrBlock: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The destination IPv6 CIDR block.
    */
  val destinationIpv6CidrBlock: Output_[js.UndefOr[String]] = js.native
  
  val destinationPrefixListId: Output_[String] = js.native
  
  /**
    * Identifier of a VPC Egress Only Internet Gateway.
    */
  val egressOnlyGatewayId: Output_[String] = js.native
  
  /**
    * Identifier of a VPC internet gateway or a virtual private gateway.
    */
  val gatewayId: Output_[String] = js.native
  
  /**
    * Identifier of an EC2 instance.
    */
  val instanceId: Output_[String] = js.native
  
  val instanceOwnerId: Output_[String] = js.native
  
  /**
    * Identifier of a Outpost local gateway.
    */
  val localGatewayId: Output_[String] = js.native
  
  /**
    * Identifier of a VPC NAT gateway.
    */
  val natGatewayId: Output_[String] = js.native
  
  /**
    * Identifier of an EC2 network interface.
    */
  val networkInterfaceId: Output_[String] = js.native
  
  val origin: Output_[String] = js.native
  
  /**
    * The ID of the routing table.
    */
  val routeTableId: Output_[String] = js.native
  
  val state: Output_[String] = js.native
  
  /**
    * Identifier of an EC2 Transit Gateway.
    */
  val transitGatewayId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Identifier of a VPC Endpoint.
    */
  val vpcEndpointId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Identifier of a VPC peering connection.
    */
  val vpcPeeringConnectionId: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/route", "Route")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/route.Route */ Boolean = js.native
}
