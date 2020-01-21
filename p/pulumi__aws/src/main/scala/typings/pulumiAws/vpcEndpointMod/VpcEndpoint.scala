package typings.pulumiAws.vpcEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.VpcEndpointDnsEntry
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcEndpoint", "VpcEndpoint")
@js.native
class VpcEndpoint protected () extends CustomResource {
  /**
    * Create a VpcEndpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcEndpointArgs) = this()
  def this(name: String, args: VpcEndpointArgs, opts: CustomResourceOptions) = this()
  /**
    * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
    */
  val autoAccept: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val cidrBlocks: Output_[js.Array[String]] = js.native
  /**
    * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
    */
  val dnsEntries: Output_[js.Array[VpcEndpointDnsEntry]] = js.native
  /**
    * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
    */
  val networkInterfaceIds: Output_[js.Array[String]] = js.native
  /**
    * The ID of the AWS account that owns the VPC endpoint.
    */
  val ownerId: Output_[String] = js.native
  val policy: Output_[String] = js.native
  /**
    * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val prefixListId: Output_[String] = js.native
  /**
    * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
    * Defaults to `false`.
    */
  val privateDnsEnabled: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
    */
  val requesterManaged: Output_[Boolean] = js.native
  /**
    * One or more route table IDs. Applicable for endpoints of type `Gateway`.
    */
  val routeTableIds: Output_[js.Array[String]] = js.native
  /**
    * The ID of one or more security groups to associate with the network interface. Required for endpoints of type `Interface`.
    */
  val securityGroupIds: Output_[js.Array[String]] = js.native
  /**
    * The service name, in the form `com.amazonaws.region.service` for AWS services.
    */
  val serviceName: Output_[String] = js.native
  /**
    * The state of the VPC endpoint.
    */
  val state: Output_[String] = js.native
  /**
    * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `Interface`.
    */
  val subnetIds: Output_[js.Array[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The VPC endpoint type, `Gateway` or `Interface`. Defaults to `Gateway`.
    */
  val vpcEndpointType: Output_[js.UndefOr[String]] = js.native
  /**
    * The ID of the VPC in which the endpoint will be used.
    */
  val vpcId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpcEndpoint", "VpcEndpoint")
@js.native
object VpcEndpoint extends js.Object {
  /**
    * Get an existing VpcEndpoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): VpcEndpoint = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointState): VpcEndpoint = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointState, opts: CustomResourceOptions): VpcEndpoint = js.native
  /**
    * Returns true if the given object is an instance of VpcEndpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpoint.VpcEndpoint */ Boolean = js.native
}

