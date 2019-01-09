package typings
package atPulumiAwsLib.ec2VpcPeeringConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcPeeringConnection", "VpcPeeringConnection")
@js.native
class VpcPeeringConnection protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a VpcPeeringConnection resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpcPeeringConnectionArgs) = this()
  def this(name: java.lang.String, args: VpcPeeringConnectionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The status of the VPC Peering Connection request.
    */
  val acceptStatus: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * An optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that accepts
    * the peering connection (a maximum of one).
    */
  val accepter: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpc] = js.native
  /**
    * Accept the peering (both VPCs need to be in the same AWS account).
    */
  val autoAccept: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The AWS account ID of the owner of the peer VPC.
    * Defaults to the account ID the [AWS provider][1] is currently connected to.
    */
  val peerOwnerId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The region of the accepter VPC of the [VPC Peering Connection]. `auto_accept` must be `false`,
    * and use the `aws_vpc_peering_connection_accepter` to manage the accepter side.
    */
  val peerRegion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the VPC with which you are creating the VPC Peering Connection.
    */
  val peerVpcId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that requests
    * the peering connection (a maximum of one).
    */
  val requester: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpc] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The ID of the requester VPC.
    */
  val vpcId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/ec2/vpcPeeringConnection", "VpcPeeringConnection")
@js.native
object VpcPeeringConnection extends js.Object {
  /**
    * Get an existing VpcPeeringConnection resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcPeeringConnectionMod.VpcPeeringConnection = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcPeeringConnectionMod.VpcPeeringConnectionState
  ): atPulumiAwsLib.ec2VpcPeeringConnectionMod.VpcPeeringConnection = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcPeeringConnectionMod.VpcPeeringConnectionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2VpcPeeringConnectionMod.VpcPeeringConnection = js.native
}

